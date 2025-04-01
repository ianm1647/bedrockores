package ianm1647.bedrockores.common.block;

import ianm1647.bedrockores.common.registry.ModBlocks;
import ianm1647.bedrockores.common.tag.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.neoforged.neoforge.common.util.FakePlayer;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.jetbrains.annotations.Nullable;

public class BedrockOreBlock extends Block {
    public BedrockOreBlock(Properties properties) {
        super(properties.strength(30.0f, 3600000.0F).requiresCorrectToolForDrops());
    }

    @Override
    protected ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if (stack.is(Items.BUCKET)) {
            if (state.is(ModBlocks.LAVA_BEDROCK_ORE.get())) {
                if (!player.isCreative()) {
                        stack.shrink(1);
                }
                level.playSound(player, pos, SoundEvents.BUCKET_FILL_LAVA, SoundSource.BLOCKS, 1.0f, 1.0f);
                player.swing(hand);
                player.addItem(Items.LAVA_BUCKET.getDefaultInstance());
                return ItemInteractionResult.SUCCESS;
            }
        }
        return ItemInteractionResult.FAIL;
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        if (state.is(ModBlocks.LAVA_BEDROCK_ORE.get())) {
            if (!entity.isSteppingCarefully() && entity instanceof LivingEntity) {
                entity.hurt(level.damageSources().hotFloor(), 1.0F);
            }
            super.stepOn(level, pos, state, entity);
        }
    }

    @Override
    protected void spawnAfterBreak(BlockState state, ServerLevel level, BlockPos pos, ItemStack stack, boolean dropExperience) {
        if (state.is(ModBlocks.EXPERIENCE_BEDROCK_ORE.get())) {
            super.spawnAfterBreak(state, level, pos, stack, dropExperience);
        }
    }

    @Override
    public int getExpDrop(BlockState state, LevelAccessor level, BlockPos pos, @Nullable BlockEntity blockEntity, @Nullable Entity breaker, ItemStack tool) {
        if (state.is(ModBlocks.EXPERIENCE_BEDROCK_ORE.get())) {
            return 100;
        }
        return 0;
    }

    @Override
    public void playerDestroy(Level level, Player player, BlockPos pos, BlockState state, BlockEntity blockEntity, ItemStack tool) {
        if (tool.is(ModTags.Items.VALID_BEDROCK_ORE_TOOLS)) {
            if (tool.getEnchantmentLevel(level.registryAccess().holderOrThrow(Enchantments.SILK_TOUCH)) > 0) {
                if (!state.is(ModBlocks.EMPTY_BEDROCK_ORE.get())) {
                    level.setBlock(pos, ModBlocks.EMPTY_BEDROCK_ORE.get().defaultBlockState(), 1);
                } else if (state.is(ModBlocks.EMPTY_BEDROCK_ORE.get())) {
                    level.setBlock(pos, Blocks.BEDROCK.defaultBlockState(), 1);
                }
            } else {
                level.setBlock(pos, this.defaultBlockState(), 1);
            }
            player.awardStat(Stats.BLOCK_MINED.get(this));
            player.causeFoodExhaustion(0.01F);
            dropResources(state, level, pos.above(), blockEntity, player, tool);
        } else {
            level.setBlock(pos, this.defaultBlockState(), 1);
        }
    }

    public boolean hasSilkTouch(ItemStack stack) {
        if (stack.isEnchanted()) {
            MutableBoolean flag = new MutableBoolean(false);
            EnchantmentHelper.runIterationOnItem(stack, (ench, level) -> {
                if (ench.value().effects().has(EnchantmentEffectComponents.BLOCK_EXPERIENCE)) {
                    flag.setTrue();
                }
            });
            return flag.getValue();
        }
        return false;
    }
}
