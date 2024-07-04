package arthurlopes.notifications.infra.repository;

import arthurlopes.notifications.domain.entity.StatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<StatusEntity, Long> {
}
