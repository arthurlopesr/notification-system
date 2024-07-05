package arthurlopes.notifications.infra.repository;

import arthurlopes.notifications.domain.entity.NotificationEntity;
import arthurlopes.notifications.domain.entity.StatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationRepository extends JpaRepository<NotificationEntity, Long> {
    List<NotificationEntity> findByStatusInAndDateTimeBefore(List<StatusEntity> status, LocalDateTime dateTime);
}
