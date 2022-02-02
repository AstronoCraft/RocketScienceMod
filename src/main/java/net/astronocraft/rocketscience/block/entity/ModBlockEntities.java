package net.astronocraft.rocketscience.block.entity;

import net.astronocraft.rocketscience.RocketScience;
import net.astronocraft.rocketscience.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, RocketScience.MOD_ID);

    public static final RegistryObject<BlockEntityType<RocketBuilderBlockEntity>> ROCKET_BUILDER =
            BLOCK_ENTITIES.register("rocket_builder", () ->
                    BlockEntityType.Builder.of(RocketBuilderBlockEntity::new,
                            ModBlocks.ROCKET_BUILDER.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
