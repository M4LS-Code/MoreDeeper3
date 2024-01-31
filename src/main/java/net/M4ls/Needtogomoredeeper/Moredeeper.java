package net.M4ls.Needtogomoredeeper;

import com.mojang.logging.LogUtils;
import net.M4ls.Needtogomoredeeper.Item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import net.M4ls.Needtogomoredeeper.Item.ModCreativeModTabs;
import net.M4ls.Needtogomoredeeper.Item.ModCreativeModTabs.*;

import java.security.Key;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Moredeeper.MOD_ID)
public class Moredeeper {

    public static final String MOD_ID = "moredeeper";
    private static final Logger LOGGER = LogUtils.getLogger();
    public Moredeeper() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        CREATIVE_MODE_TABS.register(bus)
        if(event.getTab() == ModCreativeModTabs.MORE_DEEPER.get()) {
            event.accept(ModItems.KEY);
            event.accept(ModItems.VOIDFRAGMENT);
        }


    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
