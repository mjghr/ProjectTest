package model;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public abstract class AppModel {
    private String id;
    private String createdAt;

    public AppModel() {
        this.id = UUID.randomUUID().toString();
        this.createdAt = new Date().toString();
    }
}
