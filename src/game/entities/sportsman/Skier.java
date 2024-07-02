package game.entities.sportsman;

import game.enums.Discipline;
import game.enums.Gender;
import game.enums.League;

public class Skier extends WinterSportsman {

    public Skier(String name, int age, Gender gender, double maxSpeed, double acceleration, Discipline discipline) {
        super(name, age, gender, maxSpeed, acceleration, discipline);
    }

    @Override
    public void move(double friction) {
        double accelerationWithBonus = getAcceleration() + League.calcAccelerationBonus(getAge());
        double newSpeed = Math.min(getSpeed() + accelerationWithBonus * friction, getMaxSpeed());
        getLocation().setX(getLocation().getX() + newSpeed);
        setSpeed(newSpeed);
    }

    @Override
    public String toString() {
        return "Skier{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", discipline=" + discipline +
                ", league=" + league +
                ", maxSpeed=" + maxSpeed +
                ", acceleration=" + acceleration +
                ", speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Skier skier = (Skier) o;

        if (age != skier.age) return false;
        if (Double.compare(skier.maxSpeed, maxSpeed) != 0) return false;
        if (Double.compare(skier.acceleration, acceleration) != 0) return false;
        if (Double.compare(skier.speed, speed) != 0) return false;
        if (!name.equals(skier.name)) return false;
        if (gender != skier.gender) return false;
        if (discipline != skier.discipline) return false;
        return league == skier.league;
    }
}
