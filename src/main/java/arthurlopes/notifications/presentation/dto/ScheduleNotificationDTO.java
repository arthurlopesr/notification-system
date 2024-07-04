package arthurlopes.notifications.presentation.dto;

import arthurlopes.notifications.domain.entity.ChannelEntity;
import arthurlopes.notifications.domain.entity.NotificationEntity;
import arthurlopes.notifications.domain.entity.StatusEntity;

import java.time.LocalDateTime;

public record ScheduleNotificationDTO(LocalDateTime dateTime,
                                      String destination,
                                      String message,
                                      ChannelEntity.Values channel) {

    public NotificationEntity toNotificationEntity() {
        return new NotificationEntity(
                dateTime,
                destination,
                message,
                channel.toChannel(),
                StatusEntity.Values.PENDING.toStatus()
        );
    }
}
