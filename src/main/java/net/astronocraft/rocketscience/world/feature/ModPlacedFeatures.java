package net.astronocraft.rocketscience.world.feature;

import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    //TITANIUM
    public static final PlacedFeature TITANIUM_ORE_PLACED = PlacementUtils.register("titanium_ore_placed",
            ModConfiguredFeatures.TITANIUM_ORE.placed(ModOrePlacement.commonOrePlacement(6, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
}
