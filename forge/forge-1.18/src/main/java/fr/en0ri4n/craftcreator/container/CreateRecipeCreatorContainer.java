package fr.en0ri4n.craftcreator.container;

import fr.en0ri4n.craftcreator.base.SupportedMods;
import fr.en0ri4n.craftcreator.container.base.CommonContainer;
import fr.en0ri4n.craftcreator.init.InitContainers;
import fr.en0ri4n.craftcreator.utils.SlotHelper;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;

public class CreateRecipeCreatorContainer extends CommonContainer
{
    public CreateRecipeCreatorContainer(int pContainerId, Inventory inventory, FriendlyByteBuf byteBuf)
    {
        super(InitContainers.CREATE_RECIPE_CREATOR.get(), pContainerId, inventory, byteBuf);

        addSlots(SlotHelper.CREATE_SLOTS);

        bindInventory(inventory, 40, 90);
    }

    @Override
    public SupportedMods getMod()
    {
        return SupportedMods.CREATE;
    }

    @Override
    public int getContainerSize()
    {
        return SlotHelper.CREATE_SLOTS_SIZE;
    }
}
