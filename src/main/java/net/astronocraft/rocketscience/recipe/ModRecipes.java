package net.astronocraft.rocketscience.recipe;

import net.astronocraft.rocketscience.RocketScience;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, RocketScience.MOD_ID);

    public static final RegistryObject<RecipeSerializer<RocketBuilderRecipe>> ROCKET_BUILDER_SERIALIZER =
            SERIALIZERS.register("rocket_building", () -> RocketBuilderRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
        Registry.register(Registry.RECIPE_TYPE, RocketBuilderRecipe.Type.ID, RocketBuilderRecipe.Type.INSTANCE);
    }
}