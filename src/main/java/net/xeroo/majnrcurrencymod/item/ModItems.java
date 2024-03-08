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
    public static final Item BUNDLE_EMPTY = registerItem("bundle_empty", new Item(new FabricItemSettings()));
    public static final Item MONEY_BUNDLE = registerItem("money_bundle", new Item(new FabricItemSettings()));
    public static final Item GOLDCOIN = registerItem("gold_coin", new Item(new FabricItemSettings()));
    public static final Item SILVERCOIN = registerItem("silver_coin", new Item(new FabricItemSettings()));
    public static final Item COPPERCOIN = registerItem("copper_coin", new Item(new FabricItemSettings()));
    public static final Item COINBUNDLEEMPTY = registerItem("coin_bundle_empty", new Item(new FabricItemSettings()));
    public static final Item COINBUNDLE = registerItem("coin_bundle", new Item(new FabricItemSettings()));
    public static final Item COPPERNUGGET = registerItem("copper_nugget", new Item(new FabricItemSettings()));
    public static final Item DOLLAR02 = registerItem("ten_bucks", new Item(new FabricItemSettings()));
    public static final Item DOLLAR03 = registerItem("twenty_bucks", new Item(new FabricItemSettings()));
    public static final Item UNVALUEDPAPER = registerItem("unvalued_paper", new Item(new FabricItemSettings()));
    public static final Item ECONOMICKNOWLEDGESCHEME = registerItem("economic_knowledge_scheme", new Item(new FabricItemSettings()));
    public static final Item DUCT_TYPE = registerItem("duct_type", new Item(new FabricItemSettings()));




    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(DOLLAR);
        entries.add(BUNDLE_EMPTY);
        entries.add(MONEY_BUNDLE);
        entries.add(GOLDCOIN);
        entries.add(SILVERCOIN);
        entries.add(COPPERCOIN);
        entries.add(COINBUNDLEEMPTY);
        entries.add(COINBUNDLE);
        entries.add(COPPERNUGGET);
        entries.add(DOLLAR02);
        entries.add(DOLLAR03);
        entries.add(UNVALUEDPAPER);
        entries.add(ECONOMICKNOWLEDGESCHEME);
        entries.add(DUCT_TYPE);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MajnrCurrencyMod.MOD_ID, name), item);
    }


    public static void registerModItems() {
        MajnrCurrencyMod.LOGGER.info("Registrování Mod Itemů pro " + MajnrCurrencyMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
