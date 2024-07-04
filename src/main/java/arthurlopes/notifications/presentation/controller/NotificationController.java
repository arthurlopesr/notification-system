package arthurlopes.notifications.presentation.controller;

import arthurlopes.notifications.presentation.dto.ScheduleNotificationDTO;
import arthurlopes.notifications.service.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    private NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public ResponseEntity<Void> scheduleNotification(@RequestBody ScheduleNotificationDTO scheduleNotificationDTO) {
        notificationService.scheduleNotification(scheduleNotificationDTO);
        return ResponseEntity.accepted().build();
    }
}
