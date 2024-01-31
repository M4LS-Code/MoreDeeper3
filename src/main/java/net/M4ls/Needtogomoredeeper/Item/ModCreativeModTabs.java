package net.M4ls.Needtogomoredeeper.Item;

import net.M4ls.Needtogomoredeeper.Moredeeper;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Moredeeper.MOD_ID);

    public static final RegistryObject<CreativeModeTab> needtogomoredeeper = TABS.register("needtogomoredeeper",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.key.get()))
                    .title(Component.translatable("CreativeModeTabs.needtogomoredeeper"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.key.get());
                        pOutput.accept(ModItems.voidfragment.get());

                        pOutput.accept(Items.DIAMOND);


                    })
                    .build()
    );


    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}