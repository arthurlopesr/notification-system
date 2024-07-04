package arthurlopes.notifications.infra.repository;

import arthurlopes.notifications.domain.entity.ChannelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChannelRepository extends JpaRepository<ChannelEntity, Long> {
}
