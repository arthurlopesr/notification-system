package arthurlopes.notifications.domain.enums;

import arthurlopes.notifications.domain.entity.ChannelEntity;
import arthurlopes.notifications.domain.entity.StatusEntity;

public enum StatusEnum {
    PENDING(1L, "pending"),
    SUCCESS(2L, "success"),
    ERROR(3L, "error"),
    CANCELED(4L, "canceled");

    private Long id;

    private String description;

    StatusEnum(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public StatusEntity toStatus() {
        return new StatusEntity(id, description);
    }
}
