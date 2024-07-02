package game.entities;

import game.enums.Gender;

public abstract class MobileEntity extends Entity implements IMobileEntity {
    private double maxSpeed;
    private double acceleration;
    protected double speed;

    public MobileEntity(double maxSpeed, double acceleration) {
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.speed = 0; // Initial speed
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public void move(double friction) {
        // Implement the logic for movement based on friction
    }

    @Override
    public String toString() {
        return "MobileEntity{" +
                "maxSpeed=" + maxSpeed +
                ", acceleration=" + acceleration +
                ", speed=" + speed +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MobileEntity that = (MobileEntity) o;

        if (Double.compare(that.maxSpeed, maxSpeed) != 0) return false;
        if (Double.compare(that.acceleration, acceleration) != 0) return false;
        return Double.compare(that.speed, speed) == 0;
    }
}
