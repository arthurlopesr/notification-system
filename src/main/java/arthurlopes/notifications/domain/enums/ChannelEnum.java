package arthurlopes.notifications.domain.enums;

import arthurlopes.notifications.domain.entity.ChannelEntity;

public enum ChannelEnum {
    EMAIL(1L, "email"),
    SMS(2L, "sms"),
    PUSH(3L, "push"),
    WHATSAPP(4L, "whatsapp");

    private Long id;

    private String description;

    ChannelEnum(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public ChannelEntity toChannel() {
        return new ChannelEntity(id, description);
    }
}
