package net.xeroo.majnrcurrencymod.block;

import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.xeroo.majnrcurrencymod.MajnrCurrencyMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block PILE_OF_BUCKS = registerBlock("pile_of_bucks",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.GRASS)));

    public static final Block PILE_OF_TEN_BUCKS = registerBlock("pile_of_ten_bucks",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.GRASS)));

    public static final Block PILE_OF_TWENTY_BUCKS = registerBlock("pile_of_twenty_bucks",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.GRASS)));

    public static final Block PILE_OF_COPPER_COINS = registerBlock("pile_of_copper_coins",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.GLASS)));

    public static final Block PILE_OF_SILVER_COINS = registerBlock("pile_of_silver_coins",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.GLASS)));

    public static final Block PILE_OF_GOLD_COINS = registerBlock("pile_of_gold_coins",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.GLASS)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MajnrCurrencyMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MajnrCurrencyMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        MajnrCurrencyMod.LOGGER.info("Registrování MODBLOCK pro " + MajnrCurrencyMod.MOD_ID);
    }
}
