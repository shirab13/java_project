package game.competition;

import game.arena.IArena;
import game.enums.Discipline;
import game.enums.Gender;
import game.enums.League;

public class SkiCompetition extends WinterCompetition {
    public SkiCompetition(IArena arena, int maxCompetitors, Discipline discipline, League league, Gender gender) {
        super(arena, maxCompetitors, discipline, league, gender);
    }

    @Override
    public String toString() {
        return "SkiCompetition{" +
                "discipline=" + getDiscipline() +
                ", league=" + getLeague() +
                ", gender=" + getGender() +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SkiCompetition that = (SkiCompetition) o;

        if (getDiscipline() != that.getDiscipline()) return false;
        if (getLeague() != that.getLeague()) return false;
        return getGender() == that.getGender();
    }
}
