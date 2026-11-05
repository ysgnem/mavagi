package mavagi.tts;

import mavagi.shared.config.BotType;
import mavagi.shared.core.BotLauncher;

public final class TtsBotApplication {
    private TtsBotApplication() {}

    public static void main(String[] args) {
        BotLauncher.launch(BotType.TTS);
    }
}
