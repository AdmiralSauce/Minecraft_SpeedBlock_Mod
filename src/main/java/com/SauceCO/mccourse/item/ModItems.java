package com.SauceCO.mccourse.item;

import com.SauceCO.mccourse.MCCourseMod;
import com.SauceCO.mccourse.item.custom.DowsingRodItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MCCourseMod.MOD_ID);

    //first item cobalt_ingot, item is registered
    public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));
    //second item cobalt_nugget
    public static final RegistryObject<Item> COBALT_NUGGET= ITEMS.register("cobalt_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));
    //raw_cobalt
    public static final RegistryObject<Item> RAW_COBALT= ITEMS.register("raw_cobalt",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));
    //item...?
    public static final RegistryObject<Item> POWER_STAFF= ITEMS.register("cobalt_staff",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));
    //power item???
    public static final RegistryObject<Item> COBALT_STICK= ITEMS.register("cobalt_stick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));
    //food item
    public static final RegistryObject<Item> TURNIP= ITEMS.register("turnip",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB).food(ModFoods.TURNIP)));

    //dowsing rod
    public static final RegistryObject<Item> DOWSING_ROD= ITEMS.register("dowsing_rod",
            () -> new DowsingRodItem(new Item.Properties().durability(5).tab(ModCreativeModeTab.COURSE_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
