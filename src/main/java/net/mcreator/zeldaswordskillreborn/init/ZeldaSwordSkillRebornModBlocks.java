
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zeldaswordskillreborn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.zeldaswordskillreborn.block.LearnZLBlock;
import net.mcreator.zeldaswordskillreborn.ZeldaSwordSkillRebornMod;

public class ZeldaSwordSkillRebornModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ZeldaSwordSkillRebornMod.MODID);
	public static final RegistryObject<Block> LEARN_ZL = REGISTRY.register("learn_zl", () -> new LearnZLBlock());
}
