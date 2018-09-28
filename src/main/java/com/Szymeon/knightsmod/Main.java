package com.Szymeon.knightsmod;

import com.Szymeon.knightsmod.init.ModItems;
import com.Szymeon.knightsmod.proxy.CommonProxy;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

@Mod(modid = Main.modId, name = Main.name, version = Main.version)
public class Main {
	public static final String modId = "km";
	public static final String name = "Knights Mod";
	public static final String version = "1.0";
	public static final String ACCEPTED_VERSIONS = "1.12.2";
	public static final String CLIENT_PROXY_CLASS = "com.Szymeon.knightsmod.ClientProxy";
	public static final String COMMON_PROXY_CLASS = "com.Szymeon.knightsmod.CommonProxy";
	
	@Mod.Instance(modId)
	public static Main instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " is loading!");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
	
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	@SidedProxy(serverSide = COMMON_PROXY_CLASS, clientSide = CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
}
