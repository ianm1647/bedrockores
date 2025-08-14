package ianm1647.bedrockores.integration.justdirethings;

import com.direwolf20.justdirethings.common.blockentities.BlockBreakerT1BE;
import ianm1647.bedrockores.common.block.BedrockOreBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.util.FakePlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockBreakerT1BE.class)
public abstract class BlockBreakerMixin {

    @Inject(method = "mineBlock", at = @At(value = "HEAD"))
    public void mineBedrockOre(BlockPos pos, ItemStack tool, FakePlayer player, CallbackInfoReturnable<Boolean> cir) {
        Level level = player.level();
        BlockState state = level.getBlockState(pos);
        if (state.getBlock() instanceof BedrockOreBlock) {
            cir.setReturnValue(false);
        }
    }
}
