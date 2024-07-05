package arthurlopes.notifications.service;

import arthurlopes.notifications.domain.entity.NotificationEntity;
import arthurlopes.notifications.domain.entity.StatusEntity;
import arthurlopes.notifications.infra.repository.NotificationRepository;
import arthurlopes.notifications.presentation.dto.ScheduleNotificationDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

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

    public void checkAndSend(LocalDateTime dateTime) {
        var notifications = notificationRepository.findByStatusInAndDateTimeBefore(
                List.of(StatusEntity.Values.PENDING.toStatus(), StatusEntity.Values.ERROR.toStatus()),
                dateTime);

        notifications.forEach(sendNotification());
    }

    private Consumer<NotificationEntity> sendNotification() {
        return notification -> {
            // ToDo - REALIZAR O ENVIO DA NOTIFICAÇÃO

            notification.setStatus(StatusEntity.Values.SUCCESS.toStatus());
            notificationRepository.save(notification);
        };
    }
}
