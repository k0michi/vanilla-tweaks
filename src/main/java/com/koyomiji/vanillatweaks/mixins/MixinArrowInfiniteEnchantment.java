package com.koyomiji.vanillatweaks.mixins;

import net.minecraft.world.item.enchantment.ArrowInfiniteEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ArrowInfiniteEnchantment.class)
public abstract class MixinArrowInfiniteEnchantment {
    @Redirect(method = "checkCompatibility", at = @At(value = "CONSTANT", args = "classValue=net/minecraft/world/item/enchantment/MendingEnchantment", ordinal = 0))
    public boolean checkCompatibility$instanceOf(Object ref, Class cl){
        return false;
    }
}