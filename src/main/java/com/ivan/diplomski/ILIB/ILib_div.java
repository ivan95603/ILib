package com.ivan.diplomski.ILIB;

import java.util.HashMap;
import java.util.Map;

public class ILib_div implements ILibComponent
{
    public String innerHTML;
    public HashMap<Attribute,String> hm = new HashMap<Attribute,String>();

    public ILib_div(String id) {
        hm.put(Attribute.ID, id);
    }

public enum Attribute {
    ID("id");


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
        sb.append("<div ");



        for(Map.Entry m:hm.entrySet()){
            sb.append(m.getKey()).append(" = '").append(m.getValue()).append("'");
        }

        sb.append(">").append(innerHTML).append("</div>");
        //text +=  +  + ;
        return sb.toString();

    }

}