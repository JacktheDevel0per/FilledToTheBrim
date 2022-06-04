package com.Jack.FilledToTheBrim.mixin;


import com.Jack.FilledToTheBrim.util.CanInsert;
import com.Jack.FilledToTheBrim.util.nbtutil;

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
        //return !(Block.getBlockFromItem(stack.getItem()) instanceof ShulkerBoxBlock); //MC Code Before 1.17-1.18 (Yarn)
        //return stack.getItem().canBeNested(); //MC Code After 1-17.-1.18 (Yarn) Nesting Now Includes Bundles and Its Nice Ofc, Is also Used for Bundles also When I add Config or smth I will Add Support For any Nest.

        ci.setReturnValue(CanInsert.canInsertintoShulkerBox(stack));//Single Check in nbtutil



    }
}
