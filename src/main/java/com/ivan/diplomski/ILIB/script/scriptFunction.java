package com.ivan.diplomski.ILIB.script;

public class scriptFunction
{
    String functionName;
    String scriptText;

    public scriptFunction(String functionName, String scriptText) {
        this.functionName = functionName;
        this.scriptText = scriptText;
    }

    public String functionLink()
    {
        return (this.functionName + "()");
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getScriptText() {
        return scriptText;
    }

    public void setScriptText(String scriptText) {
        this.scriptText = scriptText;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<script>\n");

        sb.append("function ");
        sb.append(functionName).append(" (){\n");
        sb.append(scriptText);

        sb.append("\n}\n");
        sb.append("</script>\n");


        return sb.toString();
    }
}
