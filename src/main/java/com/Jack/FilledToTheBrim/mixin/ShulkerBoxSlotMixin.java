package com.Jack.FilledToTheBrim.mixin;


import com.Jack.FilledToTheBrim.util.nbtutil;
import net.minecraft.block.Block;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.ShulkerBoxSlot;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;



@Mixin(ShulkerBoxSlot.class)
public class ShulkerBoxSlotMixin {


    @Inject(method = "canInsert", at = @At("HEAD"), cancellable = true)
    private void canInsert(ItemStack stack, CallbackInfoReturnable<Boolean> ci) {
        //boolean isemptyshulkeritem = Block.getBlockFromItem(stack.getItem()) instanceof ShulkerBoxBlock && nbtutil.isEmptyShulkerBox(stack);
        //return !(Block.getBlockFromItem(stack.getItem()) instanceof ShulkerBoxBlock); //MC Code (Yarn)
        //ci.setReturnValue(!(Block.getBlockFromItem(stack.getItem()) instanceof ShulkerBoxBlock) || isemptyshulkeritem);//Double Checks

        ci.setReturnValue(!(Block.getBlockFromItem(stack.getItem()) instanceof ShulkerBoxBlock) || nbtutil.isEmptyShulkerBox(stack));//Single Check in nbtutil


    }
}
