package ianm1647.bedrockores.common.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class BedrockCoreItem extends Item {
    private final Block bedrockOre;

    public BedrockCoreItem(Block bedrockOre, Properties properties) {
        super(properties);
        this.bedrockOre = bedrockOre;
    }

    public Block getBedrockOre() {
        return this.bedrockOre;
    }
}
