package nl.webmichiel.decogems.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import nl.webmichiel.decogems.lib.BlockHelper;
import nl.webmichiel.decogems.lib.Color;

import cpw.mods.fml.common.IWorldGenerator;

/**
 * Decorative-Gems-Mod
 * WorldGenerator class will generate the ores into the world.
 * 
 * @author Msvisser
 * Copyright (c) 2013
 */
public class DecorativeGemsWorldGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        if (world.provider.dimensionId == 0)
            generateSurface(world, random, chunkX * 16, chunkZ * 16);
    }

    /**
     * Generate the Gems into the world
     * @param world World object to generate in
     * @param rand Random object
     * @param chunkX Chunk X coord (*16)
     * @param chunkZ Chunk Z coord (*16)
     */
    public void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
        for (int i = 0; i < 45; i++) {
            int randPosX = chunkX + rand.nextInt(16);
            int randPosY = 2 + rand.nextInt(28);
            int randPosZ = chunkZ + rand.nextInt(16);
            int oreMetadata = rand.nextInt(16);
            while (oreMetadata == Color.BLUE)
                oreMetadata = rand.nextInt(16);

            (new WorldGenMinable(BlockHelper.gemOre.blockID, oreMetadata, 6 + rand.nextInt(5) , Block.stone.blockID)).generate(world, rand, randPosX, randPosY, randPosZ);
        }
    }
}