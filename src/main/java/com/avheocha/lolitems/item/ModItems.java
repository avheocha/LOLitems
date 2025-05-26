package com.avheocha.lolitems.item;

import com.avheocha.lolitems.LolItems;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LolItems.MOD_ID);

    public static final RegistryObject<Item> DAGGER = ITEMS.register("dagger", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLDCOIN = ITEMS.register("goldcoin", () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
