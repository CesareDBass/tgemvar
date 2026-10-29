package net.cbass.tgv.block;

import net.cbass.tgv.TypeGemsVariant;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block BUG_GEM_BRICKS = registerBlock("bug_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));

    public static final Block DARK_GEM_BRICKS = registerBlock("dark_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));

    public static final Block DRAGON_GEM_BRICKS = registerBlock("dragon_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));

    public static final Block ELECTRIC_GEM_BRICKS = registerBlock("electric_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));

    public static final Block FAIRY_GEM_BRICKS = registerBlock("fairy_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));

    public static final Block FIGHTING_GEM_BRICKS = registerBlock("fighting_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));

    public static final Block FIRE_GEM_BRICKS = registerBlock("fire_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));

    public static final Block FLYING_GEM_BRICKS = registerBlock("flying_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));

    public static final Block GHOST_GEM_BRICKS = registerBlock("ghost_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));

    public static final Block GRASS_GEM_BRICKS = registerBlock("grass_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));

    public static final Block GROUND_GEM_BRICKS = registerBlock("ground_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));

    public static final Block ICE_GEM_BRICKS = registerBlock("ice_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));

    public static final Block NORMAL_GEM_BRICKS = registerBlock("normal_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));

    public static final Block POISON_GEM_BRICKS = registerBlock("poison_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));

    public static final Block PSYCHIC_GEM_BRICKS = registerBlock("psychic_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));

    public static final Block ROCK_GEM_BRICKS = registerBlock("rock_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));

    public static final Block STEEL_GEM_BRICKS = registerBlock("steel_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));

    public static final Block WATER_GEM_BRICKS = registerBlock("water_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TypeGemsVariant.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TypeGemsVariant.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        TypeGemsVariant.LOGGER.info("Registering Mod Blocks for " + TypeGemsVariant.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.BUG_GEM_BRICKS);
            entries.add(ModBlocks.DARK_GEM_BRICKS);
            entries.add(ModBlocks.DRAGON_GEM_BRICKS);
            entries.add(ModBlocks.ELECTRIC_GEM_BRICKS);
            entries.add(ModBlocks.FAIRY_GEM_BRICKS);
            entries.add(ModBlocks.FIGHTING_GEM_BRICKS);
            entries.add(ModBlocks.FIRE_GEM_BRICKS);
            entries.add(ModBlocks.FLYING_GEM_BRICKS);
            entries.add(ModBlocks.GHOST_GEM_BRICKS);
            entries.add(ModBlocks.GRASS_GEM_BRICKS);
            entries.add(ModBlocks.GROUND_GEM_BRICKS);
            entries.add(ModBlocks.ICE_GEM_BRICKS);
            entries.add(ModBlocks.NORMAL_GEM_BRICKS);
            entries.add(ModBlocks.POISON_GEM_BRICKS);
            entries.add(ModBlocks.PSYCHIC_GEM_BRICKS);
            entries.add(ModBlocks.ROCK_GEM_BRICKS);
            entries.add(ModBlocks.STEEL_GEM_BRICKS);
            entries.add(ModBlocks.WATER_GEM_BRICKS);
        });
    }
}
