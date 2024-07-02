package game.competition;

import game.arena.IArena;
import game.entities.sportsman.Snowboarder;
import game.enums.Discipline;
import game.enums.Gender;
import game.enums.League;

public class SnowboardCompetition extends WinterCompetition {
    public SnowboardCompetition(IArena arena, int maxCompetitors, Discipline discipline, League league, Gender gender) {
        super(arena, maxCompetitors, discipline, league, gender);
    }

    @Override
    public boolean isValidCompetitor(Competitor competitor) {
        return (competitor instanceof Snowboarder) && super.isValidCompetitor(competitor);
    }

    @Override
    public String toString() {
        return "SnowboardCompetition{" +
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

        SnowboardCompetition that = (SnowboardCompetition) o;

        if (getDiscipline() != that.getDiscipline()) return false;
        if (getLeague() != that.getLeague()) return false;
        return getGender() == that.getGender();
    }
}
