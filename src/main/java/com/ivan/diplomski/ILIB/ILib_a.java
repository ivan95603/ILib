package com.ivan.diplomski.ILIB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ivan Palijan on 7/16/2017.
 */
public class ILib_a implements ILibComponent, ILibContainsCSS, ILibCustomAttribute
{
   public HashMap<Attribute,String> hm = new HashMap<Attribute,String>();
    //String text = "<button type='button'>Click Me!</button>";
    String text = "<a ";
    String fieldText = "";

    ArrayList<ILib_CSSStyle> CSSElements = new ArrayList<>();
    ArrayList<ILibAttribute> RawAttributes = new ArrayList<>();

             //"<button><a href=\"www.google.com\">Button Text</a></button>";
  //  <button><a href="#">Button Text</a></button>


    public ILib_a(String fieldText, String href) {
        this.fieldText = fieldText;
        hm.put(ILib_a.Attribute.HREF, href);
    }

    public ILib_a() {
    }

    public String getFieldText() {
        return fieldText;
    }

    public void setFieldText(String fieldText) {
        this.fieldText = fieldText;
    }

    @Override
    public void AddCustomAttribute(String attrib, String value) {
        RawAttributes.add(new ILibAttribute(attrib, value));
    }

    @Override
    public String PrintCustomAttribute() {
        StringBuilder sb = new StringBuilder();

        for (ILibAttribute item : RawAttributes)
        {
            sb.append(" ").append(item.AttributeName).append(" = ").append("\"").append(item.AttributeValue).append("\" ");
        }
        return sb.toString();
    }

    @Override
    public void AddCSSStyle(ILib_CSSStyle style) {
        CSSElements.add(style);
    }

    @Override
    public String ReadCSSStyles() {
        StringBuilder sb = new StringBuilder();
        sb.append("style=\"");
        for (ILib_CSSStyle item : CSSElements)
        {
            sb.append(item.toString());
        }
        sb.append("\"");
        return sb.toString();
    }

    public enum Attribute {
        ID("id"),
        NAME("name"),
        HREF("href"),
        CLASS("class"),

        ONCLICK("onclick");
        //onclick="myFunction()"

        private String attribute;

        private Attribute(String attribute) {
            this.attribute = attribute;
        }

        @Override
        public String toString(){
            return attribute;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<a ");
        //text = "<a ";



        for(Map.Entry m:hm.entrySet()){
            sb.append(m.getKey()).append(" = '").append(m.getValue()).append("'");
            //text += (m.getKey()+" = '"+m.getValue()+"'");
        }

        sb.append(">").append(fieldText).append("</a>");
        //text +=  +  + ;
        text = sb.toString();

        return text;
    }
}
