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
    }
}
