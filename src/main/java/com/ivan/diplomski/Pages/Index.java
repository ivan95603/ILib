package com.ivan.diplomski.Pages;

import com.ivan.diplomski.ILIB.*;
import com.ivan.diplomski.ILIB.script.Script_AJAX;
import com.ivan.diplomski.ILIB.script.scriptFunction;
import com.ivan.diplomski.ILIB.script.scriptRaw;
import com.ivan.diplomski.Misc.Article;
import com.ivan.diplomski.database.ArticlesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;




@RestController
@RequestMapping("/")
public class Index {

    @Autowired
    private ArticlesRepository hotelRepository;


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String ika(){

        Article prvi = new Article("Naslov prvog clanka", "Ovaj clanak je povucen iz mongoDB baze");
        Article drugi = new Article("Naslov drugog clanka", "Ovaj clanak je kao i prethodni ucitan je iz mongoDB i sacinjen od naslova i teksta");

        this.hotelRepository.deleteAll();
        this.hotelRepository.save(prvi);
        this.hotelRepository.save(drugi);

        List<Article> povuceno = this.hotelRepository.findAll();



        Page stranica = new Page();


        ILib_div divTemp = new ILib_div("divTemp");
        divTemp.innerHTML = new ILib_H(1, "Core tmperature").toString();

        /*Test DIV*/
        ILib_div div1 = new ILib_div("div1");
        div1.innerHTML = new ILib_H(1, "Molimo pritisnite dugme").toString();

        stranica.addComponent(divTemp);
        stranica.addComponent(div1);

        Script_AJAX div11 = new Script_AJAX("div1", "/device/OK");
        scriptFunction fundiv11 = new scriptFunction("ajax1", div11.toString());

        Script_AJAX div12 = new Script_AJAX("div1", "/device/NO");
        scriptFunction fundiv12 = new scriptFunction("ajax2", div12.toString());

        Script_AJAX divAjaxTemp = new Script_AJAX("divTemp", "/device/GET");
        scriptFunction fundivTemp = new scriptFunction("divTemp", divAjaxTemp.toString());


        stranica.StandardScripts.add(new scriptRaw("var myVar = setInterval(divTemp, 1000);"));
        stranica.scripts.add(fundiv11);
        stranica.scripts.add(fundiv12);
        stranica.scripts.add(fundivTemp);

        ILib_a dugmeON = new ILib_a();
        dugmeON.hm.put(ILib_a.Attribute.ONCLICK, fundiv11.functionLink());
        dugmeON.setFieldText("ON");
        stranica.addComponent(dugmeON);

        ILib_a dugmeOFF = new ILib_a();
        dugmeOFF.hm.put(ILib_a.Attribute.ONCLICK, fundiv12.functionLink());
        dugmeOFF.setFieldText("OFF");
        stranica.addComponent(dugmeOFF);






        stranica.addComponent(new ILib_P("Dobro dosli na demonstraciju ILib paketa"));


        ILib_a dugme = new ILib_a();
        dugme.hm.put(ILib_a.Attribute.ID, "ika");
        dugme.hm.put(ILib_a.Attribute.NAME, "IME");
        dugme.hm.put(ILib_a.Attribute.HREF, "/students/page2");
        dugme.setFieldText("Page 2");

        for (Article item : povuceno)
        {
            stranica.addComponent(new ILib_H(1, item.Heading));
            stranica.addComponent(new ILib_P(item.text));
        }

        stranica.addComponent(new ILib_hr());

        stranica.addComponent(new ILib_P("Sledeci element je tabela"));

        ILib_ul temp = new ILib_ul();
        for (Article item : povuceno)
        {
            temp.AddNewElement(new ILib_H(1, item.Heading));
        }
        stranica.addComponent(temp);

        ILib_P test = new ILib_P("Ovo je primer paragrafa koji je sacinjen od <'p> tagova i na njemu su primenjeni CSS stilovi");
        test.AddCSSStyle(new ILib_CSSStyle(ILib_CSSStyle.CSSStyles.color.toString(), "red"));
        test.AddCSSStyle(new ILib_CSSStyle(ILib_CSSStyle.CSSStyles.font_size.toString(), "50px"));
        test.AddCSSStyle(new ILib_CSSStyle(ILib_CSSStyle.CSSStyles.background_color.toString(), "blue"));
        stranica.addComponent(test);

        stranica.addComponent(dugme);

        stranica.addComponent(new ILib_hr());

        ILib_img img = new ILib_img();
        img.AddCustomAttribute("src", "http://www.mybligr.com/wp-content/uploads/2017/03/cute-and-lovable-pictures-of-rabbits-2.jpg");
        img.AddCustomAttribute("alt", "rabbit");
        img.AddCustomAttribute("height", "300");
        img.AddCustomAttribute("width", "400");
        img.AddCSSStyle(new ILib_CSSStyle(ILib_CSSStyle.CSSStyles.border_radius.toString(), "50%"));
        stranica.addComponent(img);

        return stranica.printPage();
    }

}
