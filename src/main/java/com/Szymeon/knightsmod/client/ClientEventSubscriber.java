package com.Szymeon.knightsmod.client;

import com.Szymeon.knightsmod.init.ModItems;
import com.Szymeon.knightsmod.item.ItemBase;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = "km")
public class ClientEventSubscriber {
	
	private static final String DEFAULT_VARIANT = "normal";
	
	@SubscribeEvent
	public static void onRegisterModelsEvent(final ModelRegistryEvent event) {
		registerItemModel(ModItems.MUTANT_BONE);
	}

	private static void registerItemModel(final Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), DEFAULT_VARIANT));
		
	}
}
