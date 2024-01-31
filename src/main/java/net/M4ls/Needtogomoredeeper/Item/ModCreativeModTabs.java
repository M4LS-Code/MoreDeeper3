package net.M4ls.Needtogomoredeeper.Item;

import net.M4ls.Needtogomoredeeper.Moredeeper;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Moredeeper.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MORE_DEEPER = CREATIVE_MODE_TABS.register("more_deeper",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.KEY.get()))
                    .title(Component.translatable("creativetab.more_deeper"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.KEY.get());
                        pOutput.accept(ModItems.VOIDFRAGMENT.get());

                        pOutput.accept(Items.DIAMOND);


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTab() == ModCreativeModTabs.MORE_DEEPER.get()) {
            event.accept(ModItems.KEY);
            event.accept(ModItems.VOIDFRAGMENT);
        }


    }

}