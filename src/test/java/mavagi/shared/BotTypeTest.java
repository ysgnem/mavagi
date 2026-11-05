package mavagi.shared;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import mavagi.shared.config.BotType;

class BotTypeTest {
    @Test
    void everyBotHasAnIndependentTokenKey() {
        assertEquals(7, BotType.values().length);
        assertEquals("COMMUNITY_BOT_TOKEN", BotType.COMMUNITY.tokenEnvironmentKey());
        assertEquals("AI_BOT_TOKEN", BotType.AI.tokenEnvironmentKey());
    }
}
