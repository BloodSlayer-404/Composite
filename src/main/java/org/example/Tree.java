package org.example;

public class Tree extends BaseObstacle{

    public Tree(int X, int Y, String texture) {
        super(X, Y, texture);
    }

    /**
     *
     * @return "The hit don't affect the tree"
     */
    @Override
    public String getHitted(){
        return "The hit don't affect the tree";
    }
}
