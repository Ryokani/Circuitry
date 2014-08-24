package com.ryokani.circuitry.init;

import com.ryokani.circuitry.item.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModItems {
    public static final ItemCircuitry PCB = new ItemPCB();
    public static final ItemCircuitry BlankPCB = new ItemBlankPCB();
    public static final ItemCircuitry ingotCopper = new ItemIngotCopper();
    public static final ItemCircuitry ingotTin = new ItemIngotTin();

    public static void init(){
        GameRegistry.registerItem(PCB, "PCB");
        GameRegistry.registerItem(BlankPCB, "BlankPCB");
        GameRegistry.registerItem(ingotCopper, "ingotCopper");
        GameRegistry.registerItem(ingotTin, "ingotTin");

        OreDictionary.registerOre("ingotCopper", ModItems.ingotCopper);
        OreDictionary.registerOre("ingotTin", ModItems.ingotTin);
    }
}
