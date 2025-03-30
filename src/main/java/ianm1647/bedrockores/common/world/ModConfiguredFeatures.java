package ianm1647.bedrockores.common.world;

import ianm1647.bedrockores.BedrockOres;
import ianm1647.bedrockores.common.registry.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

import java.util.List;

public class ModConfiguredFeatures {
    private static String MODID = BedrockOres.MODID;

    public static ResourceKey<ConfiguredFeature<?, ?>> EMPTY_BEDROCK_ORE = create("empty_bedrock_ore");
    public static ResourceKey<ConfiguredFeature<?, ?>> EMPTY_BEDROCK_ORE_NETHER = create("empty_bedrock_ore_nether");

    public static ResourceKey<ConfiguredFeature<?, ?>> COAL_BEDROCK_ORE = create("coal_bedrock_ore");
    public static ResourceKey<ConfiguredFeature<?, ?>> COPPER_BEDROCK_ORE = create("copper_bedrock_ore");
    public static ResourceKey<ConfiguredFeature<?, ?>> IRON_BEDROCK_ORE = create("iron_bedrock_ore");
    public static ResourceKey<ConfiguredFeature<?, ?>> GOLD_BEDROCK_ORE = create("gold_bedrock_ore");
    public static ResourceKey<ConfiguredFeature<?, ?>> REDSTONE_BEDROCK_ORE = create("redstone_bedrock_ore");
    public static ResourceKey<ConfiguredFeature<?, ?>> LAPIS_BEDROCK_ORE = create("lapis_bedrock_ore");
    public static ResourceKey<ConfiguredFeature<?, ?>> DIAMOND_BEDROCK_ORE = create("diamond_bedrock_ore");
    public static ResourceKey<ConfiguredFeature<?, ?>> EMERALD_BEDROCK_ORE = create("emerald_bedrock_ore");
    public static ResourceKey<ConfiguredFeature<?, ?>> EXPERIENCE_BEDROCK_ORE = create("experience_bedrock_ore");
    public static ResourceKey<ConfiguredFeature<?, ?>> LAVA_BEDROCK_ORE = create("lava_bedrock_ore");
    public static ResourceKey<ConfiguredFeature<?, ?>> QUARTZ_BEDROCK_ORE = create("quartz_bedrock_ore");
    public static ResourceKey<ConfiguredFeature<?, ?>> DEBRIS_BEDROCK_ORE = create("debris_bedrock_ore");

    public static ResourceKey<ConfiguredFeature<?, ?>> OSMIUM_BEDROCK_ORE = create("osmium_bedrock_ore");
    public static ResourceKey<ConfiguredFeature<?, ?>> ALUMINUM_BEDROCK_ORE = create("aluminum_bedrock_ore");
    public static ResourceKey<ConfiguredFeature<?, ?>> LEAD_BEDROCK_ORE = create("lead_bedrock_ore");
    public static ResourceKey<ConfiguredFeature<?, ?>> NICKEL_BEDROCK_ORE = create("nickel_bedrock_ore");
    public static ResourceKey<ConfiguredFeature<?, ?>> URANIUM_BEDROCK_ORE = create("uranium_bedrock_ore");
    public static ResourceKey<ConfiguredFeature<?, ?>> FLUORITE_BEDROCK_ORE = create("fluorite_bedrock_ore");
    public static ResourceKey<ConfiguredFeature<?, ?>> SILVER_BEDROCK_ORE = create("silver_bedrock_ore");
    public static ResourceKey<ConfiguredFeature<?, ?>> TIN_BEDROCK_ORE = create("tin_bedrock_ore");
    public static ResourceKey<ConfiguredFeature<?, ?>> ZINC_BEDROCK_ORE = create("zinc_bedrock_ore");

    public static List<ResourceKey<ConfiguredFeature<?, ?>>> overworldOres = List.of(
            COAL_BEDROCK_ORE, COPPER_BEDROCK_ORE, IRON_BEDROCK_ORE, GOLD_BEDROCK_ORE, REDSTONE_BEDROCK_ORE, LAPIS_BEDROCK_ORE, DIAMOND_BEDROCK_ORE, EMERALD_BEDROCK_ORE, EXPERIENCE_BEDROCK_ORE,
            LAVA_BEDROCK_ORE, OSMIUM_BEDROCK_ORE, ALUMINUM_BEDROCK_ORE, LEAD_BEDROCK_ORE, NICKEL_BEDROCK_ORE, URANIUM_BEDROCK_ORE, FLUORITE_BEDROCK_ORE,
            SILVER_BEDROCK_ORE, TIN_BEDROCK_ORE, ZINC_BEDROCK_ORE
    );

    public static List<ResourceKey<ConfiguredFeature<?, ?>>> netherOres = List.of(
            QUARTZ_BEDROCK_ORE, DEBRIS_BEDROCK_ORE
    );

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest bedrockReplaceables = new BlockMatchTest(Blocks.BEDROCK);

        context.register(EMPTY_BEDROCK_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(OreConfiguration.target(bedrockReplaceables, ModBlocks.EMPTY_BEDROCK_ORE.get().defaultBlockState())), 8)));

        context.register(EMPTY_BEDROCK_ORE_NETHER, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(OreConfiguration.target(bedrockReplaceables, ModBlocks.EMPTY_BEDROCK_ORE.get().defaultBlockState())), 8)));

        for (int i = 0, j = 0; i < overworldOres.size() && j < OreList.overworldOres.size(); i++, j++) {
            ResourceKey<ConfiguredFeature<?, ?>> feature = overworldOres.get(i);
            Block block = OreList.overworldOres.get(j);

            context.register(feature, new ConfiguredFeature<>(Feature.ORE,
                    new OreConfiguration(List.of(OreConfiguration.target(bedrockReplaceables, block.defaultBlockState())), 3)));

        }

        for (int i = 0, j = 0; i < netherOres.size() && j < OreList.netherOres.size(); i++, j++) {
            ResourceKey<ConfiguredFeature<?, ?>> feature = netherOres.get(i);
            Block block = OreList.netherOres.get(j);

            context.register(feature, new ConfiguredFeature<>(Feature.ORE,
                    new OreConfiguration(List.of(OreConfiguration.target(bedrockReplaceables, block.defaultBlockState())), 3)));

        }
    }

    private static ResourceKey<ConfiguredFeature<?, ?>> create(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MODID, name));
    }

}
