package net.cbass.tgv.datagen;

import net.cbass.tgv.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.TextureMap;
import net.minecraft.data.client.TexturedModel;
import org.apache.logging.log4j.core.tools.picocli.CommandLine;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool PolishedBugPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_BUG_GEM_BLOCK);
        PolishedBugPool.stairs(ModBlocks.POLISHED_BUG_GEM_STAIRS);
        PolishedBugPool.slab(ModBlocks.POLISHED_BUG_GEM_SLAB);
        PolishedBugPool.wall(ModBlocks.POLISHED_BUG_GEM_WALL);

        BlockStateModelGenerator.BlockTexturePool PolishedDarkPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_DARK_GEM_BLOCK);
        PolishedDarkPool.stairs(ModBlocks.POLISHED_DARK_GEM_STAIRS);
        PolishedDarkPool.slab(ModBlocks.POLISHED_DARK_GEM_SLAB);
        PolishedDarkPool.wall(ModBlocks.POLISHED_DARK_GEM_WALL);

        BlockStateModelGenerator.BlockTexturePool PolishedDragonPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_DRAGON_GEM_BLOCK);
        PolishedDragonPool.stairs(ModBlocks.POLISHED_DRAGON_GEM_STAIRS);
        PolishedDragonPool.slab(ModBlocks.POLISHED_DRAGON_GEM_SLAB);
        PolishedDragonPool.wall(ModBlocks.POLISHED_DRAGON_GEM_WALL);

        BlockStateModelGenerator.BlockTexturePool PolishedElectricPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK);
        PolishedElectricPool.stairs(ModBlocks.POLISHED_ELECTRIC_GEM_STAIRS);
        PolishedElectricPool.slab(ModBlocks.POLISHED_ELECTRIC_GEM_SLAB);
        PolishedElectricPool.wall(ModBlocks.POLISHED_ELECTRIC_GEM_WALL);

        BlockStateModelGenerator.BlockTexturePool PolishedFairyPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_FAIRY_GEM_BLOCK);
        PolishedFairyPool.stairs(ModBlocks.POLISHED_FAIRY_GEM_STAIRS);
        PolishedFairyPool.slab(ModBlocks.POLISHED_FAIRY_GEM_SLAB);
        PolishedFairyPool.wall(ModBlocks.POLISHED_FAIRY_GEM_WALL);

        BlockStateModelGenerator.BlockTexturePool PolishedFightingPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK);
        PolishedFightingPool.stairs(ModBlocks.POLISHED_FIGHTING_GEM_STAIRS);
        PolishedFightingPool.slab(ModBlocks.POLISHED_FIGHTING_GEM_SLAB);
        PolishedFightingPool.wall(ModBlocks.POLISHED_FIGHTING_GEM_WALL);

        BlockStateModelGenerator.BlockTexturePool PolishedFirePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_FIRE_GEM_BLOCK);
        PolishedFirePool.stairs(ModBlocks.POLISHED_FIRE_GEM_STAIRS);
        PolishedFirePool.slab(ModBlocks.POLISHED_FIRE_GEM_SLAB);
        PolishedFirePool.wall(ModBlocks.POLISHED_FIRE_GEM_WALL);

        BlockStateModelGenerator.BlockTexturePool PolishedFlyingPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_FLYING_GEM_BLOCK);
        PolishedFlyingPool.stairs(ModBlocks.POLISHED_FLYING_GEM_STAIRS);
        PolishedFlyingPool.slab(ModBlocks.POLISHED_FLYING_GEM_SLAB);
        PolishedFlyingPool.wall(ModBlocks.POLISHED_FLYING_GEM_WALL);

        BlockStateModelGenerator.BlockTexturePool PolishedGhostPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_GHOST_GEM_BLOCK);
        PolishedGhostPool.stairs(ModBlocks.POLISHED_GHOST_GEM_STAIRS);
        PolishedGhostPool.slab(ModBlocks.POLISHED_GHOST_GEM_SLAB);
        PolishedGhostPool.wall(ModBlocks.POLISHED_GHOST_GEM_WALL);

        BlockStateModelGenerator.BlockTexturePool PolishedGrassPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_GRASS_GEM_BLOCK);
        PolishedGrassPool.stairs(ModBlocks.POLISHED_GRASS_GEM_STAIRS);
        PolishedGrassPool.slab(ModBlocks.POLISHED_GRASS_GEM_SLAB);
        PolishedGrassPool.wall(ModBlocks.POLISHED_GRASS_GEM_WALL);

        BlockStateModelGenerator.BlockTexturePool PolishedGroundPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_GROUND_GEM_BLOCK);
        PolishedGroundPool.stairs(ModBlocks.POLISHED_GROUND_GEM_STAIRS);
        PolishedGroundPool.slab(ModBlocks.POLISHED_GROUND_GEM_SLAB);
        PolishedGroundPool.wall(ModBlocks.POLISHED_GROUND_GEM_WALL);

        BlockStateModelGenerator.BlockTexturePool PolishedIcePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_ICE_GEM_BLOCK);
        PolishedIcePool.stairs(ModBlocks.POLISHED_ICE_GEM_STAIRS);
        PolishedIcePool.slab(ModBlocks.POLISHED_ICE_GEM_SLAB);
        PolishedIcePool.wall(ModBlocks.POLISHED_ICE_GEM_WALL);

        BlockStateModelGenerator.BlockTexturePool PolishedNormalPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_NORMAL_GEM_BLOCK);
        PolishedNormalPool.stairs(ModBlocks.POLISHED_NORMAL_GEM_STAIRS);
        PolishedNormalPool.slab(ModBlocks.POLISHED_NORMAL_GEM_SLAB);
        PolishedNormalPool.wall(ModBlocks.POLISHED_NORMAL_GEM_WALL);

        BlockStateModelGenerator.BlockTexturePool PolishedPoisonPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_POISON_GEM_BLOCK);
        PolishedPoisonPool.stairs(ModBlocks.POLISHED_POISON_GEM_STAIRS);
        PolishedPoisonPool.slab(ModBlocks.POLISHED_POISON_GEM_SLAB);
        PolishedPoisonPool.wall(ModBlocks.POLISHED_POISON_GEM_WALL);

        BlockStateModelGenerator.BlockTexturePool PolishedPsychicPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_PSYCHIC_GEM_BLOCK);
        PolishedPsychicPool.stairs(ModBlocks.POLISHED_PSYCHIC_GEM_STAIRS);
        PolishedPsychicPool.slab(ModBlocks.POLISHED_PSYCHIC_GEM_SLAB);
        PolishedPsychicPool.wall(ModBlocks.POLISHED_PSYCHIC_GEM_WALL);

        BlockStateModelGenerator.BlockTexturePool PolishedRockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_ROCK_GEM_BLOCK);
        PolishedRockPool.stairs(ModBlocks.POLISHED_ROCK_GEM_STAIRS);
        PolishedRockPool.slab(ModBlocks.POLISHED_ROCK_GEM_SLAB);
        PolishedRockPool.wall(ModBlocks.POLISHED_ROCK_GEM_WALL);

        BlockStateModelGenerator.BlockTexturePool PolishedSteelPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_STEEL_GEM_BLOCK);
        PolishedSteelPool.stairs(ModBlocks.POLISHED_STEEL_GEM_STAIRS);
        PolishedSteelPool.slab(ModBlocks.POLISHED_STEEL_GEM_SLAB);
        PolishedSteelPool.wall(ModBlocks.POLISHED_STEEL_GEM_WALL);

        BlockStateModelGenerator.BlockTexturePool PolishedWaterPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_WATER_GEM_BLOCK);
        PolishedWaterPool.stairs(ModBlocks.POLISHED_WATER_GEM_STAIRS);
        PolishedWaterPool.slab(ModBlocks.POLISHED_WATER_GEM_SLAB);
        PolishedWaterPool.wall(ModBlocks.POLISHED_WATER_GEM_WALL);

        BlockStateModelGenerator.BlockTexturePool BugBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BUG_GEM_BRICKS);
        BugBricksPool.stairs(ModBlocks.BUG_GEM_BRICKS_STAIRS);
        BugBricksPool.slab(ModBlocks.BUG_GEM_BRICKS_SLAB);
        BugBricksPool.wall(ModBlocks.BUG_GEM_BRICKS_WALL);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_BUG_GEM_BRICKS, TexturedModel.CUBE_COLUMN);

        BlockStateModelGenerator.BlockTexturePool DarkBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_GEM_BRICKS);
        DarkBricksPool.stairs(ModBlocks.DARK_GEM_BRICKS_STAIRS);
        DarkBricksPool.slab(ModBlocks.DARK_GEM_BRICKS_SLAB);
        DarkBricksPool.wall(ModBlocks.DARK_GEM_BRICKS_WALL);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_DARK_GEM_BRICKS, TexturedModel.CUBE_COLUMN);

        BlockStateModelGenerator.BlockTexturePool DragonBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DRAGON_GEM_BRICKS);
        DragonBricksPool.stairs(ModBlocks.DRAGON_GEM_BRICKS_STAIRS);
        DragonBricksPool.slab(ModBlocks.DRAGON_GEM_BRICKS_SLAB);
        DragonBricksPool.wall(ModBlocks.DRAGON_GEM_BRICKS_WALL);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_DRAGON_GEM_BRICKS, TexturedModel.CUBE_COLUMN);

        BlockStateModelGenerator.BlockTexturePool ElectricBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ELECTRIC_GEM_BRICKS);
        ElectricBricksPool.stairs(ModBlocks.ELECTRIC_GEM_BRICKS_STAIRS);
        ElectricBricksPool.slab(ModBlocks.ELECTRIC_GEM_BRICKS_SLAB);
        ElectricBricksPool.wall(ModBlocks.ELECTRIC_GEM_BRICKS_WALL);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_ELECTRIC_GEM_BRICKS, TexturedModel.CUBE_COLUMN);

        BlockStateModelGenerator.BlockTexturePool FairyBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FAIRY_GEM_BRICKS);
        FairyBricksPool.stairs(ModBlocks.FAIRY_GEM_BRICKS_STAIRS);
        FairyBricksPool.slab(ModBlocks.FAIRY_GEM_BRICKS_SLAB);
        FairyBricksPool.wall(ModBlocks.FAIRY_GEM_BRICKS_WALL);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_FAIRY_GEM_BRICKS, TexturedModel.CUBE_COLUMN);

        BlockStateModelGenerator.BlockTexturePool FightingBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FIGHTING_GEM_BRICKS);
        FightingBricksPool.stairs(ModBlocks.FIGHTING_GEM_BRICKS_STAIRS);
        FightingBricksPool.slab(ModBlocks.FIGHTING_GEM_BRICKS_SLAB);
        FightingBricksPool.wall(ModBlocks.FIGHTING_GEM_BRICKS_WALL);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_FIGHTING_GEM_BRICKS, TexturedModel.CUBE_COLUMN);

        BlockStateModelGenerator.BlockTexturePool FireBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FIRE_GEM_BRICKS);
        FireBricksPool.stairs(ModBlocks.FIRE_GEM_BRICKS_STAIRS);
        FireBricksPool.slab(ModBlocks.FIRE_GEM_BRICKS_SLAB);
        FireBricksPool.wall(ModBlocks.FIRE_GEM_BRICKS_WALL);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_FIRE_GEM_BRICKS, TexturedModel.CUBE_COLUMN);

        BlockStateModelGenerator.BlockTexturePool FlyingBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FLYING_GEM_BRICKS);
        FlyingBricksPool.stairs(ModBlocks.FLYING_GEM_BRICKS_STAIRS);
        FlyingBricksPool.slab(ModBlocks.FLYING_GEM_BRICKS_SLAB);
        FlyingBricksPool.wall(ModBlocks.FLYING_GEM_BRICKS_WALL);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_FLYING_GEM_BRICKS, TexturedModel.CUBE_COLUMN);

        BlockStateModelGenerator.BlockTexturePool GhostBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GHOST_GEM_BRICKS);
        GhostBricksPool.stairs(ModBlocks.GHOST_GEM_BRICKS_STAIRS);
        GhostBricksPool.slab(ModBlocks.GHOST_GEM_BRICKS_SLAB);
        GhostBricksPool.wall(ModBlocks.GHOST_GEM_BRICKS_WALL);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_GHOST_GEM_BRICKS, TexturedModel.CUBE_COLUMN);

        BlockStateModelGenerator.BlockTexturePool GrassBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRASS_GEM_BRICKS);
        GrassBricksPool.stairs(ModBlocks.GRASS_GEM_BRICKS_STAIRS);
        GrassBricksPool.slab(ModBlocks.GRASS_GEM_BRICKS_SLAB);
        GrassBricksPool.wall(ModBlocks.GRASS_GEM_BRICKS_WALL);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_GRASS_GEM_BRICKS, TexturedModel.CUBE_COLUMN);

        BlockStateModelGenerator.BlockTexturePool GroundBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GROUND_GEM_BRICKS);
        GroundBricksPool.stairs(ModBlocks.GROUND_GEM_BRICKS_STAIRS);
        GroundBricksPool.slab(ModBlocks.GROUND_GEM_BRICKS_SLAB);
        GroundBricksPool.wall(ModBlocks.GROUND_GEM_BRICKS_WALL);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_GROUND_GEM_BRICKS, TexturedModel.CUBE_COLUMN);

        BlockStateModelGenerator.BlockTexturePool IceBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ICE_GEM_BRICKS);
        IceBricksPool.stairs(ModBlocks.ICE_GEM_BRICKS_STAIRS);
        IceBricksPool.slab(ModBlocks.ICE_GEM_BRICKS_SLAB);
        IceBricksPool.wall(ModBlocks.ICE_GEM_BRICKS_WALL);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_ICE_GEM_BRICKS, TexturedModel.CUBE_COLUMN);

        BlockStateModelGenerator.BlockTexturePool NormalBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NORMAL_GEM_BRICKS);
        NormalBricksPool.stairs(ModBlocks.NORMAL_GEM_BRICKS_STAIRS);
        NormalBricksPool.slab(ModBlocks.NORMAL_GEM_BRICKS_SLAB);
        NormalBricksPool.wall(ModBlocks.NORMAL_GEM_BRICKS_WALL);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_NORMAL_GEM_BRICKS, TexturedModel.CUBE_COLUMN);

        BlockStateModelGenerator.BlockTexturePool PoisonBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POISON_GEM_BRICKS);
        PoisonBricksPool.stairs(ModBlocks.POISON_GEM_BRICKS_STAIRS);
        PoisonBricksPool.slab(ModBlocks.POISON_GEM_BRICKS_SLAB);
        PoisonBricksPool.wall(ModBlocks.POISON_GEM_BRICKS_WALL);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_POISON_GEM_BRICKS, TexturedModel.CUBE_COLUMN);

        BlockStateModelGenerator.BlockTexturePool PsychicBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PSYCHIC_GEM_BRICKS);
        PsychicBricksPool.stairs(ModBlocks.PSYCHIC_GEM_BRICKS_STAIRS);
        PsychicBricksPool.slab(ModBlocks.PSYCHIC_GEM_BRICKS_SLAB);
        PsychicBricksPool.wall(ModBlocks.PSYCHIC_GEM_BRICKS_WALL);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_PSYCHIC_GEM_BRICKS, TexturedModel.CUBE_COLUMN);

        BlockStateModelGenerator.BlockTexturePool RockBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ROCK_GEM_BRICKS);
        RockBricksPool.stairs(ModBlocks.ROCK_GEM_BRICKS_STAIRS);
        RockBricksPool.slab(ModBlocks.ROCK_GEM_BRICKS_SLAB);
        RockBricksPool.wall(ModBlocks.ROCK_GEM_BRICKS_WALL);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_ROCK_GEM_BRICKS, TexturedModel.CUBE_COLUMN);

        BlockStateModelGenerator.BlockTexturePool SteelBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STEEL_GEM_BRICKS);
        SteelBricksPool.stairs(ModBlocks.STEEL_GEM_BRICKS_STAIRS);
        SteelBricksPool.slab(ModBlocks.STEEL_GEM_BRICKS_SLAB);
        SteelBricksPool.wall(ModBlocks.STEEL_GEM_BRICKS_WALL);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_STEEL_GEM_BRICKS, TexturedModel.CUBE_COLUMN);

        BlockStateModelGenerator.BlockTexturePool WaterBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WATER_GEM_BRICKS);
        WaterBricksPool.stairs(ModBlocks.WATER_GEM_BRICKS_STAIRS);
        WaterBricksPool.slab(ModBlocks.WATER_GEM_BRICKS_SLAB);
        WaterBricksPool.wall(ModBlocks.WATER_GEM_BRICKS_WALL);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_WATER_GEM_BRICKS, TexturedModel.CUBE_COLUMN);

        BlockStateModelGenerator.BlockTexturePool SmoothBugPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_BUG_GEM_BLOCK);
        SmoothBugPool.stairs(ModBlocks.SMOOTH_BUG_GEM_STAIRS);
        SmoothBugPool.slab(ModBlocks.SMOOTH_BUG_GEM_SLAB);
        blockStateModelGenerator.registerRotatable(ModBlocks.CHISELED_SMOOTH_BUG_GEM_BLOCK);

        BlockStateModelGenerator.BlockTexturePool SmoothDarkPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_DARK_GEM_BLOCK);
        SmoothDarkPool.stairs(ModBlocks.SMOOTH_DARK_GEM_STAIRS);
        SmoothDarkPool.slab(ModBlocks.SMOOTH_DARK_GEM_SLAB);
        blockStateModelGenerator.registerRotatable(ModBlocks.CHISELED_SMOOTH_DARK_GEM_BLOCK);

        BlockStateModelGenerator.BlockTexturePool SmoothDragonPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_DRAGON_GEM_BLOCK);
        SmoothDragonPool.stairs(ModBlocks.SMOOTH_DRAGON_GEM_STAIRS);
        SmoothDragonPool.slab(ModBlocks.SMOOTH_DRAGON_GEM_SLAB);
        blockStateModelGenerator.registerRotatable(ModBlocks.CHISELED_SMOOTH_DRAGON_GEM_BLOCK);

        BlockStateModelGenerator.BlockTexturePool SmoothElectricPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_ELECTRIC_GEM_BLOCK);
        SmoothElectricPool.stairs(ModBlocks.SMOOTH_ELECTRIC_GEM_STAIRS);
        SmoothElectricPool.slab(ModBlocks.SMOOTH_ELECTRIC_GEM_SLAB);
        blockStateModelGenerator.registerRotatable(ModBlocks.CHISELED_SMOOTH_ELECTRIC_GEM_BLOCK);

        BlockStateModelGenerator.BlockTexturePool SmoothFairyPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_FAIRY_GEM_BLOCK);
        SmoothFairyPool.stairs(ModBlocks.SMOOTH_FAIRY_GEM_STAIRS);
        SmoothFairyPool.slab(ModBlocks.SMOOTH_FAIRY_GEM_SLAB);
        blockStateModelGenerator.registerRotatable(ModBlocks.CHISELED_SMOOTH_FAIRY_GEM_BLOCK);

        BlockStateModelGenerator.BlockTexturePool SmoothFightingPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_FIGHTING_GEM_BLOCK);
        SmoothFightingPool.stairs(ModBlocks.SMOOTH_FIGHTING_GEM_STAIRS);
        SmoothFightingPool.slab(ModBlocks.SMOOTH_FIGHTING_GEM_SLAB);
        blockStateModelGenerator.registerRotatable(ModBlocks.CHISELED_SMOOTH_FIGHTING_GEM_BLOCK);

        BlockStateModelGenerator.BlockTexturePool SmoothFirePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_FIRE_GEM_BLOCK);
        SmoothFirePool.stairs(ModBlocks.SMOOTH_FIRE_GEM_STAIRS);
        SmoothFirePool.slab(ModBlocks.SMOOTH_FIRE_GEM_SLAB);
        blockStateModelGenerator.registerRotatable(ModBlocks.CHISELED_SMOOTH_FIRE_GEM_BLOCK);

        BlockStateModelGenerator.BlockTexturePool SmoothFlyingPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_FLYING_GEM_BLOCK);
        SmoothFlyingPool.stairs(ModBlocks.SMOOTH_FLYING_GEM_STAIRS);
        SmoothFlyingPool.slab(ModBlocks.SMOOTH_FLYING_GEM_SLAB);
        blockStateModelGenerator.registerRotatable(ModBlocks.CHISELED_SMOOTH_FLYING_GEM_BLOCK);

        BlockStateModelGenerator.BlockTexturePool SmoothGhostPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_GHOST_GEM_BLOCK);
        SmoothGhostPool.stairs(ModBlocks.SMOOTH_GHOST_GEM_STAIRS);
        SmoothGhostPool.slab(ModBlocks.SMOOTH_GHOST_GEM_SLAB);
        blockStateModelGenerator.registerRotatable(ModBlocks.CHISELED_SMOOTH_GHOST_GEM_BLOCK);

        BlockStateModelGenerator.BlockTexturePool SmoothGrassPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_GRASS_GEM_BLOCK);
        SmoothGrassPool.stairs(ModBlocks.SMOOTH_GRASS_GEM_STAIRS);
        SmoothGrassPool.slab(ModBlocks.SMOOTH_GRASS_GEM_SLAB);
        blockStateModelGenerator.registerRotatable(ModBlocks.CHISELED_SMOOTH_GRASS_GEM_BLOCK);

        BlockStateModelGenerator.BlockTexturePool SmoothGroundPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_GROUND_GEM_BLOCK);
        SmoothGroundPool.stairs(ModBlocks.SMOOTH_GROUND_GEM_STAIRS);
        SmoothGroundPool.slab(ModBlocks.SMOOTH_GROUND_GEM_SLAB);
        blockStateModelGenerator.registerRotatable(ModBlocks.CHISELED_SMOOTH_GROUND_GEM_BLOCK);

        BlockStateModelGenerator.BlockTexturePool SmoothIcePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_ICE_GEM_BLOCK);
        SmoothIcePool.stairs(ModBlocks.SMOOTH_ICE_GEM_STAIRS);
        SmoothIcePool.slab(ModBlocks.SMOOTH_ICE_GEM_SLAB);
        blockStateModelGenerator.registerRotatable(ModBlocks.CHISELED_SMOOTH_ICE_GEM_BLOCK);

        BlockStateModelGenerator.BlockTexturePool SmoothNormalPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_NORMAL_GEM_BLOCK);
        SmoothNormalPool.stairs(ModBlocks.SMOOTH_NORMAL_GEM_STAIRS);
        SmoothNormalPool.slab(ModBlocks.SMOOTH_NORMAL_GEM_SLAB);
        blockStateModelGenerator.registerRotatable(ModBlocks.CHISELED_SMOOTH_NORMAL_GEM_BLOCK);

        BlockStateModelGenerator.BlockTexturePool SmoothPoisonPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_POISON_GEM_BLOCK);
        SmoothPoisonPool.stairs(ModBlocks.SMOOTH_POISON_GEM_STAIRS);
        SmoothPoisonPool.slab(ModBlocks.SMOOTH_POISON_GEM_SLAB);
        blockStateModelGenerator.registerRotatable(ModBlocks.CHISELED_SMOOTH_POISON_GEM_BLOCK);

        BlockStateModelGenerator.BlockTexturePool SmoothPsychicPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_PSYCHIC_GEM_BLOCK);
        SmoothPsychicPool.stairs(ModBlocks.SMOOTH_PSYCHIC_GEM_STAIRS);
        SmoothPsychicPool.slab(ModBlocks.SMOOTH_PSYCHIC_GEM_SLAB);
        blockStateModelGenerator.registerRotatable(ModBlocks.CHISELED_SMOOTH_PSYCHIC_GEM_BLOCK);

        BlockStateModelGenerator.BlockTexturePool SmoothRockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_ROCK_GEM_BLOCK);
        SmoothRockPool.stairs(ModBlocks.SMOOTH_ROCK_GEM_STAIRS);
        SmoothRockPool.slab(ModBlocks.SMOOTH_ROCK_GEM_SLAB);
        blockStateModelGenerator.registerRotatable(ModBlocks.CHISELED_SMOOTH_ROCK_GEM_BLOCK);

        BlockStateModelGenerator.BlockTexturePool SmoothSteelPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_STEEL_GEM_BLOCK);
        SmoothSteelPool.stairs(ModBlocks.SMOOTH_STEEL_GEM_STAIRS);
        SmoothSteelPool.slab(ModBlocks.SMOOTH_STEEL_GEM_SLAB);
        blockStateModelGenerator.registerRotatable(ModBlocks.CHISELED_SMOOTH_STEEL_GEM_BLOCK);

        BlockStateModelGenerator.BlockTexturePool SmoothWaterPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_WATER_GEM_BLOCK);
        SmoothWaterPool.stairs(ModBlocks.SMOOTH_WATER_GEM_STAIRS);
        SmoothWaterPool.slab(ModBlocks.SMOOTH_WATER_GEM_SLAB);
        blockStateModelGenerator.registerRotatable(ModBlocks.CHISELED_SMOOTH_WATER_GEM_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
