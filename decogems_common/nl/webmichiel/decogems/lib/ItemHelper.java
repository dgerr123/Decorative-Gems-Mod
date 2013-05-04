package nl.webmichiel.decogems.lib;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import nl.webmichiel.decogems.item.GemItem;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemHelper {
    /*
     * Registering all the different blocks Use ReferenceID.BLOCKNAME for the ID
     */
    public static final Item gemItem = new GemItem(Reference.ID_GEMITEM);

    /**
     * Initialize all the Blocks and their names.
     */
    public static void init() {
        // Add all blocks to the LangRegister
        for (int i = 0; i < Reference.LOCALIZED_COLORS.length; i++) {
            if (i != Color.BLUE) {
                ItemStack gemItemStack = new ItemStack(gemItem, 1, i);
                LanguageRegistry.addName(gemItemStack, Reference.LOCALIZED_COLORS[i]);
            }
        }
    }
}
