package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class FlintPlus extends Item {
    public FlintPlus() {
        super();
        this.setUnlocalizedName("flint_plus");
        this.setTextureName("minecraft:flint"); // 直接复用原版燧石贴图
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }
}
