package arthurlopes.notifications.presentation.controller;

import arthurlopes.notifications.domain.entity.NotificationEntity;
import arthurlopes.notifications.presentation.dto.ScheduleNotificationDTO;
import arthurlopes.notifications.service.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public ResponseEntity<Void> scheduleNotification(@RequestBody ScheduleNotificationDTO scheduleNotificationDTO) {
        notificationService.scheduleNotification(scheduleNotificationDTO);
        return ResponseEntity.accepted().build();
    }

    @GetMapping("/{notificationId}")
    public ResponseEntity<NotificationEntity> getNotification(@PathVariable("notificationId") Long notificationId) {
        var notification = notificationService.findById(notificationId);

        if (notification.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(notification.get());
    }
}
