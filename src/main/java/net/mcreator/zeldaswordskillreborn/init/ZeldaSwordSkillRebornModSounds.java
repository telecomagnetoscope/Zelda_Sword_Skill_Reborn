
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
	public static final RegistryObject<SoundEvent> SUNSSONG = REGISTRY.register("sunssong", () -> new SoundEvent(new ResourceLocation("zelda_sword_skill_reborn", "sunssong")));
	public static final RegistryObject<SoundEvent> SARIASSONG = REGISTRY.register("sariassong", () -> new SoundEvent(new ResourceLocation("zelda_sword_skill_reborn", "sariassong")));
	public static final RegistryObject<SoundEvent> EPONASONG = REGISTRY.register("eponasong", () -> new SoundEvent(new ResourceLocation("zelda_sword_skill_reborn", "eponasong")));
	public static final RegistryObject<SoundEvent> SONGOFTIME = REGISTRY.register("songoftime", () -> new SoundEvent(new ResourceLocation("zelda_sword_skill_reborn", "songoftime")));
	public static final RegistryObject<SoundEvent> SONGOFSTORM = REGISTRY.register("songofstorm", () -> new SoundEvent(new ResourceLocation("zelda_sword_skill_reborn", "songofstorm")));
	public static final RegistryObject<SoundEvent> MINUETOFFOREST = REGISTRY.register("minuetofforest", () -> new SoundEvent(new ResourceLocation("zelda_sword_skill_reborn", "minuetofforest")));
}
