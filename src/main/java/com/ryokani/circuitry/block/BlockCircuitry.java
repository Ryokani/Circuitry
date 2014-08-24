package com.ryokani.circuitry.block;

import com.ryokani.circuitry.creativetab.CreativeTabCircuitry;
import com.ryokani.circuitry.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockCircuitry extends Block {

    public BlockCircuitry(Material material){
        super(material);
        this.setCreativeTab(CreativeTabCircuitry.Circuitry_Tab);
    }

    public BlockCircuitry() {
       this(Material.iron);
    }

    @Override
    public String getUnlocalizedName(){
        return String.format("tile.%s%s", Reference.Mod_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
