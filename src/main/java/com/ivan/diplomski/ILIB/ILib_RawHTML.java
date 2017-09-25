package com.ivan.diplomski.ILIB;

import java.util.ArrayList;
import java.util.Map;

public class ILib_RawHTML implements ILibComponent, ILibContainsCSS, ILibCustomAttribute
{
    String tagName;
    String inTagText = "";
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

    @Override
    public String toString() {
        return "<" + tagName  + ReadCSSStyles() + PrintCustomAttribute() + ">" + inTagText + "</" + tagName + ">";
    }

}
