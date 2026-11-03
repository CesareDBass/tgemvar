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

    public static final Block BUG_GEM_BRICKS = registerBlock("bug_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block BUG_GEM_BRICKS_STAIRS = registerBlock("bug_gem_bricks_stairs",
            new StairsBlock(ModBlocks.BUG_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block BUG_GEM_BRICKS_SLAB = registerBlock("bug_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block BUG_GEM_BRICKS_WALL = registerBlock("bug_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block DARK_GEM_BRICKS = registerBlock("dark_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block DARK_GEM_BRICKS_STAIRS = registerBlock("dark_gem_bricks_stairs",
            new StairsBlock(ModBlocks.DARK_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block DARK_GEM_BRICKS_SLAB = registerBlock("dark_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block DARK_GEM_BRICKS_WALL = registerBlock("dark_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block DRAGON_GEM_BRICKS = registerBlock("dragon_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block DRAGON_GEM_BRICKS_STAIRS = registerBlock("dragon_gem_bricks_stairs",
            new StairsBlock(ModBlocks.DRAGON_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block DRAGON_GEM_BRICKS_SLAB = registerBlock("dragon_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block DRAGON_GEM_BRICKS_WALL = registerBlock("dragon_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block ELECTRIC_GEM_BRICKS = registerBlock("electric_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block ELECTRIC_GEM_BRICKS_STAIRS = registerBlock("electric_gem_bricks_stairs",
            new StairsBlock(ModBlocks.ELECTRIC_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block ELECTRIC_GEM_BRICKS_SLAB = registerBlock("electric_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block ELECTRIC_GEM_BRICKS_WALL = registerBlock("electric_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block FAIRY_GEM_BRICKS = registerBlock("fairy_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block FAIRY_GEM_BRICKS_STAIRS = registerBlock("fairy_gem_bricks_stairs",
            new StairsBlock(ModBlocks.FAIRY_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block FAIRY_GEM_BRICKS_SLAB = registerBlock("fairy_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block FAIRY_GEM_BRICKS_WALL = registerBlock("fairy_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block FIGHTING_GEM_BRICKS = registerBlock("fighting_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block FIGHTING_GEM_BRICKS_STAIRS = registerBlock("fighting_gem_bricks_stairs",
            new StairsBlock(ModBlocks.FIGHTING_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block FIGHTING_GEM_BRICKS_SLAB = registerBlock("fighting_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block FIGHTING_GEM_BRICKS_WALL = registerBlock("fighting_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block FIRE_GEM_BRICKS = registerBlock("fire_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block FIRE_GEM_BRICKS_STAIRS = registerBlock("fire_gem_bricks_stairs",
            new StairsBlock(ModBlocks.FIRE_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block FIRE_GEM_BRICKS_SLAB = registerBlock("fire_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block FIRE_GEM_BRICKS_WALL = registerBlock("fire_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block FLYING_GEM_BRICKS = registerBlock("flying_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block FLYING_GEM_BRICKS_STAIRS = registerBlock("flying_gem_bricks_stairs",
            new StairsBlock(ModBlocks.FLYING_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block FLYING_GEM_BRICKS_SLAB = registerBlock("flying_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block FLYING_GEM_BRICKS_WALL = registerBlock("flying_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block GHOST_GEM_BRICKS = registerBlock("ghost_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block GHOST_GEM_BRICKS_STAIRS = registerBlock("ghost_gem_bricks_stairs",
            new StairsBlock(ModBlocks.GHOST_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block GHOST_GEM_BRICKS_SLAB = registerBlock("ghost_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block GHOST_GEM_BRICKS_WALL = registerBlock("ghost_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block GRASS_GEM_BRICKS = registerBlock("grass_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block GRASS_GEM_BRICKS_STAIRS = registerBlock("grass_gem_bricks_stairs",
            new StairsBlock(ModBlocks.GRASS_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block GRASS_GEM_BRICKS_SLAB = registerBlock("grass_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block GRASS_GEM_BRICKS_WALL = registerBlock("grass_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block GROUND_GEM_BRICKS = registerBlock("ground_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block GROUND_GEM_BRICKS_STAIRS = registerBlock("ground_gem_bricks_stairs",
            new StairsBlock(ModBlocks.GROUND_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block GROUND_GEM_BRICKS_SLAB = registerBlock("ground_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block GROUND_GEM_BRICKS_WALL = registerBlock("ground_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block ICE_GEM_BRICKS = registerBlock("ice_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block ICE_GEM_BRICKS_STAIRS = registerBlock("ice_gem_bricks_stairs",
            new StairsBlock(ModBlocks.ICE_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block ICE_GEM_BRICKS_SLAB = registerBlock("ice_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block ICE_GEM_BRICKS_WALL = registerBlock("ice_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block NORMAL_GEM_BRICKS = registerBlock("normal_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block NORMAL_GEM_BRICKS_STAIRS = registerBlock("normal_gem_bricks_stairs",
            new StairsBlock(ModBlocks.NORMAL_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block NORMAL_GEM_BRICKS_SLAB = registerBlock("normal_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block NORMAL_GEM_BRICKS_WALL = registerBlock("normal_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block POISON_GEM_BRICKS = registerBlock("poison_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block POISON_GEM_BRICKS_STAIRS = registerBlock("poison_gem_bricks_stairs",
            new StairsBlock(ModBlocks.POISON_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block POISON_GEM_BRICKS_SLAB = registerBlock("poison_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block POISON_GEM_BRICKS_WALL = registerBlock("poison_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block PSYCHIC_GEM_BRICKS = registerBlock("psychic_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block PSYCHIC_GEM_BRICKS_STAIRS = registerBlock("psychic_gem_bricks_stairs",
            new StairsBlock(ModBlocks.PSYCHIC_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block PSYCHIC_GEM_BRICKS_SLAB = registerBlock("psychic_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block PSYCHIC_GEM_BRICKS_WALL = registerBlock("psychic_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block ROCK_GEM_BRICKS = registerBlock("rock_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block ROCK_GEM_BRICKS_STAIRS = registerBlock("rock_gem_bricks_stairs",
            new StairsBlock(ModBlocks.ROCK_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block ROCK_GEM_BRICKS_SLAB = registerBlock("rock_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block ROCK_GEM_BRICKS_WALL = registerBlock("rock_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block STEEL_GEM_BRICKS = registerBlock("steel_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block STEEL_GEM_BRICKS_STAIRS = registerBlock("steel_gem_bricks_stairs",
            new StairsBlock(ModBlocks.STEEL_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block STEEL_GEM_BRICKS_SLAB = registerBlock("steel_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block STEEL_GEM_BRICKS_WALL = registerBlock("steel_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block WATER_GEM_BRICKS = registerBlock("water_gem_bricks",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block WATER_GEM_BRICKS_STAIRS = registerBlock("water_gem_bricks_stairs",
            new StairsBlock(ModBlocks.WATER_GEM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block WATER_GEM_BRICKS_SLAB = registerBlock("water_gem_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block WATER_GEM_BRICKS_WALL = registerBlock("water_gem_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));



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
            entries.add(ModBlocks.BUG_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.BUG_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.BUG_GEM_BRICKS_WALL);
            entries.add(ModBlocks.DARK_GEM_BRICKS);
            entries.add(ModBlocks.DARK_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.DARK_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.DARK_GEM_BRICKS_WALL);
            entries.add(ModBlocks.DRAGON_GEM_BRICKS);
            entries.add(ModBlocks.DRAGON_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.DRAGON_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.DRAGON_GEM_BRICKS_WALL);
            entries.add(ModBlocks.ELECTRIC_GEM_BRICKS);
            entries.add(ModBlocks.ELECTRIC_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.ELECTRIC_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.ELECTRIC_GEM_BRICKS_WALL);
            entries.add(ModBlocks.FAIRY_GEM_BRICKS);
            entries.add(ModBlocks.FAIRY_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.FAIRY_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.FAIRY_GEM_BRICKS_WALL);
            entries.add(ModBlocks.FIGHTING_GEM_BRICKS);
            entries.add(ModBlocks.FIGHTING_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.FIGHTING_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.FIGHTING_GEM_BRICKS_WALL);
            entries.add(ModBlocks.FIRE_GEM_BRICKS);
            entries.add(ModBlocks.FIRE_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.FIRE_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.FIRE_GEM_BRICKS_WALL);
            entries.add(ModBlocks.FLYING_GEM_BRICKS);
            entries.add(ModBlocks.FLYING_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.FLYING_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.FLYING_GEM_BRICKS_WALL);
            entries.add(ModBlocks.GHOST_GEM_BRICKS);
            entries.add(ModBlocks.GHOST_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.GHOST_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.GHOST_GEM_BRICKS_WALL);
            entries.add(ModBlocks.GRASS_GEM_BRICKS);
            entries.add(ModBlocks.GRASS_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.GRASS_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.GRASS_GEM_BRICKS_WALL);
            entries.add(ModBlocks.GROUND_GEM_BRICKS);
            entries.add(ModBlocks.GROUND_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.GROUND_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.GROUND_GEM_BRICKS_WALL);
            entries.add(ModBlocks.ICE_GEM_BRICKS);
            entries.add(ModBlocks.ICE_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.ICE_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.ICE_GEM_BRICKS_WALL);
            entries.add(ModBlocks.NORMAL_GEM_BRICKS);
            entries.add(ModBlocks.NORMAL_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.NORMAL_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.NORMAL_GEM_BRICKS_WALL);
            entries.add(ModBlocks.POISON_GEM_BRICKS);
            entries.add(ModBlocks.POISON_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.POISON_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.POISON_GEM_BRICKS_WALL);
            entries.add(ModBlocks.PSYCHIC_GEM_BRICKS);
            entries.add(ModBlocks.PSYCHIC_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.PSYCHIC_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.PSYCHIC_GEM_BRICKS_WALL);
            entries.add(ModBlocks.ROCK_GEM_BRICKS);
            entries.add(ModBlocks.ROCK_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.ROCK_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.ROCK_GEM_BRICKS_WALL);
            entries.add(ModBlocks.STEEL_GEM_BRICKS);
            entries.add(ModBlocks.STEEL_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.STEEL_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.STEEL_GEM_BRICKS_WALL);
            entries.add(ModBlocks.WATER_GEM_BRICKS);
            entries.add(ModBlocks.WATER_GEM_BRICKS_STAIRS);
            entries.add(ModBlocks.WATER_GEM_BRICKS_SLAB);
            entries.add(ModBlocks.WATER_GEM_BRICKS_WALL);
        });
    }
}
