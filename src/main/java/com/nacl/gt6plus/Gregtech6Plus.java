/**
 * 
 */
package com.nacl.gt6plus;

import org.spongepowered.asm.mixin.Mixin;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * @author NaCl
 *
 */

@Mod(modid = "gt6plus")
public class Gregtech6Plus {

	@SidedProxy(modId = "gt6plus",clientSide = "com.nacl.gt6plus.Gregtech6Plus_Client",serverSide = "com.nacl.gt6plus.Gregtech6Plus_Server")
	public static Gregtech6Plus_Common gregtech6PlusProxy;
	
	@EventHandler
	void PerInit(FMLPreInitializationEvent event){
		gregtech6PlusProxy.PerInit(event);
	}
	
	@EventHandler
	void Init(FMLInitializationEvent event) {
		gregtech6PlusProxy.Init(event);
	}
	
	@EventHandler
	void PostInitialization(FMLPostInitializationEvent event) {
		gregtech6PlusProxy.PostInit(event);
	}
}
