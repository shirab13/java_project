package game.entities;

import utilities.Point;

public abstract class Entity {
    protected Point location;

    public Entity() {
        this.location = new Point(0, 0);
    }

    public Entity(Point location) {
        this.location = location;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "location=" + location +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entity entity = (Entity) o;

        return location.equals(entity.location);
    }
}
