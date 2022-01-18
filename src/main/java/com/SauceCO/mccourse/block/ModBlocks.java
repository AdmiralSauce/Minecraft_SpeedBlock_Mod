package com.SauceCO.mccourse.block;

import com.SauceCO.mccourse.MCCourseMod;
import com.SauceCO.mccourse.item.ModCreativeModeTab;
import com.SauceCO.mccourse.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MCCourseMod.MOD_ID);

    //Added first block, Cobalt Block
    public static final RegistryObject<Block> COBALT_BLOCK = registerBlock("cobalt_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(5f).requiresCorrectToolForDrops().jumpFactor(2f).speedFactor(2f)), ModCreativeModeTab.COURSE_TAB);

    //Second block, ore
    public static final RegistryObject<Block> COBALT_ORE = registerBlock("cobalt_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.COURSE_TAB);

    //Deep ore
    public static final RegistryObject<Block> COBALT_DEEPSLATE = registerBlock("cobalt_deepslate",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.COURSE_TAB);

    //raw cobalt block
    public static final RegistryObject<Block> RAW_COBALT_BLOCK = registerBlock("raw_cobalt_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4f).requiresCorrectToolForDrops().speedFactor(1.5f).jumpFactor(1.5f)), ModCreativeModeTab.COURSE_TAB);

    //creates the block, but does not create item for block, so it calls other helper method to create item for block.
    //if you need a block that doesn't have an item form, create a new method does not call the registerBlockItem method.
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    //creates item for block
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    //here bc we called deferred register
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
