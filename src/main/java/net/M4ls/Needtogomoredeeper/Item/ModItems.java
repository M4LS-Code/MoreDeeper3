package net.M4ls.Needtogomoredeeper.Item;

import net.M4ls.Needtogomoredeeper.Moredeeper;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.swing.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Moredeeper.MOD_ID);

    public static final RegistryObject<Item> key = ITEMS.register("key",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> voidfragment = ITEMS.register("voidfragment",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}