package net.cbass.tgv.datagen;

import net.cbass.tgv.block.ModBlocks;
import net.cbass.tgv.item.ModItemGroups;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.StonecuttingRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.StonecuttingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
fern, sandsus, ice, calcite, redmush, dripstone, chorusplant, tubecoral
    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BUG_GEM_BLOCK, 4)
                .pattern("BB")
                .pattern("BB")
                .input('B', Items.COBWEB)
                .criterion(hasItem(Items.COBWEB), conditionsFromItem(Items.COBWEB))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.COBWEB), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BUG_GEM_BLOCK)
                .criterion(hasItem(Items.COBWEB), conditionsFromItem(Items.COBWEB))
                .offerTo(exporter, "polished_bug_block_stonecutter");

        createStairsRecipe(ModBlocks.POLISHED_BUG_GEM_STAIRS, Ingredient.ofItems(ModBlocks.POLISHED_BUG_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.POLISHED_BUG_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_BUG_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.COBWEB), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BUG_GEM_STAIRS)
                .criterion(hasItem(Items.COBWEB), conditionsFromItem(Items.COBWEB))
                .offerTo(exporter, "polished_bug_stairs_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_BUG_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BUG_GEM_STAIRS)
                .criterion(hasItem(ModBlocks.POLISHED_BUG_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_BUG_GEM_BLOCK))
                .offerTo(exporter, "polished_bug_stairs_block_stonecutter");

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BUG_GEM_SLAB, Ingredient.ofItems(ModBlocks.POLISHED_BUG_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.POLISHED_BUG_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_BUG_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.COBWEB), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BUG_GEM_SLAB, 2)
                .criterion(hasItem(Items.COBWEB), conditionsFromItem(Items.COBWEB))
                .offerTo(exporter, "polished_bug_slab_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_BUG_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BUG_GEM_SLAB, 2)
                .criterion(hasItem(ModBlocks.POLISHED_BUG_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_BUG_GEM_BLOCK))
                .offerTo(exporter, "polished_bug_slab_block_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BUG_GEM_WALL, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ModBlocks.POLISHED_BUG_GEM_BLOCK)
                .criterion(hasItem(ModBlocks.POLISHED_BUG_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_BUG_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.COBWEB), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BUG_GEM_WALL)
                .criterion(hasItem(Items.COBWEB), conditionsFromItem(Items.COBWEB))
                .offerTo(exporter, "polished_bug_wall_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_BUG_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BUG_GEM_WALL)
                .criterion(hasItem(ModBlocks.POLISHED_BUG_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_BUG_GEM_BLOCK))
                .offerTo(exporter, "polished_bug_wall_block_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BUG_GEM_BRICKS, 4)
                .pattern("BB")
                .pattern("BB")
                .input('B', ModBlocks.POLISHED_BUG_GEM_BLOCK)
                .criterion(hasItem(ModBlocks.POLISHED_BUG_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_BUG_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.COBWEB), RecipeCategory.BUILDING_BLOCKS, ModBlocks.BUG_GEM_BRICKS)
                .criterion(hasItem(Items.COBWEB), conditionsFromItem(Items.COBWEB))
                .offerTo(exporter, "bug_bricks_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_BUG_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.BUG_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.POLISHED_BUG_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_BUG_GEM_BLOCK))
                .offerTo(exporter, "bug_bricks_polished_stonecutter");

        createStairsRecipe(ModBlocks.BUG_GEM_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.BUG_GEM_BRICKS))
                .criterion(hasItem(ModBlocks.BUG_GEM_BRICKS), conditionsFromItem(ModBlocks.BUG_GEM_BRICKS))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.COBWEB), RecipeCategory.BUILDING_BLOCKS, ModBlocks.BUG_GEM_BRICKS_STAIRS)
                .criterion(hasItem(Items.COBWEB), conditionsFromItem(Items.COBWEB))
                .offerTo(exporter, "bug_bricks_stairs_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_BUG_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.BUG_GEM_BRICKS_STAIRS)
                .criterion(hasItem(ModBlocks.POLISHED_BUG_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_BUG_GEM_BLOCK))
                .offerTo(exporter, "bug_bricks_stairs_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.BUG_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.BUG_GEM_BRICKS_STAIRS)
                .criterion(hasItem(ModBlocks.BUG_GEM_BRICKS), conditionsFromItem(ModBlocks.BUG_GEM_BRICKS))
                .offerTo(exporter, "bug_bricks_stairs_bricks_stonecutter");

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BUG_GEM_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.BUG_GEM_BRICKS))
                .criterion(hasItem(ModBlocks.BUG_GEM_BRICKS), conditionsFromItem(ModBlocks.BUG_GEM_BRICKS))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.COBWEB), RecipeCategory.BUILDING_BLOCKS, ModBlocks.BUG_GEM_BRICKS_SLAB, 2)
                .criterion(hasItem(Items.COBWEB), conditionsFromItem(Items.COBWEB))
                .offerTo(exporter, "bug_bricks_slab_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_BUG_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.BUG_GEM_BRICKS_SLAB, 2)
                .criterion(hasItem(ModBlocks.POLISHED_BUG_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_BUG_GEM_BLOCK))
                .offerTo(exporter, "bug_bricks_slab_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.BUG_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.BUG_GEM_BRICKS_SLAB, 2)
                .criterion(hasItem(ModBlocks.BUG_GEM_BRICKS), conditionsFromItem(ModBlocks.BUG_GEM_BRICKS))
                .offerTo(exporter, "bug_bricks_slab_bricks_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BUG_GEM_BRICKS_WALL, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ModBlocks.BUG_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.BUG_GEM_BRICKS), conditionsFromItem(ModBlocks.BUG_GEM_BRICKS))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.COBWEB), RecipeCategory.BUILDING_BLOCKS, ModBlocks.BUG_GEM_BRICKS_WALL)
                .criterion(hasItem(Items.COBWEB), conditionsFromItem(Items.COBWEB))
                .offerTo(exporter, "bug_bricks_wall_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_BUG_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.BUG_GEM_BRICKS_WALL)
                .criterion(hasItem(ModBlocks.POLISHED_BUG_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_BUG_GEM_BLOCK))
                .offerTo(exporter, "bug_bricks_wall_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.BUG_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.BUG_GEM_BRICKS_WALL)
                .criterion(hasItem(ModBlocks.BUG_GEM_BRICKS), conditionsFromItem(ModBlocks.BUG_GEM_BRICKS))
                .offerTo(exporter, "bug_bricks_wall_bricks_stonecutter");

        createChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_BUG_GEM_BRICKS, Ingredient.ofItems(ModBlocks.BUG_GEM_BRICKS_SLAB))
                .criterion(hasItem(ModBlocks.BUG_GEM_BRICKS_SLAB), conditionsFromItem(ModBlocks.BUG_GEM_BRICKS_SLAB))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.COBWEB), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_BUG_GEM_BRICKS)
                .criterion(hasItem(Items.COBWEB), conditionsFromItem(Items.COBWEB))
                .offerTo(exporter, "bug_bricks_chiseled_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_BUG_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_BUG_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.POLISHED_BUG_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_BUG_GEM_BLOCK))
                .offerTo(exporter, "bug_bricks_chiseled_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.BUG_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_BUG_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.BUG_GEM_BRICKS), conditionsFromItem(ModBlocks.BUG_GEM_BRICKS))
                .offerTo(exporter, "bug_bricks_chiseled_bricks_stonecutter");

        List<ItemConvertible> POLISHED_BUG_SMELT = List.of(ModBlocks.POLISHED_BUG_GEM_BLOCK);
        offerSmelting(exporter, POLISHED_BUG_SMELT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BUG_GEM_BLOCK, 0.1f, 200, "smooth_bug_gem_block");

        createStairsRecipe(ModBlocks.SMOOTH_BUG_GEM_STAIRS, Ingredient.ofItems(ModBlocks.SMOOTH_BUG_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.SMOOTH_BUG_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_BUG_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.SMOOTH_BUG_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BUG_GEM_STAIRS)
                .criterion(hasItem(ModBlocks.SMOOTH_BUG_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_BUG_GEM_BLOCK))
                .offerTo(exporter, "smooth_bug_stairs_stonecutter");

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BUG_GEM_SLAB, Ingredient.ofItems(ModBlocks.SMOOTH_BUG_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.SMOOTH_BUG_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_BUG_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.SMOOTH_BUG_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BUG_GEM_SLAB, 2)
                .criterion(hasItem(ModBlocks.SMOOTH_BUG_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_BUG_GEM_BLOCK))
                .offerTo(exporter, "smooth_bug_slab_stonecutter");

        createChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SMOOTH_BUG_GEM_BLOCK, Ingredient.ofItems(ModBlocks.SMOOTH_BUG_GEM_SLAB))
                .criterion(hasItem(ModBlocks.SMOOTH_BUG_GEM_SLAB), conditionsFromItem(ModBlocks.SMOOTH_BUG_GEM_SLAB))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.SMOOTH_BUG_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SMOOTH_BUG_GEM_BLOCK)
                .criterion(hasItem(ModBlocks.SMOOTH_BUG_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_BUG_GEM_BLOCK))
                .offerTo(exporter, "smooth_bug_chiseled_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DARK_GEM_BLOCK, 4)
                .pattern("BB")
                .pattern("BB")
                .input('B', Items.ECHO_SHARD)
                .criterion(hasItem(Items.ECHO_SHARD), conditionsFromItem(Items.ECHO_SHARD))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.ECHO_SHARD), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DARK_GEM_BLOCK)
                .criterion(hasItem(Items.ECHO_SHARD), conditionsFromItem(Items.ECHO_SHARD))
                .offerTo(exporter, "polished_dark_block_stonecutter");

        createStairsRecipe(ModBlocks.POLISHED_DARK_GEM_STAIRS, Ingredient.ofItems(ModBlocks.POLISHED_DARK_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.POLISHED_DARK_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_DARK_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.ECHO_SHARD), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DARK_GEM_STAIRS)
                .criterion(hasItem(Items.ECHO_SHARD), conditionsFromItem(Items.ECHO_SHARD))
                .offerTo(exporter, "polished_dark_stairs_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_DARK_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DARK_GEM_STAIRS)
                .criterion(hasItem(ModBlocks.POLISHED_DARK_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_DARK_GEM_BLOCK))
                .offerTo(exporter, "polished_dark_stairs_block_stonecutter");

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DARK_GEM_SLAB, Ingredient.ofItems(ModBlocks.POLISHED_DARK_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.POLISHED_DARK_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_DARK_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.ECHO_SHARD), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DARK_GEM_SLAB, 2)
                .criterion(hasItem(Items.ECHO_SHARD), conditionsFromItem(Items.ECHO_SHARD))
                .offerTo(exporter, "polished_dark_slab_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_DARK_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DARK_GEM_SLAB, 2)
                .criterion(hasItem(ModBlocks.POLISHED_DARK_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_DARK_GEM_BLOCK))
                .offerTo(exporter, "polished_dark_slab_block_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DARK_GEM_WALL, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ModBlocks.POLISHED_DARK_GEM_BLOCK)
                .criterion(hasItem(ModBlocks.POLISHED_DARK_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_DARK_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.ECHO_SHARD), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DARK_GEM_WALL)
                .criterion(hasItem(Items.ECHO_SHARD), conditionsFromItem(Items.ECHO_SHARD))
                .offerTo(exporter, "polished_dark_wall_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_DARK_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DARK_GEM_WALL)
                .criterion(hasItem(ModBlocks.POLISHED_DARK_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_DARK_GEM_BLOCK))
                .offerTo(exporter, "polished_dark_wall_block_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_GEM_BRICKS, 4)
                .pattern("BB")
                .pattern("BB")
                .input('B', ModBlocks.POLISHED_DARK_GEM_BLOCK)
                .criterion(hasItem(ModBlocks.POLISHED_DARK_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_DARK_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.ECHO_SHARD), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_GEM_BRICKS)
                .criterion(hasItem(Items.ECHO_SHARD), conditionsFromItem(Items.ECHO_SHARD))
                .offerTo(exporter, "dark_bricks_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_DARK_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.POLISHED_DARK_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_DARK_GEM_BLOCK))
                .offerTo(exporter, "dark_bricks_polished_stonecutter");

        createStairsRecipe(ModBlocks.DARK_GEM_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.DARK_GEM_BRICKS))
                .criterion(hasItem(ModBlocks.DARK_GEM_BRICKS), conditionsFromItem(ModBlocks.DARK_GEM_BRICKS))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.ECHO_SHARD), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_GEM_BRICKS_STAIRS)
                .criterion(hasItem(Items.ECHO_SHARD), conditionsFromItem(Items.ECHO_SHARD))
                .offerTo(exporter, "dark_bricks_stairs_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_DARK_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_GEM_BRICKS_STAIRS)
                .criterion(hasItem(ModBlocks.POLISHED_DARK_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_DARK_GEM_BLOCK))
                .offerTo(exporter, "dark_bricks_stairs_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.DARK_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_GEM_BRICKS_STAIRS)
                .criterion(hasItem(ModBlocks.DARK_GEM_BRICKS), conditionsFromItem(ModBlocks.DARK_GEM_BRICKS))
                .offerTo(exporter, "dark_bricks_stairs_bricks_stonecutter");

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_GEM_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.DARK_GEM_BRICKS))
                .criterion(hasItem(ModBlocks.DARK_GEM_BRICKS), conditionsFromItem(ModBlocks.DARK_GEM_BRICKS))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.ECHO_SHARD), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_GEM_BRICKS_SLAB, 2)
                .criterion(hasItem(Items.ECHO_SHARD), conditionsFromItem(Items.ECHO_SHARD))
                .offerTo(exporter, "dark_bricks_slab_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_DARK_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_GEM_BRICKS_SLAB, 2)
                .criterion(hasItem(ModBlocks.POLISHED_DARK_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_DARK_GEM_BLOCK))
                .offerTo(exporter, "dark_bricks_slab_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.DARK_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_GEM_BRICKS_SLAB, 2)
                .criterion(hasItem(ModBlocks.DARK_GEM_BRICKS), conditionsFromItem(ModBlocks.DARK_GEM_BRICKS))
                .offerTo(exporter, "dark_bricks_slab_bricks_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_GEM_BRICKS_WALL, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ModBlocks.DARK_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.DARK_GEM_BRICKS), conditionsFromItem(ModBlocks.DARK_GEM_BRICKS))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.ECHO_SHARD), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_GEM_BRICKS_WALL)
                .criterion(hasItem(Items.ECHO_SHARD), conditionsFromItem(Items.ECHO_SHARD))
                .offerTo(exporter, "dark_bricks_wall_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_DARK_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_GEM_BRICKS_WALL)
                .criterion(hasItem(ModBlocks.POLISHED_DARK_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_DARK_GEM_BLOCK))
                .offerTo(exporter, "dark_bricks_wall_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.DARK_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_GEM_BRICKS_WALL)
                .criterion(hasItem(ModBlocks.DARK_GEM_BRICKS), conditionsFromItem(ModBlocks.DARK_GEM_BRICKS))
                .offerTo(exporter, "dark_bricks_wall_bricks_stonecutter");

        createChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DARK_GEM_BRICKS, Ingredient.ofItems(ModBlocks.DARK_GEM_BRICKS_SLAB))
                .criterion(hasItem(ModBlocks.DARK_GEM_BRICKS_SLAB), conditionsFromItem(ModBlocks.DARK_GEM_BRICKS_SLAB))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.ECHO_SHARD), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DARK_GEM_BRICKS)
                .criterion(hasItem(Items.ECHO_SHARD), conditionsFromItem(Items.ECHO_SHARD))
                .offerTo(exporter, "dark_bricks_chiseled_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_DARK_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DARK_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.POLISHED_DARK_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_DARK_GEM_BLOCK))
                .offerTo(exporter, "dark_bricks_chiseled_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.DARK_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DARK_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.DARK_GEM_BRICKS), conditionsFromItem(ModBlocks.DARK_GEM_BRICKS))
                .offerTo(exporter, "dark_bricks_chiseled_bricks_stonecutter");

        List<ItemConvertible> POLISHED_DARK_SMELT = List.of(ModBlocks.POLISHED_DARK_GEM_BLOCK);
        offerSmelting(exporter, POLISHED_DARK_SMELT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DARK_GEM_BLOCK, 0.1f, 200, "smooth_dark_gem_block");

        createStairsRecipe(ModBlocks.SMOOTH_DARK_GEM_STAIRS, Ingredient.ofItems(ModBlocks.SMOOTH_DARK_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.SMOOTH_DARK_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_DARK_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.SMOOTH_DARK_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DARK_GEM_STAIRS)
                .criterion(hasItem(ModBlocks.SMOOTH_DARK_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_DARK_GEM_BLOCK))
                .offerTo(exporter, "smooth_dark_stairs_stonecutter");

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DARK_GEM_SLAB, Ingredient.ofItems(ModBlocks.SMOOTH_DARK_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.SMOOTH_DARK_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_DARK_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.SMOOTH_DARK_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DARK_GEM_SLAB, 2)
                .criterion(hasItem(ModBlocks.SMOOTH_DARK_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_DARK_GEM_BLOCK))
                .offerTo(exporter, "smooth_dark_slab_stonecutter");

        createChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SMOOTH_DARK_GEM_BLOCK, Ingredient.ofItems(ModBlocks.SMOOTH_DARK_GEM_SLAB))
                .criterion(hasItem(ModBlocks.SMOOTH_DARK_GEM_SLAB), conditionsFromItem(ModBlocks.SMOOTH_DARK_GEM_SLAB))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.SMOOTH_DARK_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SMOOTH_DARK_GEM_BLOCK)
                .criterion(hasItem(ModBlocks.SMOOTH_DARK_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_DARK_GEM_BLOCK))
                .offerTo(exporter, "smooth_dark_chiseled_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRAGON_GEM_BLOCK, 4)
                .pattern("BB")
                .pattern("BB")
                .input('B', Items.DRAGON_EGG)
                .criterion(hasItem(Items.DRAGON_EGG), conditionsFromItem(Items.DRAGON_EGG))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.DRAGON_EGG), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRAGON_GEM_BLOCK)
                .criterion(hasItem(Items.DRAGON_EGG), conditionsFromItem(Items.DRAGON_EGG))
                .offerTo(exporter, "polished_dragon_block_stonecutter");

        createStairsRecipe(ModBlocks.POLISHED_DRAGON_GEM_STAIRS, Ingredient.ofItems(ModBlocks.POLISHED_DRAGON_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.POLISHED_DRAGON_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_DRAGON_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.DRAGON_EGG), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRAGON_GEM_STAIRS)
                .criterion(hasItem(Items.DRAGON_EGG), conditionsFromItem(Items.DRAGON_EGG))
                .offerTo(exporter, "polished_dragon_stairs_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_DRAGON_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRAGON_GEM_STAIRS)
                .criterion(hasItem(ModBlocks.POLISHED_DRAGON_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_DRAGON_GEM_BLOCK))
                .offerTo(exporter, "polished_dragon_stairs_block_stonecutter");

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRAGON_GEM_SLAB, Ingredient.ofItems(ModBlocks.POLISHED_DRAGON_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.POLISHED_DRAGON_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_DRAGON_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.DRAGON_EGG), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRAGON_GEM_SLAB, 2)
                .criterion(hasItem(Items.DRAGON_EGG), conditionsFromItem(Items.DRAGON_EGG))
                .offerTo(exporter, "polished_dragon_slab_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_DRAGON_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRAGON_GEM_SLAB, 2)
                .criterion(hasItem(ModBlocks.POLISHED_DRAGON_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_DRAGON_GEM_BLOCK))
                .offerTo(exporter, "polished_dragon_slab_block_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRAGON_GEM_WALL, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ModBlocks.POLISHED_DRAGON_GEM_BLOCK)
                .criterion(hasItem(ModBlocks.POLISHED_DRAGON_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_DRAGON_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.DRAGON_EGG), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRAGON_GEM_WALL)
                .criterion(hasItem(Items.DRAGON_EGG), conditionsFromItem(Items.DRAGON_EGG))
                .offerTo(exporter, "polished_dragon_wall_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_DRAGON_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRAGON_GEM_WALL)
                .criterion(hasItem(ModBlocks.POLISHED_DRAGON_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_DRAGON_GEM_BLOCK))
                .offerTo(exporter, "polished_dragon_wall_block_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRAGON_GEM_BRICKS, 4)
                .pattern("BB")
                .pattern("BB")
                .input('B', ModBlocks.POLISHED_DRAGON_GEM_BLOCK)
                .criterion(hasItem(ModBlocks.POLISHED_DRAGON_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_DRAGON_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.DRAGON_EGG), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRAGON_GEM_BRICKS)
                .criterion(hasItem(Items.DRAGON_EGG), conditionsFromItem(Items.DRAGON_EGG))
                .offerTo(exporter, "dragon_bricks_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_DRAGON_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRAGON_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.POLISHED_DRAGON_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_DRAGON_GEM_BLOCK))
                .offerTo(exporter, "dragon_bricks_polished_stonecutter");

        createStairsRecipe(ModBlocks.DRAGON_GEM_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.DRAGON_GEM_BRICKS))
                .criterion(hasItem(ModBlocks.DRAGON_GEM_BRICKS), conditionsFromItem(ModBlocks.DRAGON_GEM_BRICKS))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.DRAGON_EGG), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRAGON_GEM_BRICKS_STAIRS)
                .criterion(hasItem(Items.DRAGON_EGG), conditionsFromItem(Items.DRAGON_EGG))
                .offerTo(exporter, "dragon_bricks_stairs_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_DRAGON_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRAGON_GEM_BRICKS_STAIRS)
                .criterion(hasItem(ModBlocks.POLISHED_DRAGON_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_DRAGON_GEM_BLOCK))
                .offerTo(exporter, "dragon_bricks_stairs_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.DRAGON_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRAGON_GEM_BRICKS_STAIRS)
                .criterion(hasItem(ModBlocks.DRAGON_GEM_BRICKS), conditionsFromItem(ModBlocks.DRAGON_GEM_BRICKS))
                .offerTo(exporter, "dragon_bricks_stairs_bricks_stonecutter");

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRAGON_GEM_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.DRAGON_GEM_BRICKS))
                .criterion(hasItem(ModBlocks.DRAGON_GEM_BRICKS), conditionsFromItem(ModBlocks.DRAGON_GEM_BRICKS))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.DRAGON_EGG), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRAGON_GEM_BRICKS_SLAB, 2)
                .criterion(hasItem(Items.DRAGON_EGG), conditionsFromItem(Items.DRAGON_EGG))
                .offerTo(exporter, "dragon_bricks_slab_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_DRAGON_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRAGON_GEM_BRICKS_SLAB, 2)
                .criterion(hasItem(ModBlocks.POLISHED_DRAGON_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_DRAGON_GEM_BLOCK))
                .offerTo(exporter, "dragon_bricks_slab_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.DRAGON_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRAGON_GEM_BRICKS_SLAB, 2)
                .criterion(hasItem(ModBlocks.DRAGON_GEM_BRICKS), conditionsFromItem(ModBlocks.DRAGON_GEM_BRICKS))
                .offerTo(exporter, "dragon_bricks_slab_bricks_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRAGON_GEM_BRICKS_WALL, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ModBlocks.DRAGON_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.DRAGON_GEM_BRICKS), conditionsFromItem(ModBlocks.DRAGON_GEM_BRICKS))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.DRAGON_EGG), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRAGON_GEM_BRICKS_WALL)
                .criterion(hasItem(Items.DRAGON_EGG), conditionsFromItem(Items.DRAGON_EGG))
                .offerTo(exporter, "dragon_bricks_wall_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_DRAGON_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRAGON_GEM_BRICKS_WALL)
                .criterion(hasItem(ModBlocks.POLISHED_DRAGON_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_DRAGON_GEM_BLOCK))
                .offerTo(exporter, "dragon_bricks_wall_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.DRAGON_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRAGON_GEM_BRICKS_WALL)
                .criterion(hasItem(ModBlocks.DRAGON_GEM_BRICKS), conditionsFromItem(ModBlocks.DRAGON_GEM_BRICKS))
                .offerTo(exporter, "dragon_bricks_wall_bricks_stonecutter");

        createChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DRAGON_GEM_BRICKS, Ingredient.ofItems(ModBlocks.DRAGON_GEM_BRICKS_SLAB))
                .criterion(hasItem(ModBlocks.DRAGON_GEM_BRICKS_SLAB), conditionsFromItem(ModBlocks.DRAGON_GEM_BRICKS_SLAB))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.DRAGON_EGG), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DRAGON_GEM_BRICKS)
                .criterion(hasItem(Items.DRAGON_EGG), conditionsFromItem(Items.DRAGON_EGG))
                .offerTo(exporter, "dragon_bricks_chiseled_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_DRAGON_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DRAGON_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.POLISHED_DRAGON_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_DRAGON_GEM_BLOCK))
                .offerTo(exporter, "dragon_bricks_chiseled_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.DRAGON_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DRAGON_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.DRAGON_GEM_BRICKS), conditionsFromItem(ModBlocks.DRAGON_GEM_BRICKS))
                .offerTo(exporter, "dragon_bricks_chiseled_bricks_stonecutter");

        List<ItemConvertible> POLISHED_DRAGON_SMELT = List.of(ModBlocks.POLISHED_DRAGON_GEM_BLOCK);
        offerSmelting(exporter, POLISHED_DRAGON_SMELT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DRAGON_GEM_BLOCK, 0.1f, 200, "smooth_dragon_gem_block");

        createStairsRecipe(ModBlocks.SMOOTH_DRAGON_GEM_STAIRS, Ingredient.ofItems(ModBlocks.SMOOTH_DRAGON_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.SMOOTH_DRAGON_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_DRAGON_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.SMOOTH_DRAGON_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DRAGON_GEM_STAIRS)
                .criterion(hasItem(ModBlocks.SMOOTH_DRAGON_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_DRAGON_GEM_BLOCK))
                .offerTo(exporter, "smooth_dragon_stairs_stonecutter");

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DRAGON_GEM_SLAB, Ingredient.ofItems(ModBlocks.SMOOTH_DRAGON_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.SMOOTH_DRAGON_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_DRAGON_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.SMOOTH_DRAGON_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DRAGON_GEM_SLAB, 2)
                .criterion(hasItem(ModBlocks.SMOOTH_DRAGON_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_DRAGON_GEM_BLOCK))
                .offerTo(exporter, "smooth_dragon_slab_stonecutter");

        createChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SMOOTH_DRAGON_GEM_BLOCK, Ingredient.ofItems(ModBlocks.SMOOTH_DRAGON_GEM_SLAB))
                .criterion(hasItem(ModBlocks.SMOOTH_DRAGON_GEM_SLAB), conditionsFromItem(ModBlocks.SMOOTH_DRAGON_GEM_SLAB))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.SMOOTH_DRAGON_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SMOOTH_DRAGON_GEM_BLOCK)
                .criterion(hasItem(ModBlocks.SMOOTH_DRAGON_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_DRAGON_GEM_BLOCK))
                .offerTo(exporter, "smooth_dragon_chiseled_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK, 4)
                .pattern("BB")
                .pattern("BB")
                .input('B', Items.COPPER_BULB)
                .criterion(hasItem(Items.COPPER_BULB), conditionsFromItem(Items.COPPER_BULB))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.COPPER_BULB), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK)
                .criterion(hasItem(Items.COPPER_BULB), conditionsFromItem(Items.COPPER_BULB))
                .offerTo(exporter, "polished_electric_block_stonecutter");

        createStairsRecipe(ModBlocks.POLISHED_ELECTRIC_GEM_STAIRS, Ingredient.ofItems(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.COPPER_BULB), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ELECTRIC_GEM_STAIRS)
                .criterion(hasItem(Items.COPPER_BULB), conditionsFromItem(Items.COPPER_BULB))
                .offerTo(exporter, "polished_electric_stairs_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ELECTRIC_GEM_STAIRS)
                .criterion(hasItem(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK))
                .offerTo(exporter, "polished_electric_stairs_block_stonecutter");

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ELECTRIC_GEM_SLAB, Ingredient.ofItems(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.COPPER_BULB), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ELECTRIC_GEM_SLAB, 2)
                .criterion(hasItem(Items.COPPER_BULB), conditionsFromItem(Items.COPPER_BULB))
                .offerTo(exporter, "polished_electric_slab_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ELECTRIC_GEM_SLAB, 2)
                .criterion(hasItem(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK))
                .offerTo(exporter, "polished_electric_slab_block_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ELECTRIC_GEM_WALL, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK)
                .criterion(hasItem(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.COPPER_BULB), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ELECTRIC_GEM_WALL)
                .criterion(hasItem(Items.COPPER_BULB), conditionsFromItem(Items.COPPER_BULB))
                .offerTo(exporter, "polished_electric_wall_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ELECTRIC_GEM_WALL)
                .criterion(hasItem(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK))
                .offerTo(exporter, "polished_electric_wall_block_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ELECTRIC_GEM_BRICKS, 4)
                .pattern("BB")
                .pattern("BB")
                .input('B', ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK)
                .criterion(hasItem(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.COPPER_BULB), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ELECTRIC_GEM_BRICKS)
                .criterion(hasItem(Items.COPPER_BULB), conditionsFromItem(Items.COPPER_BULB))
                .offerTo(exporter, "electric_bricks_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ELECTRIC_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK))
                .offerTo(exporter, "electric_bricks_polished_stonecutter");

        createStairsRecipe(ModBlocks.ELECTRIC_GEM_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.ELECTRIC_GEM_BRICKS))
                .criterion(hasItem(ModBlocks.ELECTRIC_GEM_BRICKS), conditionsFromItem(ModBlocks.ELECTRIC_GEM_BRICKS))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.COPPER_BULB), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ELECTRIC_GEM_BRICKS_STAIRS)
                .criterion(hasItem(Items.COPPER_BULB), conditionsFromItem(Items.COPPER_BULB))
                .offerTo(exporter, "electric_bricks_stairs_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ELECTRIC_GEM_BRICKS_STAIRS)
                .criterion(hasItem(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK))
                .offerTo(exporter, "electric_bricks_stairs_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.ELECTRIC_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ELECTRIC_GEM_BRICKS_STAIRS)
                .criterion(hasItem(ModBlocks.ELECTRIC_GEM_BRICKS), conditionsFromItem(ModBlocks.ELECTRIC_GEM_BRICKS))
                .offerTo(exporter, "electric_bricks_stairs_bricks_stonecutter");

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ELECTRIC_GEM_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.ELECTRIC_GEM_BRICKS))
                .criterion(hasItem(ModBlocks.ELECTRIC_GEM_BRICKS), conditionsFromItem(ModBlocks.ELECTRIC_GEM_BRICKS))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.COPPER_BULB), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ELECTRIC_GEM_BRICKS_SLAB, 2)
                .criterion(hasItem(Items.COPPER_BULB), conditionsFromItem(Items.COPPER_BULB))
                .offerTo(exporter, "electric_bricks_slab_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ELECTRIC_GEM_BRICKS_SLAB, 2)
                .criterion(hasItem(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK))
                .offerTo(exporter, "electric_bricks_slab_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.ELECTRIC_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ELECTRIC_GEM_BRICKS_SLAB, 2)
                .criterion(hasItem(ModBlocks.ELECTRIC_GEM_BRICKS), conditionsFromItem(ModBlocks.ELECTRIC_GEM_BRICKS))
                .offerTo(exporter, "electric_bricks_slab_bricks_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ELECTRIC_GEM_BRICKS_WALL, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ModBlocks.ELECTRIC_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.ELECTRIC_GEM_BRICKS), conditionsFromItem(ModBlocks.ELECTRIC_GEM_BRICKS))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.COPPER_BULB), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ELECTRIC_GEM_BRICKS_WALL)
                .criterion(hasItem(Items.COPPER_BULB), conditionsFromItem(Items.COPPER_BULB))
                .offerTo(exporter, "electric_bricks_wall_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ELECTRIC_GEM_BRICKS_WALL)
                .criterion(hasItem(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK))
                .offerTo(exporter, "electric_bricks_wall_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.ELECTRIC_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ELECTRIC_GEM_BRICKS_WALL)
                .criterion(hasItem(ModBlocks.ELECTRIC_GEM_BRICKS), conditionsFromItem(ModBlocks.ELECTRIC_GEM_BRICKS))
                .offerTo(exporter, "electric_bricks_wall_bricks_stonecutter");

        createChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ELECTRIC_GEM_BRICKS, Ingredient.ofItems(ModBlocks.ELECTRIC_GEM_BRICKS_SLAB))
                .criterion(hasItem(ModBlocks.ELECTRIC_GEM_BRICKS_SLAB), conditionsFromItem(ModBlocks.ELECTRIC_GEM_BRICKS_SLAB))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.COPPER_BULB), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ELECTRIC_GEM_BRICKS)
                .criterion(hasItem(Items.COPPER_BULB), conditionsFromItem(Items.COPPER_BULB))
                .offerTo(exporter, "electric_bricks_chiseled_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ELECTRIC_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK))
                .offerTo(exporter, "electric_bricks_chiseled_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.ELECTRIC_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ELECTRIC_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.ELECTRIC_GEM_BRICKS), conditionsFromItem(ModBlocks.ELECTRIC_GEM_BRICKS))
                .offerTo(exporter, "electric_bricks_chiseled_bricks_stonecutter");

        List<ItemConvertible> POLISHED_ELECTRIC_SMELT = List.of(ModBlocks.POLISHED_ELECTRIC_GEM_BLOCK);
        offerSmelting(exporter, POLISHED_ELECTRIC_SMELT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_ELECTRIC_GEM_BLOCK, 0.1f, 200, "smooth_electric_gem_block");

        createStairsRecipe(ModBlocks.SMOOTH_ELECTRIC_GEM_STAIRS, Ingredient.ofItems(ModBlocks.SMOOTH_ELECTRIC_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.SMOOTH_ELECTRIC_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_ELECTRIC_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.SMOOTH_ELECTRIC_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_ELECTRIC_GEM_STAIRS)
                .criterion(hasItem(ModBlocks.SMOOTH_ELECTRIC_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_ELECTRIC_GEM_BLOCK))
                .offerTo(exporter, "smooth_electric_stairs_stonecutter");

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_ELECTRIC_GEM_SLAB, Ingredient.ofItems(ModBlocks.SMOOTH_ELECTRIC_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.SMOOTH_ELECTRIC_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_ELECTRIC_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.SMOOTH_ELECTRIC_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_ELECTRIC_GEM_SLAB, 2)
                .criterion(hasItem(ModBlocks.SMOOTH_ELECTRIC_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_ELECTRIC_GEM_BLOCK))
                .offerTo(exporter, "smooth_electric_slab_stonecutter");

        createChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SMOOTH_ELECTRIC_GEM_BLOCK, Ingredient.ofItems(ModBlocks.SMOOTH_ELECTRIC_GEM_SLAB))
                .criterion(hasItem(ModBlocks.SMOOTH_ELECTRIC_GEM_SLAB), conditionsFromItem(ModBlocks.SMOOTH_ELECTRIC_GEM_SLAB))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.SMOOTH_ELECTRIC_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SMOOTH_ELECTRIC_GEM_BLOCK)
                .criterion(hasItem(ModBlocks.SMOOTH_ELECTRIC_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_ELECTRIC_GEM_BLOCK))
                .offerTo(exporter, "smooth_electric_chiseled_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FAIRY_GEM_BLOCK, 4)
                .pattern("BB")
                .pattern("BB")
                .input('B', Items.AMETHYST_BLOCK)
                .criterion(hasItem(Items.AMETHYST_BLOCK), conditionsFromItem(Items.AMETHYST_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.AMETHYST_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FAIRY_GEM_BLOCK)
                .criterion(hasItem(Items.AMETHYST_BLOCK), conditionsFromItem(Items.AMETHYST_BLOCK))
                .offerTo(exporter, "polished_fairy_block_stonecutter");

        createStairsRecipe(ModBlocks.POLISHED_FAIRY_GEM_STAIRS, Ingredient.ofItems(ModBlocks.POLISHED_FAIRY_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.POLISHED_FAIRY_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FAIRY_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.AMETHYST_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FAIRY_GEM_STAIRS)
                .criterion(hasItem(Items.AMETHYST_BLOCK), conditionsFromItem(Items.AMETHYST_BLOCK))
                .offerTo(exporter, "polished_fairy_stairs_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FAIRY_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FAIRY_GEM_STAIRS)
                .criterion(hasItem(ModBlocks.POLISHED_FAIRY_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FAIRY_GEM_BLOCK))
                .offerTo(exporter, "polished_fairy_stairs_block_stonecutter");

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FAIRY_GEM_SLAB, Ingredient.ofItems(ModBlocks.POLISHED_FAIRY_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.POLISHED_FAIRY_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FAIRY_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.AMETHYST_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FAIRY_GEM_SLAB, 2)
                .criterion(hasItem(Items.AMETHYST_BLOCK), conditionsFromItem(Items.AMETHYST_BLOCK))
                .offerTo(exporter, "polished_fairy_slab_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FAIRY_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FAIRY_GEM_SLAB, 2)
                .criterion(hasItem(ModBlocks.POLISHED_FAIRY_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FAIRY_GEM_BLOCK))
                .offerTo(exporter, "polished_fairy_slab_block_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FAIRY_GEM_WALL, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ModBlocks.POLISHED_FAIRY_GEM_BLOCK)
                .criterion(hasItem(ModBlocks.POLISHED_FAIRY_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FAIRY_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.AMETHYST_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FAIRY_GEM_WALL)
                .criterion(hasItem(Items.AMETHYST_BLOCK), conditionsFromItem(Items.AMETHYST_BLOCK))
                .offerTo(exporter, "polished_fairy_wall_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FAIRY_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FAIRY_GEM_WALL)
                .criterion(hasItem(ModBlocks.POLISHED_FAIRY_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FAIRY_GEM_BLOCK))
                .offerTo(exporter, "polished_fairy_wall_block_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FAIRY_GEM_BRICKS, 4)
                .pattern("BB")
                .pattern("BB")
                .input('B', ModBlocks.POLISHED_FAIRY_GEM_BLOCK)
                .criterion(hasItem(ModBlocks.POLISHED_FAIRY_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FAIRY_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.AMETHYST_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FAIRY_GEM_BRICKS)
                .criterion(hasItem(Items.AMETHYST_BLOCK), conditionsFromItem(Items.AMETHYST_BLOCK))
                .offerTo(exporter, "fairy_bricks_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FAIRY_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FAIRY_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.POLISHED_FAIRY_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FAIRY_GEM_BLOCK))
                .offerTo(exporter, "fairy_bricks_polished_stonecutter");

        createStairsRecipe(ModBlocks.FAIRY_GEM_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.FAIRY_GEM_BRICKS))
                .criterion(hasItem(ModBlocks.FAIRY_GEM_BRICKS), conditionsFromItem(ModBlocks.FAIRY_GEM_BRICKS))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.AMETHYST_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FAIRY_GEM_BRICKS_STAIRS)
                .criterion(hasItem(Items.AMETHYST_BLOCK), conditionsFromItem(Items.AMETHYST_BLOCK))
                .offerTo(exporter, "fairy_bricks_stairs_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FAIRY_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FAIRY_GEM_BRICKS_STAIRS)
                .criterion(hasItem(ModBlocks.POLISHED_FAIRY_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FAIRY_GEM_BLOCK))
                .offerTo(exporter, "fairy_bricks_stairs_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.FAIRY_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FAIRY_GEM_BRICKS_STAIRS)
                .criterion(hasItem(ModBlocks.FAIRY_GEM_BRICKS), conditionsFromItem(ModBlocks.FAIRY_GEM_BRICKS))
                .offerTo(exporter, "fairy_bricks_stairs_bricks_stonecutter");

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FAIRY_GEM_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.FAIRY_GEM_BRICKS))
                .criterion(hasItem(ModBlocks.FAIRY_GEM_BRICKS), conditionsFromItem(ModBlocks.FAIRY_GEM_BRICKS))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.AMETHYST_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FAIRY_GEM_BRICKS_SLAB, 2)
                .criterion(hasItem(Items.AMETHYST_BLOCK), conditionsFromItem(Items.AMETHYST_BLOCK))
                .offerTo(exporter, "fairy_bricks_slab_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FAIRY_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FAIRY_GEM_BRICKS_SLAB, 2)
                .criterion(hasItem(ModBlocks.POLISHED_FAIRY_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FAIRY_GEM_BLOCK))
                .offerTo(exporter, "fairy_bricks_slab_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.FAIRY_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FAIRY_GEM_BRICKS_SLAB, 2)
                .criterion(hasItem(ModBlocks.FAIRY_GEM_BRICKS), conditionsFromItem(ModBlocks.FAIRY_GEM_BRICKS))
                .offerTo(exporter, "fairy_bricks_slab_bricks_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FAIRY_GEM_BRICKS_WALL, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ModBlocks.FAIRY_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.FAIRY_GEM_BRICKS), conditionsFromItem(ModBlocks.FAIRY_GEM_BRICKS))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.AMETHYST_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FAIRY_GEM_BRICKS_WALL)
                .criterion(hasItem(Items.AMETHYST_BLOCK), conditionsFromItem(Items.AMETHYST_BLOCK))
                .offerTo(exporter, "fairy_bricks_wall_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FAIRY_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FAIRY_GEM_BRICKS_WALL)
                .criterion(hasItem(ModBlocks.POLISHED_FAIRY_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FAIRY_GEM_BLOCK))
                .offerTo(exporter, "fairy_bricks_wall_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.FAIRY_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FAIRY_GEM_BRICKS_WALL)
                .criterion(hasItem(ModBlocks.FAIRY_GEM_BRICKS), conditionsFromItem(ModBlocks.FAIRY_GEM_BRICKS))
                .offerTo(exporter, "fairy_bricks_wall_bricks_stonecutter");

        createChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_FAIRY_GEM_BRICKS, Ingredient.ofItems(ModBlocks.FAIRY_GEM_BRICKS_SLAB))
                .criterion(hasItem(ModBlocks.FAIRY_GEM_BRICKS_SLAB), conditionsFromItem(ModBlocks.FAIRY_GEM_BRICKS_SLAB))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.AMETHYST_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_FAIRY_GEM_BRICKS)
                .criterion(hasItem(Items.AMETHYST_BLOCK), conditionsFromItem(Items.AMETHYST_BLOCK))
                .offerTo(exporter, "fairy_bricks_chiseled_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FAIRY_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_FAIRY_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.POLISHED_FAIRY_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FAIRY_GEM_BLOCK))
                .offerTo(exporter, "fairy_bricks_chiseled_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.FAIRY_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_FAIRY_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.FAIRY_GEM_BRICKS), conditionsFromItem(ModBlocks.FAIRY_GEM_BRICKS))
                .offerTo(exporter, "fairy_bricks_chiseled_bricks_stonecutter");

        List<ItemConvertible> POLISHED_FAIRY_SMELT = List.of(ModBlocks.POLISHED_FAIRY_GEM_BLOCK);
        offerSmelting(exporter, POLISHED_FAIRY_SMELT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_FAIRY_GEM_BLOCK, 0.1f, 200, "smooth_fairy_gem_block");

        createStairsRecipe(ModBlocks.SMOOTH_FAIRY_GEM_STAIRS, Ingredient.ofItems(ModBlocks.SMOOTH_FAIRY_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.SMOOTH_FAIRY_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_FAIRY_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.SMOOTH_FAIRY_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_FAIRY_GEM_STAIRS)
                .criterion(hasItem(ModBlocks.SMOOTH_FAIRY_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_FAIRY_GEM_BLOCK))
                .offerTo(exporter, "smooth_fairy_stairs_stonecutter");

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_FAIRY_GEM_SLAB, Ingredient.ofItems(ModBlocks.SMOOTH_FAIRY_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.SMOOTH_FAIRY_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_FAIRY_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.SMOOTH_FAIRY_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_FAIRY_GEM_SLAB, 2)
                .criterion(hasItem(ModBlocks.SMOOTH_FAIRY_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_FAIRY_GEM_BLOCK))
                .offerTo(exporter, "smooth_fairy_slab_stonecutter");

        createChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SMOOTH_FAIRY_GEM_BLOCK, Ingredient.ofItems(ModBlocks.SMOOTH_FAIRY_GEM_SLAB))
                .criterion(hasItem(ModBlocks.SMOOTH_FAIRY_GEM_SLAB), conditionsFromItem(ModBlocks.SMOOTH_FAIRY_GEM_SLAB))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.SMOOTH_FAIRY_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SMOOTH_FAIRY_GEM_BLOCK)
                .criterion(hasItem(ModBlocks.SMOOTH_FAIRY_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_FAIRY_GEM_BLOCK))
                .offerTo(exporter, "smooth_fairy_chiseled_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FIGHTING_GEM_BLOCK, 4)
                .pattern("BB")
                .pattern("BB")
                .input('B', Items.LEATHER)
                .criterion(hasItem(Items.LEATHER), conditionsFromItem(Items.LEATHER))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.LEATHER), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FIGHTING_GEM_BLOCK)
                .criterion(hasItem(Items.LEATHER), conditionsFromItem(Items.LEATHER))
                .offerTo(exporter, "polished_fighting_block_stonecutter");

        createStairsRecipe(ModBlocks.POLISHED_FIGHTING_GEM_STAIRS, Ingredient.ofItems(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.LEATHER), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FIGHTING_GEM_STAIRS)
                .criterion(hasItem(Items.LEATHER), conditionsFromItem(Items.LEATHER))
                .offerTo(exporter, "polished_fighting_stairs_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FIGHTING_GEM_STAIRS)
                .criterion(hasItem(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK))
                .offerTo(exporter, "polished_fighting_stairs_block_stonecutter");

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FIGHTING_GEM_SLAB, Ingredient.ofItems(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.LEATHER), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FIGHTING_GEM_SLAB, 2)
                .criterion(hasItem(Items.LEATHER), conditionsFromItem(Items.LEATHER))
                .offerTo(exporter, "polished_fighting_slab_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FIGHTING_GEM_SLAB, 2)
                .criterion(hasItem(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK))
                .offerTo(exporter, "polished_fighting_slab_block_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FIGHTING_GEM_WALL, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ModBlocks.POLISHED_FIGHTING_GEM_BLOCK)
                .criterion(hasItem(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.LEATHER), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FIGHTING_GEM_WALL)
                .criterion(hasItem(Items.LEATHER), conditionsFromItem(Items.LEATHER))
                .offerTo(exporter, "polished_fighting_wall_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FIGHTING_GEM_WALL)
                .criterion(hasItem(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK))
                .offerTo(exporter, "polished_fighting_wall_block_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIGHTING_GEM_BRICKS, 4)
                .pattern("BB")
                .pattern("BB")
                .input('B', ModBlocks.POLISHED_FIGHTING_GEM_BLOCK)
                .criterion(hasItem(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.LEATHER), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIGHTING_GEM_BRICKS)
                .criterion(hasItem(Items.LEATHER), conditionsFromItem(Items.LEATHER))
                .offerTo(exporter, "fighting_bricks_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIGHTING_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK))
                .offerTo(exporter, "fighting_bricks_polished_stonecutter");

        createStairsRecipe(ModBlocks.FIGHTING_GEM_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.FIGHTING_GEM_BRICKS))
                .criterion(hasItem(ModBlocks.FIGHTING_GEM_BRICKS), conditionsFromItem(ModBlocks.FIGHTING_GEM_BRICKS))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.LEATHER), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIGHTING_GEM_BRICKS_STAIRS)
                .criterion(hasItem(Items.LEATHER), conditionsFromItem(Items.LEATHER))
                .offerTo(exporter, "fighting_bricks_stairs_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIGHTING_GEM_BRICKS_STAIRS)
                .criterion(hasItem(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK))
                .offerTo(exporter, "fighting_bricks_stairs_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.FIGHTING_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIGHTING_GEM_BRICKS_STAIRS)
                .criterion(hasItem(ModBlocks.FIGHTING_GEM_BRICKS), conditionsFromItem(ModBlocks.FIGHTING_GEM_BRICKS))
                .offerTo(exporter, "fighting_bricks_stairs_bricks_stonecutter");

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIGHTING_GEM_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.FIGHTING_GEM_BRICKS))
                .criterion(hasItem(ModBlocks.FIGHTING_GEM_BRICKS), conditionsFromItem(ModBlocks.FIGHTING_GEM_BRICKS))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.LEATHER), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIGHTING_GEM_BRICKS_SLAB, 2)
                .criterion(hasItem(Items.LEATHER), conditionsFromItem(Items.LEATHER))
                .offerTo(exporter, "fighting_bricks_slab_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIGHTING_GEM_BRICKS_SLAB, 2)
                .criterion(hasItem(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK))
                .offerTo(exporter, "fighting_bricks_slab_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.FIGHTING_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIGHTING_GEM_BRICKS_SLAB, 2)
                .criterion(hasItem(ModBlocks.FIGHTING_GEM_BRICKS), conditionsFromItem(ModBlocks.FIGHTING_GEM_BRICKS))
                .offerTo(exporter, "fighting_bricks_slab_bricks_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIGHTING_GEM_BRICKS_WALL, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ModBlocks.FIGHTING_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.FIGHTING_GEM_BRICKS), conditionsFromItem(ModBlocks.FIGHTING_GEM_BRICKS))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.LEATHER), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIGHTING_GEM_BRICKS_WALL)
                .criterion(hasItem(Items.LEATHER), conditionsFromItem(Items.LEATHER))
                .offerTo(exporter, "fighting_bricks_wall_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIGHTING_GEM_BRICKS_WALL)
                .criterion(hasItem(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK))
                .offerTo(exporter, "fighting_bricks_wall_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.FIGHTING_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIGHTING_GEM_BRICKS_WALL)
                .criterion(hasItem(ModBlocks.FIGHTING_GEM_BRICKS), conditionsFromItem(ModBlocks.FIGHTING_GEM_BRICKS))
                .offerTo(exporter, "fighting_bricks_wall_bricks_stonecutter");

        createChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_FIGHTING_GEM_BRICKS, Ingredient.ofItems(ModBlocks.FIGHTING_GEM_BRICKS_SLAB))
                .criterion(hasItem(ModBlocks.FIGHTING_GEM_BRICKS_SLAB), conditionsFromItem(ModBlocks.FIGHTING_GEM_BRICKS_SLAB))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.LEATHER), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_FIGHTING_GEM_BRICKS)
                .criterion(hasItem(Items.LEATHER), conditionsFromItem(Items.LEATHER))
                .offerTo(exporter, "fighting_bricks_chiseled_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_FIGHTING_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK))
                .offerTo(exporter, "fighting_bricks_chiseled_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.FIGHTING_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_FIGHTING_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.FIGHTING_GEM_BRICKS), conditionsFromItem(ModBlocks.FIGHTING_GEM_BRICKS))
                .offerTo(exporter, "fighting_bricks_chiseled_bricks_stonecutter");

        List<ItemConvertible> POLISHED_FIGHTING_SMELT = List.of(ModBlocks.POLISHED_FIGHTING_GEM_BLOCK);
        offerSmelting(exporter, POLISHED_FIGHTING_SMELT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_FIGHTING_GEM_BLOCK, 0.1f, 200, "smooth_fighting_gem_block");

        createStairsRecipe(ModBlocks.SMOOTH_FIGHTING_GEM_STAIRS, Ingredient.ofItems(ModBlocks.SMOOTH_FIGHTING_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.SMOOTH_FIGHTING_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_FIGHTING_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.SMOOTH_FIGHTING_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_FIGHTING_GEM_STAIRS)
                .criterion(hasItem(ModBlocks.SMOOTH_FIGHTING_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_FIGHTING_GEM_BLOCK))
                .offerTo(exporter, "smooth_fighting_stairs_stonecutter");

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_FIGHTING_GEM_SLAB, Ingredient.ofItems(ModBlocks.SMOOTH_FIGHTING_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.SMOOTH_FIGHTING_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_FIGHTING_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.SMOOTH_FIGHTING_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_FIGHTING_GEM_SLAB, 2)
                .criterion(hasItem(ModBlocks.SMOOTH_FIGHTING_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_FIGHTING_GEM_BLOCK))
                .offerTo(exporter, "smooth_fighting_slab_stonecutter");

        createChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SMOOTH_FIGHTING_GEM_BLOCK, Ingredient.ofItems(ModBlocks.SMOOTH_FIGHTING_GEM_SLAB))
                .criterion(hasItem(ModBlocks.SMOOTH_FIGHTING_GEM_SLAB), conditionsFromItem(ModBlocks.SMOOTH_FIGHTING_GEM_SLAB))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.SMOOTH_FIGHTING_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SMOOTH_FIGHTING_GEM_BLOCK)
                .criterion(hasItem(ModBlocks.SMOOTH_FIGHTING_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_FIGHTING_GEM_BLOCK))
                .offerTo(exporter, "smooth_fighting_chiseled_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FIRE_GEM_BLOCK, 4)
                .pattern("BB")
                .pattern("BB")
                .input('B', Items.FIRE_CHARGE)
                .criterion(hasItem(Items.FIRE_CHARGE), conditionsFromItem(Items.FIRE_CHARGE))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.FIRE_CHARGE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FIRE_GEM_BLOCK)
                .criterion(hasItem(Items.FIRE_CHARGE), conditionsFromItem(Items.FIRE_CHARGE))
                .offerTo(exporter, "polished_fire_block_stonecutter");

        createStairsRecipe(ModBlocks.POLISHED_FIRE_GEM_STAIRS, Ingredient.ofItems(ModBlocks.POLISHED_FIRE_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.POLISHED_FIRE_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FIRE_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.FIRE_CHARGE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FIRE_GEM_STAIRS)
                .criterion(hasItem(Items.FIRE_CHARGE), conditionsFromItem(Items.FIRE_CHARGE))
                .offerTo(exporter, "polished_fire_stairs_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FIRE_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FIRE_GEM_STAIRS)
                .criterion(hasItem(ModBlocks.POLISHED_FIRE_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FIRE_GEM_BLOCK))
                .offerTo(exporter, "polished_fire_stairs_block_stonecutter");

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FIRE_GEM_SLAB, Ingredient.ofItems(ModBlocks.POLISHED_FIRE_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.POLISHED_FIRE_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FIRE_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.FIRE_CHARGE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FIRE_GEM_SLAB, 2)
                .criterion(hasItem(Items.FIRE_CHARGE), conditionsFromItem(Items.FIRE_CHARGE))
                .offerTo(exporter, "polished_fire_slab_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FIRE_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FIRE_GEM_SLAB, 2)
                .criterion(hasItem(ModBlocks.POLISHED_FIRE_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FIRE_GEM_BLOCK))
                .offerTo(exporter, "polished_fire_slab_block_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FIRE_GEM_WALL, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ModBlocks.POLISHED_FIRE_GEM_BLOCK)
                .criterion(hasItem(ModBlocks.POLISHED_FIRE_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FIRE_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.FIRE_CHARGE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FIRE_GEM_WALL)
                .criterion(hasItem(Items.FIRE_CHARGE), conditionsFromItem(Items.FIRE_CHARGE))
                .offerTo(exporter, "polished_fire_wall_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FIRE_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FIRE_GEM_WALL)
                .criterion(hasItem(ModBlocks.POLISHED_FIRE_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FIRE_GEM_BLOCK))
                .offerTo(exporter, "polished_fire_wall_block_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIRE_GEM_BRICKS, 4)
                .pattern("BB")
                .pattern("BB")
                .input('B', ModBlocks.POLISHED_FIRE_GEM_BLOCK)
                .criterion(hasItem(ModBlocks.POLISHED_FIRE_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FIRE_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.FIRE_CHARGE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIRE_GEM_BRICKS)
                .criterion(hasItem(Items.FIRE_CHARGE), conditionsFromItem(Items.FIRE_CHARGE))
                .offerTo(exporter, "fire_bricks_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FIRE_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIRE_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.POLISHED_FIRE_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FIRE_GEM_BLOCK))
                .offerTo(exporter, "fire_bricks_polished_stonecutter");

        createStairsRecipe(ModBlocks.FIRE_GEM_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.FIRE_GEM_BRICKS))
                .criterion(hasItem(ModBlocks.FIRE_GEM_BRICKS), conditionsFromItem(ModBlocks.FIRE_GEM_BRICKS))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.FIRE_CHARGE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIRE_GEM_BRICKS_STAIRS)
                .criterion(hasItem(Items.FIRE_CHARGE), conditionsFromItem(Items.FIRE_CHARGE))
                .offerTo(exporter, "fire_bricks_stairs_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FIRE_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIRE_GEM_BRICKS_STAIRS)
                .criterion(hasItem(ModBlocks.POLISHED_FIRE_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FIRE_GEM_BLOCK))
                .offerTo(exporter, "fire_bricks_stairs_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.FIRE_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIRE_GEM_BRICKS_STAIRS)
                .criterion(hasItem(ModBlocks.FIRE_GEM_BRICKS), conditionsFromItem(ModBlocks.FIRE_GEM_BRICKS))
                .offerTo(exporter, "fire_bricks_stairs_bricks_stonecutter");

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIRE_GEM_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.FIRE_GEM_BRICKS))
                .criterion(hasItem(ModBlocks.FIRE_GEM_BRICKS), conditionsFromItem(ModBlocks.FIRE_GEM_BRICKS))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.FIRE_CHARGE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIRE_GEM_BRICKS_SLAB, 2)
                .criterion(hasItem(Items.FIRE_CHARGE), conditionsFromItem(Items.FIRE_CHARGE))
                .offerTo(exporter, "fire_bricks_slab_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FIRE_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIRE_GEM_BRICKS_SLAB, 2)
                .criterion(hasItem(ModBlocks.POLISHED_FIRE_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FIRE_GEM_BLOCK))
                .offerTo(exporter, "fire_bricks_slab_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.FIRE_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIRE_GEM_BRICKS_SLAB, 2)
                .criterion(hasItem(ModBlocks.FIRE_GEM_BRICKS), conditionsFromItem(ModBlocks.FIRE_GEM_BRICKS))
                .offerTo(exporter, "fire_bricks_slab_bricks_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIRE_GEM_BRICKS_WALL, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ModBlocks.FIRE_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.FIRE_GEM_BRICKS), conditionsFromItem(ModBlocks.FIRE_GEM_BRICKS))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.FIRE_CHARGE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIRE_GEM_BRICKS_WALL)
                .criterion(hasItem(Items.FIRE_CHARGE), conditionsFromItem(Items.FIRE_CHARGE))
                .offerTo(exporter, "fire_bricks_wall_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FIRE_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIRE_GEM_BRICKS_WALL)
                .criterion(hasItem(ModBlocks.POLISHED_FIRE_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FIRE_GEM_BLOCK))
                .offerTo(exporter, "fire_bricks_wall_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.FIRE_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIRE_GEM_BRICKS_WALL)
                .criterion(hasItem(ModBlocks.FIRE_GEM_BRICKS), conditionsFromItem(ModBlocks.FIRE_GEM_BRICKS))
                .offerTo(exporter, "fire_bricks_wall_bricks_stonecutter");

        createChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_FIRE_GEM_BRICKS, Ingredient.ofItems(ModBlocks.FIRE_GEM_BRICKS_SLAB))
                .criterion(hasItem(ModBlocks.FIRE_GEM_BRICKS_SLAB), conditionsFromItem(ModBlocks.FIRE_GEM_BRICKS_SLAB))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.FIRE_CHARGE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_FIRE_GEM_BRICKS)
                .criterion(hasItem(Items.FIRE_CHARGE), conditionsFromItem(Items.FIRE_CHARGE))
                .offerTo(exporter, "fire_bricks_chiseled_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FIRE_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_FIRE_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.POLISHED_FIRE_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FIRE_GEM_BLOCK))
                .offerTo(exporter, "fire_bricks_chiseled_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.FIRE_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_FIRE_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.FIRE_GEM_BRICKS), conditionsFromItem(ModBlocks.FIRE_GEM_BRICKS))
                .offerTo(exporter, "fire_bricks_chiseled_bricks_stonecutter");

        List<ItemConvertible> POLISHED_FIRE_SMELT = List.of(ModBlocks.POLISHED_FIRE_GEM_BLOCK);
        offerSmelting(exporter, POLISHED_FIRE_SMELT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_FIRE_GEM_BLOCK, 0.1f, 200, "smooth_fire_gem_block");

        createStairsRecipe(ModBlocks.SMOOTH_FIRE_GEM_STAIRS, Ingredient.ofItems(ModBlocks.SMOOTH_FIRE_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.SMOOTH_FIRE_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_FIRE_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.SMOOTH_FIRE_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_FIRE_GEM_STAIRS)
                .criterion(hasItem(ModBlocks.SMOOTH_FIRE_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_FIRE_GEM_BLOCK))
                .offerTo(exporter, "smooth_fire_stairs_stonecutter");

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_FIRE_GEM_SLAB, Ingredient.ofItems(ModBlocks.SMOOTH_FIRE_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.SMOOTH_FIRE_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_FIRE_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.SMOOTH_FIRE_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_FIRE_GEM_SLAB, 2)
                .criterion(hasItem(ModBlocks.SMOOTH_FIRE_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_FIRE_GEM_BLOCK))
                .offerTo(exporter, "smooth_fire_slab_stonecutter");

        createChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SMOOTH_FIRE_GEM_BLOCK, Ingredient.ofItems(ModBlocks.SMOOTH_FIRE_GEM_SLAB))
                .criterion(hasItem(ModBlocks.SMOOTH_FIRE_GEM_SLAB), conditionsFromItem(ModBlocks.SMOOTH_FIRE_GEM_SLAB))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.SMOOTH_FIRE_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SMOOTH_FIRE_GEM_BLOCK)
                .criterion(hasItem(ModBlocks.SMOOTH_FIRE_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_FIRE_GEM_BLOCK))
                .offerTo(exporter, "smooth_fire_chiseled_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FLYING_GEM_BLOCK, 4)
                .pattern("BB")
                .pattern("BB")
                .input('B', Items.FEATHER)
                .criterion(hasItem(Items.FEATHER), conditionsFromItem(Items.FEATHER))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.FEATHER), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FLYING_GEM_BLOCK)
                .criterion(hasItem(Items.FEATHER), conditionsFromItem(Items.FEATHER))
                .offerTo(exporter, "polished_flying_block_stonecutter");

        createStairsRecipe(ModBlocks.POLISHED_FLYING_GEM_STAIRS, Ingredient.ofItems(ModBlocks.POLISHED_FLYING_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.POLISHED_FLYING_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FLYING_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.FEATHER), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FLYING_GEM_STAIRS)
                .criterion(hasItem(Items.FEATHER), conditionsFromItem(Items.FEATHER))
                .offerTo(exporter, "polished_flying_stairs_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FLYING_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FLYING_GEM_STAIRS)
                .criterion(hasItem(ModBlocks.POLISHED_FLYING_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FLYING_GEM_BLOCK))
                .offerTo(exporter, "polished_flying_stairs_block_stonecutter");

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FLYING_GEM_SLAB, Ingredient.ofItems(ModBlocks.POLISHED_FLYING_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.POLISHED_FLYING_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FLYING_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.FEATHER), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FLYING_GEM_SLAB, 2)
                .criterion(hasItem(Items.FEATHER), conditionsFromItem(Items.FEATHER))
                .offerTo(exporter, "polished_flying_slab_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FLYING_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FLYING_GEM_SLAB, 2)
                .criterion(hasItem(ModBlocks.POLISHED_FLYING_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FLYING_GEM_BLOCK))
                .offerTo(exporter, "polished_flying_slab_block_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FLYING_GEM_WALL, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ModBlocks.POLISHED_FLYING_GEM_BLOCK)
                .criterion(hasItem(ModBlocks.POLISHED_FLYING_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FLYING_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.FEATHER), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FLYING_GEM_WALL)
                .criterion(hasItem(Items.FEATHER), conditionsFromItem(Items.FEATHER))
                .offerTo(exporter, "polished_flying_wall_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FLYING_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FLYING_GEM_WALL)
                .criterion(hasItem(ModBlocks.POLISHED_FLYING_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FLYING_GEM_BLOCK))
                .offerTo(exporter, "polished_flying_wall_block_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLYING_GEM_BRICKS, 4)
                .pattern("BB")
                .pattern("BB")
                .input('B', ModBlocks.POLISHED_FLYING_GEM_BLOCK)
                .criterion(hasItem(ModBlocks.POLISHED_FLYING_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FLYING_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.FEATHER), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLYING_GEM_BRICKS)
                .criterion(hasItem(Items.FEATHER), conditionsFromItem(Items.FEATHER))
                .offerTo(exporter, "flying_bricks_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FLYING_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLYING_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.POLISHED_FLYING_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FLYING_GEM_BLOCK))
                .offerTo(exporter, "flying_bricks_polished_stonecutter");

        createStairsRecipe(ModBlocks.FLYING_GEM_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.FLYING_GEM_BRICKS))
                .criterion(hasItem(ModBlocks.FLYING_GEM_BRICKS), conditionsFromItem(ModBlocks.FLYING_GEM_BRICKS))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.FEATHER), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLYING_GEM_BRICKS_STAIRS)
                .criterion(hasItem(Items.FEATHER), conditionsFromItem(Items.FEATHER))
                .offerTo(exporter, "flying_bricks_stairs_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FLYING_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLYING_GEM_BRICKS_STAIRS)
                .criterion(hasItem(ModBlocks.POLISHED_FLYING_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FLYING_GEM_BLOCK))
                .offerTo(exporter, "flying_bricks_stairs_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.FLYING_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLYING_GEM_BRICKS_STAIRS)
                .criterion(hasItem(ModBlocks.FLYING_GEM_BRICKS), conditionsFromItem(ModBlocks.FLYING_GEM_BRICKS))
                .offerTo(exporter, "flying_bricks_stairs_bricks_stonecutter");

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLYING_GEM_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.FLYING_GEM_BRICKS))
                .criterion(hasItem(ModBlocks.FLYING_GEM_BRICKS), conditionsFromItem(ModBlocks.FLYING_GEM_BRICKS))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.FEATHER), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLYING_GEM_BRICKS_SLAB, 2)
                .criterion(hasItem(Items.FEATHER), conditionsFromItem(Items.FEATHER))
                .offerTo(exporter, "flying_bricks_slab_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FLYING_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLYING_GEM_BRICKS_SLAB, 2)
                .criterion(hasItem(ModBlocks.POLISHED_FLYING_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FLYING_GEM_BLOCK))
                .offerTo(exporter, "flying_bricks_slab_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.FLYING_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLYING_GEM_BRICKS_SLAB, 2)
                .criterion(hasItem(ModBlocks.FLYING_GEM_BRICKS), conditionsFromItem(ModBlocks.FLYING_GEM_BRICKS))
                .offerTo(exporter, "flying_bricks_slab_bricks_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLYING_GEM_BRICKS_WALL, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ModBlocks.FLYING_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.FLYING_GEM_BRICKS), conditionsFromItem(ModBlocks.FLYING_GEM_BRICKS))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.FEATHER), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLYING_GEM_BRICKS_WALL)
                .criterion(hasItem(Items.FEATHER), conditionsFromItem(Items.FEATHER))
                .offerTo(exporter, "flying_bricks_wall_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FLYING_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLYING_GEM_BRICKS_WALL)
                .criterion(hasItem(ModBlocks.POLISHED_FLYING_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FLYING_GEM_BLOCK))
                .offerTo(exporter, "flying_bricks_wall_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.FLYING_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLYING_GEM_BRICKS_WALL)
                .criterion(hasItem(ModBlocks.FLYING_GEM_BRICKS), conditionsFromItem(ModBlocks.FLYING_GEM_BRICKS))
                .offerTo(exporter, "flying_bricks_wall_bricks_stonecutter");

        createChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_FLYING_GEM_BRICKS, Ingredient.ofItems(ModBlocks.FLYING_GEM_BRICKS_SLAB))
                .criterion(hasItem(ModBlocks.FLYING_GEM_BRICKS_SLAB), conditionsFromItem(ModBlocks.FLYING_GEM_BRICKS_SLAB))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.FEATHER), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_FLYING_GEM_BRICKS)
                .criterion(hasItem(Items.FEATHER), conditionsFromItem(Items.FEATHER))
                .offerTo(exporter, "flying_bricks_chiseled_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_FLYING_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_FLYING_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.POLISHED_FLYING_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_FLYING_GEM_BLOCK))
                .offerTo(exporter, "flying_bricks_chiseled_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.FLYING_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_FLYING_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.FLYING_GEM_BRICKS), conditionsFromItem(ModBlocks.FLYING_GEM_BRICKS))
                .offerTo(exporter, "flying_bricks_chiseled_bricks_stonecutter");

        List<ItemConvertible> POLISHED_FLYING_SMELT = List.of(ModBlocks.POLISHED_FLYING_GEM_BLOCK);
        offerSmelting(exporter, POLISHED_FLYING_SMELT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_FLYING_GEM_BLOCK, 0.1f, 200, "smooth_electric_gem_block");

        createStairsRecipe(ModBlocks.SMOOTH_FLYING_GEM_STAIRS, Ingredient.ofItems(ModBlocks.SMOOTH_FLYING_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.SMOOTH_FLYING_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_FLYING_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.SMOOTH_FLYING_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_FLYING_GEM_STAIRS)
                .criterion(hasItem(ModBlocks.SMOOTH_FLYING_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_FLYING_GEM_BLOCK))
                .offerTo(exporter, "smooth_flying_stairs_stonecutter");

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_FLYING_GEM_SLAB, Ingredient.ofItems(ModBlocks.SMOOTH_FLYING_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.SMOOTH_FLYING_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_FLYING_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.SMOOTH_FLYING_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_FLYING_GEM_SLAB, 2)
                .criterion(hasItem(ModBlocks.SMOOTH_FLYING_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_FLYING_GEM_BLOCK))
                .offerTo(exporter, "smooth_flying_slab_stonecutter");

        createChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SMOOTH_FLYING_GEM_BLOCK, Ingredient.ofItems(ModBlocks.SMOOTH_FLYING_GEM_SLAB))
                .criterion(hasItem(ModBlocks.SMOOTH_FLYING_GEM_SLAB), conditionsFromItem(ModBlocks.SMOOTH_FLYING_GEM_SLAB))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.SMOOTH_FLYING_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SMOOTH_FLYING_GEM_BLOCK)
                .criterion(hasItem(ModBlocks.SMOOTH_FLYING_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_FLYING_GEM_BLOCK))
                .offerTo(exporter, "smooth_flying_chiseled_stonecutter");


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GHOST_GEM_BLOCK, 4)
                .pattern("BB")
                .pattern("BB")
                .input('B', Items.SOUL_SOIL)
                .criterion(hasItem(Items.SOUL_SOIL), conditionsFromItem(Items.SOUL_SOIL))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.SOUL_SOIL), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GHOST_GEM_BLOCK)
                .criterion(hasItem(Items.SOUL_SOIL), conditionsFromItem(Items.SOUL_SOIL))
                .offerTo(exporter, "polished_ghost_block_stonecutter");

        createStairsRecipe(ModBlocks.POLISHED_GHOST_GEM_STAIRS, Ingredient.ofItems(ModBlocks.POLISHED_GHOST_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.POLISHED_GHOST_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_GHOST_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.SOUL_SOIL), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GHOST_GEM_STAIRS)
                .criterion(hasItem(Items.SOUL_SOIL), conditionsFromItem(Items.SOUL_SOIL))
                .offerTo(exporter, "polished_ghost_stairs_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_GHOST_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GHOST_GEM_STAIRS)
                .criterion(hasItem(ModBlocks.POLISHED_GHOST_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_GHOST_GEM_BLOCK))
                .offerTo(exporter, "polished_ghost_stairs_block_stonecutter");

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GHOST_GEM_SLAB, Ingredient.ofItems(ModBlocks.POLISHED_GHOST_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.POLISHED_GHOST_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_GHOST_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.SOUL_SOIL), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GHOST_GEM_SLAB, 2)
                .criterion(hasItem(Items.SOUL_SOIL), conditionsFromItem(Items.SOUL_SOIL))
                .offerTo(exporter, "polished_ghost_slab_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_GHOST_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GHOST_GEM_SLAB, 2)
                .criterion(hasItem(ModBlocks.POLISHED_GHOST_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_GHOST_GEM_BLOCK))
                .offerTo(exporter, "polished_ghost_slab_block_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GHOST_GEM_WALL, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ModBlocks.POLISHED_GHOST_GEM_BLOCK)
                .criterion(hasItem(ModBlocks.POLISHED_GHOST_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_GHOST_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.SOUL_SOIL), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GHOST_GEM_WALL)
                .criterion(hasItem(Items.SOUL_SOIL), conditionsFromItem(Items.SOUL_SOIL))
                .offerTo(exporter, "polished_ghost_wall_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_GHOST_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GHOST_GEM_WALL)
                .criterion(hasItem(ModBlocks.POLISHED_GHOST_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_GHOST_GEM_BLOCK))
                .offerTo(exporter, "polished_ghost_wall_block_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GHOST_GEM_BRICKS, 4)
                .pattern("BB")
                .pattern("BB")
                .input('B', ModBlocks.POLISHED_GHOST_GEM_BLOCK)
                .criterion(hasItem(ModBlocks.POLISHED_GHOST_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_GHOST_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.SOUL_SOIL), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GHOST_GEM_BRICKS)
                .criterion(hasItem(Items.SOUL_SOIL), conditionsFromItem(Items.SOUL_SOIL))
                .offerTo(exporter, "ghost_bricks_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_GHOST_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GHOST_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.POLISHED_GHOST_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_GHOST_GEM_BLOCK))
                .offerTo(exporter, "ghost_bricks_polished_stonecutter");

        createStairsRecipe(ModBlocks.GHOST_GEM_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.GHOST_GEM_BRICKS))
                .criterion(hasItem(ModBlocks.GHOST_GEM_BRICKS), conditionsFromItem(ModBlocks.GHOST_GEM_BRICKS))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.SOUL_SOIL), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GHOST_GEM_BRICKS_STAIRS)
                .criterion(hasItem(Items.SOUL_SOIL), conditionsFromItem(Items.SOUL_SOIL))
                .offerTo(exporter, "ghost_bricks_stairs_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_GHOST_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GHOST_GEM_BRICKS_STAIRS)
                .criterion(hasItem(ModBlocks.POLISHED_GHOST_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_GHOST_GEM_BLOCK))
                .offerTo(exporter, "ghost_bricks_stairs_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.GHOST_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GHOST_GEM_BRICKS_STAIRS)
                .criterion(hasItem(ModBlocks.GHOST_GEM_BRICKS), conditionsFromItem(ModBlocks.GHOST_GEM_BRICKS))
                .offerTo(exporter, "ghost_bricks_stairs_bricks_stonecutter");

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GHOST_GEM_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.GHOST_GEM_BRICKS))
                .criterion(hasItem(ModBlocks.GHOST_GEM_BRICKS), conditionsFromItem(ModBlocks.GHOST_GEM_BRICKS))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.SOUL_SOIL), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GHOST_GEM_BRICKS_SLAB, 2)
                .criterion(hasItem(Items.SOUL_SOIL), conditionsFromItem(Items.SOUL_SOIL))
                .offerTo(exporter, "ghost_bricks_slab_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_GHOST_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GHOST_GEM_BRICKS_SLAB, 2)
                .criterion(hasItem(ModBlocks.POLISHED_GHOST_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_GHOST_GEM_BLOCK))
                .offerTo(exporter, "ghost_bricks_slab_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.GHOST_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GHOST_GEM_BRICKS_SLAB, 2)
                .criterion(hasItem(ModBlocks.GHOST_GEM_BRICKS), conditionsFromItem(ModBlocks.GHOST_GEM_BRICKS))
                .offerTo(exporter, "ghost_bricks_slab_bricks_stonecutter");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GHOST_GEM_BRICKS_WALL, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ModBlocks.GHOST_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.GHOST_GEM_BRICKS), conditionsFromItem(ModBlocks.GHOST_GEM_BRICKS))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.SOUL_SOIL), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GHOST_GEM_BRICKS_WALL)
                .criterion(hasItem(Items.SOUL_SOIL), conditionsFromItem(Items.SOUL_SOIL))
                .offerTo(exporter, "ghost_bricks_wall_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_GHOST_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GHOST_GEM_BRICKS_WALL)
                .criterion(hasItem(ModBlocks.POLISHED_GHOST_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_GHOST_GEM_BLOCK))
                .offerTo(exporter, "ghost_bricks_wall_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.GHOST_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GHOST_GEM_BRICKS_WALL)
                .criterion(hasItem(ModBlocks.GHOST_GEM_BRICKS), conditionsFromItem(ModBlocks.GHOST_GEM_BRICKS))
                .offerTo(exporter, "ghost_bricks_wall_bricks_stonecutter");

        createChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GHOST_GEM_BRICKS, Ingredient.ofItems(ModBlocks.GHOST_GEM_BRICKS_SLAB))
                .criterion(hasItem(ModBlocks.GHOST_GEM_BRICKS_SLAB), conditionsFromItem(ModBlocks.GHOST_GEM_BRICKS_SLAB))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Items.SOUL_SOIL), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GHOST_GEM_BRICKS)
                .criterion(hasItem(Items.SOUL_SOIL), conditionsFromItem(Items.SOUL_SOIL))
                .offerTo(exporter, "ghost_bricks_chiseled_raw_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.POLISHED_GHOST_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GHOST_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.POLISHED_GHOST_GEM_BLOCK), conditionsFromItem(ModBlocks.POLISHED_GHOST_GEM_BLOCK))
                .offerTo(exporter, "ghost_bricks_chiseled_polished_stonecutter");
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.GHOST_GEM_BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GHOST_GEM_BRICKS)
                .criterion(hasItem(ModBlocks.GHOST_GEM_BRICKS), conditionsFromItem(ModBlocks.GHOST_GEM_BRICKS))
                .offerTo(exporter, "ghost_bricks_chiseled_bricks_stonecutter");

        List<ItemConvertible> POLISHED_GHOST_SMELT = List.of(ModBlocks.POLISHED_GHOST_GEM_BLOCK);
        offerSmelting(exporter, POLISHED_GHOST_SMELT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_GHOST_GEM_BLOCK, 0.1f, 200, "smooth_ghost_gem_block");

        createStairsRecipe(ModBlocks.SMOOTH_GHOST_GEM_STAIRS, Ingredient.ofItems(ModBlocks.SMOOTH_GHOST_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.SMOOTH_GHOST_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_GHOST_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.SMOOTH_GHOST_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_GHOST_GEM_STAIRS)
                .criterion(hasItem(ModBlocks.SMOOTH_GHOST_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_GHOST_GEM_BLOCK))
                .offerTo(exporter, "smooth_ghost_stairs_stonecutter");

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_GHOST_GEM_SLAB, Ingredient.ofItems(ModBlocks.SMOOTH_GHOST_GEM_BLOCK))
                .criterion(hasItem(ModBlocks.SMOOTH_GHOST_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_GHOST_GEM_BLOCK))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.SMOOTH_GHOST_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_GHOST_GEM_SLAB, 2)
                .criterion(hasItem(ModBlocks.SMOOTH_GHOST_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_GHOST_GEM_BLOCK))
                .offerTo(exporter, "smooth_ghost_slab_stonecutter");

        createChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SMOOTH_GHOST_GEM_BLOCK, Ingredient.ofItems(ModBlocks.SMOOTH_GHOST_GEM_SLAB))
                .criterion(hasItem(ModBlocks.SMOOTH_GHOST_GEM_SLAB), conditionsFromItem(ModBlocks.SMOOTH_GHOST_GEM_SLAB))
                .offerTo(exporter);
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.SMOOTH_GHOST_GEM_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SMOOTH_GHOST_GEM_BLOCK)
                .criterion(hasItem(ModBlocks.SMOOTH_GHOST_GEM_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_GHOST_GEM_BLOCK))
                .offerTo(exporter, "smooth_ghost_chiseled_stonecutter");
    }
}
