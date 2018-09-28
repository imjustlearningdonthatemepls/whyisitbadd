package com.Szymeon.knightsmod.init;

import com.Szymeon.knightsmod.item.ItemBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	
	public static ItemBase MUTANT_BONE = new ItemBase("mutantbone").setCreativeTab(CreativeTabs.MATERIALS);
	
	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
				MUTANT_BONE
			);
	}
	
	
	public static void registerModels() {
		MUTANT_BONE.registerItemModel();
	}

}