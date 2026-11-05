package mavagi.entertainment;

import mavagi.shared.config.BotType;
import mavagi.shared.core.BotLauncher;

public final class EntertainmentBotApplication {
    private EntertainmentBotApplication() {}

    public static void main(String[] args) {
        BotLauncher.launch(BotType.ENTERTAINMENT);
    }
}
