package fr.en0ri4n.craftcreator.init;


import fr.en0ri4n.craftcreator.References;
import fr.en0ri4n.craftcreator.base.SupportedMods;
import fr.en0ri4n.craftcreator.item.ItemBlockBasic;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class InitItems
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, References.MOD_ID);
	
	public static final RegistryObject<Item> MINECRAFT_RECIPE_CREATOR = register("minecraft_recipe_creator", () -> new ItemBlockBasic(SupportedMods.MINECRAFT, InitBlocks.MINECRAFT_RECIPE_CREATOR.get()));
	public static final RegistryObject<Item> BOTANIA_RECIPE_CREATOR = register("botania_recipe_creator", () -> new ItemBlockBasic(SupportedMods.BOTANIA, InitBlocks.BOTANIA_RECIPE_CREATOR.get()));
	public static final RegistryObject<Item> THERMAL_RECIPE_CREATOR = register("thermal_recipe_creator", () -> new ItemBlockBasic(SupportedMods.THERMAL, InitBlocks.THERMAL_RECIPE_CREATOR.get()));
	public static final RegistryObject<Item> CREATE_RECIPE_CREATOR = register("create_recipe_creator", () -> new ItemBlockBasic(SupportedMods.CREATE, InitBlocks.CREATE_RECIPE_CREATOR.get()));

	private static RegistryObject<Item> register(String registryName, Supplier<Item> item)
	{
		return ITEMS.register(registryName, item);
	}
}