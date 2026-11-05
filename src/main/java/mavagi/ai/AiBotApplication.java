package mavagi.ai;

import mavagi.shared.config.BotType;
import mavagi.shared.core.BotLauncher;

/** Entry point for the AI bot process. */
public final class AiBotApplication {
    private AiBotApplication() {}

    public static void main(String[] args) {
        BotLauncher.launch(BotType.AI);
    }
}
