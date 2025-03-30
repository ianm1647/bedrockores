package ianm1647.bedrockores.common.world;

import ianm1647.bedrockores.BedrockOres;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

public class ModPlacedFeatures {
    private static String MODID = BedrockOres.MODID;

    public static ResourceKey<PlacedFeature> EMPTY_BEDROCK_ORE = create("empty_bedrock_ore");
    public static ResourceKey<PlacedFeature> EMPTY_BEDROCK_ORE_NETHER = create("empty_bedrock_ore_nether");

    public static ResourceKey<PlacedFeature> COAL_BEDROCK_ORE = create("coal_bedrock_ore");
    public static ResourceKey<PlacedFeature> COPPER_BEDROCK_ORE = create("copper_bedrock_ore");
    public static ResourceKey<PlacedFeature> IRON_BEDROCK_ORE = create("iron_bedrock_ore");
    public static ResourceKey<PlacedFeature> GOLD_BEDROCK_ORE = create("gold_bedrock_ore");
    public static ResourceKey<PlacedFeature> REDSTONE_BEDROCK_ORE = create("redstone_bedrock_ore");
    public static ResourceKey<PlacedFeature> LAPIS_BEDROCK_ORE = create("lapis_bedrock_ore");
    public static ResourceKey<PlacedFeature> DIAMOND_BEDROCK_ORE = create("diamond_bedrock_ore");
    public static ResourceKey<PlacedFeature> EMERALD_BEDROCK_ORE = create("emerald_bedrock_ore");
    public static ResourceKey<PlacedFeature> EXPERIENCE_BEDROCK_ORE = create("experience_bedrock_ore");
    public static ResourceKey<PlacedFeature> LAVA_BEDROCK_ORE = create("lava_bedrock_ore");
    public static ResourceKey<PlacedFeature> QUARTZ_BEDROCK_ORE = create("quartz_bedrock_ore");
    public static ResourceKey<PlacedFeature> DEBRIS_BEDROCK_ORE = create("debris_bedrock_ore");

    public static ResourceKey<PlacedFeature> OSMIUM_BEDROCK_ORE = create("osmium_bedrock_ore");
    public static ResourceKey<PlacedFeature> ALUMINUM_BEDROCK_ORE = create("aluminum_bedrock_ore");
    public static ResourceKey<PlacedFeature> LEAD_BEDROCK_ORE = create("lead_bedrock_ore");
    public static ResourceKey<PlacedFeature> NICKEL_BEDROCK_ORE = create("nickel_bedrock_ore");
    public static ResourceKey<PlacedFeature> URANIUM_BEDROCK_ORE = create("uranium_bedrock_ore");
    public static ResourceKey<PlacedFeature> FLUORITE_BEDROCK_ORE = create("fluorite_bedrock_ore");
    public static ResourceKey<PlacedFeature> SILVER_BEDROCK_ORE = create("silver_bedrock_ore");
    public static ResourceKey<PlacedFeature> TIN_BEDROCK_ORE = create("tin_bedrock_ore");
    public static ResourceKey<PlacedFeature> ZINC_BEDROCK_ORE = create("zinc_bedrock_ore");

    public static List<ResourceKey<PlacedFeature>> overworldOres = List.of(
            COAL_BEDROCK_ORE, COPPER_BEDROCK_ORE, IRON_BEDROCK_ORE, GOLD_BEDROCK_ORE, REDSTONE_BEDROCK_ORE, LAPIS_BEDROCK_ORE, DIAMOND_BEDROCK_ORE, EMERALD_BEDROCK_ORE, EXPERIENCE_BEDROCK_ORE,
            LAVA_BEDROCK_ORE, OSMIUM_BEDROCK_ORE, ALUMINUM_BEDROCK_ORE, LEAD_BEDROCK_ORE, NICKEL_BEDROCK_ORE, URANIUM_BEDROCK_ORE, FLUORITE_BEDROCK_ORE,
            SILVER_BEDROCK_ORE, TIN_BEDROCK_ORE, ZINC_BEDROCK_ORE
    );

    public static List<ResourceKey<PlacedFeature>> netherOres = List.of(
            QUARTZ_BEDROCK_ORE, DEBRIS_BEDROCK_ORE
    );

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        context.register(EMPTY_BEDROCK_ORE, new PlacedFeature(configuredFeatures.getOrThrow(ModConfiguredFeatures.EMPTY_BEDROCK_ORE), OrePlacement.commonOrePlacement(2,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-70), VerticalAnchor.absolute(-60)))));

        context.register(EMPTY_BEDROCK_ORE_NETHER, new PlacedFeature(configuredFeatures.getOrThrow(ModConfiguredFeatures.EMPTY_BEDROCK_ORE_NETHER), OrePlacement.commonOrePlacement(2,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-5), VerticalAnchor.absolute(5)))));

        for (int i = 0, j = 0; i < overworldOres.size() && j < ModConfiguredFeatures.overworldOres.size(); i++, j++) {
            ResourceKey<PlacedFeature> placed = overworldOres.get(i);
            ResourceKey<ConfiguredFeature<?, ?>> feature = ModConfiguredFeatures.overworldOres.get(j);

            context.register(placed, new PlacedFeature(configuredFeatures.getOrThrow(feature), OrePlacement.commonOrePlacement(1,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-70), VerticalAnchor.absolute(-60)))));

        }

        for (int i = 0, j = 0; i < netherOres.size() && j < ModConfiguredFeatures.netherOres.size(); i++, j++) {
            ResourceKey<PlacedFeature> placed = netherOres.get(i);
            ResourceKey<ConfiguredFeature<?, ?>> feature = ModConfiguredFeatures.netherOres.get(j);

            context.register(placed, new PlacedFeature(configuredFeatures.getOrThrow(feature), OrePlacement.commonOrePlacement(1,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-5), VerticalAnchor.absolute(5)))));

        }

    }

    private static ResourceKey<PlacedFeature> create(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MODID, name));
    }
}
