package ianm1647.bedrockores.common.registry;

import ianm1647.bedrockores.BedrockOres;
import ianm1647.bedrockores.common.block.BedrockOreBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS;

    public static Supplier<Block> EMPTY_BEDROCK_ORE;
    public static Supplier<Block> COAL_BEDROCK_ORE;
    public static Supplier<Block> COPPER_BEDROCK_ORE;
    public static Supplier<Block> IRON_BEDROCK_ORE;
    public static Supplier<Block> GOLD_BEDROCK_ORE;
    public static Supplier<Block> REDSTONE_BEDROCK_ORE;
    public static Supplier<Block> LAPIS_BEDROCK_ORE;
    public static Supplier<Block> DIAMOND_BEDROCK_ORE;
    public static Supplier<Block> EMERALD_BEDROCK_ORE;
    public static Supplier<Block> LAVA_BEDROCK_ORE;
    public static Supplier<Block> EXPERIENCE_BEDROCK_ORE;
    public static Supplier<Block> QUARTZ_BEDROCK_ORE;
    public static Supplier<Block> DEBRIS_BEDROCK_ORE;

    public static Supplier<Block> OSMIUM_BEDROCK_ORE;
    public static Supplier<Block> ALUMINUM_BEDROCK_ORE;
    public static Supplier<Block> LEAD_BEDROCK_ORE;
    public static Supplier<Block> NICKEL_BEDROCK_ORE;
    public static Supplier<Block> URANIUM_BEDROCK_ORE;
    public static Supplier<Block> FLUORITE_BEDROCK_ORE;
    public static Supplier<Block> SILVER_BEDROCK_ORE;
    public static Supplier<Block> TIN_BEDROCK_ORE;
    public static Supplier<Block> ZINC_BEDROCK_ORE;

    static {
        BLOCKS = DeferredRegister.create(Registries.BLOCK, BedrockOres.MODID);

        EMPTY_BEDROCK_ORE = BLOCKS.register("empty_bedrock_ore", () -> new BedrockOreBlock(BlockBehaviour.Properties.of()));
        COAL_BEDROCK_ORE = BLOCKS.register("coal_bedrock_ore", () -> new BedrockOreBlock(BlockBehaviour.Properties.of()));
        COPPER_BEDROCK_ORE = BLOCKS.register("copper_bedrock_ore", () -> new BedrockOreBlock(BlockBehaviour.Properties.of()));
        IRON_BEDROCK_ORE = BLOCKS.register("iron_bedrock_ore", () -> new BedrockOreBlock(BlockBehaviour.Properties.of()));
        GOLD_BEDROCK_ORE = BLOCKS.register("gold_bedrock_ore", () -> new BedrockOreBlock(BlockBehaviour.Properties.of()));
        REDSTONE_BEDROCK_ORE = BLOCKS.register("redstone_bedrock_ore", () -> new BedrockOreBlock(BlockBehaviour.Properties.of()));
        LAPIS_BEDROCK_ORE = BLOCKS.register("lapis_bedrock_ore", () -> new BedrockOreBlock(BlockBehaviour.Properties.of()));
        DIAMOND_BEDROCK_ORE = BLOCKS.register("diamond_bedrock_ore", () -> new BedrockOreBlock(BlockBehaviour.Properties.of()));
        EMERALD_BEDROCK_ORE = BLOCKS.register("emerald_bedrock_ore", () -> new BedrockOreBlock(BlockBehaviour.Properties.of()));
        EXPERIENCE_BEDROCK_ORE = BLOCKS.register("experience_bedrock_ore", () -> new BedrockOreBlock(BlockBehaviour.Properties.of()));
        LAVA_BEDROCK_ORE = BLOCKS.register("lava_bedrock_ore", () -> new BedrockOreBlock(BlockBehaviour.Properties.of().lightLevel((i) -> 14)));
        QUARTZ_BEDROCK_ORE = BLOCKS.register("quartz_bedrock_ore", () -> new BedrockOreBlock(BlockBehaviour.Properties.of()));
        DEBRIS_BEDROCK_ORE = BLOCKS.register("debris_bedrock_ore", () -> new BedrockOreBlock(BlockBehaviour.Properties.of()));

        OSMIUM_BEDROCK_ORE = BLOCKS.register("osmium_bedrock_ore", () -> new BedrockOreBlock(BlockBehaviour.Properties.of()));
        ALUMINUM_BEDROCK_ORE = BLOCKS.register("aluminum_bedrock_ore", () -> new BedrockOreBlock(BlockBehaviour.Properties.of()));
        LEAD_BEDROCK_ORE = BLOCKS.register("lead_bedrock_ore", () -> new BedrockOreBlock(BlockBehaviour.Properties.of()));
        NICKEL_BEDROCK_ORE = BLOCKS.register("nickel_bedrock_ore", () -> new BedrockOreBlock(BlockBehaviour.Properties.of()));
        URANIUM_BEDROCK_ORE = BLOCKS.register("uranium_bedrock_ore", () -> new BedrockOreBlock(BlockBehaviour.Properties.of()));
        FLUORITE_BEDROCK_ORE = BLOCKS.register("fluorite_bedrock_ore", () -> new BedrockOreBlock(BlockBehaviour.Properties.of()));
        SILVER_BEDROCK_ORE = BLOCKS.register("silver_bedrock_ore", () -> new BedrockOreBlock(BlockBehaviour.Properties.of()));
        TIN_BEDROCK_ORE = BLOCKS.register("tin_bedrock_ore", () -> new BedrockOreBlock(BlockBehaviour.Properties.of()));
        ZINC_BEDROCK_ORE = BLOCKS.register("zinc_bedrock_ore", () -> new BedrockOreBlock(BlockBehaviour.Properties.of()));

    }
}
