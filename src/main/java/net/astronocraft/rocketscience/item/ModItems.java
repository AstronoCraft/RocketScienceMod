package net.astronocraft.rocketscience.item;

import net.astronocraft.rocketscience.RocketScience;
import net.astronocraft.rocketscience.item.custom.CopperAnalyserItem;
import net.astronocraft.rocketscience.item.custom.CopperRocketItem;
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
    public static final RegistryObject<Item> COPPER_ROCKET_ITEM = ITEMS.register("copper_rocket",
            () -> new CopperRocketItem(new Item.Properties().tab(ModCreativeModeTab.ROCKET_DEVISE_TAB).stacksTo(1)));
    public static final RegistryObject<Item> IRON_ROCKET_ITEM = ITEMS.register("iron_rocket",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ROCKET_DEVISE_TAB).stacksTo(1)));
    public static final RegistryObject<Item> TITANIUM_ROCKET_ITEM = ITEMS.register("titanium_rocket",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ROCKET_DEVISE_TAB).stacksTo(1)));

    //ANALYSER
    public static final RegistryObject<Item> COPPER_ANALYSER = ITEMS.register("copper_analyser",
            () -> new CopperAnalyserItem(new Item.Properties().tab(ModCreativeModeTab.ROCKET_DEVISE_TAB).stacksTo(1)));

    public static final RegistryObject<Item> EARTH_COPPER_ANALYSER = ITEMS.register("earth_copper_analyser",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SKY_COPPER_ANALYSER = ITEMS.register("sky_copper_analyser",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SPACE_COPPER_ANALYSER = ITEMS.register("space_copper_analyser",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
