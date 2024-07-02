package game;

import game.competition.Competition;

public class GameEngine {
    private static GameEngine instance;

    private GameEngine() {
        // Private constructor to prevent instantiation
    }

    public static GameEngine getInstance() {
        if (instance == null) {
            instance = new GameEngine();
        }
        return instance;
    }

    public void startRace(Competition competition) {
        while (competition.hasActiveCompetitors()) {
            competition.playTurn();
        }
    }
}
