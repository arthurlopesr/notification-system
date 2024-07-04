package arthurlopes.notifications.service;

import arthurlopes.notifications.infra.repository.NotificationRepository;
import arthurlopes.notifications.presentation.dto.ScheduleNotificationDTO;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void scheduleNotification(ScheduleNotificationDTO scheduleNotificationDTO) {
        notificationRepository.save(scheduleNotificationDTO.toNotificationEntity());
    }
}
