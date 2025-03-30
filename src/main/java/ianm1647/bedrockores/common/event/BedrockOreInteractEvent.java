package ianm1647.bedrockores.common.event;

import ianm1647.bedrockores.BedrockOres;
import ianm1647.bedrockores.common.block.BedrockOreBlock;
import ianm1647.bedrockores.common.item.BedrockCoreItem;
import ianm1647.bedrockores.common.registry.ModBlocks;
import ianm1647.bedrockores.common.registry.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;

@EventBusSubscriber(modid = BedrockOres.MODID)
public class BedrockOreInteractEvent {

    @SubscribeEvent
    public static void onPlayerInteract(PlayerInteractEvent.RightClickBlock event) {
        ItemStack stack = event.getItemStack();
        Player player = event.getEntity();
        InteractionHand hand = player.getUsedItemHand();
        BlockPos pos = event.getPos();
        Level level = event.getLevel();
        BlockState state = level.getBlockState(pos);

        if (stack.is(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("mekanism", "cardboard_box")))) {
            if (state.getBlock() instanceof BedrockOreBlock) {
                event.setCanceled(true);
            }
        }

        if (stack.getItem() instanceof BedrockCoreItem item) {
            if (state.is(ModBlocks.EMPTY_BEDROCK_ORE.get()) && !(item == ModItems.EMPTY_BEDROCK_CORE.get())) {
                if (!player.isCreative()) {
                    stack.shrink(1);
                }
                level.playSound(player, pos, SoundEvents.STONE_PLACE, SoundSource.BLOCKS, 1.0f, 1.0f);
                level.setBlock(pos, item.getBedrockOre().defaultBlockState(), 1);
                player.swing(hand);
            } else if (state.is(Blocks.BEDROCK) && item == ModItems.EMPTY_BEDROCK_CORE.get()) {
                if (!player.isCreative()) {
                    stack.shrink(1);
                }
                level.playSound(player, pos, SoundEvents.STONE_PLACE, SoundSource.BLOCKS, 1.0f, 1.0f);
                level.setBlock(pos, item.getBedrockOre().defaultBlockState(), 1);
                player.swing(hand);
            }
        }
    }
}
