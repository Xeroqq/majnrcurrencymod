package net.xeroo.majnrcurrencymod.item;

import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.util.Identifier;

import net.xeroo.majnrcurrencymod.MajnrCurrencyMod;

public class ModItems {
    public static final Item DOLLAR = registerItem("dollar", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(DOLLAR);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MajnrCurrencyMod.MOD_ID, name), item);
    }


    public static void registerModItems() {
        MajnrCurrencyMod.LOGGER.info("Registrování Mod Itemů pro " + MajnrCurrencyMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
