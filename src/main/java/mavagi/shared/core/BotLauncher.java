package mavagi.shared.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mavagi.shared.config.BotConfig;
import mavagi.shared.config.BotType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public final class BotLauncher {
    private static final Logger LOGGER = LoggerFactory.getLogger(BotLauncher.class);

    private BotLauncher() {}

    public static void launch(BotType botType) {
        String token = BotConfig.requireToken(botType);
        try {
            JDA jda = JDABuilder.createDefault(token)
                    .addEventListeners(new ReadyListener())
                    .build();
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                LOGGER.info("Shutting down {} bot", botType);
                jda.shutdown();
            }, "mavagi-" + botType.name().toLowerCase() + "-shutdown"));
            LOGGER.info("Starting {} bot", botType);
        } catch (RuntimeException exception) {
            LOGGER.error("Failed to start {} bot", botType, exception);
            throw exception;
        }
    }
}
