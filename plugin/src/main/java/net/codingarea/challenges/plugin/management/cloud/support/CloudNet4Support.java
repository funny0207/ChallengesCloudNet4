package net.codingarea.challenges.plugin.management.cloud.support;

import eu.cloudnetservice.modules.bridge.BridgeServiceHelper;
import net.codingarea.challenges.plugin.management.cloud.CloudSupport;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;
import java.util.UUID;

public final class CloudNet4Support implements CloudSupport {

    @Nonnull
    @Override
    public String getColoredName(@Nonnull Player player) {
        return "§7" + player.getName();
    }

    @Nonnull
    @Override
    public String getColoredName(@Nonnull UUID uuid) {
        return "§7" + uuid.toString();
    }

    @Override
    public boolean hasNameFor(@Nonnull UUID uuid) {
        return true;
    }

    @Override
    public void startNewService() {
        BridgeServiceHelper.changeToIngame();
    }

    @Override
    public void setIngame() {
        BridgeServiceHelper.changeToIngame(false);
    }

    @Override
    public void setLobby() {
        BridgeServiceHelper.setServiceState("LOBBY");
    }

}
