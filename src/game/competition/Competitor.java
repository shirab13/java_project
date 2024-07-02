package game.competition;

import game.entities.MobileEntity;
import utilities.Point;

public abstract class Competitor extends MobileEntity {
    public Competitor(double maxSpeed, double acceleration) {
        super(maxSpeed, acceleration);
    }

    public void initRace(Point start) {
        this.location = start;
        this.speed = 0;
    }

    @Override
    public abstract void move(double friction);
}
