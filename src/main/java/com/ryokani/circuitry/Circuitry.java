package com.ryokani.circuitry;

import com.ryokani.circuitry.handler.ConfigurationHandler;
import com.ryokani.circuitry.init.ModBlocks;
import com.ryokani.circuitry.init.ModItems;
import com.ryokani.circuitry.init.Recipes;
import com.ryokani.circuitry.proxy.IProxy;
import com.ryokani.circuitry.reference.Reference;
import com.ryokani.circuitry.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.Mod_ID, name = Reference.Mod_Name, version = Reference.Version, guiFactory = Reference.Gui_Factory_Class)
public class Circuitry {

    @Mod.Instance(Reference.Mod_ID)
    public static Circuitry instance;

    @SidedProxy(clientSide = Reference.Client_Proxy_Class, serverSide = Reference.Server_Proxy_Class)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInt(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initialization Complete!");

        ModItems.init();

        ModBlocks.init();
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {
        LogHelper.info("Initialization Complete!");

        Recipes.init();
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        LogHelper.info("Post Initialization Complete!");
    }
}
