package mavagi.shared.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public final class ReadyListener extends ListenerAdapter {
    private static final Logger LOGGER = LoggerFactory.getLogger(ReadyListener.class);

    @Override
    public void onReady(ReadyEvent event) {
        User self = event.getJDA().getSelfUser();
        LOGGER.info("Discord connection ready: {} ({})", self.getName(), self.getId());
    }
}
