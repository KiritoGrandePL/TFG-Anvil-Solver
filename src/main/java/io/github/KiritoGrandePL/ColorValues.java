package io.github.KiritoGrandePL;

import javafx.scene.paint.Color;

public enum ColorValues {
    RED(16, "#AE3D3D"),
    ORANGE(13, "#CA8759"),
    YELLOW(7, "#E8D675"),
    GREEN(2, "#89D968"),
    VERYLIGHTBLUE(-3,"#6ADDDD"),
    LIGHTBLUE(-6, "#4E90C0"),
    DARKBLUE(-9, "#3142A3"),
    PURPLE(-15, "#7400FF");
    private final int colorValue;
    private final String hexValue;

    ColorValues(int colorValue, String hexValue) {

        this.colorValue = colorValue;
        this.hexValue = hexValue;
    }

    public int getColorValue(){
        return this.colorValue;
    } // get color value based on color input

    public static String getValueColor(int colorValue){ // get color hex of input value
        for(ColorValues color : ColorValues.values()){
            if (color.getColorValue() == colorValue){
                return color.hexValue;
            }
        }
        throw new IllegalArgumentException("No ColorValues with value of " + colorValue);
    }
    public static Color getValueFxColor(String StringColorValue){ //input string of possible anvil number values, return javafx color hex
        if (StringColorValue == "NONE"){
            return Color.TRANSPARENT;
        }
        int colorValue = Integer.parseInt(StringColorValue);
        for(ColorValues color : ColorValues.values()){
            if (color.getColorValue() == colorValue){
                return Color.web(color.hexValue);
            }
        }
        throw new IllegalArgumentException("No ColorValues with value of " + colorValue);
    }


}
