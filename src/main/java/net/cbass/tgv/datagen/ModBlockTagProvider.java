package net.cbass.tgv.datagen;

import net.cbass.tgv.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.POLISHED_BUG_GEM_BLOCK)
                .add(ModBlocks.POLISHED_BUG_GEM_STAIRS)
                .add(ModBlocks.POLISHED_BUG_GEM_SLAB)

                .add(ModBlocks.POLISHED_DARK_GEM_BLOCK)
                .add(ModBlocks.POLISHED_DARK_GEM_STAIRS)
                .add(ModBlocks.POLISHED_DARK_GEM_SLAB)

                .add(ModBlocks.POLISHED_DRAGON_GEM_BLOCK)
                .add(ModBlocks.POLISHED_DRAGON_GEM_STAIRS)
                .add(ModBlocks.POLISHED_DRAGON_GEM_SLAB)

                .add(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK)
                .add(ModBlocks.POLISHED_ELECTRIC_GEM_STAIRS)
                .add(ModBlocks.POLISHED_ELECTRIC_GEM_SLAB)

                .add(ModBlocks.POLISHED_FAIRY_GEM_BLOCK)
                .add(ModBlocks.POLISHED_FAIRY_GEM_STAIRS)
                .add(ModBlocks.POLISHED_FAIRY_GEM_SLAB)

                .add(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK)
                .add(ModBlocks.POLISHED_FIGHTING_GEM_STAIRS)
                .add(ModBlocks.POLISHED_FIGHTING_GEM_SLAB)

                .add(ModBlocks.POLISHED_FIRE_GEM_BLOCK)
                .add(ModBlocks.POLISHED_FIRE_GEM_STAIRS)
                .add(ModBlocks.POLISHED_FIRE_GEM_SLAB)

                .add(ModBlocks.POLISHED_FLYING_GEM_BLOCK)
                .add(ModBlocks.POLISHED_FLYING_GEM_STAIRS)
                .add(ModBlocks.POLISHED_FLYING_GEM_SLAB)

                .add(ModBlocks.POLISHED_GHOST_GEM_BLOCK)
                .add(ModBlocks.POLISHED_GHOST_GEM_STAIRS)
                .add(ModBlocks.POLISHED_GHOST_GEM_SLAB)

                .add(ModBlocks.POLISHED_GRASS_GEM_BLOCK)
                .add(ModBlocks.POLISHED_GRASS_GEM_STAIRS)
                .add(ModBlocks.POLISHED_GRASS_GEM_SLAB)

                .add(ModBlocks.POLISHED_GROUND_GEM_BLOCK)
                .add(ModBlocks.POLISHED_GROUND_GEM_STAIRS)
                .add(ModBlocks.POLISHED_GROUND_GEM_SLAB)

                .add(ModBlocks.POLISHED_ICE_GEM_BLOCK)
                .add(ModBlocks.POLISHED_ICE_GEM_STAIRS)
                .add(ModBlocks.POLISHED_ICE_GEM_SLAB)

                .add(ModBlocks.POLISHED_NORMAL_GEM_BLOCK)
                .add(ModBlocks.POLISHED_NORMAL_GEM_STAIRS)
                .add(ModBlocks.POLISHED_NORMAL_GEM_SLAB)

                .add(ModBlocks.POLISHED_POISON_GEM_BLOCK)
                .add(ModBlocks.POLISHED_POISON_GEM_STAIRS)
                .add(ModBlocks.POLISHED_POISON_GEM_SLAB)

                .add(ModBlocks.POLISHED_PSYCHIC_GEM_BLOCK)
                .add(ModBlocks.POLISHED_PSYCHIC_GEM_STAIRS)
                .add(ModBlocks.POLISHED_PSYCHIC_GEM_SLAB)

                .add(ModBlocks.POLISHED_ROCK_GEM_BLOCK)
                .add(ModBlocks.POLISHED_ROCK_GEM_STAIRS)
                .add(ModBlocks.POLISHED_ROCK_GEM_SLAB)

                .add(ModBlocks.POLISHED_STEEL_GEM_BLOCK)
                .add(ModBlocks.POLISHED_STEEL_GEM_STAIRS)
                .add(ModBlocks.POLISHED_STEEL_GEM_SLAB)

                .add(ModBlocks.POLISHED_WATER_GEM_BLOCK)
                .add(ModBlocks.POLISHED_WATER_GEM_STAIRS)
                .add(ModBlocks.POLISHED_WATER_GEM_SLAB)

                .add(ModBlocks.BUG_GEM_BRICKS)
                .add(ModBlocks.BUG_GEM_BRICKS_STAIRS)
                .add(ModBlocks.BUG_GEM_BRICKS_SLAB)
                .add(ModBlocks.CHISELED_BUG_GEM_BRICKS)

                .add(ModBlocks.DARK_GEM_BRICKS)
                .add(ModBlocks.DARK_GEM_BRICKS_STAIRS)
                .add(ModBlocks.DARK_GEM_BRICKS_SLAB)
                .add(ModBlocks.CHISELED_DARK_GEM_BRICKS)

                .add(ModBlocks.DRAGON_GEM_BRICKS)
                .add(ModBlocks.DRAGON_GEM_BRICKS_STAIRS)
                .add(ModBlocks.DRAGON_GEM_BRICKS_SLAB)
                .add(ModBlocks.CHISELED_DRAGON_GEM_BRICKS)

                .add(ModBlocks.ELECTRIC_GEM_BRICKS)
                .add(ModBlocks.ELECTRIC_GEM_BRICKS_STAIRS)
                .add(ModBlocks.ELECTRIC_GEM_BRICKS_SLAB)
                .add(ModBlocks.CHISELED_ELECTRIC_GEM_BRICKS)

                .add(ModBlocks.FAIRY_GEM_BRICKS)
                .add(ModBlocks.FAIRY_GEM_BRICKS_STAIRS)
                .add(ModBlocks.FAIRY_GEM_BRICKS_SLAB)
                .add(ModBlocks.CHISELED_FAIRY_GEM_BRICKS)

                .add(ModBlocks.FIGHTING_GEM_BRICKS)
                .add(ModBlocks.FIGHTING_GEM_BRICKS_STAIRS)
                .add(ModBlocks.FIGHTING_GEM_BRICKS_SLAB)
                .add(ModBlocks.CHISELED_FIGHTING_GEM_BRICKS)

                .add(ModBlocks.FIRE_GEM_BRICKS)
                .add(ModBlocks.FIRE_GEM_BRICKS_STAIRS)
                .add(ModBlocks.FIRE_GEM_BRICKS_SLAB)
                .add(ModBlocks.CHISELED_FIRE_GEM_BRICKS)

                .add(ModBlocks.FLYING_GEM_BRICKS)
                .add(ModBlocks.FLYING_GEM_BRICKS_STAIRS)
                .add(ModBlocks.FLYING_GEM_BRICKS_SLAB)
                .add(ModBlocks.CHISELED_FLYING_GEM_BRICKS)

                .add(ModBlocks.GHOST_GEM_BRICKS)
                .add(ModBlocks.GHOST_GEM_BRICKS_STAIRS)
                .add(ModBlocks.GHOST_GEM_BRICKS_SLAB)
                .add(ModBlocks.CHISELED_GRASS_GEM_BRICKS)

                .add(ModBlocks.GRASS_GEM_BRICKS)
                .add(ModBlocks.GRASS_GEM_BRICKS_STAIRS)
                .add(ModBlocks.GRASS_GEM_BRICKS_SLAB)
                .add(ModBlocks.CHISELED_GRASS_GEM_BRICKS)

                .add(ModBlocks.GROUND_GEM_BRICKS)
                .add(ModBlocks.GROUND_GEM_BRICKS_STAIRS)
                .add(ModBlocks.GROUND_GEM_BRICKS_SLAB)
                .add(ModBlocks.CHISELED_GROUND_GEM_BRICKS)

                .add(ModBlocks.ICE_GEM_BRICKS)
                .add(ModBlocks.ICE_GEM_BRICKS_STAIRS)
                .add(ModBlocks.ICE_GEM_BRICKS_SLAB)
                .add(ModBlocks.CHISELED_ICE_GEM_BRICKS)

                .add(ModBlocks.NORMAL_GEM_BRICKS)
                .add(ModBlocks.NORMAL_GEM_BRICKS_STAIRS)
                .add(ModBlocks.NORMAL_GEM_BRICKS_SLAB)
                .add(ModBlocks.CHISELED_NORMAL_GEM_BRICKS)

                .add(ModBlocks.POISON_GEM_BRICKS)
                .add(ModBlocks.POISON_GEM_BRICKS_STAIRS)
                .add(ModBlocks.POISON_GEM_BRICKS_SLAB)
                .add(ModBlocks.CHISELED_POISON_GEM_BRICKS)

                .add(ModBlocks.PSYCHIC_GEM_BRICKS)
                .add(ModBlocks.PSYCHIC_GEM_BRICKS_STAIRS)
                .add(ModBlocks.PSYCHIC_GEM_BRICKS_SLAB)
                .add(ModBlocks.CHISELED_PSYCHIC_GEM_BRICKS)

                .add(ModBlocks.ROCK_GEM_BRICKS)
                .add(ModBlocks.ROCK_GEM_BRICKS_STAIRS)
                .add(ModBlocks.ROCK_GEM_BRICKS_SLAB)
                .add(ModBlocks.CHISELED_ROCK_GEM_BRICKS)

                .add(ModBlocks.STEEL_GEM_BRICKS)
                .add(ModBlocks.STEEL_GEM_BRICKS_STAIRS)
                .add(ModBlocks.STEEL_GEM_BRICKS_SLAB)
                .add(ModBlocks.CHISELED_STEEL_GEM_BRICKS)

                .add(ModBlocks.WATER_GEM_BRICKS)
                .add(ModBlocks.WATER_GEM_BRICKS_STAIRS)
                .add(ModBlocks.WATER_GEM_BRICKS_SLAB)
                .add(ModBlocks.CHISELED_WATER_GEM_BRICKS)

                .add(ModBlocks.SMOOTH_BUG_GEM_BLOCK)
                .add(ModBlocks.SMOOTH_BUG_GEM_STAIRS)
                .add(ModBlocks.SMOOTH_BUG_GEM_SLAB)
                .add(ModBlocks.CHISELED_SMOOTH_BUG_GEM_BLOCK)

                .add(ModBlocks.SMOOTH_DARK_GEM_BLOCK)
                .add(ModBlocks.SMOOTH_DARK_GEM_STAIRS)
                .add(ModBlocks.SMOOTH_DARK_GEM_SLAB)
                .add(ModBlocks.CHISELED_SMOOTH_DARK_GEM_BLOCK)

                .add(ModBlocks.SMOOTH_DRAGON_GEM_BLOCK)
                .add(ModBlocks.SMOOTH_DRAGON_GEM_STAIRS)
                .add(ModBlocks.SMOOTH_DRAGON_GEM_SLAB)
                .add(ModBlocks.CHISELED_SMOOTH_DRAGON_GEM_BLOCK)

                .add(ModBlocks.SMOOTH_ELECTRIC_GEM_BLOCK)
                .add(ModBlocks.SMOOTH_ELECTRIC_GEM_STAIRS)
                .add(ModBlocks.SMOOTH_ELECTRIC_GEM_SLAB)
                .add(ModBlocks.CHISELED_SMOOTH_ELECTRIC_GEM_BLOCK)

                .add(ModBlocks.SMOOTH_FAIRY_GEM_BLOCK)
                .add(ModBlocks.SMOOTH_FAIRY_GEM_STAIRS)
                .add(ModBlocks.SMOOTH_FAIRY_GEM_SLAB)
                .add(ModBlocks.CHISELED_SMOOTH_FAIRY_GEM_BLOCK)

                .add(ModBlocks.SMOOTH_FIGHTING_GEM_BLOCK)
                .add(ModBlocks.SMOOTH_FIGHTING_GEM_STAIRS)
                .add(ModBlocks.SMOOTH_FIGHTING_GEM_SLAB)
                .add(ModBlocks.CHISELED_SMOOTH_FIGHTING_GEM_BLOCK)

                .add(ModBlocks.SMOOTH_FIRE_GEM_BLOCK)
                .add(ModBlocks.SMOOTH_FIRE_GEM_STAIRS)
                .add(ModBlocks.SMOOTH_FIRE_GEM_SLAB)
                .add(ModBlocks.CHISELED_SMOOTH_FIRE_GEM_BLOCK)

                .add(ModBlocks.SMOOTH_FLYING_GEM_BLOCK)
                .add(ModBlocks.SMOOTH_FLYING_GEM_STAIRS)
                .add(ModBlocks.SMOOTH_FLYING_GEM_SLAB)
                .add(ModBlocks.CHISELED_SMOOTH_FLYING_GEM_BLOCK)

                .add(ModBlocks.SMOOTH_GHOST_GEM_BLOCK)
                .add(ModBlocks.SMOOTH_GHOST_GEM_STAIRS)
                .add(ModBlocks.SMOOTH_GHOST_GEM_SLAB)
                .add(ModBlocks.CHISELED_SMOOTH_GHOST_GEM_BLOCK)

                .add(ModBlocks.SMOOTH_GRASS_GEM_BLOCK)
                .add(ModBlocks.SMOOTH_GRASS_GEM_STAIRS)
                .add(ModBlocks.SMOOTH_GRASS_GEM_SLAB)
                .add(ModBlocks.CHISELED_SMOOTH_GRASS_GEM_BLOCK)

                .add(ModBlocks.SMOOTH_GROUND_GEM_BLOCK)
                .add(ModBlocks.SMOOTH_GROUND_GEM_STAIRS)
                .add(ModBlocks.SMOOTH_GROUND_GEM_SLAB)
                .add(ModBlocks.CHISELED_SMOOTH_GROUND_GEM_BLOCK)

                .add(ModBlocks.SMOOTH_ICE_GEM_BLOCK)
                .add(ModBlocks.SMOOTH_ICE_GEM_STAIRS)
                .add(ModBlocks.SMOOTH_ICE_GEM_SLAB)
                .add(ModBlocks.CHISELED_SMOOTH_ICE_GEM_BLOCK)

                .add(ModBlocks.SMOOTH_NORMAL_GEM_BLOCK)
                .add(ModBlocks.SMOOTH_NORMAL_GEM_STAIRS)
                .add(ModBlocks.SMOOTH_NORMAL_GEM_SLAB)
                .add(ModBlocks.CHISELED_SMOOTH_NORMAL_GEM_BLOCK)

                .add(ModBlocks.SMOOTH_POISON_GEM_BLOCK)
                .add(ModBlocks.SMOOTH_POISON_GEM_STAIRS)
                .add(ModBlocks.SMOOTH_POISON_GEM_SLAB)
                .add(ModBlocks.CHISELED_SMOOTH_POISON_GEM_BLOCK)

                .add(ModBlocks.SMOOTH_PSYCHIC_GEM_BLOCK)
                .add(ModBlocks.SMOOTH_PSYCHIC_GEM_STAIRS)
                .add(ModBlocks.SMOOTH_PSYCHIC_GEM_SLAB)
                .add(ModBlocks.CHISELED_SMOOTH_ROCK_GEM_BLOCK)

                .add(ModBlocks.SMOOTH_ROCK_GEM_BLOCK)
                .add(ModBlocks.SMOOTH_ROCK_GEM_STAIRS)
                .add(ModBlocks.SMOOTH_ROCK_GEM_SLAB)
                .add(ModBlocks.CHISELED_SMOOTH_ROCK_GEM_BLOCK)

                .add(ModBlocks.SMOOTH_STEEL_GEM_BLOCK)
                .add(ModBlocks.SMOOTH_STEEL_GEM_STAIRS)
                .add(ModBlocks.SMOOTH_STEEL_GEM_SLAB)
                .add(ModBlocks.CHISELED_SMOOTH_STEEL_GEM_BLOCK)

                .add(ModBlocks.SMOOTH_WATER_GEM_BLOCK)
                .add(ModBlocks.SMOOTH_WATER_GEM_STAIRS)
                .add(ModBlocks.SMOOTH_WATER_GEM_SLAB)
                .add(ModBlocks.CHISELED_SMOOTH_WATER_GEM_BLOCK);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.POLISHED_BUG_GEM_WALL)
                .add(ModBlocks.POLISHED_DARK_GEM_WALL)
                .add(ModBlocks.POLISHED_DRAGON_GEM_WALL)
                .add(ModBlocks.POLISHED_ELECTRIC_GEM_WALL)
                .add(ModBlocks.POLISHED_FAIRY_GEM_WALL)
                .add(ModBlocks.POLISHED_FIGHTING_GEM_WALL)
                .add(ModBlocks.POLISHED_FIRE_GEM_WALL)
                .add(ModBlocks.POLISHED_FLYING_GEM_WALL)
                .add(ModBlocks.POLISHED_GHOST_GEM_WALL)
                .add(ModBlocks.POLISHED_GRASS_GEM_WALL)
                .add(ModBlocks.POLISHED_GROUND_GEM_WALL)
                .add(ModBlocks.POLISHED_ICE_GEM_WALL)
                .add(ModBlocks.POLISHED_NORMAL_GEM_WALL)
                .add(ModBlocks.POLISHED_POISON_GEM_WALL)
                .add(ModBlocks.POLISHED_PSYCHIC_GEM_WALL)
                .add(ModBlocks.POLISHED_ROCK_GEM_WALL)
                .add(ModBlocks.POLISHED_STEEL_GEM_WALL)
                .add(ModBlocks.POLISHED_WATER_GEM_WALL)
                .add(ModBlocks.BUG_GEM_BRICKS_WALL)
                .add(ModBlocks.DARK_GEM_BRICKS_WALL)
                .add(ModBlocks.DRAGON_GEM_BRICKS_WALL)
                .add(ModBlocks.ELECTRIC_GEM_BRICKS_WALL)
                .add(ModBlocks.FAIRY_GEM_BRICKS_WALL)
                .add(ModBlocks.FIGHTING_GEM_BRICKS_WALL)
                .add(ModBlocks.FIRE_GEM_BRICKS_WALL)
                .add(ModBlocks.FLYING_GEM_BRICKS_WALL)
                .add(ModBlocks.GHOST_GEM_BRICKS_WALL)
                .add(ModBlocks.GRASS_GEM_BRICKS_WALL)
                .add(ModBlocks.GROUND_GEM_BRICKS_WALL)
                .add(ModBlocks.ICE_GEM_BRICKS_WALL)
                .add(ModBlocks.NORMAL_GEM_BRICKS_WALL)
                .add(ModBlocks.POISON_GEM_BRICKS_WALL)
                .add(ModBlocks.PSYCHIC_GEM_BRICKS_WALL)
                .add(ModBlocks.ROCK_GEM_BRICKS_WALL)
                .add(ModBlocks.STEEL_GEM_BRICKS_WALL)
                .add(ModBlocks.WATER_GEM_BRICKS_WALL);
    }
}
