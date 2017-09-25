package com.ivan.diplomski.ILIB;

public class ILibAttribute
{
    String AttributeName;
    String AttributeValue;

    public ILibAttribute(String attributeName, String attributeValue) {
        AttributeName = attributeName;
        AttributeValue = attributeValue;
    }

    public String getAttributeName() {
        return AttributeName;
    }

    public void setAttributeName(String attributeName) {
        AttributeName = attributeName;
    }

    public String getAttributeValue() {
        return AttributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        AttributeValue = attributeValue;
    }
}
