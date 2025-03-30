package ianm1647.bedrockores.common.world;

import ianm1647.bedrockores.BedrockOres;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.List;

public class ModBiomeModifiers {
    private static String MODID = BedrockOres.MODID;

    public static ResourceKey<BiomeModifier> EMPTY_BEDROCK_ORE = create("empty_bedrock_ore");
    public static ResourceKey<BiomeModifier> EMPTY_BEDROCK_ORE_NETHER = create("empty_bedrock_ore_nether");

    public static ResourceKey<BiomeModifier> COAL_BEDROCK_ORE = create("coal_bedrock_ore");
    public static ResourceKey<BiomeModifier> COPPER_BEDROCK_ORE = create("copper_bedrock_ore");
    public static ResourceKey<BiomeModifier> IRON_BEDROCK_ORE = create("iron_bedrock_ore");
    public static ResourceKey<BiomeModifier> GOLD_BEDROCK_ORE = create("gold_bedrock_ore");
    public static ResourceKey<BiomeModifier> REDSTONE_BEDROCK_ORE = create("redstone_bedrock_ore");
    public static ResourceKey<BiomeModifier> LAPIS_BEDROCK_ORE = create("lapis_bedrock_ore");
    public static ResourceKey<BiomeModifier> DIAMOND_BEDROCK_ORE = create("diamond_bedrock_ore");
    public static ResourceKey<BiomeModifier> EMERALD_BEDROCK_ORE = create("emerald_bedrock_ore");
    public static ResourceKey<BiomeModifier> EXPERIENCE_BEDROCK_ORE = create("experience_bedrock_ore");
    public static ResourceKey<BiomeModifier> LAVA_BEDROCK_ORE = create("lava_bedrock_ore");
    public static ResourceKey<BiomeModifier> QUARTZ_BEDROCK_ORE = create("quartz_bedrock_ore");
    public static ResourceKey<BiomeModifier> DEBRIS_BEDROCK_ORE = create("debris_bedrock_ore");

    public static ResourceKey<BiomeModifier> OSMIUM_BEDROCK_ORE = create("osmium_bedrock_ore");
    public static ResourceKey<BiomeModifier> ALUMINUM_BEDROCK_ORE = create("aluminum_bedrock_ore");
    public static ResourceKey<BiomeModifier> LEAD_BEDROCK_ORE = create("lead_bedrock_ore");
    public static ResourceKey<BiomeModifier> NICKEL_BEDROCK_ORE = create("nickel_bedrock_ore");
    public static ResourceKey<BiomeModifier> URANIUM_BEDROCK_ORE = create("uranium_bedrock_ore");
    public static ResourceKey<BiomeModifier> FLUORITE_BEDROCK_ORE = create("fluorite_bedrock_ore");
    public static ResourceKey<BiomeModifier> SILVER_BEDROCK_ORE = create("silver_bedrock_ore");
    public static ResourceKey<BiomeModifier> TIN_BEDROCK_ORE = create("tin_bedrock_ore");
    public static ResourceKey<BiomeModifier> ZINC_BEDROCK_ORE = create("zinc_bedrock_ore");

    public static List<ResourceKey<BiomeModifier>> overworldOres = List.of(
            COAL_BEDROCK_ORE, COPPER_BEDROCK_ORE, IRON_BEDROCK_ORE, GOLD_BEDROCK_ORE, REDSTONE_BEDROCK_ORE, LAPIS_BEDROCK_ORE, DIAMOND_BEDROCK_ORE, EMERALD_BEDROCK_ORE, EXPERIENCE_BEDROCK_ORE,
            LAVA_BEDROCK_ORE, OSMIUM_BEDROCK_ORE, ALUMINUM_BEDROCK_ORE, LEAD_BEDROCK_ORE, NICKEL_BEDROCK_ORE, URANIUM_BEDROCK_ORE, FLUORITE_BEDROCK_ORE,
            SILVER_BEDROCK_ORE, TIN_BEDROCK_ORE, ZINC_BEDROCK_ORE
    );

    public static List<ResourceKey<BiomeModifier>> netherOres = List.of(
            QUARTZ_BEDROCK_ORE, DEBRIS_BEDROCK_ORE
    );

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(EMPTY_BEDROCK_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.EMPTY_BEDROCK_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(EMPTY_BEDROCK_ORE_NETHER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.EMPTY_BEDROCK_ORE_NETHER)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        for (int i = 0, j = 0; i < overworldOres.size() && j < ModPlacedFeatures.overworldOres.size(); i++, j++) {
            ResourceKey<BiomeModifier> modifier = overworldOres.get(i);
            ResourceKey<PlacedFeature> feature = ModPlacedFeatures.overworldOres.get(j);

            context.register(modifier, new BiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(Tags.Biomes.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(feature)),
                    GenerationStep.Decoration.UNDERGROUND_ORES));

        }

        for (int i = 0, j = 0; i < netherOres.size() && j < ModPlacedFeatures.netherOres.size(); i++, j++) {
            ResourceKey<BiomeModifier> modifier = netherOres.get(i);
            ResourceKey<PlacedFeature> feature = ModPlacedFeatures.netherOres.get(j);

            context.register(modifier, new BiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(Tags.Biomes.IS_NETHER),
                    HolderSet.direct(placedFeatures.getOrThrow(feature)),
                    GenerationStep.Decoration.UNDERGROUND_ORES));

        }
    }

    private static ResourceKey<BiomeModifier> create(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(MODID, name));
    }

}
