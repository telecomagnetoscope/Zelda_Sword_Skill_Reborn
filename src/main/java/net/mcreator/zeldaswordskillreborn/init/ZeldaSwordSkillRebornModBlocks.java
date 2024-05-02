
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zeldaswordskillreborn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.zeldaswordskillreborn.block.TpMinuetBlock;
import net.mcreator.zeldaswordskillreborn.block.RoyalFamilyBlockBlock;
import net.mcreator.zeldaswordskillreborn.block.LearnZLBlock;
import net.mcreator.zeldaswordskillreborn.block.LearnStSBlock;
import net.mcreator.zeldaswordskillreborn.block.LearnStBlock;
import net.mcreator.zeldaswordskillreborn.block.LearnSaSBlock;
import net.mcreator.zeldaswordskillreborn.block.LearnSSBlock;
import net.mcreator.zeldaswordskillreborn.block.LearnEponasongBlock;
import net.mcreator.zeldaswordskillreborn.block.GateOfTimeBlock;
import net.mcreator.zeldaswordskillreborn.block.BlockofTimeBlock;
import net.mcreator.zeldaswordskillreborn.ZeldaSwordSkillRebornMod;

public class ZeldaSwordSkillRebornModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ZeldaSwordSkillRebornMod.MODID);
	public static final RegistryObject<Block> LEARN_ZL = REGISTRY.register("learn_zl", () -> new LearnZLBlock());
	public static final RegistryObject<Block> LEARN_SS = REGISTRY.register("learn_ss", () -> new LearnSSBlock());
	public static final RegistryObject<Block> LEARN_SA_S = REGISTRY.register("learn_sa_s", () -> new LearnSaSBlock());
	public static final RegistryObject<Block> LEARN_EPONASONG = REGISTRY.register("learn_eponasong", () -> new LearnEponasongBlock());
	public static final RegistryObject<Block> LEARN_ST = REGISTRY.register("learn_st", () -> new LearnStBlock());
	public static final RegistryObject<Block> LEARN_ST_S = REGISTRY.register("learn_st_s", () -> new LearnStSBlock());
	public static final RegistryObject<Block> ROYAL_FAMILY_BLOCK = REGISTRY.register("royal_family_block", () -> new RoyalFamilyBlockBlock());
	public static final RegistryObject<Block> BLOCKOF_TIME = REGISTRY.register("blockof_time", () -> new BlockofTimeBlock());
	public static final RegistryObject<Block> GATE_OF_TIME = REGISTRY.register("gate_of_time", () -> new GateOfTimeBlock());
	public static final RegistryObject<Block> TP_MINUET = REGISTRY.register("tp_minuet", () -> new TpMinuetBlock());
}
