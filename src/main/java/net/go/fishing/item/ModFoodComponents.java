package net.go.fishing.item;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

public class ModFoodComponents {
    public static final FoodComponent RAW_BLUE_FISH = new FoodComponent.Builder()
            .nutrition(2).saturationModifier(0.1f).build();
    public static final FoodComponent COOKED_BLUE_FISH = new FoodComponent.Builder()
            .nutrition(5).saturationModifier(0.6f).build();
    public static final FoodComponent RAW_GREEDILY_FISH = new FoodComponent.Builder()
            .nutrition(5).saturationModifier(0.6f).build();

    public static final FoodComponent TEST_BLOCK_OF_ONE = new FoodComponent.Builder()
            .nutrition(5).saturationModifier(0.6f).build();

    public static final FoodComponent BLACK_CARD_FISH = new FoodComponent.Builder()
            .nutrition(2).saturationModifier(0.1f).build();
    public static final ConsumableComponent BLACK_CARD_FISH_EFFCRT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new
                    StatusEffectInstance(StatusEffects.POISON, 150, 1), 1.0f)).build();
    public static final FoodComponent BURNED_BLACK_CARD_FISH = new FoodComponent.Builder()
            .nutrition(1).saturationModifier(0.1f).build();
    public static final ConsumableComponent BURNED_BLACK_CARD_FISH_EFFCRT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new
                    StatusEffectInstance(StatusEffects.POISON, 250, 2), 1.0f)).build();

    public static final FoodComponent RED_CARD_FISH = new FoodComponent.Builder()
            .nutrition(2).saturationModifier(0.1f).build();
    public static final ConsumableComponent RED_CARD_FISH_EFFCRT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new
                    StatusEffectInstance(StatusEffects.POISON, 100, 1), 1.0f)).build();
    public static final FoodComponent BURNED_RED_CARD_FISH = new FoodComponent.Builder()
            .nutrition(1).saturationModifier(0.1f).build();
    public static final ConsumableComponent BURNED_RED_CARD_FISH_EFFCRT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new
                    StatusEffectInstance(StatusEffects.POISON, 250, 2), 1.0f)).build();
}
