package com.lucasmods.bananamod.item;

import com.lucasmods.bananamod.BananaMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BananaMod.MODID);

    public static final RegistryObject<Item> BANANA = ITEMS.register("banana", () -> new Item(new Item.Properties().setId(ITEMS.key("banana")).food(new FoodProperties.Builder()
            .alwaysEdible()
            .nutrition(2)
            .saturationModifier(2)
            .build()
            )
        )
    );

    public static void register(BusGroup busGroup){
        ITEMS.register(busGroup);
    }

}
