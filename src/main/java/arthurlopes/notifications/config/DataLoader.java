package arthurlopes.notifications.config;

import arthurlopes.notifications.domain.entity.ChannelEntity;
import arthurlopes.notifications.domain.entity.StatusEntity;
import arthurlopes.notifications.infra.repository.ChannelRepository;
import arthurlopes.notifications.infra.repository.StatusRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class DataLoader implements CommandLineRunner {

    private final ChannelRepository channelRepository;

    private final StatusRepository statusRepository;

    public DataLoader(ChannelRepository channelRepository, StatusRepository statusRepository) {
        this.channelRepository = channelRepository;
        this.statusRepository = statusRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Arrays.stream(ChannelEntity.Values.values())
                .map(ChannelEntity.Values::toChannel)
                .forEach(channelRepository::save);

        Arrays.stream(StatusEntity.Values.values())
                .map(StatusEntity.Values::toStatus)
                .forEach(statusRepository::save);
    }
}
