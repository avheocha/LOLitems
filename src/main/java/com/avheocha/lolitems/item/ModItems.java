package com.avheocha.lolitems.item;

import com.avheocha.lolitems.LolItems;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TridentItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LolItems.MOD_ID);

    public static final RegistryObject<Item> DAGGER = ITEMS.register("dagger", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLDCOIN = ITEMS.register("goldcoin", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RECURVE_BOW = ITEMS.register("recurve_bow", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NASHORRS_TOOTH = ITEMS.register("nashorrs_tooth", () -> new NashorrsToothItem(
            new Item.Properties()
            .durability(750)
            .attributes(NashorrsToothItem.createAttributes())
            .component(DataComponents.TOOL, NashorrsToothItem.createToolProperties())));
    /*
    public static final Item NASHORRS_TOOTH = registerItem(
            "nashorrs_tooth",
            new NashorrsToothItem(
                    new Item.Properties()
                            .durability(750)
                            .attributes(NashorrsToothItem.createAttributes())
                            .component(DataComponents.TOOL, NashorrsToothItem.createToolProperties())
            )
    );
*/

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
