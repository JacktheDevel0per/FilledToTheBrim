package com.Jack.FilledToTheBrim.util;

import com.Jack.FilledToTheBrim.FilledToTheBrim;

import net.minecraft.block.Block;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.item.ItemStack;

public class CanInsert {


    public static boolean canInsertintoShulkerBox(ItemStack stack) {

        return stack.getItem().canBeNested() || nbtutil.isEmptyShulkerBox(stack);
    }

}

