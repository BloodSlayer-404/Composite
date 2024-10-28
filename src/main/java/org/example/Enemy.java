package org.example;

public class Enemy extends BaseObstacle{

    private int hp;

    public Enemy(int X, int Y, String texture, int hp) {
        super(X, Y, texture);
        this.hp =  hp;
    }

    @Override
    public String getHitted(){
        hp -= 1;
        return "The enemy lose HP due to the hit";
    }
}
