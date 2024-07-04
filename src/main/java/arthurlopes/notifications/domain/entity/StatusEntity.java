package arthurlopes.notifications.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "status")
public class StatusEntity {

    public StatusEntity() {
    }

    public StatusEntity(Long statusId, String description) {
        this.statusId = statusId;
        this.description = description;
    }

    @Id
    private Long statusId;

    private String description;

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
