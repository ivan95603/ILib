package com.ivan.diplomski.ILIB;

import java.util.ArrayList;

public class ILib_ul implements ILibComponent
{

    ArrayList<ILibComponent> elements = new ArrayList<>();

    public void AddNewElement(ILibComponent elemment)
    {
        elements.add(elemment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("<ul>\n");

        for (ILibComponent item : elements)
        {
            sb.append("<li>");
            sb.append(item.toString());
            sb.append("</li>\n");
        }

        sb.append("</ul>");

        return sb.toString();

    }
}
