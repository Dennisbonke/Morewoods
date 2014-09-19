package com.Dennisbonke.morewoods.init;

import com.Dennisbonke.morewoods.item.ItemMW;
import com.Dennisbonke.morewoods.item.ItemMapleLeaf;
import com.Dennisbonke.morewoods.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static  final ItemMW mapleleaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleleaf, "mapleLeaf");
    }
}
