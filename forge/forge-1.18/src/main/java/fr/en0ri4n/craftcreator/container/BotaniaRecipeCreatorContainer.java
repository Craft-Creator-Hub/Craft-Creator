package fr.en0ri4n.craftcreator.container;

import fr.en0ri4n.craftcreator.base.SupportedMods;
import fr.en0ri4n.craftcreator.container.base.CommonContainer;
import fr.en0ri4n.craftcreator.init.InitContainers;
import fr.en0ri4n.craftcreator.utils.SlotHelper;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;

public class BotaniaRecipeCreatorContainer extends CommonContainer
{
    public BotaniaRecipeCreatorContainer(int containerId, Inventory inventory, FriendlyByteBuf packet)
    {
        super(InitContainers.BOTANIA_RECIPE_CREATOR.get(), containerId, inventory, packet);

        addSlots(SlotHelper.BOTANIA_SLOTS);

        this.bindInventory(inventory);
    }

    @Override
    public SupportedMods getMod()
    {
        return SupportedMods.BOTANIA;
    }
    
    @Override
    public int getContainerSize()
    {
        return SlotHelper.BOTANIA_SLOTS_SIZE;
    }
}
