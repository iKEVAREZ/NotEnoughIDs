package ru.fewizz.neid;

import net.minecraft.block.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Neid.MODID, name = Neid.NAME, version = Neid.VERSION, acceptedMinecraftVersions = "[1.12,1.12.2]")
public class Neid {
	public static final String MODID = "neid";
	public static final String NAME = "NotEnoughIDs";
	public static final String VERSION = "1.5.4.3";
	public static final boolean DEBUG_BLOCKS = false;
	public static final boolean DEBUG_ITEMS = false;

	@EventHandler
	public void init(FMLPreInitializationEvent event) {
		if (DEBUG_BLOCKS) {
			for (int i = 0; i < 10000; i++) {
				BlockIce block = new BlockIce();
				block.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
				block.setUnlocalizedName("" + i);
				block.setRegistryName(new ResourceLocation("neid:ICE" + i));
				GameRegistry.findRegistry(Block.class).register(block);
				GameRegistry.findRegistry(Item.class).register(new ItemBlock(block).setRegistryName(new ResourceLocation("neid:ICE" + i)));
			}
		}
		
		if(DEBUG_ITEMS) {
			for (int i = 0; i < 35000; i++) {
				Item item = new ItemArrow();
				item.setCreativeTab(CreativeTabs.FOOD);
				item.setUnlocalizedName("" + i);
				item.setRegistryName(new ResourceLocation("neid:ARROW" + i));
				GameRegistry.findRegistry(Item.class).register(item);
			}
		}
	}
}
