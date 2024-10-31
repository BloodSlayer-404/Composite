package org.example;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@NoArgsConstructor
public class CompoundObstacle extends BaseObstacle{

    protected List<Obstacle> obstacles = new ArrayList<>();

    public CompoundObstacle(Obstacle[] obstacles) {
        super(0, 0, "");
        add(obstacles);
    }

    /**
     * Adds an Obstacle to the Compound Obstacle
     * @param obstacle: The obstacle to be added to the Compound Obstacle
     */
    public void add(Obstacle obstacle){
        this.obstacles.add(obstacle);
    }

    /**
     * Adds all the Obstacles of an array to the Compound Obstacle
     * @param obstacles: An array of obstacles to be added to the Compound Obstacle
     */
    public void add(Obstacle[] obstacles){
        this.obstacles.addAll(Arrays.asList(obstacles) );
    }

    /**
     * Removes an Obstacle from the Compound Obstacle
     * @param obstacle: The obstacle to be added to the Compound Obstacle
     */
    public void remove(Obstacle obstacle) {
        this.obstacles.remove(obstacle);
    }

    /**
     * Removes all the Obstacles of an array from the Compound Obstacle
     * @param obstacles: An array of obstacles to be added to the Compound Obstacle
     */
    public void remove(Obstacle[] obstacles) {
        this.obstacles.removeAll(Arrays.asList(obstacles));
    }

    /**
     * Removes all the Obstacles from the Compound Obstacle
     */
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
