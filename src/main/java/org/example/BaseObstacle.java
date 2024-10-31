package org.example;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class BaseObstacle implements Obstacle{
    private int X;
    private int Y;
    private String texture;


    @Override
    public int getX() {
        return X;
    }

    @Override
    public int getY() {
        return Y;
    }

    @Override
    public String getTexture() {
        return texture;
    }

    /**
     *
     * @return "The obstacle gets a hit"
     */
    @Override
    public String getHitted() {
        return "The obstacle gets a hit";
    }
}
