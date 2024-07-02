package game.entities.sportsman;
import game.competition.Competitor;
import game.enums.Discipline;
import game.enums.Gender;
import game.enums.League;
import game.entities.MobileEntity;

public class Sportsman extends Competitor {
    private String name;
    private double age;
    private Gender gender;

    public Sportsman(String name, double age, Gender gender, double maxSpeed, double acceleration) {
        super(maxSpeed, acceleration);
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Sportsman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Sportsman sportsman = (Sportsman) o;

        if (Double.compare(sportsman.age, age) != 0) return false;
        if (!name.equals(sportsman.name)) return false;
        return gender == sportsman.gender;
    }

    @Override
    public void move(double friction) {

    }
}
