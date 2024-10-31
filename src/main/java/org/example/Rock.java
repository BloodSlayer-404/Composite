package org.example;

public class Rock extends BaseObstacle{

    public Rock(int X, int Y, String texture) {
        super(X, Y, texture);
    }


    /**
     *
     * @return "The hit in the rock hurts the player"
     */
    @Override
    public String getHitted(){
        return "The hit in the rock hurts the player";
    }
}
