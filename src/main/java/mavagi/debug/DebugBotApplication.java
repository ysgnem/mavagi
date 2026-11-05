package mavagi.debug;

import mavagi.shared.config.BotType;
import mavagi.shared.core.BotLauncher;

public final class DebugBotApplication {
    private DebugBotApplication() {}

    public static void main(String[] args) {
        BotLauncher.launch(BotType.DEBUG);
    }
}
