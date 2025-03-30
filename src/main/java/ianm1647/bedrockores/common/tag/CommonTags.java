package ianm1647.bedrockores.common.tag;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class CommonTags {
    public static class Blocks {

        public static final TagKey<Block> OSMIUM_ORES = blockTag("ores/osmium");
        public static final TagKey<Block> ALUMINUM_ORES = blockTag("ores/aluminum");
        public static final TagKey<Block> LEAD_ORES = blockTag("ores/lead");
        public static final TagKey<Block> NICKEL_ORES = blockTag("ores/nickel");
        public static final TagKey<Block> URANIUM_ORES = blockTag("ores/uranium");
        public static final TagKey<Block> FLUORITE_ORES = blockTag("ores/fluorite");
        public static final TagKey<Block> SILVER_ORES = blockTag("ores/silver");
        public static final TagKey<Block> TIN_ORES = blockTag("ores/tin");
        public static final TagKey<Block> ZINC_ORES = blockTag("ores/zinc");

        private static TagKey<Block> blockTag(String path) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }

    }

    public static class Items {

        public static final TagKey<Item> OSMIUM_ORES = itemTag("ores/osmium");
        public static final TagKey<Item> ALUMINUM_ORES = itemTag("ores/aluminum");
        public static final TagKey<Item> LEAD_ORES = itemTag("ores/lead");
        public static final TagKey<Item> NICKEL_ORES = itemTag("ores/nickel");
        public static final TagKey<Item> URANIUM_ORES = itemTag("ores/uranium");
        public static final TagKey<Item> FLUORITE_ORES = itemTag("ores/fluorite");
        public static final TagKey<Item> SILVER_ORES = itemTag("ores/silver");
        public static final TagKey<Item> TIN_ORES = itemTag("ores/tin");
        public static final TagKey<Item> ZINC_ORES = itemTag("ores/zinc");

        public static final TagKey<Item> OSMIUM_RAW = itemTag("raw_materials/osmium");
        public static final TagKey<Item> ALUMINUM_RAW = itemTag("raw_materials/aluminum");
        public static final TagKey<Item> LEAD_RAW = itemTag("raw_materials/lead");
        public static final TagKey<Item> NICKEL_RAW = itemTag("raw_materials/nickel");
        public static final TagKey<Item> URANIUM_RAW = itemTag("raw_materials/uranium");
        public static final TagKey<Item> FLUORITE_RAW = itemTag("gems/fluorite");
        public static final TagKey<Item> SILVER_RAW = itemTag("raw_materials/silver");
        public static final TagKey<Item> TIN_RAW = itemTag("raw_materials/tin");
        public static final TagKey<Item> ZINC_RAW = itemTag("raw_materials/zinc");

        private static TagKey<Item> itemTag(String path) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
