package com.ivan.diplomski.ILIB;

import com.ivan.diplomski.ILIB.script.ILib_IScript;
import com.ivan.diplomski.ILIB.script.scriptFunction;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Created by Ivan Palijan on 7/16/2017.
 */

@Component
public class Page
{
    public ArrayList<ILib_IScript> StandardScripts = new  ArrayList<>();
    public ArrayList<scriptFunction> scripts = new  ArrayList<>();
    ArrayList<ILibComponent> PageComponents = new ArrayList<>();

    public void addComponent(ILibComponent Component){
        PageComponents.add(Component);
    }

    public String printPage()
    {
        String temp = "";
        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html>\n <html>\n");
        for (scriptFunction item : scripts) {
            sb.append(item);
        }
        sb.append("<script>");
        for (ILib_IScript item : StandardScripts) {
            sb.append(item);
        }
        sb.append("</script>\n");


        sb.append(" <body>\n ");

        for (ILibComponent item : PageComponents) {
            //temp += item.toString() + "\n";
            sb.append(item.toString()).append("\n");
        }

        sb.append("\n </body>\n </html>\n");
       /* temp += "\n" +
                "</body>\n" +
                "</html>";*/
       temp = sb.toString();
        return temp;

    }

    @Override
    public String toString() {
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "\n" +
                "<h1>My First Heading</h1>\n" +
                "<p>My first paragraph.</p>\n" +
                "\n" +
                "</body>\n" +
                "</html>";

    }
}
