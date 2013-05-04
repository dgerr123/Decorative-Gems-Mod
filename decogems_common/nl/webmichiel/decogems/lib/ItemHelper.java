package nl.webmichiel.decogems.lib;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import nl.webmichiel.decogems.item.GemItem;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemHelper {

    // Names of all the blocks, in the same order as registered lower in the class
    private static final String[] itemNames = new String[] { "Snow Quartz", "Citrine", "Amethyst", "Larimar", "Yellow Topaz", "Peridot", "Kunzite", "Gray Agate", "Light Gray", "Turquoise",
            "Sugilite", "-", "Smokey Quartz", "Tsavorite", "Carnelian", "Jet" };

    /*
     * Registering all the different blocks Use ReferenceID.BLOCKNAME for the ID
     */
    public static final Item gemItem = new GemItem(Reference.ID_GEMITEM);

    /**
     * Initialize all the Blocks and their names.
     */
    public static void init() {
        // Add all blocks to the LangRegister
        for (int i = 0; i < itemNames.length; i++) {
            if (i != Color.BLUE) {
                ItemStack gemItemStack = new ItemStack(gemItem, 1, i);
                LanguageRegistry.addName(gemItemStack, itemNames[i]);
            }
        }
    }
}
