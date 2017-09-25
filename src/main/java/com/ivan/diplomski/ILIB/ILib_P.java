package com.ivan.diplomski.ILIB;

import java.util.ArrayList;

/**
 * Created by Ivan Palijan on 7/16/2017.
 */
public class ILib_P implements ILibComponent, ILibCustomAttribute, ILibContainsCSS
{
    String text;

    ArrayList<ILib_CSSStyle> CSSElements = new ArrayList<>();
    ArrayList<ILibAttribute> RawAttributes = new ArrayList<>();

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




    public ILib_P(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "<p " + ReadCSSStyles() + PrintCustomAttribute() + ">" + text + "</p>";
    }
}
