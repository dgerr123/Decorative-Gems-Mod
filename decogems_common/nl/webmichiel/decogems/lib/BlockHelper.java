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

/**
 * Decorative-Gems-Mod
 * Class that registers all blocks into the game and adds the names for the blocks.
 * 
 * @author Msvisser
 * Copyright (c) 2013
 */
public class BlockHelper {
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
        for (int i = 0; i < Reference.LOCALIZED_COLORS.length; i++) {
            if (i != Color.BLUE) {
                ItemStack gemBlockItemStack = new ItemStack(gemBlock, 1, i);
                LanguageRegistry.addName(gemBlockItemStack, Reference.LOCALIZED_COLORS[i] + " Block");

                ItemStack gemOreItemStack = new ItemStack(gemOre, 1, i);
                LanguageRegistry.addName(gemOreItemStack, Reference.LOCALIZED_COLORS[i] + " Ore");
            }
        }
    }
}
