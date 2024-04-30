
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zeldaswordskillreborn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.zeldaswordskillreborn.ZeldaSwordSkillRebornMod;

public class ZeldaSwordSkillRebornModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ZeldaSwordSkillRebornMod.MODID);
	public static final RegistryObject<SoundEvent> BOMB = REGISTRY.register("bomb", () -> new SoundEvent(new ResourceLocation("zelda_sword_skill_reborn", "bomb")));
	public static final RegistryObject<SoundEvent> ZELDASLULLABY = REGISTRY.register("zeldaslullaby", () -> new SoundEvent(new ResourceLocation("zelda_sword_skill_reborn", "zeldaslullaby")));
}
