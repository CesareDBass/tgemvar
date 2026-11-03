package net.cbass.tgv.item;

import net.cbass.tgv.TypeGemsVariant;
import net.cbass.tgv.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;


public class ModItemGroups {

    public static final ItemGroup TYPE_GEM_BLOCKS_VARIANTS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TypeGemsVariant.MOD_ID, "type_gem_blocks_variant"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.NORMAL_GEM_BRICKS))
                    .displayName(Text.translatable("itemgroup.tgemvar.type_block_variants"))
                    .entries((displayContext, entries) -> {
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
                    }).build());

    public static void registerItemGroups() {
        TypeGemsVariant.LOGGER.info("Registering Item Groups for" + TypeGemsVariant.MOD_ID);
    }
}
