package ru.fewizz.idextender;

import net.minecraft.block.Block;
import net.minecraft.block.BlockIce;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid = "notenoughIDs", name = "NotEnoughIDs", version = "1.4.2")
public class IDExtender {
	@EventHandler
	public void test(FMLPreInitializationEvent event) {
		//for(int i = 0; i < 4500; i++){
		//Block shield = new BlockIce().setBlockName(".shield" + i);
		//GameRegistry.registerBlock(shield, i + "ShieldBlock");
		//System.out.println("TUTA");
		//shield.setCreativeTab(CreativeTabs.tabFood);
		//}
	}
}
