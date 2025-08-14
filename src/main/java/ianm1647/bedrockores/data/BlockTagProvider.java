package ianm1647.bedrockores.data;

import ianm1647.bedrockores.BedrockOres;
import ianm1647.bedrockores.common.registry.ModBlocks;
import ianm1647.bedrockores.common.tag.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class BlockTagProvider extends BlockTagsProvider {
    public BlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, BedrockOres.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        registerModTags();
        registerMinecraftTags();
        registerNeoTags();
    }

    protected void registerModTags() {
        tag(ModTags.Blocks.BEDROCK_ORES).add(
                ModBlocks.EMPTY_BEDROCK_ORE.get(),
                ModBlocks.COAL_BEDROCK_ORE.get(),
                ModBlocks.COPPER_BEDROCK_ORE.get(),
                ModBlocks.IRON_BEDROCK_ORE.get(),
                ModBlocks.GOLD_BEDROCK_ORE.get(),
                ModBlocks.REDSTONE_BEDROCK_ORE.get(),
                ModBlocks.LAPIS_BEDROCK_ORE.get(),
                ModBlocks.DIAMOND_BEDROCK_ORE.get(),
                ModBlocks.EMERALD_BEDROCK_ORE.get(),
                ModBlocks.EXPERIENCE_BEDROCK_ORE.get(),
                ModBlocks.LAVA_BEDROCK_ORE.get(),
                ModBlocks.QUARTZ_BEDROCK_ORE.get(),
                ModBlocks.DEBRIS_BEDROCK_ORE.get(),

                ModBlocks.OSMIUM_BEDROCK_ORE.get(),
                ModBlocks.ALUMINUM_BEDROCK_ORE.get(),
                ModBlocks.LEAD_BEDROCK_ORE.get(),
                ModBlocks.NICKEL_BEDROCK_ORE.get(),
                ModBlocks.URANIUM_BEDROCK_ORE.get(),
                ModBlocks.FLUORITE_BEDROCK_ORE.get(),
                ModBlocks.SILVER_BEDROCK_ORE.get(),
                ModBlocks.TIN_BEDROCK_ORE.get(),
                ModBlocks.ZINC_BEDROCK_ORE.get()
        );
    }

    protected void registerMinecraftTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE).addTag(ModTags.Blocks.BEDROCK_ORES);
    }

    protected void registerNeoTags() {
        tag(Tags.Blocks.RELOCATION_NOT_SUPPORTED).addTag(ModTags.Blocks.BEDROCK_ORES);
        tag(Tags.Blocks.ORES_COAL).add(ModBlocks.COAL_BEDROCK_ORE.get());
        tag(Tags.Blocks.ORES_COPPER).add(ModBlocks.COPPER_BEDROCK_ORE.get());
        tag(Tags.Blocks.ORES_IRON).add(ModBlocks.IRON_BEDROCK_ORE.get());
        tag(Tags.Blocks.ORES_GOLD).add(ModBlocks.GOLD_BEDROCK_ORE.get());
        tag(Tags.Blocks.ORES_REDSTONE).add(ModBlocks.REDSTONE_BEDROCK_ORE.get());
        tag(Tags.Blocks.ORES_LAPIS).add(ModBlocks.LAPIS_BEDROCK_ORE.get());
        tag(Tags.Blocks.ORES_DIAMOND).add(ModBlocks.DIAMOND_BEDROCK_ORE.get());
        tag(Tags.Blocks.ORES_EMERALD).add(ModBlocks.EMERALD_BEDROCK_ORE.get());
        tag(Tags.Blocks.ORES_QUARTZ).add(ModBlocks.QUARTZ_BEDROCK_ORE.get());
        tag(Tags.Blocks.ORES_NETHERITE_SCRAP).add(ModBlocks.DEBRIS_BEDROCK_ORE.get());
    }
}
