package com.Dennisbonke.morewoods;

import com.Dennisbonke.morewoods.reference.Reference;
import com.Dennisbonke.morewoods.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Morewoods
{
    @Mod.Instance(Reference.MOD_ID)
    public static Morewoods instance;

    @Mod.EventHandler
    public void preInit (FMLPreInitializationEvent event)
    {
        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void Init (FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }
}
