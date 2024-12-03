package net.go.fishing.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.go.fishing.item.ModItems;
import net.minecraft.client.render.entity.FishingBobberEntityRenderer;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

//@Mixin(FishingBobberEntityRenderer.class)
public class FishingBobberRendererMixin {
    /*
    @ModifyExpressionValue(method = "render(Lnet/minecraft/client/render/entity/state/FishingBobberEntityState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/entity/EntityRenderer;render(Lnet/minecraft/client/render/entity/state/EntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"))
    private boolean addCustomFishingRodToFishingRodCheck(boolean original, @Local ItemStack itemStack) {
        return original || itemStack.isOf(ModItems.BETTER_FISHING_ROD)
                        || itemStack.isOf(ModItems.BAMBOO_FISHING_ROD);
    }

     */
}
