package ianm1647.bedrockores.integration.industrialforegoing;

import com.buuz135.industrial.block.resourceproduction.tile.BlockBreakerTile;
import com.buuz135.industrial.block.tile.IndustrialAreaWorkingTile;
import com.buuz135.industrial.block.tile.IndustrialWorkingTile;
import com.buuz135.industrial.block.tile.RangeManager;
import com.buuz135.industrial.config.machine.resourceproduction.BlockBreakerConfig;
import com.buuz135.industrial.module.ModuleResourceProduction;
import com.buuz135.industrial.utils.BlockUtils;
import com.hrznstudio.titanium.component.inventory.SidedInventoryComponent;
import ianm1647.bedrockores.common.block.BedrockOreBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.items.ItemHandlerHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Iterator;

@Mixin(BlockBreakerTile.class)
public abstract class BlockBreakerMixin extends IndustrialAreaWorkingTile<BlockBreakerTile> {

    @Shadow private int getPowerPerOperation;

    @Shadow private SidedInventoryComponent<BlockBreakerTile> output;

    public BlockBreakerMixin(BlockPos blockPos, BlockState blockState) {
        super(ModuleResourceProduction.BLOCK_BREAKER, RangeManager.RangeType.BEHIND, false, BlockBreakerConfig.powerPerOperation, blockPos, blockState);
    }

    @Inject(method = "work", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;getDestroySpeed(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)F", shift = At.Shift.AFTER), cancellable = true)
    public void work(CallbackInfoReturnable<IndustrialWorkingTile<BlockBreakerTile>.WorkAction> cir) {
        BlockPos pos = this.getPointedBlockPos();
        BlockState state = this.level.getBlockState(pos);
        Block block = state.getBlock();
        if (block instanceof BedrockOreBlock ore) {
            Iterator var3 = BlockUtils.getBlockDrops(this.level, pos).iterator();

            while(var3.hasNext()) {
                ItemStack blockDrop = (ItemStack)var3.next();
                ItemStack result = ItemHandlerHelper.insertItem(this.output, blockDrop, false);
                if (!result.isEmpty()) {
                    BlockUtils.spawnItemStack(result, this.level, pos);
                }
            }

            this.level.setBlockAndUpdate(pos, ore.defaultBlockState());
            this.level.playSound(null, pos, SoundEvents.STONE_BREAK, SoundSource.BLOCKS, 1.0f, 1.0f);
            this.increasePointer();
            cir.setReturnValue(new WorkAction( 1, this.getPowerPerOperation));
        }
    }
}
