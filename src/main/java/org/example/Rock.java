package org.example;

public class Rock extends BaseObstacle{

    public Rock(int X, int Y, String texture, int hp) {
        super(X, Y, texture);
    }

    @Override
    public String getHitted(){
        return "The hit in the rock hurts the player";
    }
}
