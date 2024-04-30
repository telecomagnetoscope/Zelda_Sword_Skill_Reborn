
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zeldaswordskillreborn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.zeldaswordskillreborn.entity.MirrorShieldEntity;
import net.mcreator.zeldaswordskillreborn.entity.LongshotEntity;
import net.mcreator.zeldaswordskillreborn.entity.HylianShieldEntity;
import net.mcreator.zeldaswordskillreborn.entity.HookshotEntity;
import net.mcreator.zeldaswordskillreborn.entity.FairySlingshotEntity;
import net.mcreator.zeldaswordskillreborn.entity.DekuShieldEntity;
import net.mcreator.zeldaswordskillreborn.entity.BowofHeroEntity;
import net.mcreator.zeldaswordskillreborn.entity.BowOfHerooDrawing3Entity;
import net.mcreator.zeldaswordskillreborn.entity.BowOfHeroDrawing1Entity;
import net.mcreator.zeldaswordskillreborn.entity.BowOfHeroDrawin2Entity;
import net.mcreator.zeldaswordskillreborn.entity.BoomerangEntity;
import net.mcreator.zeldaswordskillreborn.entity.BombEntity;
import net.mcreator.zeldaswordskillreborn.ZeldaSwordSkillRebornMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ZeldaSwordSkillRebornModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ZeldaSwordSkillRebornMod.MODID);
	public static final RegistryObject<EntityType<DekuShieldEntity>> DEKU_SHIELD = register("projectile_deku_shield",
			EntityType.Builder.<DekuShieldEntity>of(DekuShieldEntity::new, MobCategory.MISC).setCustomClientFactory(DekuShieldEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HylianShieldEntity>> HYLIAN_SHIELD = register("projectile_hylian_shield",
			EntityType.Builder.<HylianShieldEntity>of(HylianShieldEntity::new, MobCategory.MISC).setCustomClientFactory(HylianShieldEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MirrorShieldEntity>> MIRROR_SHIELD = register("projectile_mirror_shield",
			EntityType.Builder.<MirrorShieldEntity>of(MirrorShieldEntity::new, MobCategory.MISC).setCustomClientFactory(MirrorShieldEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FairySlingshotEntity>> FAIRY_SLINGSHOT = register("projectile_fairy_slingshot",
			EntityType.Builder.<FairySlingshotEntity>of(FairySlingshotEntity::new, MobCategory.MISC).setCustomClientFactory(FairySlingshotEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BombEntity>> BOMB = register("projectile_bomb",
			EntityType.Builder.<BombEntity>of(BombEntity::new, MobCategory.MISC).setCustomClientFactory(BombEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BoomerangEntity>> BOOMERANG = register("projectile_boomerang",
			EntityType.Builder.<BoomerangEntity>of(BoomerangEntity::new, MobCategory.MISC).setCustomClientFactory(BoomerangEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HookshotEntity>> HOOKSHOT = register("projectile_hookshot",
			EntityType.Builder.<HookshotEntity>of(HookshotEntity::new, MobCategory.MISC).setCustomClientFactory(HookshotEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BowofHeroEntity>> BOWOF_HERO = register("projectile_bowof_hero",
			EntityType.Builder.<BowofHeroEntity>of(BowofHeroEntity::new, MobCategory.MISC).setCustomClientFactory(BowofHeroEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LongshotEntity>> LONGSHOT = register("projectile_longshot",
			EntityType.Builder.<LongshotEntity>of(LongshotEntity::new, MobCategory.MISC).setCustomClientFactory(LongshotEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BowOfHeroDrawing1Entity>> BOW_OF_HERO_DRAWING_1 = register("projectile_bow_of_hero_drawing_1", EntityType.Builder.<BowOfHeroDrawing1Entity>of(BowOfHeroDrawing1Entity::new, MobCategory.MISC)
			.setCustomClientFactory(BowOfHeroDrawing1Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BowOfHeroDrawin2Entity>> BOW_OF_HERO_DRAWIN_2 = register("projectile_bow_of_hero_drawin_2", EntityType.Builder.<BowOfHeroDrawin2Entity>of(BowOfHeroDrawin2Entity::new, MobCategory.MISC)
			.setCustomClientFactory(BowOfHeroDrawin2Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BowOfHerooDrawing3Entity>> BOW_OF_HEROO_DRAWING_3 = register("projectile_bow_of_heroo_drawing_3", EntityType.Builder.<BowOfHerooDrawing3Entity>of(BowOfHerooDrawing3Entity::new, MobCategory.MISC)
			.setCustomClientFactory(BowOfHerooDrawing3Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}
