package ianm1647.bedrockores.common.world;

import ianm1647.bedrockores.common.registry.ModBlocks;
import net.minecraft.world.level.block.Block;

import java.util.List;

public class OreList {
    public static List<Block> overworldOres = List.of(
            ModBlocks.COAL_BEDROCK_ORE.get(), ModBlocks.COPPER_BEDROCK_ORE.get(), ModBlocks.IRON_BEDROCK_ORE.get(), ModBlocks.GOLD_BEDROCK_ORE.get(),
            ModBlocks.REDSTONE_BEDROCK_ORE.get(), ModBlocks.LAPIS_BEDROCK_ORE.get(), ModBlocks.DIAMOND_BEDROCK_ORE.get(), ModBlocks.EMERALD_BEDROCK_ORE.get(),
            ModBlocks.LAVA_BEDROCK_ORE.get(), ModBlocks.EXPERIENCE_BEDROCK_ORE.get(), ModBlocks.OSMIUM_BEDROCK_ORE.get(), ModBlocks.ALUMINUM_BEDROCK_ORE.get(),
            ModBlocks.LEAD_BEDROCK_ORE.get(), ModBlocks.NICKEL_BEDROCK_ORE.get(), ModBlocks.URANIUM_BEDROCK_ORE.get(), ModBlocks.FLUORITE_BEDROCK_ORE.get(),
            ModBlocks.SILVER_BEDROCK_ORE.get(), ModBlocks.TIN_BEDROCK_ORE.get(), ModBlocks.ZINC_BEDROCK_ORE.get()
    );

    public static List<Block> netherOres = List.of(
            ModBlocks.QUARTZ_BEDROCK_ORE.get(), ModBlocks.DEBRIS_BEDROCK_ORE.get()
    );
}
