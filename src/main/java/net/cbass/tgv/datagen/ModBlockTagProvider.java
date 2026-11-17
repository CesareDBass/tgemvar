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
                .add(ModBlocks.CHISELED_WATER_GEM_BRICKS);

        getOrCreateTagBuilder(BlockTags.WALLS)
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
