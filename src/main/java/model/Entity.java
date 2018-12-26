package model;

import java.util.UUID;

public class Entity {
    private UUID uuid;

    public Entity(UUID uuid) {
        this.uuid = uuid;
    }

    public Entity() {
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public static Entity createNewUUIDEntity() {
        Entity uuidEntity = new Entity();
        uuidEntity.uuid = UUID.randomUUID();
        return uuidEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entity that = (Entity) o;

        return uuid != null ? uuid.equals(that.uuid) : that.uuid == null;
    }

    @Override
    public int hashCode() {
        return uuid != null ? uuid.hashCode() : 0;
    }
}
