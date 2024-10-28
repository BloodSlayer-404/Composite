package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundObstacle extends BaseObstacle{

    protected List<Obstacle> obstacles = new ArrayList<>();

    public CompoundObstacle(Obstacle[] obstacles) {
        super(0, 0, "");
        add(obstacles);
    }

    public void add(Obstacle obstacle){
        this.obstacles.add(obstacle);
    }

    public void add(Obstacle[] obstacles){
        this.obstacles.addAll(Arrays.asList(obstacles) );
    }

    public void remove(Obstacle obstacle) {
        this.obstacles.remove(obstacle);
    }

    public void remove(Obstacle[] obstacles) {
        this.obstacles.removeAll(Arrays.asList(obstacles));
    }

    public void clear() {
        obstacles.clear();
    }

    @Override
    public int getX() {
        if (obstacles.isEmpty()) {
            return 0;
        }
        int x = obstacles.getFirst().getX();
        for (Obstacle obstacle : obstacles) {
            if (obstacle.getX() < x) {
                x = obstacle.getX();
            }
        }
        return x;
    }

    @Override
    public int getY() {
        if (obstacles.isEmpty()) {
            return 0;
        }
        int y = obstacles.getFirst().getY();
        for (Obstacle obstacle : obstacles) {
            if (obstacle.getY() < y) {
                y = obstacle.getY();
            }
        }
        return y;
    }
}
