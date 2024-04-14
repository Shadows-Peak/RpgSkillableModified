package com.github.dragoni7.rpgskillable.common.effects;

import java.util.UUID;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraftforge.fml.ModList;

public class EffectMind extends MobEffect {
	
	private static final UUID MAX_MANA_BONUS = UUID.fromString("4e9c93c1-162e-401b-aace-aa4109fd0a5f");
	private static final UUID CAST_TIME_REDUCTION_BONUS = UUID.formString("9ca8f045-fc7a-43ae-a4a0-8fc9ac8ceba7");
	private static final UUID COOLDOWN_REDUCTION_BONUS = UUID.formString("87495934-7df6-451f-a5bf-589b008156a9");

	protected EffectMind() {
		super(MobEffectCategory.BENEFICIAL, 0X373f8c);
		if (ModList.get().isLoaded("irons_spellbooks")) {
			this.addAttributeModifier(AttributeRegistry.MAX_MANA.get(), MAX_MANA_BONUS.toString(), 0.2f, AttributeModifier.Operation.MULTIPLY_TOTAL);
			this.addAttributeModifier(AttributeRegistry.CAST_TIME_REDUCTION.get(), CAST_TIME_REDUCTION_BONUS.toString(), -0.1f, AttributeModifier.Operation.MULTIPLY_BASE);
			this.addAttributeModifier(AttributeRegistry.COOLDOWN_REDUCTION.get(), COOLDOWN_REDUCTION_BONUS.toString(), -0.05f, AttributeModifier.Operation.MULTIPLY_BASE);
		}
	}

}
