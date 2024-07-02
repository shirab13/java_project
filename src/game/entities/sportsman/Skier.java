package game.entities.sportsman;

import game.enums.Discipline;
import game.enums.Gender;
import game.enums.League;

public class Skier extends WinterSportsman {
//    String name, double age, Gender gender, Discipline discipline, League league, double maxSpeed, double acceleration
    public Skier(String name, int age, Gender gender, double maxSpeed, double acceleration, Discipline discipline) {
        super(name, age, gender, discipline, League.ADULT /* TODO CHANGE FROM STATIC ADULT TO DYNAMIC*/, maxSpeed, acceleration);
    }

    @Override
    public void move(double friction) {
        double accelerationWithBonus = getAcceleration() + League.calcAccelerationBonus(getAge());
        double newSpeed = Math.min(getSpeed() + accelerationWithBonus * friction, getMaxSpeed());
        getLocation().setX(getLocation().getX() + newSpeed);
        setSpeed(newSpeed);
    }

    /*TODO MAYBE DELETE*/
    private void setSpeed(double newSpeed) {
    }

    @Override
    public String toString() {
        String age;
        return "Skier{" +
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

        Skier skier = (Skier) o;


        if (getAge() != skier.getAge()) return false;
        if (Double.compare(skier.getMaxSpeed(), getMaxSpeed()) != 0) return false;
        if (Double.compare(skier.getAcceleration(), getAcceleration()) != 0) return false;
        if (Double.compare(skier.speed, speed) != 0) return false;
        if (!getName().equals(skier.getName())) return false;
        if (getGender() != skier.getGender()) return false;
        if (getDiscipline() != skier.getDiscipline()) return false;
        return getLeague() == skier.getLeague();
    }
}
