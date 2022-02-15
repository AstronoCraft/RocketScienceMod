package net.astronocraft.rocketscience.world.feature;

import net.astronocraft.rocketscience.block.ModBlocks;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class ModConfiguredFeatures {
    //TITANIUM
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_TITANIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TITANIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_TITANIUM_ORE.get().defaultBlockState()));

    public static final ConfiguredFeature<?, ?> TITANIUM_ORE = FeatureUtils.register("titanium_ore",
            Feature.ORE.configured(new OreConfiguration(OVERWORLD_TITANIUM_ORES, 8)));
}
