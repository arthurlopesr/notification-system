package arthurlopes.notifications.domain.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "notifications")
public class NotificationEntity {

    public NotificationEntity() {
    }

    public NotificationEntity(LocalDateTime dateTime, String destination, String message, ChannelEntity channel, StatusEntity status) {
        this.dateTime = dateTime;
        this.destination = destination;
        this.message = message;
        this.channel = channel;
        this.status = status;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long notificationId;

    private LocalDateTime dateTime;

    private String destination;

    private String message;

    @ManyToOne()
    @JoinColumn(name = "channel_id")
    private ChannelEntity channel;

    @ManyToOne()
    @JoinColumn(name = "status_id")
    private StatusEntity status;

    public Long getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Long notificationId) {
        this.notificationId = notificationId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ChannelEntity getChannel() {
        return channel;
    }

    public void setChannel(ChannelEntity channel) {
        this.channel = channel;
    }

    public StatusEntity getStatus() {
        return status;
    }

    public void setStatus(StatusEntity status) {
        this.status = status;
    }
}
