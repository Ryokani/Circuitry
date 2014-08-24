package com.ryokani.circuitry.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {

    public static void init(){

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockCopper), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.ingotCopper)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockTin), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.ingotTin)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.ingotCopper, 9), new ItemStack(ModBlocks.blockCopper)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.ingotTin, 9), new ItemStack(ModBlocks.blockTin)));
    }
}
