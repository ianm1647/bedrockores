package ianm1647.bedrockores;

import ianm1647.bedrockores.common.registry.ModBlocks;
import ianm1647.bedrockores.common.registry.ModItems;
import ianm1647.bedrockores.common.registry.ModTabs;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(BedrockOres.MODID)
public class BedrockOres {
    public static final String MODID = "bedrockores";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public BedrockOres(IEventBus bus, ModContainer container) {
        ModBlocks.BLOCKS.register(bus);
        ModItems.ITEMS.register(bus);
        ModTabs.CREATIVE_TABS.register(bus);

        NeoForge.EVENT_BUS.register(this);
    }

    public static ResourceLocation loc(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("Bedrock Ores server is starting...");
    }
}
