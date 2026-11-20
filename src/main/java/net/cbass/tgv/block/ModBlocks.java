package net.cbass.tgv.block;

import net.cbass.tgv.TypeGemsVariant;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block POLISHED_BUG_GEM_BLOCK = registerBlock("polished_bug_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block POLISHED_BUG_GEM_STAIRS = registerBlock("polished_bug_gem_stairs",
            new StairsBlock(ModBlocks.POLISHED_BUG_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block POLISHED_BUG_GEM_SLAB = registerBlock("polished_bug_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block POLISHED_BUG_GEM_WALL = registerBlock("polished_bug_gem_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.TERRACOTTA_LIME)));

    public static final Block POLISHED_DARK_GEM_BLOCK = registerBlock("polished_dark_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block POLISHED_DARK_GEM_STAIRS = registerBlock("polished_dark_gem_stairs",
            new StairsBlock(ModBlocks.POLISHED_DARK_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block POLISHED_DARK_GEM_SLAB = registerBlock("polished_dark_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block POLISHED_DARK_GEM_WALL = registerBlock("polished_dark_gem_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.TERRACOTTA_BLACK)));

    public static final Block POLISHED_DRAGON_GEM_BLOCK = registerBlock("polished_dragon_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.BLUE)));
    public static final Block POLISHED_DRAGON_GEM_STAIRS = registerBlock("polished_dragon_gem_stairs",
            new StairsBlock(ModBlocks.POLISHED_DRAGON_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.BLUE)));
    public static final Block POLISHED_DRAGON_GEM_SLAB = registerBlock("polished_dragon_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.BLUE)));
    public static final Block POLISHED_DRAGON_GEM_WALL = registerBlock("polished_dragon_gem_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.BLUE)));

    public static final Block POLISHED_ELECTRIC_GEM_BLOCK = registerBlock("polished_electric_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.GOLD)));
    public static final Block POLISHED_ELECTRIC_GEM_STAIRS = registerBlock("polished_electric_gem_stairs",
            new StairsBlock(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.GOLD)));
    public static final Block POLISHED_ELECTRIC_GEM_SLAB = registerBlock("polished_electric_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.GOLD)));
    public static final Block POLISHED_ELECTRIC_GEM_WALL = registerBlock("polished_electric_gem_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.GOLD)));

    public static final Block POLISHED_FAIRY_GEM_BLOCK = registerBlock("polished_fairy_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.PINK)));
    public static final Block POLISHED_FAIRY_GEM_STAIRS = registerBlock("polished_fairy_gem_stairs",
            new StairsBlock(ModBlocks.POLISHED_FAIRY_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.PINK)));
    public static final Block POLISHED_FAIRY_GEM_SLAB = registerBlock("polished_fairy_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.PINK)));
    public static final Block POLISHED_FAIRY_GEM_WALL = registerBlock("polished_fairy_gem_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.PINK)));

    public static final Block POLISHED_FIGHTING_GEM_BLOCK = registerBlock("polished_fighting_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.RED)));
    public static final Block POLISHED_FIGHTING_GEM_STAIRS = registerBlock("polished_fighting_gem_stairs",
            new StairsBlock(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.RED)));
    public static final Block POLISHED_FIGHTING_GEM_SLAB = registerBlock("polished_fighting_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.RED)));
    public static final Block POLISHED_FIGHTING_GEM_WALL = registerBlock("polished_fighting_gem_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.RED)));

    public static final Block POLISHED_FIRE_GEM_BLOCK = registerBlock("polished_fire_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.BRIGHT_RED)));
    public static final Block POLISHED_FIRE_GEM_STAIRS = registerBlock("polished_fire_gem_stairs",
            new StairsBlock(ModBlocks.POLISHED_FIRE_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.BRIGHT_RED)));
    public static final Block POLISHED_FIRE_GEM_SLAB = registerBlock("polished_fire_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.BRIGHT_RED)));
    public static final Block POLISHED_FIRE_GEM_WALL = registerBlock("polished_fire_gem_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.BRIGHT_RED)));

    public static final Block POLISHED_FLYING_GEM_BLOCK = registerBlock("polished_flying_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.LIGHT_BLUE)));
    public static final Block POLISHED_FLYING_GEM_STAIRS = registerBlock("polished_flying_gem_stairs",
            new StairsBlock(ModBlocks.POLISHED_FLYING_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.LIGHT_BLUE)));
    public static final Block POLISHED_FLYING_GEM_SLAB = registerBlock("polished_flying_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.LIGHT_BLUE)));
    public static final Block POLISHED_FLYING_GEM_WALL = registerBlock("polished_flying_gem_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.LIGHT_BLUE)));

    public static final Block POLISHED_GHOST_GEM_BLOCK = registerBlock("polished_ghost_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)));
    public static final Block POLISHED_GHOST_GEM_STAIRS = registerBlock("polished_ghost_gem_stairs",
            new StairsBlock(ModBlocks.POLISHED_GHOST_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.TERRACOTTA_MAGENTA)));
    public static final Block POLISHED_GHOST_GEM_SLAB = registerBlock("polished_ghost_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)));
    public static final Block POLISHED_GHOST_GEM_WALL = registerBlock("polished_ghost_gem_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)));

    public static final Block POLISHED_GRASS_GEM_BLOCK = registerBlock("polished_grass_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.LIME)));
    public static final Block POLISHED_GRASS_GEM_STAIRS = registerBlock("polished_grass_gem_stairs",
            new StairsBlock(ModBlocks.POLISHED_GRASS_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.LIME)));
    public static final Block POLISHED_GRASS_GEM_SLAB = registerBlock("polished_grass_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.LIME)));
    public static final Block POLISHED_GRASS_GEM_WALL = registerBlock("polished_grass_gem_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.LIME)));

    public static final Block POLISHED_GROUND_GEM_BLOCK = registerBlock("polished_ground_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block POLISHED_GROUND_GEM_STAIRS = registerBlock("polished_ground_gem_stairs",
            new StairsBlock(ModBlocks.POLISHED_GROUND_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block POLISHED_GROUND_GEM_SLAB = registerBlock("polished_ground_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block POLISHED_GROUND_GEM_WALL = registerBlock("polished_ground_gem_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.SPRUCE_BROWN)));

    public static final Block POLISHED_ICE_GEM_BLOCK = registerBlock("polished_ice_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.PALE_PURPLE)));
    public static final Block POLISHED_ICE_GEM_STAIRS = registerBlock("polished_ice_gem_stairs",
            new StairsBlock(ModBlocks.POLISHED_ICE_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.PALE_PURPLE)));
    public static final Block POLISHED_ICE_GEM_SLAB = registerBlock("polished_ice_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.PALE_PURPLE)));
    public static final Block POLISHED_ICE_GEM_WALL = registerBlock("polished_ice_gem_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.PALE_PURPLE)));

    public static final Block POLISHED_NORMAL_GEM_BLOCK = registerBlock("polished_normal_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.WHITE)));
    public static final Block POLISHED_NORMAL_GEM_STAIRS = registerBlock("polished_normal_gem_stairs",
            new StairsBlock(ModBlocks.POLISHED_NORMAL_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.WHITE)));
    public static final Block POLISHED_NORMAL_GEM_SLAB = registerBlock("polished_normal_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.WHITE)));
    public static final Block POLISHED_NORMAL_GEM_WALL = registerBlock("polished_normal_gem_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.WHITE)));

    public static final Block POLISHED_POISON_GEM_BLOCK = registerBlock("polished_poison_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.PURPLE)));
    public static final Block POLISHED_POISON_GEM_STAIRS = registerBlock("polished_poison_gem_stairs",
            new StairsBlock(ModBlocks.POLISHED_POISON_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.PURPLE)));
    public static final Block POLISHED_POISON_GEM_SLAB = registerBlock("polished_poison_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.PURPLE)));
    public static final Block POLISHED_POISON_GEM_WALL = registerBlock("polished_poison_gem_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.PURPLE)));

    public static final Block POLISHED_PSYCHIC_GEM_BLOCK = registerBlock("polished_psychic_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.MAGENTA)));
    public static final Block POLISHED_PSYCHIC_GEM_STAIRS = registerBlock("polished_psychic_gem_stairs",
            new StairsBlock(ModBlocks.POLISHED_PSYCHIC_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.MAGENTA)));
    public static final Block POLISHED_PSYCHIC_GEM_SLAB = registerBlock("polished_psychic_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.MAGENTA)));
    public static final Block POLISHED_PSYCHIC_GEM_WALL = registerBlock("polished_psychic_gem_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.MAGENTA)));

    public static final Block POLISHED_ROCK_GEM_BLOCK = registerBlock("polished_rock_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
    public static final Block POLISHED_ROCK_GEM_STAIRS = registerBlock("polished_rock_gem_stairs",
            new StairsBlock(ModBlocks.POLISHED_ROCK_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
    public static final Block POLISHED_ROCK_GEM_SLAB = registerBlock("polished_rock_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
    public static final Block POLISHED_ROCK_GEM_WALL = registerBlock("polished_rock_gem_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));

    public static final Block POLISHED_STEEL_GEM_BLOCK = registerBlock("polished_steel_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.IRON_GRAY)));
    public static final Block POLISHED_STEEL_GEM_STAIRS = registerBlock("polished_steel_gem_stairs",
            new StairsBlock(ModBlocks.POLISHED_STEEL_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.IRON_GRAY)));
    public static final Block POLISHED_STEEL_GEM_SLAB = registerBlock("polished_steel_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.IRON_GRAY)));
    public static final Block POLISHED_STEEL_GEM_WALL = registerBlock("polished_steel_gem_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.IRON_GRAY)));

    public static final Block POLISHED_WATER_GEM_BLOCK = registerBlock("polished_water_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.WATER_BLUE)));
    public static final Block POLISHED_WATER_GEM_STAIRS = registerBlock("polished_water_gem_stairs",
            new StairsBlock(ModBlocks.POLISHED_WATER_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.WATER_BLUE)));
    public static final Block POLISHED_WATER_GEM_SLAB = registerBlock("polished_water_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.WATER_BLUE)));
    public static final Block POLISHED_WATER_GEM_WALL = registerBlock("polished_water_gem_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.WATER_BLUE)));

    public static final Block BUG_GEM_BRICKS = registerBlock("bug_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block BUG_GEM_BRICKS_STAIRS = registerBlock("bug_gem_bricks_stairs",
            new StairsBlock(ModBlocks.BUG_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block BUG_GEM_BRICKS_SLAB = registerBlock("bug_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block BUG_GEM_BRICKS_WALL = registerBlock("bug_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block CHISELED_BUG_GEM_BRICKS = registerBlock("chiseled_bug_gem_bricks",
            new PillarBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_LIME)));

    public static final Block DARK_GEM_BRICKS = registerBlock("dark_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block DARK_GEM_BRICKS_STAIRS = registerBlock("dark_gem_bricks_stairs",
            new StairsBlock(ModBlocks.DARK_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block DARK_GEM_BRICKS_SLAB = registerBlock("dark_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block DARK_GEM_BRICKS_WALL = registerBlock("dark_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block CHISELED_DARK_GEM_BRICKS = registerBlock("chiseled_dark_gem_bricks",
            new PillarBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_BLACK)));

    public static final Block DRAGON_GEM_BRICKS = registerBlock("dragon_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.BLUE)));
    public static final Block DRAGON_GEM_BRICKS_STAIRS = registerBlock("dragon_gem_bricks_stairs",
            new StairsBlock(ModBlocks.DRAGON_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.BLUE)));
    public static final Block DRAGON_GEM_BRICKS_SLAB = registerBlock("dragon_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.BLUE)));
    public static final Block DRAGON_GEM_BRICKS_WALL = registerBlock("dragon_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.BLUE)));
    public static final Block CHISELED_DRAGON_GEM_BRICKS = registerBlock("chiseled_dragon_gem_bricks",
            new PillarBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.BLUE)));

    public static final Block ELECTRIC_GEM_BRICKS = registerBlock("electric_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.GOLD)));
    public static final Block ELECTRIC_GEM_BRICKS_STAIRS = registerBlock("electric_gem_bricks_stairs",
            new StairsBlock(ModBlocks.ELECTRIC_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.GOLD)));
    public static final Block ELECTRIC_GEM_BRICKS_SLAB = registerBlock("electric_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.GOLD)));
    public static final Block ELECTRIC_GEM_BRICKS_WALL = registerBlock("electric_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.GOLD)));
    public static final Block CHISELED_ELECTRIC_GEM_BRICKS = registerBlock("chiseled_electric_gem_bricks",
            new PillarBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.GOLD)));

    public static final Block FAIRY_GEM_BRICKS = registerBlock("fairy_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.PINK)));
    public static final Block FAIRY_GEM_BRICKS_STAIRS = registerBlock("fairy_gem_bricks_stairs",
            new StairsBlock(ModBlocks.FAIRY_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.PINK)));
    public static final Block FAIRY_GEM_BRICKS_SLAB = registerBlock("fairy_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.PINK)));
    public static final Block FAIRY_GEM_BRICKS_WALL = registerBlock("fairy_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.PINK)));
    public static final Block CHISELED_FAIRY_GEM_BRICKS = registerBlock("chiseled_fairy_gem_bricks",
            new PillarBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.PINK)));

    public static final Block FIGHTING_GEM_BRICKS = registerBlock("fighting_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.RED)));
    public static final Block FIGHTING_GEM_BRICKS_STAIRS = registerBlock("fighting_gem_bricks_stairs",
            new StairsBlock(ModBlocks.FIGHTING_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.RED)));
    public static final Block FIGHTING_GEM_BRICKS_SLAB = registerBlock("fighting_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.RED)));
    public static final Block FIGHTING_GEM_BRICKS_WALL = registerBlock("fighting_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.RED)));
    public static final Block CHISELED_FIGHTING_GEM_BRICKS = registerBlock("chiseled_fighting_gem_bricks",
            new PillarBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.RED)));

    public static final Block FIRE_GEM_BRICKS = registerBlock("fire_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.BRIGHT_RED)));
    public static final Block FIRE_GEM_BRICKS_STAIRS = registerBlock("fire_gem_bricks_stairs",
            new StairsBlock(ModBlocks.FIRE_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.BRIGHT_RED)));
    public static final Block FIRE_GEM_BRICKS_SLAB = registerBlock("fire_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.BRIGHT_RED)));
    public static final Block FIRE_GEM_BRICKS_WALL = registerBlock("fire_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.BRIGHT_RED)));
    public static final Block CHISELED_FIRE_GEM_BRICKS = registerBlock("chiseled_fire_gem_bricks",
            new PillarBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.BRIGHT_RED)));

    public static final Block FLYING_GEM_BRICKS = registerBlock("flying_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.LIGHT_BLUE)));
    public static final Block FLYING_GEM_BRICKS_STAIRS = registerBlock("flying_gem_bricks_stairs",
            new StairsBlock(ModBlocks.FLYING_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.LIGHT_BLUE)));
    public static final Block FLYING_GEM_BRICKS_SLAB = registerBlock("flying_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.LIGHT_BLUE)));
    public static final Block FLYING_GEM_BRICKS_WALL = registerBlock("flying_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.LIGHT_BLUE)));
    public static final Block CHISELED_FLYING_GEM_BRICKS = registerBlock("chiseled_flying_gem_bricks",
            new PillarBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.LIGHT_BLUE)));

    public static final Block GHOST_GEM_BRICKS = registerBlock("ghost_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)));
    public static final Block GHOST_GEM_BRICKS_STAIRS = registerBlock("ghost_gem_bricks_stairs",
            new StairsBlock(ModBlocks.GHOST_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.TERRACOTTA_MAGENTA)));
    public static final Block GHOST_GEM_BRICKS_SLAB = registerBlock("ghost_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)));
    public static final Block GHOST_GEM_BRICKS_WALL = registerBlock("ghost_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)));
    public static final Block CHISELED_GHOST_GEM_BRICKS = registerBlock("chiseled_ghost_gem_bricks",
            new PillarBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)));

    public static final Block GRASS_GEM_BRICKS = registerBlock("grass_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.LIME)));
    public static final Block GRASS_GEM_BRICKS_STAIRS = registerBlock("grass_gem_bricks_stairs",
            new StairsBlock(ModBlocks.GRASS_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.LIME)));
    public static final Block GRASS_GEM_BRICKS_SLAB = registerBlock("grass_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.LIME)));
    public static final Block GRASS_GEM_BRICKS_WALL = registerBlock("grass_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.LIME)));
    public static final Block CHISELED_GRASS_GEM_BRICKS = registerBlock("chiseled_grass_gem_bricks",
            new PillarBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.LIME)));

    public static final Block GROUND_GEM_BRICKS = registerBlock("ground_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block GROUND_GEM_BRICKS_STAIRS = registerBlock("ground_gem_bricks_stairs",
            new StairsBlock(ModBlocks.GROUND_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block GROUND_GEM_BRICKS_SLAB = registerBlock("ground_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block GROUND_GEM_BRICKS_WALL = registerBlock("ground_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block CHISELED_GROUND_GEM_BRICKS = registerBlock("chiseled_ground_gem_bricks",
            new PillarBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.SPRUCE_BROWN)));

    public static final Block ICE_GEM_BRICKS = registerBlock("ice_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.PALE_PURPLE)));
    public static final Block ICE_GEM_BRICKS_STAIRS = registerBlock("ice_gem_bricks_stairs",
            new StairsBlock(ModBlocks.ICE_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.PALE_PURPLE)));
    public static final Block ICE_GEM_BRICKS_SLAB = registerBlock("ice_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.PALE_PURPLE)));
    public static final Block ICE_GEM_BRICKS_WALL = registerBlock("ice_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.PALE_PURPLE)));
    public static final Block CHISELED_ICE_GEM_BRICKS = registerBlock("chiseled_ice_gem_bricks",
            new PillarBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.PALE_PURPLE)));

    public static final Block NORMAL_GEM_BRICKS = registerBlock("normal_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.WHITE)));
    public static final Block NORMAL_GEM_BRICKS_STAIRS = registerBlock("normal_gem_bricks_stairs",
            new StairsBlock(ModBlocks.NORMAL_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.WHITE)));
    public static final Block NORMAL_GEM_BRICKS_SLAB = registerBlock("normal_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.WHITE)));
    public static final Block NORMAL_GEM_BRICKS_WALL = registerBlock("normal_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.WHITE)));
    public static final Block CHISELED_NORMAL_GEM_BRICKS = registerBlock("chiseled_normal_gem_bricks",
            new PillarBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.WHITE)));

    public static final Block POISON_GEM_BRICKS = registerBlock("poison_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.PURPLE)));
    public static final Block POISON_GEM_BRICKS_STAIRS = registerBlock("poison_gem_bricks_stairs",
            new StairsBlock(ModBlocks.POISON_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.PURPLE)));
    public static final Block POISON_GEM_BRICKS_SLAB = registerBlock("poison_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.PURPLE)));
    public static final Block POISON_GEM_BRICKS_WALL = registerBlock("poison_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.PURPLE)));
    public static final Block CHISELED_POISON_GEM_BRICKS = registerBlock("chiseled_poison_gem_bricks",
            new PillarBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.PURPLE)));

    public static final Block PSYCHIC_GEM_BRICKS = registerBlock("psychic_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.MAGENTA)));
    public static final Block PSYCHIC_GEM_BRICKS_STAIRS = registerBlock("psychic_gem_bricks_stairs",
            new StairsBlock(ModBlocks.PSYCHIC_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.MAGENTA)));
    public static final Block PSYCHIC_GEM_BRICKS_SLAB = registerBlock("psychic_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.MAGENTA)));
    public static final Block PSYCHIC_GEM_BRICKS_WALL = registerBlock("psychic_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.MAGENTA)));
    public static final Block CHISELED_PSYCHIC_GEM_BRICKS = registerBlock("chiseled_psychic_gem_bricks",
            new PillarBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.MAGENTA)));

    public static final Block ROCK_GEM_BRICKS = registerBlock("rock_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
    public static final Block ROCK_GEM_BRICKS_STAIRS = registerBlock("rock_gem_bricks_stairs",
            new StairsBlock(ModBlocks.ROCK_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
    public static final Block ROCK_GEM_BRICKS_SLAB = registerBlock("rock_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
    public static final Block ROCK_GEM_BRICKS_WALL = registerBlock("rock_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
    public static final Block CHISELED_ROCK_GEM_BRICKS = registerBlock("chiseled_rock_gem_bricks",
            new PillarBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));

    public static final Block STEEL_GEM_BRICKS = registerBlock("steel_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.IRON_GRAY)));
    public static final Block STEEL_GEM_BRICKS_STAIRS = registerBlock("steel_gem_bricks_stairs",
            new StairsBlock(ModBlocks.STEEL_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.IRON_GRAY)));
    public static final Block STEEL_GEM_BRICKS_SLAB = registerBlock("steel_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.IRON_GRAY)));
    public static final Block STEEL_GEM_BRICKS_WALL = registerBlock("steel_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.IRON_GRAY)));
    public static final Block CHISELED_STEEL_GEM_BRICKS = registerBlock("chiseled_steel_gem_bricks",
            new PillarBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.IRON_GRAY)));

    public static final Block WATER_GEM_BRICKS = registerBlock("water_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.WATER_BLUE)));
    public static final Block WATER_GEM_BRICKS_STAIRS = registerBlock("water_gem_bricks_stairs",
            new StairsBlock(ModBlocks.WATER_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.WATER_BLUE)));
    public static final Block WATER_GEM_BRICKS_SLAB = registerBlock("water_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.WATER_BLUE)));
    public static final Block WATER_GEM_BRICKS_WALL = registerBlock("water_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.WATER_BLUE)));
    public static final Block CHISELED_WATER_GEM_BRICKS = registerBlock("chiseled_water_gem_bricks",
            new PillarBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.WATER_BLUE)));

    public static final Block SMOOTH_BUG_GEM_BLOCK = registerBlock("smooth_bug_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block SMOOTH_BUG_GEM_STAIRS = registerBlock("smooth_bug_gem_stairs",
            new StairsBlock(ModBlocks.SMOOTH_BUG_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block SMOOTH_BUG_GEM_SLAB = registerBlock("smooth_bug_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block CHISELED_SMOOTH_BUG_GEM_BLOCK = registerBlock("chiseled_smooth_bug_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_LIME)));

    public static final Block SMOOTH_DARK_GEM_BLOCK = registerBlock("smooth_dark_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block SMOOTH_DARK_GEM_STAIRS = registerBlock("smooth_dark_gem_stairs",
            new StairsBlock(ModBlocks.SMOOTH_DARK_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block SMOOTH_DARK_GEM_SLAB = registerBlock("smooth_dark_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block CHISELED_SMOOTH_DARK_GEM_BLOCK = registerBlock("chiseled_smooth_dark_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_BLACK)));

    public static final Block SMOOTH_DRAGON_GEM_BLOCK = registerBlock("smooth_dragon_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.BLUE)));
    public static final Block SMOOTH_DRAGON_GEM_STAIRS = registerBlock("smooth_dragon_gem_stairs",
            new StairsBlock(ModBlocks.SMOOTH_DRAGON_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.BLUE)));
    public static final Block SMOOTH_DRAGON_GEM_SLAB = registerBlock("smooth_dragon_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.BLUE)));
    public static final Block CHISELED_SMOOTH_DRAGON_GEM_BLOCK = registerBlock("chiseled_smooth_dragon_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.BLUE)));

    public static final Block SMOOTH_ELECTRIC_GEM_BLOCK = registerBlock("smooth_electric_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.GOLD)));
    public static final Block SMOOTH_ELECTRIC_GEM_STAIRS = registerBlock("smooth_electric_gem_stairs",
            new StairsBlock(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.GOLD)));
    public static final Block SMOOTH_ELECTRIC_GEM_SLAB = registerBlock("smooth_electric_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.GOLD)));
    public static final Block CHISELED_SMOOTH_ELECTRIC_GEM_BLOCK = registerBlock("chiseled_smooth_electric_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.GOLD)));

    public static final Block SMOOTH_FAIRY_GEM_BLOCK = registerBlock("smooth_fairy_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.PINK)));
    public static final Block SMOOTH_FAIRY_GEM_STAIRS = registerBlock("smooth_fairy_gem_stairs",
            new StairsBlock(ModBlocks.SMOOTH_FAIRY_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.PINK)));
    public static final Block SMOOTH_FAIRY_GEM_SLAB = registerBlock("smooth_fairy_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.PINK)));
    public static final Block CHISELED_SMOOTH_FAIRY_GEM_BLOCK = registerBlock("chiseled_smooth_fairy_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.PINK)));

    public static final Block SMOOTH_FIGHTING_GEM_BLOCK = registerBlock("smooth_fighting_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.RED)));
    public static final Block SMOOTH_FIGHTING_GEM_STAIRS = registerBlock("smooth_fighting_gem_stairs",
            new StairsBlock(ModBlocks.SMOOTH_FIGHTING_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.RED)));
    public static final Block SMOOTH_FIGHTING_GEM_SLAB = registerBlock("smooth_fighting_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.RED)));
    public static final Block CHISELED_SMOOTH_FIGHTING_GEM_BLOCK = registerBlock("chiseled_smooth_fighting_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.RED)));

    public static final Block SMOOTH_FIRE_GEM_BLOCK = registerBlock("smooth_fire_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.BRIGHT_RED)));
    public static final Block SMOOTH_FIRE_GEM_STAIRS = registerBlock("smooth_fire_gem_stairs",
            new StairsBlock(ModBlocks.SMOOTH_FIRE_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.BRIGHT_RED)));
    public static final Block SMOOTH_FIRE_GEM_SLAB = registerBlock("smooth_fire_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.BRIGHT_RED)));
    public static final Block CHISELED_SMOOTH_FIRE_GEM_BLOCK = registerBlock("chiseled_smooth_fire_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.BRIGHT_RED)));

    public static final Block SMOOTH_FLYING_GEM_BLOCK = registerBlock("smooth_flying_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.LIGHT_BLUE)));
    public static final Block SMOOTH_FLYING_GEM_STAIRS = registerBlock("smooth_flying_gem_stairs",
            new StairsBlock(ModBlocks.SMOOTH_FLYING_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.LIGHT_BLUE)));
    public static final Block SMOOTH_FLYING_GEM_SLAB = registerBlock("smooth_flying_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.LIGHT_BLUE)));
    public static final Block CHISELED_SMOOTH_FLYING_GEM_BLOCK = registerBlock("chiseled_smooth_flying_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.LIGHT_BLUE)));

    public static final Block SMOOTH_GHOST_GEM_BLOCK = registerBlock("smooth_ghost_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)));
    public static final Block SMOOTH_GHOST_GEM_STAIRS = registerBlock("smooth_ghost_gem_stairs",
            new StairsBlock(ModBlocks.SMOOTH_GHOST_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.TERRACOTTA_MAGENTA)));
    public static final Block SMOOTH_GHOST_GEM_SLAB = registerBlock("smooth_ghost_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)));
    public static final Block CHISELED_SMOOTH_GHOST_GEM_BLOCK = registerBlock("chiseled_smooth_ghost_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)));

    public static final Block SMOOTH_GRASS_GEM_BLOCK = registerBlock("smooth_grass_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.LIME)));
    public static final Block SMOOTH_GRASS_GEM_STAIRS = registerBlock("smooth_grass_gem_stairs",
            new StairsBlock(ModBlocks.SMOOTH_GRASS_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.LIME)));
    public static final Block SMOOTH_GRASS_GEM_SLAB = registerBlock("smooth_grass_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.LIME)));
    public static final Block CHISELED_SMOOTH_GRASS_GEM_BLOCK = registerBlock("chiseled_smooth_grass_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.LIME)));

    public static final Block SMOOTH_GROUND_GEM_BLOCK = registerBlock("smooth_ground_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block SMOOTH_GROUND_GEM_STAIRS = registerBlock("smooth_ground_gem_stairs",
            new StairsBlock(ModBlocks.SMOOTH_GROUND_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block SMOOTH_GROUND_GEM_SLAB = registerBlock("smooth_ground_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block CHISELED_SMOOTH_GROUND_GEM_BLOCK = registerBlock("chiseled_smooth_ground_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.SPRUCE_BROWN)));

    public static final Block SMOOTH_ICE_GEM_BLOCK = registerBlock("smooth_ice_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.PALE_PURPLE)));
    public static final Block SMOOTH_ICE_GEM_STAIRS = registerBlock("smooth_ice_gem_stairs",
            new StairsBlock(ModBlocks.SMOOTH_ICE_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.PALE_PURPLE)));
    public static final Block SMOOTH_ICE_GEM_SLAB = registerBlock("smooth_ice_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.PALE_PURPLE)));
    public static final Block CHISELED_SMOOTH_ICE_GEM_BLOCK = registerBlock("chiseled_smooth_ice_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.PALE_PURPLE)));

    public static final Block SMOOTH_NORMAL_GEM_BLOCK = registerBlock("smooth_normal_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.WHITE)));
    public static final Block SMOOTH_NORMAL_GEM_STAIRS = registerBlock("smooth_normal_gem_stairs",
            new StairsBlock(ModBlocks.SMOOTH_NORMAL_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.WHITE)));
    public static final Block SMOOTH_NORMAL_GEM_SLAB = registerBlock("smooth_normal_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.WHITE)));
    public static final Block CHISELED_SMOOTH_NORMAL_GEM_BLOCK = registerBlock("chiseled_smooth_normal_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.WHITE)));

    public static final Block SMOOTH_POISON_GEM_BLOCK = registerBlock("smooth_poison_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.PURPLE)));
    public static final Block SMOOTH_POISON_GEM_STAIRS = registerBlock("smooth_poison_gem_stairs",
            new StairsBlock(ModBlocks.SMOOTH_POISON_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.PURPLE)));
    public static final Block SMOOTH_POISON_GEM_SLAB = registerBlock("smooth_poison_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.PURPLE)));
    public static final Block CHISELED_SMOOTH_POISON_GEM_BLOCK = registerBlock("chiseled_smooth_poison_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.PURPLE)));

    public static final Block SMOOTH_PSYCHIC_GEM_BLOCK = registerBlock("smooth_psychic_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.MAGENTA)));
    public static final Block SMOOTH_PSYCHIC_GEM_STAIRS = registerBlock("smooth_psychic_gem_stairs",
            new StairsBlock(ModBlocks.SMOOTH_PSYCHIC_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.MAGENTA)));
    public static final Block SMOOTH_PSYCHIC_GEM_SLAB = registerBlock("smooth_psychic_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.MAGENTA)));
    public static final Block CHISELED_SMOOTH_PSYCHIC_GEM_BLOCK = registerBlock("chiseled_smooth_psychic_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.MAGENTA)));

    public static final Block SMOOTH_ROCK_GEM_BLOCK = registerBlock("smooth_rock_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
    public static final Block SMOOTH_ROCK_GEM_STAIRS = registerBlock("smooth_rock_gem_stairs",
            new StairsBlock(ModBlocks.SMOOTH_ROCK_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
    public static final Block SMOOTH_ROCK_GEM_SLAB = registerBlock("smooth_rock_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
    public static final Block CHISELED_SMOOTH_ROCK_GEM_BLOCK = registerBlock("chiseled_smooth_rock_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));

    public static final Block SMOOTH_STEEL_GEM_BLOCK = registerBlock("smooth_steel_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.IRON_GRAY)));
    public static final Block SMOOTH_STEEL_GEM_STAIRS = registerBlock("smooth_steel_gem_stairs",
            new StairsBlock(ModBlocks.SMOOTH_STEEL_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.IRON_GRAY)));
    public static final Block SMOOTH_STEEL_GEM_SLAB = registerBlock("smooth_steel_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.IRON_GRAY)));
    public static final Block CHISELED_SMOOTH_STEEL_GEM_BLOCK = registerBlock("chiseled_smooth_steel_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.IRON_GRAY)));

    public static final Block SMOOTH_WATER_GEM_BLOCK = registerBlock("smooth_water_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.WATER_BLUE)));
    public static final Block SMOOTH_WATER_GEM_STAIRS = registerBlock("smooth_water_gem_stairs",
            new StairsBlock(ModBlocks.SMOOTH_WATER_GEM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()
                            .mapColor(MapColor.WATER_BLUE)));
    public static final Block SMOOTH_WATER_GEM_SLAB = registerBlock("smooth_water_gem_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .mapColor(MapColor.WATER_BLUE)));
    public static final Block CHISELED_SMOOTH_WATER_GEM_BLOCK = registerBlock("chiseled_smooth_water_gem_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .mapColor(MapColor.WATER_BLUE)));


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
            entries.add(ModBlocks.POLISHED_BUG_GEM_BLOCK);
            entries.add(ModBlocks.POLISHED_BUG_GEM_STAIRS);
            entries.add(ModBlocks.POLISHED_BUG_GEM_SLAB);
            entries.add(ModBlocks.POLISHED_BUG_GEM_WALL);
            entries.add(ModBlocks.POLISHED_DARK_GEM_BLOCK);
            entries.add(ModBlocks.POLISHED_DARK_GEM_STAIRS);
            entries.add(ModBlocks.POLISHED_DARK_GEM_SLAB);
            entries.add(ModBlocks.POLISHED_DARK_GEM_WALL);
            entries.add(ModBlocks.POLISHED_DRAGON_GEM_BLOCK);
            entries.add(ModBlocks.POLISHED_DRAGON_GEM_STAIRS);
            entries.add(ModBlocks.POLISHED_DRAGON_GEM_SLAB);
            entries.add(ModBlocks.POLISHED_DRAGON_GEM_WALL);
            entries.add(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK);
            entries.add(ModBlocks.POLISHED_ELECTRIC_GEM_STAIRS);
            entries.add(ModBlocks.POLISHED_ELECTRIC_GEM_SLAB);
            entries.add(ModBlocks.POLISHED_ELECTRIC_GEM_WALL);
            entries.add(ModBlocks.POLISHED_FAIRY_GEM_BLOCK);
            entries.add(ModBlocks.POLISHED_FAIRY_GEM_STAIRS);
            entries.add(ModBlocks.POLISHED_FAIRY_GEM_SLAB);
            entries.add(ModBlocks.POLISHED_FAIRY_GEM_WALL);
            entries.add(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK);
            entries.add(ModBlocks.POLISHED_FIGHTING_GEM_STAIRS);
            entries.add(ModBlocks.POLISHED_FIGHTING_GEM_SLAB);
            entries.add(ModBlocks.POLISHED_FIGHTING_GEM_WALL);
            entries.add(ModBlocks.POLISHED_FIRE_GEM_BLOCK);
            entries.add(ModBlocks.POLISHED_FIRE_GEM_STAIRS);
            entries.add(ModBlocks.POLISHED_FIRE_GEM_SLAB);
            entries.add(ModBlocks.POLISHED_FIRE_GEM_WALL);
            entries.add(ModBlocks.POLISHED_FLYING_GEM_BLOCK);
            entries.add(ModBlocks.POLISHED_FLYING_GEM_STAIRS);
            entries.add(ModBlocks.POLISHED_FLYING_GEM_SLAB);
            entries.add(ModBlocks.POLISHED_FLYING_GEM_WALL);
            entries.add(ModBlocks.POLISHED_GHOST_GEM_BLOCK);
            entries.add(ModBlocks.POLISHED_GHOST_GEM_STAIRS);
            entries.add(ModBlocks.POLISHED_GHOST_GEM_SLAB);
            entries.add(ModBlocks.POLISHED_GHOST_GEM_WALL);
            entries.add(ModBlocks.POLISHED_GRASS_GEM_BLOCK);
            entries.add(ModBlocks.POLISHED_GRASS_GEM_STAIRS);
            entries.add(ModBlocks.POLISHED_GRASS_GEM_SLAB);
            entries.add(ModBlocks.POLISHED_GRASS_GEM_WALL);
            entries.add(ModBlocks.POLISHED_GROUND_GEM_BLOCK);
            entries.add(ModBlocks.POLISHED_GROUND_GEM_STAIRS);
            entries.add(ModBlocks.POLISHED_GROUND_GEM_SLAB);
            entries.add(ModBlocks.POLISHED_GROUND_GEM_WALL);
            entries.add(ModBlocks.POLISHED_ICE_GEM_BLOCK);
            entries.add(ModBlocks.POLISHED_ICE_GEM_STAIRS);
            entries.add(ModBlocks.POLISHED_ICE_GEM_SLAB);
            entries.add(ModBlocks.POLISHED_ICE_GEM_WALL);
            entries.add(ModBlocks.POLISHED_NORMAL_GEM_BLOCK);
            entries.add(ModBlocks.POLISHED_NORMAL_GEM_STAIRS);
            entries.add(ModBlocks.POLISHED_NORMAL_GEM_SLAB);
            entries.add(ModBlocks.POLISHED_NORMAL_GEM_WALL);
            entries.add(ModBlocks.POLISHED_POISON_GEM_BLOCK);
            entries.add(ModBlocks.POLISHED_POISON_GEM_STAIRS);
            entries.add(ModBlocks.POLISHED_POISON_GEM_SLAB);
            entries.add(ModBlocks.POLISHED_POISON_GEM_WALL);
            entries.add(ModBlocks.POLISHED_PSYCHIC_GEM_BLOCK);
            entries.add(ModBlocks.POLISHED_PSYCHIC_GEM_STAIRS);
            entries.add(ModBlocks.POLISHED_PSYCHIC_GEM_SLAB);
            entries.add(ModBlocks.POLISHED_PSYCHIC_GEM_WALL);
            entries.add(ModBlocks.POLISHED_ROCK_GEM_BLOCK);
            entries.add(ModBlocks.POLISHED_ROCK_GEM_STAIRS);
            entries.add(ModBlocks.POLISHED_ROCK_GEM_SLAB);
            entries.add(ModBlocks.POLISHED_ROCK_GEM_WALL);
            entries.add(ModBlocks.POLISHED_STEEL_GEM_BLOCK);
            entries.add(ModBlocks.POLISHED_STEEL_GEM_STAIRS);
            entries.add(ModBlocks.POLISHED_STEEL_GEM_SLAB);
            entries.add(ModBlocks.POLISHED_STEEL_GEM_WALL);
            entries.add(ModBlocks.POLISHED_WATER_GEM_BLOCK);
            entries.add(ModBlocks.POLISHED_WATER_GEM_STAIRS);
            entries.add(ModBlocks.POLISHED_WATER_GEM_SLAB);
            entries.add(ModBlocks.POLISHED_WATER_GEM_WALL);

            entries.add(ModBlocks.BUG_GEM_BRICKS);
            entries.add(ModBlocks.BUG_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.BUG_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.BUG_GEM_BRICKS_WALL);
            entries.add(ModBlocks.CHISELED_BUG_GEM_BRICKS);
            entries.add(ModBlocks.DARK_GEM_BRICKS);
            entries.add(ModBlocks.DARK_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.DARK_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.DARK_GEM_BRICKS_WALL);
            entries.add(ModBlocks.CHISELED_DARK_GEM_BRICKS);
            entries.add(ModBlocks.DRAGON_GEM_BRICKS);
            entries.add(ModBlocks.DRAGON_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.DRAGON_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.DRAGON_GEM_BRICKS_WALL);
            entries.add(ModBlocks.CHISELED_DRAGON_GEM_BRICKS);
            entries.add(ModBlocks.ELECTRIC_GEM_BRICKS);
            entries.add(ModBlocks.ELECTRIC_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.ELECTRIC_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.ELECTRIC_GEM_BRICKS_WALL);
            entries.add(ModBlocks.CHISELED_ELECTRIC_GEM_BRICKS);
            entries.add(ModBlocks.FAIRY_GEM_BRICKS);
            entries.add(ModBlocks.FAIRY_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.FAIRY_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.FAIRY_GEM_BRICKS_WALL);
            entries.add(ModBlocks.CHISELED_FAIRY_GEM_BRICKS);
            entries.add(ModBlocks.FIGHTING_GEM_BRICKS);
            entries.add(ModBlocks.FIGHTING_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.FIGHTING_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.FIGHTING_GEM_BRICKS_WALL);
            entries.add(ModBlocks.CHISELED_FIGHTING_GEM_BRICKS);
            entries.add(ModBlocks.FIRE_GEM_BRICKS);
            entries.add(ModBlocks.FIRE_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.FIRE_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.FIRE_GEM_BRICKS_WALL);
            entries.add(ModBlocks.CHISELED_FIRE_GEM_BRICKS);
            entries.add(ModBlocks.FLYING_GEM_BRICKS);
            entries.add(ModBlocks.FLYING_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.FLYING_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.FLYING_GEM_BRICKS_WALL);
            entries.add(ModBlocks.CHISELED_FLYING_GEM_BRICKS);
            entries.add(ModBlocks.GHOST_GEM_BRICKS);
            entries.add(ModBlocks.GHOST_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.GHOST_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.GHOST_GEM_BRICKS_WALL);
            entries.add(ModBlocks.CHISELED_GHOST_GEM_BRICKS);
            entries.add(ModBlocks.GRASS_GEM_BRICKS);
            entries.add(ModBlocks.GRASS_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.GRASS_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.GRASS_GEM_BRICKS_WALL);
            entries.add(ModBlocks.CHISELED_GRASS_GEM_BRICKS);
            entries.add(ModBlocks.GROUND_GEM_BRICKS);
            entries.add(ModBlocks.GROUND_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.GROUND_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.GROUND_GEM_BRICKS_WALL);
            entries.add(ModBlocks.CHISELED_GROUND_GEM_BRICKS);
            entries.add(ModBlocks.ICE_GEM_BRICKS);
            entries.add(ModBlocks.ICE_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.ICE_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.ICE_GEM_BRICKS_WALL);
            entries.add(ModBlocks.CHISELED_ICE_GEM_BRICKS);
            entries.add(ModBlocks.NORMAL_GEM_BRICKS);
            entries.add(ModBlocks.NORMAL_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.NORMAL_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.NORMAL_GEM_BRICKS_WALL);
            entries.add(ModBlocks.CHISELED_NORMAL_GEM_BRICKS);
            entries.add(ModBlocks.POISON_GEM_BRICKS);
            entries.add(ModBlocks.POISON_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.POISON_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.POISON_GEM_BRICKS_WALL);
            entries.add(ModBlocks.CHISELED_POISON_GEM_BRICKS);
            entries.add(ModBlocks.PSYCHIC_GEM_BRICKS);
            entries.add(ModBlocks.PSYCHIC_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.PSYCHIC_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.PSYCHIC_GEM_BRICKS_WALL);
            entries.add(ModBlocks.CHISELED_PSYCHIC_GEM_BRICKS);
            entries.add(ModBlocks.ROCK_GEM_BRICKS);
            entries.add(ModBlocks.ROCK_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.ROCK_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.ROCK_GEM_BRICKS_WALL);
            entries.add(ModBlocks.CHISELED_ROCK_GEM_BRICKS);
            entries.add(ModBlocks.STEEL_GEM_BRICKS);
            entries.add(ModBlocks.STEEL_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.STEEL_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.STEEL_GEM_BRICKS_WALL);
            entries.add(ModBlocks.CHISELED_STEEL_GEM_BRICKS);
            entries.add(ModBlocks.WATER_GEM_BRICKS);
            entries.add(ModBlocks.WATER_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.WATER_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.WATER_GEM_BRICKS_WALL);
            entries.add(ModBlocks.CHISELED_WATER_GEM_BRICKS);

            entries.add(ModBlocks.SMOOTH_BUG_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_BUG_GEM_STAIRS);
            entries.add(ModBlocks.SMOOTH_BUG_GEM_SLAB);
            entries.add(ModBlocks.CHISELED_SMOOTH_BUG_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_DARK_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_DARK_GEM_STAIRS);
            entries.add(ModBlocks.SMOOTH_DARK_GEM_SLAB);
            entries.add(ModBlocks.CHISELED_SMOOTH_DARK_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_DRAGON_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_DRAGON_GEM_STAIRS);
            entries.add(ModBlocks.SMOOTH_DRAGON_GEM_SLAB);
            entries.add(ModBlocks.CHISELED_SMOOTH_DRAGON_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_ELECTRIC_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_ELECTRIC_GEM_STAIRS);
            entries.add(ModBlocks.SMOOTH_ELECTRIC_GEM_SLAB);
            entries.add(ModBlocks.CHISELED_SMOOTH_ELECTRIC_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_FAIRY_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_FAIRY_GEM_STAIRS);
            entries.add(ModBlocks.SMOOTH_FAIRY_GEM_SLAB);
            entries.add(ModBlocks.CHISELED_SMOOTH_FAIRY_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_FIGHTING_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_FIGHTING_GEM_STAIRS);
            entries.add(ModBlocks.SMOOTH_FIGHTING_GEM_SLAB);
            entries.add(ModBlocks.CHISELED_SMOOTH_FIGHTING_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_FIRE_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_FIRE_GEM_STAIRS);
            entries.add(ModBlocks.SMOOTH_FIRE_GEM_SLAB);
            entries.add(ModBlocks.CHISELED_SMOOTH_FIRE_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_FLYING_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_FLYING_GEM_STAIRS);
            entries.add(ModBlocks.SMOOTH_FLYING_GEM_SLAB);
            entries.add(ModBlocks.CHISELED_SMOOTH_FLYING_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_GHOST_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_GHOST_GEM_STAIRS);
            entries.add(ModBlocks.SMOOTH_GHOST_GEM_SLAB);
            entries.add(ModBlocks.CHISELED_SMOOTH_GHOST_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_GRASS_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_GRASS_GEM_STAIRS);
            entries.add(ModBlocks.SMOOTH_GRASS_GEM_SLAB);
            entries.add(ModBlocks.CHISELED_SMOOTH_GRASS_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_GROUND_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_GROUND_GEM_STAIRS);
            entries.add(ModBlocks.SMOOTH_GROUND_GEM_SLAB);
            entries.add(ModBlocks.CHISELED_SMOOTH_GROUND_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_ICE_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_ICE_GEM_STAIRS);
            entries.add(ModBlocks.SMOOTH_ICE_GEM_SLAB);
            entries.add(ModBlocks.CHISELED_SMOOTH_ICE_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_NORMAL_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_NORMAL_GEM_STAIRS);
            entries.add(ModBlocks.SMOOTH_NORMAL_GEM_SLAB);
            entries.add(ModBlocks.CHISELED_SMOOTH_NORMAL_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_POISON_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_POISON_GEM_STAIRS);
            entries.add(ModBlocks.SMOOTH_POISON_GEM_SLAB);
            entries.add(ModBlocks.CHISELED_SMOOTH_POISON_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_PSYCHIC_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_PSYCHIC_GEM_STAIRS);
            entries.add(ModBlocks.SMOOTH_PSYCHIC_GEM_SLAB);
            entries.add(ModBlocks.CHISELED_SMOOTH_PSYCHIC_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_ROCK_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_ROCK_GEM_STAIRS);
            entries.add(ModBlocks.SMOOTH_ROCK_GEM_SLAB);
            entries.add(ModBlocks.CHISELED_SMOOTH_ROCK_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_STEEL_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_STEEL_GEM_STAIRS);
            entries.add(ModBlocks.SMOOTH_STEEL_GEM_SLAB);
            entries.add(ModBlocks.CHISELED_SMOOTH_STEEL_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_WATER_GEM_BLOCK);
            entries.add(ModBlocks.SMOOTH_WATER_GEM_STAIRS);
            entries.add(ModBlocks.SMOOTH_WATER_GEM_SLAB);
            entries.add(ModBlocks.CHISELED_SMOOTH_WATER_GEM_BLOCK);
        });
    }
}
