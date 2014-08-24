package com.ryokani.circuitry.init;

import com.ryokani.circuitry.block.BlockCopper;
import com.ryokani.circuitry.block.BlockCircuitry;
import com.ryokani.circuitry.block.BlockTin;
import com.ryokani.circuitry.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

@GameRegistry.ObjectHolder(Reference.Mod_ID)
public class ModBlocks {

    public static final BlockCircuitry blockCopper = new BlockCopper();
    public static final BlockCircuitry blockTin = new BlockTin();

    public static void init(){

        GameRegistry.registerBlock(blockCopper, "blockCopper");
        GameRegistry.registerBlock(blockTin, "blockTin");

        OreDictionary.registerOre("blockCopper", ModBlocks.blockCopper);
        OreDictionary.registerOre("blockTin", ModBlocks.blockTin);
    }
}
