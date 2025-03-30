package ianm1647.bedrockores.data;

import ianm1647.bedrockores.BedrockOres;
import ianm1647.bedrockores.common.world.ModBiomeModifiers;
import ianm1647.bedrockores.common.world.ModConfiguredFeatures;
import ianm1647.bedrockores.common.world.ModPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class PackProvider extends DatapackBuiltinEntriesProvider {

    public static final RegistrySetBuilder BUILDER;

    public PackProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(BedrockOres.MODID));
    }

    static {
        BUILDER = new RegistrySetBuilder()
                .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap)
                .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
                .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifiers::bootstrap);
    }
}
