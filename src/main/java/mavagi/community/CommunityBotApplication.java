package mavagi.community;

import mavagi.shared.config.BotType;
import mavagi.shared.core.BotLauncher;

public final class CommunityBotApplication {
    private CommunityBotApplication() {}

    public static void main(String[] args) {
        BotLauncher.launch(BotType.COMMUNITY);
    }
}
