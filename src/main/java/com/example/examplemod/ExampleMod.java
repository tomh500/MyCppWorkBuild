package com.example.examplemod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";

    // 声明物品
    public static Item flintPlus;

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());

        // 注册新物品
        flintPlus = new FlintPlus();
        GameRegistry.registerItem(flintPlus, "flint_plus");

        // 无序配方：燧石 → 燧石+
        GameRegistry.addShapelessRecipe(new ItemStack(flintPlus), new ItemStack(Items.flint));

        // 无序配方：燧石+ + 铁锭 → 打火石（原版物品）
        GameRegistry.addShapelessRecipe(new ItemStack(Items.flintAndSteel),
                new ItemStack(flintPlus),
                new ItemStack(Items.iron_ingot));
    }
}
