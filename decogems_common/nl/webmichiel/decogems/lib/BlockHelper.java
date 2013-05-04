package nl.webmichiel.decogems.lib;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import nl.webmichiel.decogems.block.GemBlock;
import nl.webmichiel.decogems.block.GemOre;
import nl.webmichiel.decogems.item.GemBlockItem;
import nl.webmichiel.decogems.item.GemOreItem;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockHelper {

    // Names of all the blocks, in the same order as registered lower in the class
    private static final String[] blockNames = new String[] { "Snow Quartz", "Citrine", "Amethyst", "Larimar", "Yellow Topaz", "Peridot", "Kunzite", "Gray Agate", "Light Gray", "Turquoise",
            "Sugilite", "-", "Smokey Quartz", "Tsavorite", "Carnelian", "Jet" };

    /*
     * Registering all the different blocks Use ReferenceID.BLOCKNAME for the ID
     */
    public static final Block gemBlock = new GemBlock(Reference.ID_GEMBLOCK);
    public static final Block gemOre = new GemOre(Reference.ID_GEMORE);

    /**
     * Initialize all the Blocks and their names.
     */
    public static void init() {
        // Add the block to the GameRegistry
        GameRegistry.registerBlock(gemBlock, GemBlockItem.class, Reference.MOD_ID + "_GemBlock");
        GameRegistry.registerBlock(gemOre, GemOreItem.class, Reference.MOD_ID + "_GemOre");
        // Set the min. harvest level
        MinecraftForge.setBlockHarvestLevel(gemBlock, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(gemOre, "pickaxe", 2);

        // Add all blocks to the LangRegister
        for (int i = 0; i < blockNames.length; i++) {
            if (i != Color.BLUE) {
                ItemStack gemBlockItemStack = new ItemStack(gemBlock, 1, i);
                LanguageRegistry.addName(gemBlockItemStack, blockNames[i] + " Block");

                ItemStack gemOreItemStack = new ItemStack(gemOre, 1, i);
                LanguageRegistry.addName(gemOreItemStack, blockNames[i] + " Ore");
            }
        }
    }
}
