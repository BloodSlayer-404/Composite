package org.example;

public interface Obstacle {

    /**
     * Gets the X coordinate of the obstacle
     * @return The X coordinate of the obstacle
     */
    int getX();

    /**
     * Gets the Y coordinate of the obstacle
     * @return The Y coordinate of the obstacle
     */
    int getY();

    /**
     * Gets the texture of the obstacle
     * @return The path of the texture of the obstacle
     */
    String getTexture();

    /**
     * Gets the text of an action for when someone hits the obstacle
     * @return The action that succeed when someone hits the obstacle
     */
    String getHitted();

}
