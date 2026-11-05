package mavagi.music;

import mavagi.shared.config.BotType;
import mavagi.shared.core.BotLauncher;

public final class MusicBotApplication {
    private MusicBotApplication() {}

    public static void main(String[] args) {
        BotLauncher.launch(BotType.MUSIC);
    }
}
