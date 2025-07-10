package ianm1647.bedrockores.data;

import ianm1647.bedrockores.common.registry.ModBlocks;
import ianm1647.bedrockores.common.registry.ModItems;
import ianm1647.bedrockores.common.tag.CommonTags;
import ianm1647.bedrockores.common.tag.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.tags.TagKey;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.entries.TagEntry;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.neoforged.neoforge.common.Tags;

import java.util.HashSet;
import java.util.Set;

public class BlockDropProvider extends BlockLootSubProvider {
    private final Set<Block> generatedLootTables = new HashSet();

    public BlockDropProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    protected void generate() {

        this.dropSilkTouchItem(ModBlocks.COAL_BEDROCK_ORE.get(), Items.COAL);
        this.itemWhenSilkTouch(ModBlocks.EMPTY_BEDROCK_ORE.get(), ModItems.EMPTY_BEDROCK_CORE.get());
        this.itemWhenSilkTouch(ModBlocks.EXPERIENCE_BEDROCK_ORE.get(), ModItems.EXPERIENCE_BEDROCK_CORE.get());
        this.itemWhenSilkTouch(ModBlocks.LAVA_BEDROCK_ORE.get(), ModItems.LAVA_BEDROCK_CORE.get());

        this.dropSilkTouchTag(ModBlocks.COPPER_BEDROCK_ORE.get(), ModItems.COPPER_BEDROCK_CORE.get(), Tags.Items.RAW_MATERIALS_COPPER);
        this.dropSilkTouchTag(ModBlocks.IRON_BEDROCK_ORE.get(), ModItems.IRON_BEDROCK_CORE.get(), Tags.Items.RAW_MATERIALS_IRON);
        this.dropSilkTouchTag(ModBlocks.GOLD_BEDROCK_ORE.get(), ModItems.GOLD_BEDROCK_CORE.get(), Tags.Items.RAW_MATERIALS_GOLD);
        this.dropSilkTouchTagWithCount(ModBlocks.REDSTONE_BEDROCK_ORE.get(), ModItems.REDSTONE_BEDROCK_CORE.get(), Tags.Items.DUSTS_REDSTONE, 4, 8);
        this.dropSilkTouchTagWithCount(ModBlocks.LAPIS_BEDROCK_ORE.get(), ModItems.LAPIS_BEDROCK_CORE.get(), Tags.Items.GEMS_LAPIS, 4, 8);
        this.dropSilkTouchTag(ModBlocks.DIAMOND_BEDROCK_ORE.get(), ModItems.DIAMOND_BEDROCK_CORE.get(), Tags.Items.GEMS_DIAMOND);
        this.dropSilkTouchTag(ModBlocks.EMERALD_BEDROCK_ORE.get(), ModItems.EMERALD_BEDROCK_CORE.get(), Tags.Items.GEMS_EMERALD);
        this.dropSilkTouchTag(ModBlocks.QUARTZ_BEDROCK_ORE.get(), ModItems.QUARTZ_BEDROCK_CORE.get(), ModTags.Items.NETHER_QUARTZ);
        this.dropSilkTouchTag(ModBlocks.DEBRIS_BEDROCK_ORE.get(), ModItems.DEBRIS_BEDROCK_CORE.get(), Tags.Items.ORES_NETHERITE_SCRAP);

        this.dropSilkTouchTag(ModBlocks.OSMIUM_BEDROCK_ORE.get(), ModItems.OSMIUM_BEDROCK_CORE.get(), CommonTags.Items.OSMIUM_RAW);
        this.dropSilkTouchTag(ModBlocks.ALUMINUM_BEDROCK_ORE.get(), ModItems.ALUMINUM_BEDROCK_CORE.get(), CommonTags.Items.ALUMINUM_RAW);
        this.dropSilkTouchTag(ModBlocks.LEAD_BEDROCK_ORE.get(), ModItems.LEAD_BEDROCK_CORE.get(), CommonTags.Items.LEAD_RAW);
        this.dropSilkTouchTag(ModBlocks.NICKEL_BEDROCK_ORE.get(), ModItems.NICKEL_BEDROCK_CORE.get(), CommonTags.Items.NICKEL_RAW);
        this.dropSilkTouchTag(ModBlocks.URANIUM_BEDROCK_ORE.get(), ModItems.URANIUM_BEDROCK_CORE.get(), CommonTags.Items.URANIUM_RAW);
        this.dropSilkTouchTagWithCount(ModBlocks.FLUORITE_BEDROCK_ORE.get(), ModItems.FLUORITE_BEDROCK_CORE.get(), CommonTags.Items.FLUORITE_RAW, 2, 4);
        this.dropSilkTouchTag(ModBlocks.SILVER_BEDROCK_ORE.get(), ModItems.SILVER_BEDROCK_CORE.get(), CommonTags.Items.SILVER_RAW);
        this.dropSilkTouchTag(ModBlocks.TIN_BEDROCK_ORE.get(), ModItems.TIN_BEDROCK_CORE.get(), CommonTags.Items.TIN_RAW);
        this.dropSilkTouchTag(ModBlocks.ZINC_BEDROCK_ORE.get(), ModItems.ZINC_BEDROCK_CORE.get(), CommonTags.Items.ZINC_RAW);
    }

    protected void dropOtherTag(Block block, TagKey<Item> tag) {
        this.add(block, this.createSingleTagTable(block, tag));
    }

    protected void dropSilkTouchItem(Block block, Item item) {
        this.add(block, createSingleItemTableWithSilkTouch(block, item));
    }

    protected void dropSilkTouchTag(Block block, Item item, TagKey<Item> tag) {
        this.add(block, createSingleTagTableWithSilkTouch(block, item, tag));
    }

    protected void dropSilkTouchTagWithCount(Block block, Item item, TagKey<Item> tag, int min, int max) {
        this.add(block, createSingleTagTableWithSilkTouchWithCount(block, item, tag, min, max));
    }

    protected void itemWhenSilkTouch(Block block, Item other) {
        this.add(block, this.createSilkTouchOnlyTable(other));
    }

    public LootTable.Builder createSingleTagTable(Block block, TagKey<Item> tag) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return LootTable.lootTable().withPool(this.applyExplosionCondition(block, LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(TagEntry.tagContents(tag))).apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE))));
    }

    protected LootTable.Builder createSingleTagTableWithSilkTouchWithCount(Block block, Item item, TagKey<Item> tag, int min, int max) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSpecialSilkTouchDispatchTable(item, this.applyExplosionDecay(block, TagEntry.tagContents(tag).apply(SetItemCountFunction.setCount(UniformGenerator.between(min, max))).apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    protected LootTable.Builder createSingleTagTableWithSilkTouch(Block block, Item item, TagKey<Item> tag) {
        return this.createSpecialSilkTouchDispatchTable(item, this.applyExplosionDecay(block, TagEntry.tagContents(tag)));
    }

    protected LootTable.Builder createSpecialSilkTouchDispatchTable(Item item, LootPoolEntryContainer.Builder<?> builder) {
        return createSpecialSelfDropDispatchTable(item, this.hasSilkTouch(), builder);
    }

    protected LootTable.Builder createSpecialSelfDropDispatchTable(Item item, LootItemCondition.Builder conditionBuilder, LootPoolEntryContainer.Builder<?> alternativeBuilder) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(item).when(conditionBuilder).otherwise(alternativeBuilder)).apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))                                   );
    }

    protected void add(Block block, LootTable.Builder builder) {
        this.generatedLootTables.add(block);
        this.map.put(block.getLootTable(), builder);
    }

    protected Iterable<Block> getKnownBlocks() {
        return this.generatedLootTables;
    }
}
