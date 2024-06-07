package com.snaap6391.coppertoolsmod.modstuff;

import com.snaap6391.coppertoolsmod.coppertoolsmod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, coppertoolsmod.MOD_ID);

    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(modtier.COPPER, 2, -2.4f, new Item.Properties().tab
                    (CreativeModeTab.TAB_COMBAT))) ;
    public static final RegistryObject<Item> COPPER_PICK = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(modtier.COPPER, 0, -2.8f, new Item.Properties().tab
                    (CreativeModeTab.TAB_TOOLS))) ;
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(modtier.COPPER, 0, -3f, new Item.Properties().tab
                    (CreativeModeTab.TAB_TOOLS))) ;
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(modtier.COPPER, 0, -3f, new Item.Properties().tab
                    (CreativeModeTab.TAB_TOOLS))) ;
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new ArmorItem(modItemMaterial.Copper, EquipmentSlot.FEET, new Item.Properties().tab
                    (CreativeModeTab.TAB_COMBAT))) ;
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(modtier.COPPER, 6, -3.1f, new Item.Properties().tab
                    (CreativeModeTab.TAB_TOOLS))) ;
    public static final RegistryObject<Item> COPPER_chestplate = ITEMS.register("copper_chestplate",
            () -> new ArmorItem(modItemMaterial.Copper, EquipmentSlot.CHEST, new Item.Properties().tab
                    (CreativeModeTab.TAB_COMBAT))) ;
    public static final RegistryObject<Item> COPPER_leggings = ITEMS.register("copper_leggings",
            () -> new ArmorItem(modItemMaterial.Copper, EquipmentSlot.LEGS, new Item.Properties().tab
                    (CreativeModeTab.TAB_COMBAT))) ;
    public static final RegistryObject<Item> COPPER_helmet = ITEMS.register("copper_helmet",
            () -> new ArmorItem(modItemMaterial.Copper, EquipmentSlot.HEAD, new Item.Properties().tab
                    (CreativeModeTab.TAB_COMBAT))) ;
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
