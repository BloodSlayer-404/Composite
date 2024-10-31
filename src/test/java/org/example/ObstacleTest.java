package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObstacleTest {

    Rock rock = new Rock(54, 97, "rock.png");
    Tree tree = new Tree(48, 100, "tree.png");
    Enemy enemy = new Enemy(72, 63, "redPesto.png", 10);

    /**
     * Check that all the methods in the Rock class works properly
     */
    @Test
    void rockTest(){
        assertEquals(54, rock.getX());
        assertEquals(97, rock.getY());
        assertEquals("rock.png", rock.getTexture());
        assertEquals("The hit in the rock hurts the player", rock.getHitted());
    }

    /**
     * Check that all the methods in the Tree class works properly
     */
    @Test
    void treeTest(){
        assertEquals(48, tree.getX());
        assertEquals(100, tree.getY());
        assertEquals("tree.png", tree.getTexture());
        assertEquals("The hit don't affect the tree", tree.getHitted());
    }

    /**
     * Check that all the methods in the Enemy class works properly
     */
    @Test
    void enemyTest(){
        assertEquals(72, enemy.getX());
        assertEquals(63, enemy.getY());
        assertEquals("redPesto.png", enemy.getTexture());
        assertEquals(10, enemy.getHp());
        assertEquals("The enemy lose HP due to the hit", enemy.getHitted());
        assertEquals(9, enemy.getHp());
    }

    /**
     * Check that all the methods in the Compound Obstacle class works properly
     */
    @Test
    void compoundObstacleTest(){
        Obstacle obstacles[] = {enemy, rock, tree};
        CompoundObstacle compoundObstacle = new CompoundObstacle();

        assertEquals(0, compoundObstacle.getX());
        assertEquals(0, compoundObstacle.getY());

        compoundObstacle.add(enemy);
        compoundObstacle.add(rock);

        assertEquals(54, compoundObstacle.getX());
        assertEquals(63, compoundObstacle.getY());

        compoundObstacle.remove(enemy);

        assertEquals(54, compoundObstacle.getX());
        assertEquals(97, compoundObstacle.getY());

        compoundObstacle.clear();

        assertEquals(0, compoundObstacle.getX());
        assertEquals(0, compoundObstacle.getY());

        compoundObstacle.add(obstacles);

        assertEquals(48, compoundObstacle.getX());
        assertEquals(63, compoundObstacle.getY());

        Enemy enemy1 = new Enemy(100,54, "acroBandit.png", 15);
        compoundObstacle.add(enemy1);
        compoundObstacle.remove(obstacles);

        assertEquals(100, compoundObstacle.getX());
        assertEquals(54, compoundObstacle.getY());
    }
}