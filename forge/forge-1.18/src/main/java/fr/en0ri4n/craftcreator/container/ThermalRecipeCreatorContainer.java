package fr.en0ri4n.craftcreator.container;

import fr.en0ri4n.craftcreator.base.SupportedMods;
import fr.en0ri4n.craftcreator.container.base.CommonContainer;
import fr.en0ri4n.craftcreator.init.InitContainers;
import fr.en0ri4n.craftcreator.utils.SlotHelper;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;

public class ThermalRecipeCreatorContainer extends CommonContainer
{
    public ThermalRecipeCreatorContainer(int containerId, Inventory inventory, FriendlyByteBuf packet)
    {
        super(InitContainers.THERMAL_RECIPE_CREATOR.get(), containerId, inventory, packet);

        addSlots(SlotHelper.THERMAL_SLOTS);

        this.bindInventory(inventory, 60, 90);
    }

    @Override
    public SupportedMods getMod()
    {
        return SupportedMods.THERMAL;
    }
    
    @Override
    public int getContainerSize()
    {
        return SlotHelper.THERMAL_SLOTS_SIZE;
    }
}
