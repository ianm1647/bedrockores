package ianm1647.bedrockores.common.tag;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> BEDROCK_ORES = blockTag("bedrock_ores");

        private static TagKey<Block> blockTag(String path) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath("bedrockores", path));
        }

    }

    public static class Items {

        public static final TagKey<Item> BEDROCK_ORES = itemTag("bedrock_ores");
        public static final TagKey<Item> BEDROCK_CORES = itemTag("bedrock_cores");

        public static final TagKey<Item> VALID_BEDROCK_ORE_TOOLS = itemTag("valid_bedrock_ore_tools");

        public static final TagKey<Item> NETHER_QUARTZ = itemTag("nether_quartz");

        private static TagKey<Item> itemTag(String path) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("bedrockores", path));
        }
    }
}
