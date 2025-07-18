package ianm1647.bedrockores.integration.create;

import com.simibubi.create.content.kinetics.base.BlockBreakingKineticBlockEntity;
import com.simibubi.create.content.kinetics.base.KineticBlockEntity;
import ianm1647.bedrockores.common.block.BedrockOreBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BlockBreakingKineticBlockEntity.class)
public abstract class BlockBreakingKineticBlockEntityMixin extends KineticBlockEntity {

    @Shadow protected BlockPos breakingPos;

    @Shadow public abstract void onBlockBroken(BlockState stateToBreak);

    @Shadow protected int destroyProgress;

    @Shadow protected abstract BlockPos getBreakingPos();

    @Shadow protected int breakerId;

    public BlockBreakingKineticBlockEntityMixin(BlockEntityType<?> typeIn, BlockPos pos, BlockState state) {
        super(typeIn, pos, state);
    }

    @Inject(method = "tick", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/Level;playSound(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V", shift = At.Shift.AFTER))
    public void breakBedrock(CallbackInfo ci) {
        breakingPos = getBreakingPos();
        BlockState stateToBreak = level.getBlockState(breakingPos);
        if (this.destroyProgress >= 10 && stateToBreak.getBlock() instanceof BedrockOreBlock block) {
            onBlockBroken(stateToBreak);
            destroyProgress = 0;
            level.destroyBlockProgress(breakerId, breakingPos, -1);
            level.setBlock(breakingPos, block.defaultBlockState(), 1);
        }
    }
}
