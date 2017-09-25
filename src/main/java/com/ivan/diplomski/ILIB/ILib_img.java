package com.ivan.diplomski.ILIB;

import java.util.ArrayList;

public class ILib_img implements ILibComponent, ILibCustomAttribute, ILibContainsCSS
{
    String src;
    String alt;

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
        StringBuilder sb = new StringBuilder();
        sb.append("<img ");
        sb.append(PrintCustomAttribute());
        sb.append(ReadCSSStyles());
        sb.append(">");
        return sb.toString();
    }
}
