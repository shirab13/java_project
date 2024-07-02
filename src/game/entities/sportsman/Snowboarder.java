package game.entities.sportsman;

import game.enums.Discipline;
import game.enums.Gender;
import game.enums.League;

public class Snowboarder extends WinterSportsman {

    public Snowboarder(String name, int age, Gender gender, double maxSpeed, double acceleration, Discipline discipline) {
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
        return "Snowboarder{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", discipline=" + getDiscipline() +
                ", league=" + getLeague() +
                ", maxSpeed=" + getMaxSpeed() +
                ", acceleration=" + getAcceleration() +
                ", speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Snowboarder that = (Snowboarder) o;

        if (age != that.age) return false;
        if (Double.compare(that.maxSpeed, maxSpeed) != 0) return false;
        if (Double.compare(that.acceleration, acceleration) != 0) return false;
        if (Double.compare(that.speed, speed) != 0) return false;
        if (!name.equals(that.name)) return false;
        if (gender != that.gender) return false;
        if (discipline != that.discipline) return false;
        return league == that.league;
    }
}
