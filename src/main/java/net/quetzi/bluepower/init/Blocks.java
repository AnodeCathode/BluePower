package net.quetzi.bluepower.init;

import net.minecraft.block.Block;
import net.quetzi.bluepower.blocks.BlockBasalt;
import net.quetzi.bluepower.blocks.BlockBasaltBrick;
import net.quetzi.bluepower.blocks.BlockBasaltCobble;
import net.quetzi.bluepower.blocks.BlockMarble;
import net.quetzi.bluepower.blocks.BlockMarbleBrick;
import net.quetzi.bluepower.references.Refs;
import cpw.mods.fml.common.registry.GameRegistry;

public class Blocks {
    public static void init() {
        registerBlocks();
    }
    
    public static final Block basalt = (Block)Block.blockRegistry.getObject("basalt");
    public static final Block marble = (Block)Block.blockRegistry.getObject("marble");
    public static final Block basalt_cobble = (Block)Block.blockRegistry.getObject("basalt_cobble");
    public static final Block basalt_brick = (Block)Block.blockRegistry.getObject("basalt_brick");
    public static final Block marble_brick = (Block)Block.blockRegistry.getObject("marble_brick");
    
    private static void registerBlocks() {
        GameRegistry.registerBlock(new BlockBasalt().setBlockName(Refs.BLOCKBASALT_NAME), "basalt");
        GameRegistry.registerBlock(new BlockMarble().setBlockName(Refs.BLOCKMARBLE_NAME), "marble");
        GameRegistry.registerBlock(new BlockBasaltCobble().setBlockName(Refs.BLOCKBASALTCOBBLE_NAME), "basalt_cobble");
        GameRegistry.registerBlock(new BlockBasaltBrick().setBlockName(Refs.BLOCKBASALTBRICK_NAME), "basalt_brick");
        GameRegistry.registerBlock(new BlockMarbleBrick().setBlockName(Refs.BLOCKMARBLEBRICK_NAME), "marble_brick");
    }
}