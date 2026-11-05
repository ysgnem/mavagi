package mavagi.shared.config;

public enum BotType {
    COMMUNITY("COMMUNITY_BOT_TOKEN"),
    DEBUG("DEBUG_BOT_TOKEN"),
    ENTERTAINMENT("ENTERTAINMENT_BOT_TOKEN"),
    MINASE("MINASE_BOT_TOKEN"),
    MUSIC("MUSIC_BOT_TOKEN"),
    TTS("TTS_BOT_TOKEN"),
    AI("AI_BOT_TOKEN");

    private final String tokenEnvironmentKey;

    BotType(String tokenEnvironmentKey) {
        this.tokenEnvironmentKey = tokenEnvironmentKey;
    }

    public String tokenEnvironmentKey() {
        return tokenEnvironmentKey;
    }
}
