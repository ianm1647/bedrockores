package ianm1647.bedrockores.data;

import ianm1647.bedrockores.BedrockOres;
import ianm1647.bedrockores.common.registry.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class BlockStatesProvider extends BlockStateProvider {
    public BlockStatesProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, BedrockOres.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        this.simpleBlock(ModBlocks.EMPTY_BEDROCK_ORE.get());
        this.simpleBlock(ModBlocks.COAL_BEDROCK_ORE.get());
        this.simpleBlock(ModBlocks.COPPER_BEDROCK_ORE.get());
        this.simpleBlock(ModBlocks.IRON_BEDROCK_ORE.get());
        this.simpleBlock(ModBlocks.GOLD_BEDROCK_ORE.get());
        this.simpleBlock(ModBlocks.REDSTONE_BEDROCK_ORE.get());
        this.simpleBlock(ModBlocks.LAPIS_BEDROCK_ORE.get());
        this.simpleBlock(ModBlocks.DIAMOND_BEDROCK_ORE.get());
        this.simpleBlock(ModBlocks.EMERALD_BEDROCK_ORE.get());
        this.simpleBlock(ModBlocks.EXPERIENCE_BEDROCK_ORE.get());
        this.simpleBlock(ModBlocks.LAVA_BEDROCK_ORE.get());
        this.simpleBlock(ModBlocks.QUARTZ_BEDROCK_ORE.get());
        this.simpleBlock(ModBlocks.DEBRIS_BEDROCK_ORE.get());

        this.simpleBlock(ModBlocks.OSMIUM_BEDROCK_ORE.get());
        this.simpleBlock(ModBlocks.ALUMINUM_BEDROCK_ORE.get());
        this.simpleBlock(ModBlocks.LEAD_BEDROCK_ORE.get());
        this.simpleBlock(ModBlocks.NICKEL_BEDROCK_ORE.get());
        this.simpleBlock(ModBlocks.URANIUM_BEDROCK_ORE.get());
        this.simpleBlock(ModBlocks.FLUORITE_BEDROCK_ORE.get());
        this.simpleBlock(ModBlocks.SILVER_BEDROCK_ORE.get());
        this.simpleBlock(ModBlocks.TIN_BEDROCK_ORE.get());
        this.simpleBlock(ModBlocks.ZINC_BEDROCK_ORE.get());

    }
}
