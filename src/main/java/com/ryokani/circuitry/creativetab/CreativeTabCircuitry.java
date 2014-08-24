package com.ryokani.circuitry.creativetab;

import com.ryokani.circuitry.init.ModItems;
import com.ryokani.circuitry.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabCircuitry {

    public static final CreativeTabs Circuitry_Tab = new CreativeTabs(Reference.Mod_ID.toLowerCase()) {

        @Override
        public Item getTabIconItem() {

            return ModItems.PCB;
        }
    };
}
