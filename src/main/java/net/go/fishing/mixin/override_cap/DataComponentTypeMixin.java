package net.go.fishing.mixin.override_cap;

import net.minecraft.component.DataComponentTypes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

import static net.go.fishing.DataDrivenStacks.MAX_STACK_SIZE_CAP;

/**Overrides the hard 99 cap on max_stack_size in one of 4 places*/
@Mixin(DataComponentTypes.class)
public abstract class DataComponentTypeMixin {
	
	@ModifyArg(method = "method_58570",  at = @At(value = "INVOKE", target = "Lnet/minecraft/util/dynamic/Codecs;rangedInt(II)Lcom/mojang/serialization/Codec;"), index = 1)
	private static int changeMaxStackSizeLimit(int original) {
		return MAX_STACK_SIZE_CAP;
	}
	
}
