package com.ivan.diplomski.ILIB;

import java.util.ArrayList;
import java.util.Map;

public class ILib_H implements ILibComponent, ILibContainsCSS
{
    public int size;
    public String text;
    public String htmlCommandText;

    ArrayList<ILib_CSSStyle> CSSElements = new ArrayList<>();

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

    public ILib_H(int size, String text) {
        this.size = size;
        this.text = text;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("<h").append(String.valueOf(size)).append(" ");
        sb.append(ReadCSSStyles());
        sb.append(">");
        sb.append(text);
        sb.append("</h");
        sb.append(String.valueOf(size)).append(">");

        htmlCommandText = sb.toString();

        return htmlCommandText;
    }


}
