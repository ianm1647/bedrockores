package ianm1647.bedrockores.common.registry;

import ianm1647.bedrockores.BedrockOres;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS;
    public static final Supplier<CreativeModeTab> TAB_ED;

    static {
        CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BedrockOres.MODID);
        TAB_ED = CREATIVE_TABS.register(BedrockOres.MODID,
                () -> CreativeModeTab.builder().title(Component.translatable("itemGroup." + BedrockOres.MODID)).icon(
                        () -> new ItemStack(ModItems.EMPTY_BEDROCK_CORE.get())).displayItems((parameters, output) ->
                        ModItems.CREATIVE_TAB_ITEMS.forEach((item) -> output.accept(item.get()))).build());
    }
}
