package com.ivan.diplomski.Pages;

import com.ivan.diplomski.ILIB.*;
import jssc.SerialPort;
import jssc.SerialPortException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import static com.pi4j.system.SystemInfo.getCpuTemperature;

@RestController
@RequestMapping("/")
public class Device
{
    @RequestMapping(value = "/device/{command}", method = RequestMethod.GET)
    public String ika(@PathVariable("command") String command){

        String portName = "/dev/ttyAMA0";

        Page stranica = new Page();
        stranica.addComponent(new ILib_H(1,  ""));

        if (command.equals("GET"))
        {
            try {
                float temp = 0;
                try {
                    temp = getCpuTemperature();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                String tempMessage = "Core Temperature: " + String.valueOf(temp) + " C";

                ILib_H message = new ILib_H(1, tempMessage);
                message.AddCSSStyle(new ILib_CSSStyle(ILib_CSSStyle.CSSStyles.color.toString(), "green"));
                stranica.addComponent(message);
                return stranica.printPage();
            }
            catch (Exception ex) {
                System.out.println(ex);
            }
        }



        if (command.equals("OK"))
        {
            //SerialPort serialPort = new SerialPort("COM7");
            SerialPort serialPort = new SerialPort(portName);

            try {
                serialPort.openPort();//Open serial port
                serialPort.setParams(SerialPort.BAUDRATE_9600,
                        SerialPort.DATABITS_8,
                        SerialPort.STOPBITS_1,
                        SerialPort.PARITY_NONE);//Set params. Also you can set params by this string: serialPort.setParams(9600, 8, 1, 0);
                serialPort.writeBytes("OK".getBytes());//Write data to port
                serialPort.closePort();//Close serial port

                float temp = 0;
                try {
                    temp = getCpuTemperature();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                ILib_H message = new ILib_H(1, "ON");
                message.AddCSSStyle(new ILib_CSSStyle(ILib_CSSStyle.CSSStyles.color.toString(), "green"));
                stranica.addComponent(message);
                return stranica.printPage();
            }
            catch (SerialPortException ex) {
                System.out.println(ex);
            }
        }
        if (command.equals("NO"))
        {
            //SerialPort serialPort = new SerialPort("COM7");
            SerialPort serialPort = new SerialPort(portName);


            try {
                serialPort.openPort();//Open serial port
                serialPort.setParams(SerialPort.BAUDRATE_9600,
                        SerialPort.DATABITS_8,
                        SerialPort.STOPBITS_1,
                        SerialPort.PARITY_NONE);//Set params. Also you can set params by this string: serialPort.setParams(9600, 8, 1, 0);
                serialPort.writeBytes("NO".getBytes());//Write data to port
                serialPort.closePort();//Close serial port
                ILib_H message = new ILib_H(1, "OFF");
                message.AddCSSStyle(new ILib_CSSStyle(ILib_CSSStyle.CSSStyles.color.toString(), "red"));
                stranica.addComponent(message);
                return stranica.printPage();
            }
            catch (SerialPortException ex) {
                System.out.println(ex);
            }
        }


        return stranica.printPage();






    }

}

