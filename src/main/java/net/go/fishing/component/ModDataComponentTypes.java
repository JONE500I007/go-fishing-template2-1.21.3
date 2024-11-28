package net.go.fishing.component;

import net.go.fishing.GoFishing;
import net.minecraft.component.ComponentType;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.dynamic.Codecs;

import java.util.function.UnaryOperator;

public class ModDataComponentTypes {

    public static final ComponentType<Integer> MAX_STACK_SIZE2 =
            register("max_stack_size2", builder ->
                    builder.codec(Codecs.rangedInt(1, 127))
                            .packetCodec(PacketCodecs.VAR_INT)
            );

    private static <T> ComponentType<T> register(String name, UnaryOperator<ComponentType.Builder<T>> builderUnaryOperator) {
        return Registry.register(Registries.DATA_COMPONENT_TYPE, Identifier.of(GoFishing.MOD_ID, name),
                builderUnaryOperator.apply(ComponentType.builder()).build()
        );
    }

    public static void registerDataComponentTypes() {
        GoFishing.LOGGER.info("Register Data ComponentTypes Types for " + GoFishing.MOD_ID);
    }
}
