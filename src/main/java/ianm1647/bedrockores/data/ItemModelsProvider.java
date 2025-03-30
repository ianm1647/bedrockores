package ianm1647.bedrockores.data;

import ianm1647.bedrockores.BedrockOres;
import ianm1647.bedrockores.common.registry.ModBlocks;
import ianm1647.bedrockores.common.registry.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ItemModelsProvider extends ItemModelProvider {
    public ItemModelsProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BedrockOres.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        registerItemModels();
        registerBlockItemModels();
    }

    protected void registerItemModels() {
        this.basicItem(ModItems.EMPTY_BEDROCK_CORE.get());
        this.basicItem(ModItems.COAL_BEDROCK_CORE.get());
        this.basicItem(ModItems.COPPER_BEDROCK_CORE.get());
        this.basicItem(ModItems.IRON_BEDROCK_CORE.get());
        this.basicItem(ModItems.GOLD_BEDROCK_CORE.get());
        this.basicItem(ModItems.REDSTONE_BEDROCK_CORE.get());
        this.basicItem(ModItems.LAPIS_BEDROCK_CORE.get());
        this.basicItem(ModItems.DIAMOND_BEDROCK_CORE.get());
        this.basicItem(ModItems.EMERALD_BEDROCK_CORE.get());
        this.basicItem(ModItems.EXPERIENCE_BEDROCK_CORE.get());
        this.basicItem(ModItems.LAVA_BEDROCK_CORE.get());
        this.basicItem(ModItems.QUARTZ_BEDROCK_CORE.get());
        this.basicItem(ModItems.DEBRIS_BEDROCK_CORE.get());

        this.basicItem(ModItems.OSMIUM_BEDROCK_CORE.get());
        this.basicItem(ModItems.ALUMINUM_BEDROCK_CORE.get());
        this.basicItem(ModItems.LEAD_BEDROCK_CORE.get());
        this.basicItem(ModItems.NICKEL_BEDROCK_CORE.get());
        this.basicItem(ModItems.URANIUM_BEDROCK_CORE.get());
        this.basicItem(ModItems.FLUORITE_BEDROCK_CORE.get());
        this.basicItem(ModItems.SILVER_BEDROCK_CORE.get());
        this.basicItem(ModItems.TIN_BEDROCK_CORE.get());
        this.basicItem(ModItems.ZINC_BEDROCK_CORE.get());
    }

    protected void registerBlockItemModels() {
        this.simpleBlockItem(ModBlocks.EMPTY_BEDROCK_ORE.get());
        this.simpleBlockItem(ModBlocks.COAL_BEDROCK_ORE.get());
        this.simpleBlockItem(ModBlocks.COPPER_BEDROCK_ORE.get());
        this.simpleBlockItem(ModBlocks.IRON_BEDROCK_ORE.get());
        this.simpleBlockItem(ModBlocks.GOLD_BEDROCK_ORE.get());
        this.simpleBlockItem(ModBlocks.REDSTONE_BEDROCK_ORE.get());
        this.simpleBlockItem(ModBlocks.LAPIS_BEDROCK_ORE.get());
        this.simpleBlockItem(ModBlocks.DIAMOND_BEDROCK_ORE.get());
        this.simpleBlockItem(ModBlocks.EMERALD_BEDROCK_ORE.get());
        this.simpleBlockItem(ModBlocks.EXPERIENCE_BEDROCK_ORE.get());
        this.simpleBlockItem(ModBlocks.LAVA_BEDROCK_ORE.get());
        this.simpleBlockItem(ModBlocks.QUARTZ_BEDROCK_ORE.get());
        this.simpleBlockItem(ModBlocks.DEBRIS_BEDROCK_ORE.get());

        this.simpleBlockItem(ModBlocks.OSMIUM_BEDROCK_ORE.get());
        this.simpleBlockItem(ModBlocks.ALUMINUM_BEDROCK_ORE.get());
        this.simpleBlockItem(ModBlocks.LEAD_BEDROCK_ORE.get());
        this.simpleBlockItem(ModBlocks.NICKEL_BEDROCK_ORE.get());
        this.simpleBlockItem(ModBlocks.URANIUM_BEDROCK_ORE.get());
        this.simpleBlockItem(ModBlocks.FLUORITE_BEDROCK_ORE.get());
        this.simpleBlockItem(ModBlocks.SILVER_BEDROCK_ORE.get());
        this.simpleBlockItem(ModBlocks.TIN_BEDROCK_ORE.get());
        this.simpleBlockItem(ModBlocks.ZINC_BEDROCK_ORE.get());
    }
}

