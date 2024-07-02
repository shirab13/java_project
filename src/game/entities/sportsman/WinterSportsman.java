package game.entities.sportsman;

import game.enums.Discipline;
import game.enums.League;
import game.enums.Gender;

public class WinterSportsman extends Sportsman {
    private Discipline discipline;
    private League league;

    public WinterSportsman(String name, double age, Gender gender, Discipline discipline, League league, double maxSpeed, double acceleration) {
        super(name, age, gender, maxSpeed, acceleration);
        this.discipline = discipline;
        this.league = league;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public League getLeague() {
        return league;
    }

    @Override
    public String toString() {
        return "WinterSportsman{" +
                "discipline=" + discipline +
                ", league=" + league +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        WinterSportsman that = (WinterSportsman) o;

        if (discipline != that.discipline) return false;
        return league == that.league;
    }
}
