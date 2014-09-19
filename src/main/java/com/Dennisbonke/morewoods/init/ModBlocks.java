package com.Dennisbonke.morewoods.init;

import com.Dennisbonke.morewoods.block.BlockFlag;
import com.Dennisbonke.morewoods.block.BlockMW;
import com.Dennisbonke.morewoods.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockMW flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}
