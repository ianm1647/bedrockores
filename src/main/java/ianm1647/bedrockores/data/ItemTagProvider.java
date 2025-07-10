package ianm1647.bedrockores.data;

import ianm1647.bedrockores.BedrockOres;
import ianm1647.bedrockores.common.registry.ModItems;
import ianm1647.bedrockores.common.tag.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ItemTagProvider extends ItemTagsProvider {
    public ItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, BedrockOres.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        registerModTags();
        registerNeoTags();
    }

    protected void registerModTags() {
        tag(ModTags.Items.VALID_BEDROCK_ORE_TOOLS).add(
                Items.NETHERITE_PICKAXE
        );

        tag(ModTags.Items.NETHER_QUARTZ).add(Items.QUARTZ);

        tag(ModTags.Items.BEDROCK_ORES).add(
                ModItems.EMPTY_BEDROCK_ORE.get(),
                ModItems.COAL_BEDROCK_ORE.get(),
                ModItems.COPPER_BEDROCK_ORE.get(),
                ModItems.IRON_BEDROCK_ORE.get(),
                ModItems.GOLD_BEDROCK_ORE.get(),
                ModItems.REDSTONE_BEDROCK_ORE.get(),
                ModItems.LAPIS_BEDROCK_CORE.get(),
                ModItems.DIAMOND_BEDROCK_ORE.get(),
                ModItems.EMERALD_BEDROCK_ORE.get(),
                ModItems.EXPERIENCE_BEDROCK_ORE.get(),
                ModItems.LAVA_BEDROCK_ORE.get(),
                ModItems.QUARTZ_BEDROCK_ORE.get(),
                ModItems.DEBRIS_BEDROCK_ORE.get(),

                ModItems.OSMIUM_BEDROCK_ORE.get(),
                ModItems.ALUMINUM_BEDROCK_ORE.get(),
                ModItems.LEAD_BEDROCK_ORE.get(),
                ModItems.NICKEL_BEDROCK_ORE.get(),
                ModItems.URANIUM_BEDROCK_ORE.get(),
                ModItems.FLUORITE_BEDROCK_ORE.get(),
                ModItems.SILVER_BEDROCK_ORE.get(),
                ModItems.TIN_BEDROCK_ORE.get(),
                ModItems.ZINC_BEDROCK_ORE.get()
        );
        tag(ModTags.Items.BEDROCK_CORES).add(
                ModItems.EMPTY_BEDROCK_CORE.get(),
                ModItems.COAL_BEDROCK_CORE.get(),
                ModItems.COPPER_BEDROCK_CORE.get(),
                ModItems.IRON_BEDROCK_CORE.get(),
                ModItems.GOLD_BEDROCK_CORE.get(),
                ModItems.REDSTONE_BEDROCK_CORE.get(),
                ModItems.LAPIS_BEDROCK_CORE.get(),
                ModItems.DIAMOND_BEDROCK_CORE.get(),
                ModItems.EMERALD_BEDROCK_CORE.get(),
                ModItems.EXPERIENCE_BEDROCK_CORE.get(),
                ModItems.LAVA_BEDROCK_CORE.get(),
                ModItems.QUARTZ_BEDROCK_CORE.get(),
                ModItems.DEBRIS_BEDROCK_CORE.get(),

                ModItems.OSMIUM_BEDROCK_CORE.get(),
                ModItems.ALUMINUM_BEDROCK_CORE.get(),
                ModItems.LEAD_BEDROCK_CORE.get(),
                ModItems.NICKEL_BEDROCK_CORE.get(),
                ModItems.URANIUM_BEDROCK_CORE.get(),
                ModItems.FLUORITE_BEDROCK_CORE.get(),
                ModItems.SILVER_BEDROCK_CORE.get(),
                ModItems.TIN_BEDROCK_CORE.get(),
                ModItems.ZINC_BEDROCK_CORE.get()
        );
    }

    protected void registerNeoTags() {
        tag(Tags.Items.ORES_COAL).add(ModItems.COAL_BEDROCK_ORE.get());
        tag(Tags.Items.ORES_COPPER).add(ModItems.COPPER_BEDROCK_ORE.get());
        tag(Tags.Items.ORES_IRON).add(ModItems.IRON_BEDROCK_ORE.get());
        tag(Tags.Items.ORES_GOLD).add(ModItems.GOLD_BEDROCK_ORE.get());
        tag(Tags.Items.ORES_REDSTONE).add(ModItems.REDSTONE_BEDROCK_ORE.get());
        tag(Tags.Items.ORES_LAPIS).add(ModItems.LAPIS_BEDROCK_ORE.get());
        tag(Tags.Items.ORES_DIAMOND).add(ModItems.DIAMOND_BEDROCK_ORE.get());
        tag(Tags.Items.ORES_EMERALD).add(ModItems.EMERALD_BEDROCK_ORE.get());
        tag(Tags.Items.ORES_QUARTZ).add(ModItems.QUARTZ_BEDROCK_ORE.get());
    }
}
