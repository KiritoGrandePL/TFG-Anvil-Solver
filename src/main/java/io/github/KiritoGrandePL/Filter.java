package io.github.KiritoGrandePL;

public class Filter {
    public static String choiceBoxFilter(String text){ //filters for "NONE", so that the label turns invisible when "NONE" is selected
        if (text.equals("NONE")){
            return " ";
        }else return text;
    }
}
