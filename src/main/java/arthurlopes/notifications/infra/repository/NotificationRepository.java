package arthurlopes.notifications.infra.repository;

import arthurlopes.notifications.domain.entity.NotificationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<NotificationEntity, Long> {
}
