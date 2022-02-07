package net.astronocraft.rocketscience.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab ROCKET_TAB = new CreativeModeTab("rocket_block_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TITANIUM_INGOT.get());
        }
    };

    public static final CreativeModeTab ROCKET_DEVISE_TAB = new CreativeModeTab("rocket_devise_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TITANIUM_ROCKET_ITEM.get());
        }
    };
}
