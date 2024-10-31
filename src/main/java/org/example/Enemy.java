package org.example;

import lombok.Getter;

public class Enemy extends BaseObstacle{

    @Getter private int hp;

    public Enemy(int X, int Y, String texture, int hp) {
        super(X, Y, texture);
        this.hp =  hp;
    }

    /**
     * The enemy lose 1 HP dou to the hit
     * @return "The enemy lose HP due to the hit"
     */
    @Override
    public String getHitted(){
        hp -= 1;
        return "The enemy lose HP due to the hit";
    }
}
