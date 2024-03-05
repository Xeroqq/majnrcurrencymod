package net.xeroo.majnrcurrencymod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.xeroo.majnrcurrencymod.MajnrCurrencyMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CURRENCY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MajnrCurrencyMod.MOD_ID, "dollar"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.dollar"))
                    .icon(() -> new ItemStack(ModItems.DOLLAR)).entries((displayContext, entries) -> {
                        entries.add(ModItems.DOLLAR);
                        entries.add(ModItems.BUNDLE_EMPTY);
                        entries.add(ModItems.MONEY_BUNDLE);
                        entries.add(ModItems.COINBUNDLE);
                        entries.add(ModItems.COINBUNDLEEMPTY);
                        entries.add(ModItems.GOLDCOIN);
                        entries.add(ModItems.SILVERCOIN);
                        entries.add(ModItems.COPPERCOIN);
                        entries.add(ModItems.COPPERNUGGET);


                        entries.add(Items.DIAMOND);


                    }).build());


    public static void registerItemGroups() {
        MajnrCurrencyMod.LOGGER.info("Registrování itemů skupin pro " + MajnrCurrencyMod.MOD_ID);
    }
}

