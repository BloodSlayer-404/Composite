package org.example;

public class Tree extends BaseObstacle{

    public Tree(int X, int Y, String texture, int hp) {
        super(X, Y, texture);
    }

    @Override
    public String getHitted(){
        return "The hit don't affect the tree";
    }
}
