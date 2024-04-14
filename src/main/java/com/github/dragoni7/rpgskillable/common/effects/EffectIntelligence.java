package com.github.dragoni7.rpgskillable.common.effects;

import java.util.UUID;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraftforge.fml.ModList;

public class EffectIntelligence extends MobEffect {
	
	private static final UUID SPELL_DAMAGE = UUID.fromString("79ca0762-a082-4fc4-a0e1-59008791b6f5");

	protected EffectIntelligence() {
		super(MobEffectCategory.BENEFICIAL, 0X3292b3);
		
		if (ModList.get().isLoaded("irons_spellbooks")) {
			this.addAttributeModifier(AttributeRegistry.SPELL_POWER.get(), SPELL_DAMAGE.toString(), 0.2f, AttributeModifier.Operation.MULTIPLY_TOTAL);
		}
	}

}
