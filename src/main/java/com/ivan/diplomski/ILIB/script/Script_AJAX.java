package com.ivan.diplomski.ILIB.script;

public class Script_AJAX implements ILib_IScript
{
    /*
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
     document.getElementById("demo").innerHTML = this.responseText;
    }
  };
  xhttp.open("GET", "ajax_info.txt", true);
  xhttp.send();

    * */

    String url;
    String elementID;

    public Script_AJAX(String elementID, String url) {
        this.elementID = elementID;
        this.url = url;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("  var xhttp = new XMLHttpRequest();\n" +
                "  xhttp.onreadystatechange = function() {\n" +
                "    if (this.readyState == 4 && this.status == 200) {\n" +
                "     document.getElementById(\"");
        sb.append(elementID);

        sb.append("\").innerHTML =\n" +
                "      this.responseText;\n" +
                "    }\n" +
                "  };\n" +
                "  xhttp.open(\"GET\", \"");

        sb.append(url);

        sb.append("\", true);\n" +
                "  xhttp.send();\n" +
                "");



        return sb.toString();
    }
}
