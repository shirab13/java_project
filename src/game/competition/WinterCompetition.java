package game.competition;

import game.arena.IArena;
import game.entities.sportsman.WinterSportsman;
import game.enums.Discipline;
import game.enums.Gender;
import game.enums.League;

public class WinterCompetition extends Competition {
    private Discipline discipline;
    private League league;
    private Gender gender;

    public WinterCompetition(IArena arena, int maxCompetitors, Discipline discipline, League league, Gender gender) {
        super(arena, maxCompetitors);
        this.discipline = discipline;
        this.league = league;
        this.gender = gender;
    }

    @Override
    public boolean isValidCompetitor(Competitor competitor) {
        if (!(competitor instanceof WinterSportsman)) {
            return false;
        }
        WinterSportsman sportsman = (WinterSportsman) competitor;
        return sportsman.getDiscipline() == discipline && sportsman.getLeague() == league && sportsman.getGender() == gender;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public League getLeague() {
        return league;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "WinterCompetition{" +
                "discipline=" + discipline +
                ", league=" + league +
                ", gender=" + gender +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        WinterCompetition that = (WinterCompetition) o;

        if (discipline != that.discipline) return false;
        if (league != that.league) return false;
        return gender == that.gender;
    }
}
