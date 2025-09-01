package fr.en0ri4n.craftcreator.handler;

import fr.en0ri4n.craftcreator.References;
import fr.en0ri4n.craftcreator.api.ClientUtils;
import fr.en0ri4n.craftcreator.api.CommonUtils;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = References.MOD_ID)
public class CommonHandler
{
    @SubscribeEvent
    public void onPlayerJoin(PlayerEvent.PlayerLoggedInEvent event)
    {
        MutableComponent issueMsg = CommonUtils.createComponentUrlOpener(References.getTranslate("message.join_issue"), "https://github.com/En0ri4n/Craft-Creator/issues");

        CommonUtils.sendMessage(event.getPlayer(), References.getTranslate("message.join", new TranslatableComponent(ClientUtils.KEY_OPEN_RECIPES_MENU.getKey().getDisplayName().getString()).getString(), new TranslatableComponent(ClientUtils.KEY_OPEN_TUTORIAL.getKey().getDisplayName().getString()).getString()));
        CommonUtils.sendMessage(event.getPlayer(), issueMsg);
    }
}
