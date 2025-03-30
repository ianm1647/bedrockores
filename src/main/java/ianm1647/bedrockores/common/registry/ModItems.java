package ianm1647.bedrockores.common.registry;

import com.google.common.collect.Sets;
import ianm1647.bedrockores.BedrockOres;
import ianm1647.bedrockores.common.item.BedrockCoreItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.LinkedHashSet;
import java.util.function.Supplier;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS;
    public static LinkedHashSet<Supplier<Item>> CREATIVE_TAB_ITEMS;

    public static Supplier<Item> EMPTY_BEDROCK_ORE;

    public static Supplier<Item> COAL_BEDROCK_ORE;
    public static Supplier<Item> COPPER_BEDROCK_ORE;
    public static Supplier<Item> IRON_BEDROCK_ORE;
    public static Supplier<Item> GOLD_BEDROCK_ORE;
    public static Supplier<Item> REDSTONE_BEDROCK_ORE;
    public static Supplier<Item> LAPIS_BEDROCK_ORE;
    public static Supplier<Item> DIAMOND_BEDROCK_ORE;
    public static Supplier<Item> EMERALD_BEDROCK_ORE;
    public static Supplier<Item> EXPERIENCE_BEDROCK_ORE;
    public static Supplier<Item> LAVA_BEDROCK_ORE;
    public static Supplier<Item> QUARTZ_BEDROCK_ORE;
    public static Supplier<Item> DEBRIS_BEDROCK_ORE;

    public static Supplier<Item> OSMIUM_BEDROCK_ORE;
    public static Supplier<Item> ALUMINUM_BEDROCK_ORE;
    public static Supplier<Item> LEAD_BEDROCK_ORE;
    public static Supplier<Item> NICKEL_BEDROCK_ORE;
    public static Supplier<Item> URANIUM_BEDROCK_ORE;
    public static Supplier<Item> FLUORITE_BEDROCK_ORE;
    public static Supplier<Item> SILVER_BEDROCK_ORE;
    public static Supplier<Item> TIN_BEDROCK_ORE;
    public static Supplier<Item> ZINC_BEDROCK_ORE;

    public static Supplier<Item> EMPTY_BEDROCK_CORE;

    public static Supplier<Item> COAL_BEDROCK_CORE;
    public static Supplier<Item> COPPER_BEDROCK_CORE;
    public static Supplier<Item> IRON_BEDROCK_CORE;
    public static Supplier<Item> GOLD_BEDROCK_CORE;
    public static Supplier<Item> REDSTONE_BEDROCK_CORE;
    public static Supplier<Item> LAPIS_BEDROCK_CORE;
    public static Supplier<Item> DIAMOND_BEDROCK_CORE;
    public static Supplier<Item> EMERALD_BEDROCK_CORE;
    public static Supplier<Item> EXPERIENCE_BEDROCK_CORE;
    public static Supplier<Item> LAVA_BEDROCK_CORE;
    public static Supplier<Item> QUARTZ_BEDROCK_CORE;
    public static Supplier<Item> DEBRIS_BEDROCK_CORE;

    public static Supplier<Item> OSMIUM_BEDROCK_CORE;
    public static Supplier<Item> ALUMINUM_BEDROCK_CORE;
    public static Supplier<Item> LEAD_BEDROCK_CORE;
    public static Supplier<Item> NICKEL_BEDROCK_CORE;
    public static Supplier<Item> URANIUM_BEDROCK_CORE;
    public static Supplier<Item> FLUORITE_BEDROCK_CORE;
    public static Supplier<Item> SILVER_BEDROCK_CORE;
    public static Supplier<Item> TIN_BEDROCK_CORE;
    public static Supplier<Item> ZINC_BEDROCK_CORE;

    static {
        ITEMS = DeferredRegister.create(Registries.ITEM, BedrockOres.MODID);
        CREATIVE_TAB_ITEMS = Sets.newLinkedHashSet();

        EMPTY_BEDROCK_ORE = registerWithTab("empty_bedrock_ore", () -> new BlockItem(ModBlocks.EMPTY_BEDROCK_ORE.get(), new Item.Properties()));

        COAL_BEDROCK_ORE = registerWithTab("coal_bedrock_ore", () -> new BlockItem(ModBlocks.COAL_BEDROCK_ORE.get(), new Item.Properties()));
        COPPER_BEDROCK_ORE = registerWithTab("copper_bedrock_ore", () -> new BlockItem(ModBlocks.COPPER_BEDROCK_ORE.get(), new Item.Properties()));
        IRON_BEDROCK_ORE = registerWithTab("iron_bedrock_ore", () -> new BlockItem(ModBlocks.IRON_BEDROCK_ORE.get(), new Item.Properties()));
        GOLD_BEDROCK_ORE = registerWithTab("gold_bedrock_ore", () -> new BlockItem(ModBlocks.GOLD_BEDROCK_ORE.get(), new Item.Properties()));
        REDSTONE_BEDROCK_ORE = registerWithTab("redstone_bedrock_ore", () -> new BlockItem(ModBlocks.REDSTONE_BEDROCK_ORE.get(), new Item.Properties()));
        LAPIS_BEDROCK_ORE = registerWithTab("lapis_bedrock_ore", () -> new BlockItem(ModBlocks.LAPIS_BEDROCK_ORE.get(), new Item.Properties()));
        DIAMOND_BEDROCK_ORE = registerWithTab("diamond_bedrock_ore", () -> new BlockItem(ModBlocks.DIAMOND_BEDROCK_ORE.get(), new Item.Properties()));
        EMERALD_BEDROCK_ORE = registerWithTab("emerald_bedrock_ore", () -> new BlockItem(ModBlocks.EMERALD_BEDROCK_ORE.get(), new Item.Properties()));
        EXPERIENCE_BEDROCK_ORE = registerWithTab("experience_bedrock_ore", () -> new BlockItem(ModBlocks.EXPERIENCE_BEDROCK_ORE.get(), new Item.Properties()));
        LAVA_BEDROCK_ORE = registerWithTab("lava_bedrock_ore", () -> new BlockItem(ModBlocks.LAVA_BEDROCK_ORE.get(), new Item.Properties()));
        QUARTZ_BEDROCK_ORE = registerWithTab("quartz_bedrock_ore", () -> new BlockItem(ModBlocks.QUARTZ_BEDROCK_ORE.get(), new Item.Properties()));
        DEBRIS_BEDROCK_ORE = registerWithTab("debris_bedrock_ore", () -> new BlockItem(ModBlocks.DEBRIS_BEDROCK_ORE.get(), new Item.Properties()));

        OSMIUM_BEDROCK_ORE = registerWithTab("osmium_bedrock_ore", () -> new BlockItem(ModBlocks.OSMIUM_BEDROCK_ORE.get(), new Item.Properties()));
        ALUMINUM_BEDROCK_ORE = registerWithTab("aluminum_bedrock_ore", () -> new BlockItem(ModBlocks.ALUMINUM_BEDROCK_ORE.get(), new Item.Properties()));
        LEAD_BEDROCK_ORE = registerWithTab("lead_bedrock_ore", () -> new BlockItem(ModBlocks.LEAD_BEDROCK_ORE.get(), new Item.Properties()));
        NICKEL_BEDROCK_ORE = registerWithTab("nickel_bedrock_ore", () -> new BlockItem(ModBlocks.NICKEL_BEDROCK_ORE.get(), new Item.Properties()));
        URANIUM_BEDROCK_ORE = registerWithTab("uranium_bedrock_ore", () -> new BlockItem(ModBlocks.URANIUM_BEDROCK_ORE.get(), new Item.Properties()));
        FLUORITE_BEDROCK_ORE = registerWithTab("fluorite_bedrock_ore", () -> new BlockItem(ModBlocks.FLUORITE_BEDROCK_ORE.get(), new Item.Properties()));
        SILVER_BEDROCK_ORE = registerWithTab("silver_bedrock_ore", () -> new BlockItem(ModBlocks.SILVER_BEDROCK_ORE.get(), new Item.Properties()));
        TIN_BEDROCK_ORE = registerWithTab("tin_bedrock_ore", () -> new BlockItem(ModBlocks.TIN_BEDROCK_ORE.get(), new Item.Properties()));
        ZINC_BEDROCK_ORE = registerWithTab("zinc_bedrock_ore", () -> new BlockItem(ModBlocks.ZINC_BEDROCK_ORE.get(), new Item.Properties()));

        EMPTY_BEDROCK_CORE = registerWithTab("empty_bedrock_core", () -> new BedrockCoreItem(ModBlocks.EMPTY_BEDROCK_ORE.get(), new Item.Properties()));

        COAL_BEDROCK_CORE = registerWithTab("coal_bedrock_core", () -> new BedrockCoreItem(ModBlocks.COAL_BEDROCK_ORE.get(), new Item.Properties()));
        COPPER_BEDROCK_CORE = registerWithTab("copper_bedrock_core", () -> new BedrockCoreItem(ModBlocks.COPPER_BEDROCK_ORE.get(), new Item.Properties()));
        IRON_BEDROCK_CORE = registerWithTab("iron_bedrock_core", () -> new BedrockCoreItem(ModBlocks.IRON_BEDROCK_ORE.get(), new Item.Properties()));
        GOLD_BEDROCK_CORE = registerWithTab("gold_bedrock_core", () -> new BedrockCoreItem(ModBlocks.GOLD_BEDROCK_ORE.get(), new Item.Properties()));
        REDSTONE_BEDROCK_CORE = registerWithTab("redstone_bedrock_core", () -> new BedrockCoreItem(ModBlocks.REDSTONE_BEDROCK_ORE.get(), new Item.Properties()));
        LAPIS_BEDROCK_CORE = registerWithTab("lapis_bedrock_core", () -> new BedrockCoreItem(ModBlocks.LAPIS_BEDROCK_ORE.get(), new Item.Properties()));
        DIAMOND_BEDROCK_CORE = registerWithTab("diamond_bedrock_core", () -> new BedrockCoreItem(ModBlocks.DIAMOND_BEDROCK_ORE.get(), new Item.Properties()));
        EMERALD_BEDROCK_CORE = registerWithTab("emerald_bedrock_core", () -> new BedrockCoreItem(ModBlocks.EMERALD_BEDROCK_ORE.get(), new Item.Properties()));
        EXPERIENCE_BEDROCK_CORE = registerWithTab("experience_bedrock_core", () -> new BedrockCoreItem(ModBlocks.EXPERIENCE_BEDROCK_ORE.get(), new Item.Properties()));
        LAVA_BEDROCK_CORE = registerWithTab("lava_bedrock_core", () -> new BedrockCoreItem(ModBlocks.LAVA_BEDROCK_ORE.get(), new Item.Properties()));
        QUARTZ_BEDROCK_CORE = registerWithTab("quartz_bedrock_core", () -> new BedrockCoreItem(ModBlocks.QUARTZ_BEDROCK_ORE.get(), new Item.Properties()));
        DEBRIS_BEDROCK_CORE = registerWithTab("debris_bedrock_core", () -> new BedrockCoreItem(ModBlocks.DEBRIS_BEDROCK_ORE.get(), new Item.Properties()));

        OSMIUM_BEDROCK_CORE = registerWithTab("osmium_bedrock_core", () -> new BedrockCoreItem(ModBlocks.OSMIUM_BEDROCK_ORE.get(), new Item.Properties()));
        ALUMINUM_BEDROCK_CORE = registerWithTab("aluminum_bedrock_core", () -> new BedrockCoreItem(ModBlocks.ALUMINUM_BEDROCK_ORE.get(), new Item.Properties()));
        LEAD_BEDROCK_CORE = registerWithTab("lead_bedrock_core", () -> new BedrockCoreItem(ModBlocks.LEAD_BEDROCK_ORE.get(), new Item.Properties()));
        NICKEL_BEDROCK_CORE = registerWithTab("nickel_bedrock_core", () -> new BedrockCoreItem(ModBlocks.NICKEL_BEDROCK_ORE.get(), new Item.Properties()));
        URANIUM_BEDROCK_CORE = registerWithTab("uranium_bedrock_core", () -> new BedrockCoreItem(ModBlocks.URANIUM_BEDROCK_ORE.get(), new Item.Properties()));
        FLUORITE_BEDROCK_CORE = registerWithTab("fluorite_bedrock_core", () -> new BedrockCoreItem(ModBlocks.FLUORITE_BEDROCK_ORE.get(), new Item.Properties()));
        SILVER_BEDROCK_CORE = registerWithTab("silver_bedrock_core", () -> new BedrockCoreItem(ModBlocks.SILVER_BEDROCK_ORE.get(), new Item.Properties()));
        TIN_BEDROCK_CORE = registerWithTab("tin_bedrock_core", () -> new BedrockCoreItem(ModBlocks.TIN_BEDROCK_ORE.get(), new Item.Properties()));
        ZINC_BEDROCK_CORE = registerWithTab("zinc_bedrock_core", () -> new BedrockCoreItem(ModBlocks.ZINC_BEDROCK_ORE.get(), new Item.Properties()));

    }

    public static Supplier<Item> registerWithTab(String name, Supplier<Item> supplier) {
        Supplier<Item> block = ITEMS.register(name, supplier);
        CREATIVE_TAB_ITEMS.add(block);
        return block;
    }

}
