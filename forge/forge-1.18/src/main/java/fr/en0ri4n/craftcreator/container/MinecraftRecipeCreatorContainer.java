package fr.en0ri4n.craftcreator.container;

import fr.en0ri4n.craftcreator.base.SupportedMods;
import fr.en0ri4n.craftcreator.container.base.CommonContainer;
import fr.en0ri4n.craftcreator.init.InitContainers;
import fr.en0ri4n.craftcreator.utils.SlotHelper;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;

public class MinecraftRecipeCreatorContainer extends CommonContainer
{
    public MinecraftRecipeCreatorContainer(int containerId, Inventory inventory, FriendlyByteBuf packet)
    {
        super(InitContainers.MINECRAFT_RECIPE_CREATOR.get(), containerId, inventory, packet);

        addSlots(SlotHelper.MINECRAFT_SLOTS);

        this.bindInventory(inventory);

        activeSlots(true);
    }

    @Override
    public SupportedMods getMod()
    {
        return SupportedMods.MINECRAFT;
    }
    
    @Override
    public int getContainerSize()
    {
        return SlotHelper.MINECRAFT_SLOTS_SIZE;
    }
}