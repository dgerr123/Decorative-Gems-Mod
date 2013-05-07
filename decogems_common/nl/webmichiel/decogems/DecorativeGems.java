package nl.webmichiel.decogems;

import nl.webmichiel.decogems.lib.BlockHelper;
import nl.webmichiel.decogems.lib.ItemHelper;
import nl.webmichiel.decogems.lib.RecipeHelper;
import nl.webmichiel.decogems.lib.Reference;
import nl.webmichiel.decogems.world.DecorativeGemsWorldGen;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Decorative-Gems-Mod
 * Decorative gems mod main class, initializing all needed parts of the mod.
 * 
 * @author Msvisser
 * Copyright (c) 2013
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class DecorativeGems {

    @Mod.Instance(Reference.MOD_ID)
    public static DecorativeGems instance;

    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        // Initialize the Blocks and Items
        BlockHelper.init();
        ItemHelper.init();
        // Initialize the Recipes and Dungeon loot
        RecipeHelper.init();
        // Register Ore spawns
        GameRegistry.registerWorldGenerator(new DecorativeGemsWorldGen());
    }

    @Init
    public void init(FMLInitializationEvent event) {

    }

    @PostInit
    public void postInit(FMLPostInitializationEvent event) {

    }
}
