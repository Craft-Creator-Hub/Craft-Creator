package fr.en0ri4n.craftcreator.init;


import fr.en0ri4n.craftcreator.References;
import fr.en0ri4n.craftcreator.blocks.BotaniaRecipeCreatorBlock;
import fr.en0ri4n.craftcreator.blocks.CreateRecipeCreatorBlock;
import fr.en0ri4n.craftcreator.blocks.MinecraftRecipeCreatorBlock;
import fr.en0ri4n.craftcreator.blocks.ThermalRecipeCreatorBlock;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class InitBlocks
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, References.MOD_ID);

	public static final RegistryObject<Block> MINECRAFT_RECIPE_CREATOR = register("minecraft_recipe_creator", MinecraftRecipeCreatorBlock::new);
	public static final RegistryObject<Block> BOTANIA_RECIPE_CREATOR = register("botania_recipe_creator", BotaniaRecipeCreatorBlock::new);
    public static final RegistryObject<Block> THERMAL_RECIPE_CREATOR = register("thermal_recipe_creator", ThermalRecipeCreatorBlock::new);
	public static final RegistryObject<Block> CREATE_RECIPE_CREATOR = register("create_recipe_creator", CreateRecipeCreatorBlock::new);

	private static RegistryObject<Block> register(String registryName, Supplier<Block> block)
	{
		return BLOCKS.register(registryName, block);
	}
}