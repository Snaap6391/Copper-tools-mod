package com.snaap6391.cotm.modstuff;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class modtier {
    public static final ForgeTier COPPER = new ForgeTier(1, 200, 5f, 1.5f, 13,
            Tags.Blocks.NEEDS_WOOD_TOOL, () -> Ingredient.of(Items.COPPER_INGOT));
}
