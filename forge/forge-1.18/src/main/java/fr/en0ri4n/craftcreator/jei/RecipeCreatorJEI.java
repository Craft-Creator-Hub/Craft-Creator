package fr.en0ri4n.craftcreator.jei;


import fr.en0ri4n.craftcreator.References;
import fr.en0ri4n.craftcreator.screen.container.BotaniaRecipeCreatorScreen;
import fr.en0ri4n.craftcreator.screen.container.CreateRecipeCreatorScreen;
import fr.en0ri4n.craftcreator.screen.container.MinecraftRecipeCreatorScreen;
import fr.en0ri4n.craftcreator.screen.container.ThermalRecipeCreatorScreen;
import fr.en0ri4n.craftcreator.screen.container.base.MultiScreenModRecipeCreatorScreen;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.gui.handlers.IGuiContainerHandler;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import net.minecraft.resources.ResourceLocation;

@JeiPlugin
public class RecipeCreatorJEI implements IModPlugin
{
    public RecipeCreatorJEI() {}

    @Override
    public ResourceLocation getPluginUid()
    {
        return References.getLoc("jeiplugin");
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration)
    {
        IGuiContainerHandler<MultiScreenModRecipeCreatorScreen<?>> guiContainerHandler = new MultiScreenModRecipeCreatorScreenGuiHandler<>();
        registration.addGuiContainerHandler(MinecraftRecipeCreatorScreen.class, guiContainerHandler);
        registration.addGuiContainerHandler(BotaniaRecipeCreatorScreen.class, guiContainerHandler);
        registration.addGuiContainerHandler(ThermalRecipeCreatorScreen.class, guiContainerHandler);
        registration.addGuiContainerHandler(CreateRecipeCreatorScreen.class, guiContainerHandler);
    }
}
