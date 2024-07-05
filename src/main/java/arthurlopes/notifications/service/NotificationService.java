package arthurlopes.notifications.service;

import arthurlopes.notifications.domain.entity.NotificationEntity;
import arthurlopes.notifications.domain.entity.StatusEntity;
import arthurlopes.notifications.infra.repository.NotificationRepository;
import arthurlopes.notifications.presentation.dto.ScheduleNotificationDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void scheduleNotification(ScheduleNotificationDTO scheduleNotificationDTO) {
        notificationRepository.save(scheduleNotificationDTO.toNotificationEntity());
    }

    public Optional<NotificationEntity> findById(Long notificationId) {
        return notificationRepository.findById(notificationId);
    }

    public void cancelNotification(Long notifcationId) {
        var notification = findById(notifcationId);

        if (notification.isPresent()) {
            notification.get().setStatus(StatusEntity.Values.CANCELED.toStatus());
            notificationRepository.save(notification.get());
        }
    }
}
