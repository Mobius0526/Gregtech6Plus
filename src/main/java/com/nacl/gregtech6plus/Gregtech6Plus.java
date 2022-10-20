/**
 * 
 */
package com.nacl.gregtech6plus;

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
@Mod(modid = "gregtech6plus" ,dependencies = "required-after:gregtech")
public class Gregtech6Plus {

	@SidedProxy(modId = "gregtech6plus",clientSide = "com.nacl.gregtech6plus.Gregtech6Plus_Client",serverSide = "com.nacl.gregtech6plus.Gregtech6Plus_Server")
	public static Gregtech6PlusProxy gregtech6PlusProxy;
	
	@EventHandler
	void PerInit(FMLPreInitializationEvent event){
		
	}
	
	@EventHandler
	void Init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	void PostInitialization(FMLPostInitializationEvent event) {
		
	}
}
