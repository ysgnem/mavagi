package mavagi.shared.config;

import io.github.cdimascio.dotenv.Dotenv;

public final class BotConfig {
    private static final Dotenv DOTENV = Dotenv.configure().ignoreIfMissing().load();

    private BotConfig() {}

    public static String requireToken(BotType botType) {
        String key = botType.tokenEnvironmentKey();
        String value = System.getenv(key);
        if (value == null || value.isBlank()) {
            value = DOTENV.get(key);
        }
        if (value == null || value.isBlank()) {
            throw new IllegalStateException("Required environment variable is missing: " + key);
        }
        return value.trim();
    }
}
