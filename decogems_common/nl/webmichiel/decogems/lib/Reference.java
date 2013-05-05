package nl.webmichiel.decogems.lib;

public class Reference {
    /* Basic constants */
    public static final String MOD_ID = "decogems";
    public static final String MOD_NAME = "Decorative Gems Mod";
    public static final String VERSION = "Alpha-BUILD 4";

    /* Filepath Related Constants */
    public static final String RESOURCE_FOLDER = MOD_ID;
    public static final String PATH_RESOURCES = "/mods/" + RESOURCE_FOLDER + "/";
    public static final String PATH_TEXTURES = PATH_RESOURCES + "textures/";

    /* ID constants */
    public static final int ID_GEMBLOCK = 1100;
    public static final int ID_GEMORE = 1101;
    public static final int ID_GEMITEM = 1100;

    /* Naming Constants */
    public static final String[] UNLOCALIZED_COLORS = new String[] { "white", "orange", "magenta", "lightBlue", "yellow", "lightGreen", "pink", "darkGrey", "lightGrey", "cyan", "purple", "blue",
            "brown", "green", "red", "black" };
    public static final String[] LOCALIZED_COLORS = new String[] { "Snow Quartz", "Citrine", "Amethyst", "Larimar", "Yellow Topaz", "Peridot", "Kunzite", "Gray Agate", "Light Gray", "Turquoise",
            "Sugilite", "-", "Smokey Quartz", "Tsavorite", "Carnelian", "Jet" };
}
