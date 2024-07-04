package arthurlopes.notifications.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "channel")
public class ChannelEntity {

    public ChannelEntity() {
    }

    public ChannelEntity(Long channelId, String description) {
        this.channelId = channelId;
        this.description = description;
    }

    @Id
    private Long channelId;

    private String description;

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
