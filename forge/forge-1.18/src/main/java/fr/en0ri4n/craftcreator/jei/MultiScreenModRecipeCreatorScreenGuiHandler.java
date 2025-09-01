package fr.en0ri4n.craftcreator.jei;


import fr.en0ri4n.craftcreator.container.base.CommonContainer;
import fr.en0ri4n.craftcreator.screen.container.base.MultiScreenModRecipeCreatorScreen;
import mezz.jei.api.gui.handlers.IGuiContainerHandler;
import net.minecraft.client.renderer.Rect2i;

import java.util.List;

public class MultiScreenModRecipeCreatorScreenGuiHandler<T extends MultiScreenModRecipeCreatorScreen<? extends CommonContainer>> implements IGuiContainerHandler<T>
{
    public MultiScreenModRecipeCreatorScreenGuiHandler() {}

    @Override
    public List<Rect2i> getGuiExtraAreas(T containerScreen)
    {
        return containerScreen.getExtraAreas();
    }
}
