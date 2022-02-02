package net.astronocraft.rocketscience.item;

import net.astronocraft.rocketscience.RocketScience;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RocketScience.MOD_ID);


    //TITANIUM
    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ROCKET_TAB)));

    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ROCKET_TAB)));

    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ROCKET_TAB)));


    //ALUMINIUM
    public static final RegistryObject<Item> ALUMINIUM_FOIL = ITEMS.register("aluminium_foil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ROCKET_TAB)));

    //ROCKETS
    public static final RegistryObject<Item> COPPER_ROCKET = ITEMS.register("copper_rocket",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ROCKET_DEVISE_TAB)));
    public static final RegistryObject<Item> IRON_ROCKET = ITEMS.register("iron_rocket",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ROCKET_DEVISE_TAB)));
    public static final RegistryObject<Item> TITANIUM_ROCKET = ITEMS.register("titanium_rocket",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ROCKET_DEVISE_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
