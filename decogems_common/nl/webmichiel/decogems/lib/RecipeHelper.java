package nl.webmichiel.decogems.lib;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class RecipeHelper {

    public static void init() {
        /* Initialize recipes */
        // 9 gems -> 1 gemblock
        for (int meta = 0; meta < 16; meta++) {
            if (meta != Color.BLUE) {
                ItemStack gemItemStack = new ItemStack(ItemHelper.gemItem, 1, meta);
                GameRegistry.addShapelessRecipe(new ItemStack(BlockHelper.gemBlock, 1, meta), gemItemStack, gemItemStack, gemItemStack, gemItemStack, gemItemStack, gemItemStack, gemItemStack,
                        gemItemStack, gemItemStack);
            }
        }
        // 1 gemblock -> 9 gems
        for (int meta = 0; meta < 16; meta++) {
            if (meta != Color.BLUE) {
                ItemStack gemBlockStack = new ItemStack(BlockHelper.gemBlock, 1, meta);
                GameRegistry.addShapelessRecipe(new ItemStack(ItemHelper.gemItem, 9, meta), gemBlockStack);
            }
        }
    }
}
