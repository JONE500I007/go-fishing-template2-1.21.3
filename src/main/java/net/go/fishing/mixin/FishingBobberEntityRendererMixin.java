package net.go.fishing.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.go.fishing.item.ModItems;
import net.minecraft.client.render.entity.FishingBobberEntityRenderer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(FishingBobberEntityRenderer.class)
public abstract class FishingBobberEntityRendererMixin {
    @WrapOperation(method = "getHandPos", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"))
    private boolean allowCustomFishingRods(ItemStack instance, Item item, Operation<Boolean> original) {
        return original.call(instance, item)
                || original.call(instance, ModItems.BETTER_FISHING_ROD)
                || original.call(instance, ModItems.BAMBOO_FISHING_ROD);
    }
}
