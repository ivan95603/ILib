package com.ivan.diplomski.Misc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ivan.diplomski.ILIB.ILibComponent;
import org.springframework.data.annotation.Id;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Article implements ILibComponent
{
    @Id
    public String id;

    public String Heading;

    public String text;

    public Article(String Heading, String text) {
        this.text = text;
        this.Heading = Heading;
    }

    public String getId() {
        return id;
    }

    public String getHeading() {
        return Heading;
    }

    public String getText() {
        return text;
    }
}
