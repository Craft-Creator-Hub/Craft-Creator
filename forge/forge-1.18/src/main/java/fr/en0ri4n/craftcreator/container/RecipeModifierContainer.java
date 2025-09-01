package fr.en0ri4n.craftcreator.container;

import fr.en0ri4n.craftcreator.container.base.VanillaCommonContainer;
import fr.en0ri4n.craftcreator.init.InitContainers;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;

public class RecipeModifierContainer extends VanillaCommonContainer
{
    public RecipeModifierContainer(int pContainerId, Inventory inventory, FriendlyByteBuf packet)
    {
        super(InitContainers.RECIPE_MODIFIER.get(), pContainerId);

        this.bindInventory(inventory, 61, 36);
    }

    public static RecipeModifierContainer create(Player player)
    {
        return new RecipeModifierContainer(111, player.getInventory(), null);
    }

    @Override
    public boolean stillValid(Player player)
    {
        return true;
    }
}
