package nl.webmichiel.decogems.lib;

/**
 * Decorative-Gems-Mod
 * Class with Minecraft Color constants based on the metadata
 * 
 * @author Msvisser
 * Copyright (c) 2013
 */
public class Color {

    /* All color metadata constants */
    public static final int WHITE = 0;
    public static final int ORANGE = 1;
    public static final int MAGENTA = 2;
    public static final int LIGHT_BLUE = 3;
    public static final int YELLOW = 4;
    public static final int LIME = 5;
    public static final int PINK = 6;
    public static final int GRAY = 7;
    public static final int LIGHT_GRAY = 8;
    public static final int CYAN = 9;
    public static final int PURPLE = 10;
    public static final int BLUE = 11;
    public static final int BROWN = 12;
    public static final int GREEN = 13;
    public static final int RED = 14;
    public static final int BLACK = 15;

    /* English names for the colors based on the metadata */
    public static final String[] COLORS = { "White", "Orange", "Magenta", "Light Blue", "Yellow", "Lime", "Pink", "Gray", "Light Gray", "Cyan", "Purple", "Blue", "Brown", "Green", "Red", "Black" };

    /* Get English color name based on the metadata */
    public static String getColorFromMetadata(int i) {
        if (i < 0 || i > 15)
            return "White";
        return COLORS[i];
    }

}
