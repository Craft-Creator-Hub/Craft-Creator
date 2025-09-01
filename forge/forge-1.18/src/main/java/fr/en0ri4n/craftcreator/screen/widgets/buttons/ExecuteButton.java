package fr.en0ri4n.craftcreator.screen.widgets.buttons;


import com.mojang.blaze3d.vertex.PoseStack;
import fr.en0ri4n.craftcreator.References;
import fr.en0ri4n.craftcreator.api.ClientUtils;
import fr.en0ri4n.craftcreator.api.ScreenUtils;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;

public class ExecuteButton extends Button
{
	private static final ResourceLocation TEXTURE = References.getLoc("textures/gui/buttons/arrow_button.png");

	public ExecuteButton(int x, int y, int width, OnPress onPress)
	{
		super(x, y, width, 20, new TextComponent(""), onPress);
	}

	@Override
	public void renderButton(PoseStack pPoseStack, int mouseX, int mouseY, float partialTick)
	{
		if(this.visible)
		{
			ClientUtils.bindTexture(TEXTURE);
			Screen.blit(pPoseStack, x, y, this.width, this.height, 0, ScreenUtils.isMouseHover(x, y, mouseX, mouseY, width, height) ? 20 : 0, 42, 20, 42, 40);
		}
	}
}
