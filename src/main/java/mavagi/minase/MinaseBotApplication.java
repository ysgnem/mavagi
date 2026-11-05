package mavagi.minase;

import mavagi.shared.config.BotType;
import mavagi.shared.core.BotLauncher;

public final class MinaseBotApplication {
    private MinaseBotApplication() {}

    public static void main(String[] args) {
        BotLauncher.launch(BotType.MINASE);
    }
}
