package com.ivan.diplomski.Pages;


import com.ivan.diplomski.ILIB.ILib_P;
import com.ivan.diplomski.ILIB.ILib_a;
import com.ivan.diplomski.ILIB.ILib_div;
import com.ivan.diplomski.ILIB.Page;
import com.ivan.diplomski.ILIB.script.Script_AJAX;
import com.ivan.diplomski.ILIB.script.scriptFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;


@RestController
@RequestMapping("/students")
public class StudentController {

    @RequestMapping(value = "/ika/{id}", method = RequestMethod.GET)
    public String ika(@PathVariable("id") int id){
        return String.valueOf(id);
    }

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public String ika(){

        Page stranica = new Page();

        ILib_P prviParagraf = new ILib_P("Stranica 'page'");
        ILib_P drugiParagraf = new ILib_P("drugi Paragraf");


        ILib_a dugme = new ILib_a();
        dugme.hm.put(ILib_a.Attribute.ID, "ika");
        dugme.hm.put(ILib_a.Attribute.NAME, "IME");
        dugme.hm.put(ILib_a.Attribute.HREF, "/students/page2");
        dugme.setFieldText("Page 2");

        stranica.addComponent(prviParagraf);
        stranica.addComponent(drugiParagraf);
        stranica.addComponent(dugme);
        return stranica.printPage();
    }

    @RequestMapping(value = "/page2", method = RequestMethod.GET)
    public String page2(){

        Page stranica = new Page();

        ILib_P prviParagraf = new ILib_P("Stranica 'page2'");
        ILib_P drugiParagraf = new ILib_P("drugi Paragraf");


        ILib_a dugme = new ILib_a();
        dugme.hm.put(ILib_a.Attribute.ID, "ika");
        dugme.hm.put(ILib_a.Attribute.NAME, "IME");
        dugme.hm.put(ILib_a.Attribute.HREF, "/students/page");
        dugme.setFieldText("Page 1");

        ILib_a dugme2 = new ILib_a();
        scriptFunction mojaFunkcija = new scriptFunction("myFunction", "document.getElementById(\"ika\").innerHTML = \"Hello World\";");
        stranica.scripts.add(mojaFunkcija);
        dugme2.hm.put(ILib_a.Attribute.ONCLICK, mojaFunkcija.functionLink());
        dugme2.setFieldText("Page function");




        ILib_a google = new ILib_a("Google", "http://www.google.com");

        ILib_div div1 = new ILib_div("div1");

        div1.innerHTML += dugme2.toString();

        Script_AJAX div11 = new Script_AJAX("div1", "page");

        scriptFunction fundiv11 = new scriptFunction("ajax1", div11.toString());

        stranica.scripts.add(fundiv11);


        ILib_a dugme3 = new ILib_a();
        dugme3.hm.put(ILib_a.Attribute.ONCLICK, fundiv11.functionLink());
        dugme3.setFieldText("fundiv1");


        stranica.addComponent(prviParagraf);
        stranica.addComponent(drugiParagraf);
        stranica.addComponent(dugme);
        stranica.addComponent(dugme2);
        stranica.addComponent(google);
        stranica.addComponent(dugme3);
        stranica.addComponent(div1);
        return stranica.printPage();
    }
}
