package net.cbass.tgv.datagen;

import net.cbass.tgv.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool BugBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BUG_GEM_BRICKS);
        BugBricksPool.stairs(ModBlocks.BUG_GEM_BRICKS_STAIRS);
        BugBricksPool.slab(ModBlocks.BUG_GEM_BRICKS_SLAB);
        BugBricksPool.wall(ModBlocks.BUG_GEM_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool DarkBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_GEM_BRICKS);
        DarkBricksPool.stairs(ModBlocks.DARK_GEM_BRICKS_STAIRS);
        DarkBricksPool.slab(ModBlocks.DARK_GEM_BRICKS_SLAB);
        DarkBricksPool.wall(ModBlocks.DARK_GEM_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool DragonBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DRAGON_GEM_BRICKS);
        DragonBricksPool.stairs(ModBlocks.DRAGON_GEM_BRICKS_STAIRS);
        DragonBricksPool.slab(ModBlocks.DRAGON_GEM_BRICKS_SLAB);
        DragonBricksPool.wall(ModBlocks.DRAGON_GEM_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool ElectricBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ELECTRIC_GEM_BRICKS);
        ElectricBricksPool.stairs(ModBlocks.ELECTRIC_GEM_BRICKS_STAIRS);
        ElectricBricksPool.slab(ModBlocks.ELECTRIC_GEM_BRICKS_SLAB);
        ElectricBricksPool.wall(ModBlocks.ELECTRIC_GEM_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool FairyBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FAIRY_GEM_BRICKS);
        FairyBricksPool.stairs(ModBlocks.FAIRY_GEM_BRICKS_STAIRS);
        FairyBricksPool.slab(ModBlocks.FAIRY_GEM_BRICKS_SLAB);
        FairyBricksPool.wall(ModBlocks.FAIRY_GEM_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool FightingBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FIGHTING_GEM_BRICKS);
        FightingBricksPool.stairs(ModBlocks.FIGHTING_GEM_BRICKS_STAIRS);
        FightingBricksPool.slab(ModBlocks.FIGHTING_GEM_BRICKS_SLAB);
        FightingBricksPool.wall(ModBlocks.FIGHTING_GEM_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool FireBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FIRE_GEM_BRICKS);
        FireBricksPool.stairs(ModBlocks.FIRE_GEM_BRICKS_STAIRS);
        FireBricksPool.slab(ModBlocks.FIRE_GEM_BRICKS_SLAB);
        FireBricksPool.wall(ModBlocks.FIRE_GEM_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool FlyingBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FLYING_GEM_BRICKS);
        FlyingBricksPool.stairs(ModBlocks.FLYING_GEM_BRICKS_STAIRS);
        FlyingBricksPool.slab(ModBlocks.FLYING_GEM_BRICKS_SLAB);
        FlyingBricksPool.wall(ModBlocks.FLYING_GEM_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool GhostBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GHOST_GEM_BRICKS);
        GhostBricksPool.stairs(ModBlocks.GHOST_GEM_BRICKS_STAIRS);
        GhostBricksPool.slab(ModBlocks.GHOST_GEM_BRICKS_SLAB);
        GhostBricksPool.wall(ModBlocks.GHOST_GEM_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool GrassBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRASS_GEM_BRICKS);
        GrassBricksPool.stairs(ModBlocks.GRASS_GEM_BRICKS_STAIRS);
        GrassBricksPool.slab(ModBlocks.GRASS_GEM_BRICKS_SLAB);
        GrassBricksPool.wall(ModBlocks.GRASS_GEM_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool GroundBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GROUND_GEM_BRICKS);
        GroundBricksPool.stairs(ModBlocks.GROUND_GEM_BRICKS_STAIRS);
        GroundBricksPool.slab(ModBlocks.GROUND_GEM_BRICKS_SLAB);
        GroundBricksPool.wall(ModBlocks.GROUND_GEM_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool IceBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ICE_GEM_BRICKS);
        IceBricksPool.stairs(ModBlocks.ICE_GEM_BRICKS_STAIRS);
        IceBricksPool.slab(ModBlocks.ICE_GEM_BRICKS_SLAB);
        IceBricksPool.wall(ModBlocks.ICE_GEM_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool NormalBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NORMAL_GEM_BRICKS);
        NormalBricksPool.stairs(ModBlocks.NORMAL_GEM_BRICKS_STAIRS);
        NormalBricksPool.slab(ModBlocks.NORMAL_GEM_BRICKS_SLAB);
        NormalBricksPool.wall(ModBlocks.NORMAL_GEM_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool PoisonBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POISON_GEM_BRICKS);
        PoisonBricksPool.stairs(ModBlocks.POISON_GEM_BRICKS_STAIRS);
        PoisonBricksPool.slab(ModBlocks.POISON_GEM_BRICKS_SLAB);
        PoisonBricksPool.wall(ModBlocks.POISON_GEM_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool PsychicBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PSYCHIC_GEM_BRICKS);
        PsychicBricksPool.stairs(ModBlocks.PSYCHIC_GEM_BRICKS_STAIRS);
        PsychicBricksPool.slab(ModBlocks.PSYCHIC_GEM_BRICKS_SLAB);
        PsychicBricksPool.wall(ModBlocks.PSYCHIC_GEM_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool RockBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ROCK_GEM_BRICKS);
        RockBricksPool.stairs(ModBlocks.ROCK_GEM_BRICKS_STAIRS);
        RockBricksPool.slab(ModBlocks.ROCK_GEM_BRICKS_SLAB);
        RockBricksPool.wall(ModBlocks.ROCK_GEM_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool SteelBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STEEL_GEM_BRICKS);
        SteelBricksPool.stairs(ModBlocks.STEEL_GEM_BRICKS_STAIRS);
        SteelBricksPool.slab(ModBlocks.STEEL_GEM_BRICKS_SLAB);
        SteelBricksPool.wall(ModBlocks.STEEL_GEM_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool WaterBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WATER_GEM_BRICKS);
        WaterBricksPool.stairs(ModBlocks.WATER_GEM_BRICKS_STAIRS);
        WaterBricksPool.slab(ModBlocks.WATER_GEM_BRICKS_SLAB);
        WaterBricksPool.wall(ModBlocks.WATER_GEM_BRICKS_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
