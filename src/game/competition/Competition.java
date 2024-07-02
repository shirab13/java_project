package game.competition;

import game.arena.IArena;
import game.entities.IMobileEntity;
import game.entities.sportsman.WinterSportsman;
import java.util.ArrayList;

public abstract class Competition {
    private final IArena arena;
    private final int maxCompetitors;
    private final ArrayList<Competitor> activeCompetitors;
    private final ArrayList<Competitor> finishedCompetitors;

    public Competition(IArena arena, int maxCompetitors) {
        this.arena = arena;
        this.maxCompetitors = maxCompetitors;
        this.activeCompetitors = new ArrayList<>();
        this.finishedCompetitors = new ArrayList<>();
    }

    public boolean isValidCompetitor(Competitor competitor) {
        return competitor instanceof WinterSportsman;
    }

    public void addCompetitor(Competitor competitor) {
        if (activeCompetitors.size() >= maxCompetitors) {
            throw new IllegalStateException("Competition is full");
        }
        if (!isValidCompetitor(competitor)) {
            throw new IllegalArgumentException("Invalid competitor");
        }
        activeCompetitors.add(competitor);
    }

    public void playTurn() {
        ArrayList<Competitor> toRemove = new ArrayList<>();
        for (Competitor competitor : activeCompetitors) {
            competitor.move(arena.getFriction());
            if (arena.isFinished(competitor)) {
                finishedCompetitors.add(competitor);
                toRemove.add(competitor);
            }
        }
        activeCompetitors.removeAll(toRemove);
    }

    public boolean hasActiveCompetitors() {
        return !activeCompetitors.isEmpty();
    }

    public ArrayList<Competitor> getFinishedCompetitors() {
        return finishedCompetitors;
    }

}
