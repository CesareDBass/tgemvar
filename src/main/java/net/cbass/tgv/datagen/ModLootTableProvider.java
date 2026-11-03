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
        addDrop(ModBlocks.BUG_GEM_BRICKS);
        addDrop(ModBlocks.BUG_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.BUG_GEM_BRICKS_SLAB, slabDrops(ModBlocks.BUG_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.BUG_GEM_BRICKS_WALL);

        addDrop(ModBlocks.DARK_GEM_BRICKS);
        addDrop(ModBlocks.DARK_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.DARK_GEM_BRICKS_SLAB, slabDrops(ModBlocks.DARK_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.DARK_GEM_BRICKS_WALL);

        addDrop(ModBlocks.DRAGON_GEM_BRICKS);
        addDrop(ModBlocks.DRAGON_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.DRAGON_GEM_BRICKS_SLAB, slabDrops(ModBlocks.DRAGON_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.DRAGON_GEM_BRICKS_WALL);

        addDrop(ModBlocks.ELECTRIC_GEM_BRICKS);
        addDrop(ModBlocks.ELECTRIC_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.ELECTRIC_GEM_BRICKS_SLAB, slabDrops(ModBlocks.ELECTRIC_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.ELECTRIC_GEM_BRICKS_WALL);

        addDrop(ModBlocks.FAIRY_GEM_BRICKS);
        addDrop(ModBlocks.FAIRY_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.FAIRY_GEM_BRICKS_SLAB, slabDrops(ModBlocks.FAIRY_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.FAIRY_GEM_BRICKS_WALL);

        addDrop(ModBlocks.FIGHTING_GEM_BRICKS);
        addDrop(ModBlocks.FIGHTING_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.FIGHTING_GEM_BRICKS_SLAB, slabDrops(ModBlocks.FIGHTING_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.FIGHTING_GEM_BRICKS_WALL);

        addDrop(ModBlocks.FIRE_GEM_BRICKS);
        addDrop(ModBlocks.FIRE_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.FIRE_GEM_BRICKS_SLAB, slabDrops(ModBlocks.FIRE_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.FIRE_GEM_BRICKS_WALL);

        addDrop(ModBlocks.FLYING_GEM_BRICKS);
        addDrop(ModBlocks.FLYING_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.FLYING_GEM_BRICKS_SLAB, slabDrops(ModBlocks.FLYING_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.FLYING_GEM_BRICKS_WALL);

        addDrop(ModBlocks.GHOST_GEM_BRICKS);
        addDrop(ModBlocks.GHOST_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.GHOST_GEM_BRICKS_SLAB, slabDrops(ModBlocks.GHOST_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.GHOST_GEM_BRICKS_WALL);

        addDrop(ModBlocks.GRASS_GEM_BRICKS);
        addDrop(ModBlocks.GRASS_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.GRASS_GEM_BRICKS_SLAB, slabDrops(ModBlocks.GRASS_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.GRASS_GEM_BRICKS_WALL);

        addDrop(ModBlocks.GROUND_GEM_BRICKS);
        addDrop(ModBlocks.GROUND_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.GROUND_GEM_BRICKS_SLAB, slabDrops(ModBlocks.GROUND_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.GROUND_GEM_BRICKS_WALL);

        addDrop(ModBlocks.ICE_GEM_BRICKS);
        addDrop(ModBlocks.ICE_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.ICE_GEM_BRICKS_SLAB, slabDrops(ModBlocks.ICE_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.ICE_GEM_BRICKS_WALL);

        addDrop(ModBlocks.NORMAL_GEM_BRICKS);
        addDrop(ModBlocks.NORMAL_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.NORMAL_GEM_BRICKS_SLAB, slabDrops(ModBlocks.NORMAL_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.NORMAL_GEM_BRICKS_WALL);

        addDrop(ModBlocks.POISON_GEM_BRICKS);
        addDrop(ModBlocks.POISON_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.POISON_GEM_BRICKS_SLAB, slabDrops(ModBlocks.POISON_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.POISON_GEM_BRICKS_WALL);

        addDrop(ModBlocks.PSYCHIC_GEM_BRICKS);
        addDrop(ModBlocks.PSYCHIC_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.PSYCHIC_GEM_BRICKS_SLAB, slabDrops(ModBlocks.PSYCHIC_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.PSYCHIC_GEM_BRICKS_WALL);

        addDrop(ModBlocks.ROCK_GEM_BRICKS);
        addDrop(ModBlocks.ROCK_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.ROCK_GEM_BRICKS_SLAB, slabDrops(ModBlocks.ROCK_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.ROCK_GEM_BRICKS_WALL);

        addDrop(ModBlocks.STEEL_GEM_BRICKS);
        addDrop(ModBlocks.STEEL_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.STEEL_GEM_BRICKS_SLAB, slabDrops(ModBlocks.STEEL_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.STEEL_GEM_BRICKS_WALL);

        addDrop(ModBlocks.WATER_GEM_BRICKS);
        addDrop(ModBlocks.WATER_GEM_BRICKS_STAIRS);
        addDrop(ModBlocks.WATER_GEM_BRICKS_SLAB, slabDrops(ModBlocks.WATER_GEM_BRICKS_SLAB));
        addDrop(ModBlocks.WATER_GEM_BRICKS_WALL);
    }
}
