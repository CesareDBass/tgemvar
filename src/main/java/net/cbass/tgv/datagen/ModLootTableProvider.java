package net.cbass.tgv.datagen;

import net.cbass.tgv.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.POLISHED_BUG_GEM_BLOCK);
        addDrop(ModBlocks.POLISHED_BUG_GEM_STAIRS);
        addDrop(ModBlocks.POLISHED_BUG_GEM_SLAB, slabDrops(ModBlocks.POLISHED_BUG_GEM_SLAB));
        addDrop(ModBlocks.POLISHED_BUG_GEM_WALL);

        addDrop(ModBlocks.POLISHED_DARK_GEM_BLOCK);
        addDrop(ModBlocks.POLISHED_DARK_GEM_STAIRS);
        addDrop(ModBlocks.POLISHED_DARK_GEM_SLAB, slabDrops(ModBlocks.POLISHED_DARK_GEM_SLAB));
        addDrop(ModBlocks.POLISHED_DARK_GEM_WALL);

        addDrop(ModBlocks.POLISHED_DRAGON_GEM_BLOCK);
        addDrop(ModBlocks.POLISHED_DRAGON_GEM_STAIRS);
        addDrop(ModBlocks.POLISHED_DRAGON_GEM_SLAB, slabDrops(ModBlocks.POLISHED_DRAGON_GEM_SLAB));
        addDrop(ModBlocks.POLISHED_DRAGON_GEM_WALL);

        addDrop(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK);
        addDrop(ModBlocks.POLISHED_ELECTRIC_GEM_STAIRS);
        addDrop(ModBlocks.POLISHED_ELECTRIC_GEM_SLAB, slabDrops(ModBlocks.POLISHED_ELECTRIC_GEM_SLAB));
        addDrop(ModBlocks.POLISHED_ELECTRIC_GEM_WALL);

        addDrop(ModBlocks.POLISHED_FAIRY_GEM_BLOCK);
        addDrop(ModBlocks.POLISHED_FAIRY_GEM_STAIRS);
        addDrop(ModBlocks.POLISHED_FAIRY_GEM_SLAB, slabDrops(ModBlocks.POLISHED_FAIRY_GEM_SLAB));
        addDrop(ModBlocks.POLISHED_FAIRY_GEM_WALL);

        addDrop(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK);
        addDrop(ModBlocks.POLISHED_FIGHTING_GEM_STAIRS);
        addDrop(ModBlocks.POLISHED_FIGHTING_GEM_SLAB, slabDrops(ModBlocks.POLISHED_FIGHTING_GEM_SLAB));
        addDrop(ModBlocks.POLISHED_FIGHTING_GEM_WALL);

        addDrop(ModBlocks.POLISHED_FIRE_GEM_BLOCK);
        addDrop(ModBlocks.POLISHED_FIRE_GEM_STAIRS);
        addDrop(ModBlocks.POLISHED_FIRE_GEM_SLAB, slabDrops(ModBlocks.POLISHED_FIRE_GEM_SLAB));
        addDrop(ModBlocks.POLISHED_FIRE_GEM_WALL);

        addDrop(ModBlocks.POLISHED_FLYING_GEM_BLOCK);
        addDrop(ModBlocks.POLISHED_FLYING_GEM_STAIRS);
        addDrop(ModBlocks.POLISHED_FLYING_GEM_SLAB, slabDrops(ModBlocks.POLISHED_FLYING_GEM_SLAB));
        addDrop(ModBlocks.POLISHED_FLYING_GEM_WALL);

        addDrop(ModBlocks.POLISHED_GHOST_GEM_BLOCK);
        addDrop(ModBlocks.POLISHED_GHOST_GEM_STAIRS);
        addDrop(ModBlocks.POLISHED_GHOST_GEM_SLAB, slabDrops(ModBlocks.POLISHED_GHOST_GEM_SLAB));
        addDrop(ModBlocks.POLISHED_GHOST_GEM_WALL);

        addDrop(ModBlocks.POLISHED_GRASS_GEM_BLOCK);
        addDrop(ModBlocks.POLISHED_GRASS_GEM_STAIRS);
        addDrop(ModBlocks.POLISHED_GRASS_GEM_SLAB, slabDrops(ModBlocks.POLISHED_GRASS_GEM_SLAB));
        addDrop(ModBlocks.POLISHED_GRASS_GEM_WALL);

        addDrop(ModBlocks.POLISHED_GROUND_GEM_BLOCK);
        addDrop(ModBlocks.POLISHED_GROUND_GEM_STAIRS);
        addDrop(ModBlocks.POLISHED_GROUND_GEM_SLAB, slabDrops(ModBlocks.POLISHED_GROUND_GEM_SLAB));
        addDrop(ModBlocks.POLISHED_GROUND_GEM_WALL);

        addDrop(ModBlocks.POLISHED_ICE_GEM_BLOCK);
        addDrop(ModBlocks.POLISHED_ICE_GEM_STAIRS);
        addDrop(ModBlocks.POLISHED_ICE_GEM_SLAB, slabDrops(ModBlocks.POLISHED_ICE_GEM_SLAB));
        addDrop(ModBlocks.POLISHED_ICE_GEM_WALL);

        addDrop(ModBlocks.POLISHED_NORMAL_GEM_BLOCK);
        addDrop(ModBlocks.POLISHED_NORMAL_GEM_STAIRS);
        addDrop(ModBlocks.POLISHED_NORMAL_GEM_SLAB, slabDrops(ModBlocks.POLISHED_NORMAL_GEM_SLAB));
        addDrop(ModBlocks.POLISHED_NORMAL_GEM_WALL);

        addDrop(ModBlocks.POLISHED_POISON_GEM_BLOCK);
        addDrop(ModBlocks.POLISHED_POISON_GEM_STAIRS);
        addDrop(ModBlocks.POLISHED_POISON_GEM_SLAB, slabDrops(ModBlocks.POLISHED_POISON_GEM_SLAB));
        addDrop(ModBlocks.POLISHED_POISON_GEM_WALL);

        addDrop(ModBlocks.POLISHED_PSYCHIC_GEM_BLOCK);
        addDrop(ModBlocks.POLISHED_PSYCHIC_GEM_STAIRS);
        addDrop(ModBlocks.POLISHED_PSYCHIC_GEM_SLAB, slabDrops(ModBlocks.POLISHED_PSYCHIC_GEM_SLAB));
        addDrop(ModBlocks.POLISHED_PSYCHIC_GEM_WALL);

        addDrop(ModBlocks.POLISHED_ROCK_GEM_BLOCK);
        addDrop(ModBlocks.POLISHED_ROCK_GEM_STAIRS);
        addDrop(ModBlocks.POLISHED_ROCK_GEM_SLAB, slabDrops(ModBlocks.POLISHED_ROCK_GEM_SLAB));
        addDrop(ModBlocks.POLISHED_ROCK_GEM_WALL);

        addDrop(ModBlocks.POLISHED_STEEL_GEM_BLOCK);
        addDrop(ModBlocks.POLISHED_STEEL_GEM_STAIRS);
        addDrop(ModBlocks.POLISHED_STEEL_GEM_SLAB, slabDrops(ModBlocks.POLISHED_STEEL_GEM_SLAB));
        addDrop(ModBlocks.POLISHED_STEEL_GEM_WALL);

        addDrop(ModBlocks.POLISHED_WATER_GEM_BLOCK);
        addDrop(ModBlocks.POLISHED_WATER_GEM_STAIRS);
        addDrop(ModBlocks.POLISHED_WATER_GEM_SLAB, slabDrops(ModBlocks.POLISHED_WATER_GEM_SLAB));
        addDrop(ModBlocks.POLISHED_WATER_GEM_WALL);

        addDrop(ModBlocks.BUG_GEM_BRICKS);
        addDrop(ModBlocks.BUG_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.BUG_GEM_BRICKS_SLAB, slabDrops(ModBlocks.BUG_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.BUG_GEM_BRICKS_WALL);
        addDrop(ModBlocks.CHISELED_BUG_GEM_BRICKS);

        addDrop(ModBlocks.DARK_GEM_BRICKS);
        addDrop(ModBlocks.DARK_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.DARK_GEM_BRICKS_SLAB, slabDrops(ModBlocks.DARK_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.DARK_GEM_BRICKS_WALL);
        addDrop(ModBlocks.CHISELED_DARK_GEM_BRICKS);

        addDrop(ModBlocks.DRAGON_GEM_BRICKS);
        addDrop(ModBlocks.DRAGON_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.DRAGON_GEM_BRICKS_SLAB, slabDrops(ModBlocks.DRAGON_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.DRAGON_GEM_BRICKS_WALL);
        addDrop(ModBlocks.CHISELED_DRAGON_GEM_BRICKS);

        addDrop(ModBlocks.ELECTRIC_GEM_BRICKS);
        addDrop(ModBlocks.ELECTRIC_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.ELECTRIC_GEM_BRICKS_SLAB, slabDrops(ModBlocks.ELECTRIC_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.ELECTRIC_GEM_BRICKS_WALL);
        addDrop(ModBlocks.CHISELED_ELECTRIC_GEM_BRICKS);

        addDrop(ModBlocks.FAIRY_GEM_BRICKS);
        addDrop(ModBlocks.FAIRY_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.FAIRY_GEM_BRICKS_SLAB, slabDrops(ModBlocks.FAIRY_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.FAIRY_GEM_BRICKS_WALL);
        addDrop(ModBlocks.CHISELED_FAIRY_GEM_BRICKS);

        addDrop(ModBlocks.FIGHTING_GEM_BRICKS);
        addDrop(ModBlocks.FIGHTING_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.FIGHTING_GEM_BRICKS_SLAB, slabDrops(ModBlocks.FIGHTING_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.FIGHTING_GEM_BRICKS_WALL);
        addDrop(ModBlocks.CHISELED_FIGHTING_GEM_BRICKS);

        addDrop(ModBlocks.FIRE_GEM_BRICKS);
        addDrop(ModBlocks.FIRE_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.FIRE_GEM_BRICKS_SLAB, slabDrops(ModBlocks.FIRE_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.FIRE_GEM_BRICKS_WALL);
        addDrop(ModBlocks.CHISELED_FIRE_GEM_BRICKS);

        addDrop(ModBlocks.FLYING_GEM_BRICKS);
        addDrop(ModBlocks.FLYING_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.FLYING_GEM_BRICKS_SLAB, slabDrops(ModBlocks.FLYING_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.FLYING_GEM_BRICKS_WALL);
        addDrop(ModBlocks.CHISELED_FLYING_GEM_BRICKS);

        addDrop(ModBlocks.GHOST_GEM_BRICKS);
        addDrop(ModBlocks.GHOST_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.GHOST_GEM_BRICKS_SLAB, slabDrops(ModBlocks.GHOST_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.GHOST_GEM_BRICKS_WALL);
        addDrop(ModBlocks.CHISELED_GHOST_GEM_BRICKS);

        addDrop(ModBlocks.GRASS_GEM_BRICKS);
        addDrop(ModBlocks.GRASS_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.GRASS_GEM_BRICKS_SLAB, slabDrops(ModBlocks.GRASS_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.GRASS_GEM_BRICKS_WALL);
        addDrop(ModBlocks.CHISELED_GRASS_GEM_BRICKS);

        addDrop(ModBlocks.GROUND_GEM_BRICKS);
        addDrop(ModBlocks.GROUND_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.GROUND_GEM_BRICKS_SLAB, slabDrops(ModBlocks.GROUND_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.GROUND_GEM_BRICKS_WALL);
        addDrop(ModBlocks.CHISELED_GROUND_GEM_BRICKS);

        addDrop(ModBlocks.ICE_GEM_BRICKS);
        addDrop(ModBlocks.ICE_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.ICE_GEM_BRICKS_SLAB, slabDrops(ModBlocks.ICE_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.ICE_GEM_BRICKS_WALL);
        addDrop(ModBlocks.CHISELED_ICE_GEM_BRICKS);

        addDrop(ModBlocks.NORMAL_GEM_BRICKS);
        addDrop(ModBlocks.NORMAL_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.NORMAL_GEM_BRICKS_SLAB, slabDrops(ModBlocks.NORMAL_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.NORMAL_GEM_BRICKS_WALL);
        addDrop(ModBlocks.CHISELED_NORMAL_GEM_BRICKS);

        addDrop(ModBlocks.POISON_GEM_BRICKS);
        addDrop(ModBlocks.POISON_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.POISON_GEM_BRICKS_SLAB, slabDrops(ModBlocks.POISON_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.POISON_GEM_BRICKS_WALL);
        addDrop(ModBlocks.CHISELED_POISON_GEM_BRICKS);

        addDrop(ModBlocks.PSYCHIC_GEM_BRICKS);
        addDrop(ModBlocks.PSYCHIC_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.PSYCHIC_GEM_BRICKS_SLAB, slabDrops(ModBlocks.PSYCHIC_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.PSYCHIC_GEM_BRICKS_WALL);
        addDrop(ModBlocks.CHISELED_PSYCHIC_GEM_BRICKS);

        addDrop(ModBlocks.ROCK_GEM_BRICKS);
        addDrop(ModBlocks.ROCK_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.ROCK_GEM_BRICKS_SLAB, slabDrops(ModBlocks.ROCK_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.ROCK_GEM_BRICKS_WALL);
        addDrop(ModBlocks.CHISELED_ROCK_GEM_BRICKS);

        addDrop(ModBlocks.STEEL_GEM_BRICKS);
        addDrop(ModBlocks.STEEL_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.STEEL_GEM_BRICKS_SLAB, slabDrops(ModBlocks.STEEL_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.STEEL_GEM_BRICKS_WALL);
        addDrop(ModBlocks.CHISELED_STEEL_GEM_BRICKS);

        addDrop(ModBlocks.WATER_GEM_BRICKS);
        addDrop(ModBlocks.WATER_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.WATER_GEM_BRICKS_SLAB, slabDrops(ModBlocks.WATER_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.WATER_GEM_BRICKS_WALL);
        addDrop(ModBlocks.CHISELED_WATER_GEM_BRICKS);
    }
}
