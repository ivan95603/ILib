package com.ivan.diplomski.ILIB.script;

import com.ivan.diplomski.ILIB.ILibComponent;

public class scriptRaw implements ILibComponent, ILib_IScript
{
    String text;

    public scriptRaw(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return  text;
    }
}
