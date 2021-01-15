package Game.util;


import Game.actors.*;

import static java.lang.StrictMath.abs;

public class GameUtils {

    /**
     * Returns a character representing given actor
     * Throws an IllegalArgumentException when given invalid input
     *
     * @param actor
     * @return
     */
    public static char getChar(Actor actor) {
        if(actor instanceof Paper){
            return 'P';
        }
        else if(actor instanceof Rock){
            return 'R';
        }
        else if(actor instanceof Scissors){
            return 'S';
        }
        else if(actor instanceof Flag){
            return 'F';
        }else if(actor == null){
            return '.';
        }else{
            throw new IllegalArgumentException();
        }
    }


    /**
     * Returns a vector representing given direction
     * Throws an IllegalArgumentException when given invalid input
     *
     * @param dir
     * @return
     */
    public static Vector toVector(Direction dir) {
        int x;
        int y;

        if(dir == Direction.DOWN){
            x = 0;
            y = 1;

        }else if(dir == Direction.UP){
            x = 0;
            y = -1;


        }else if(dir == Direction.RIGHT){
            x = 1;
            y = 0;


        }else if(dir == Direction.LEFT){
            x = -1;
            y = 0;

        }else{
            throw new IllegalArgumentException();
        }
        return new Vector(x, y);
    }

    /**
     * Returns a direction converted from given vector
     * Throws an IllegalArgumentException when given invalid input
     *
     * @param vector
     * @return
     */
    public static Direction toDirection(Vector vector) {

        if (vector.getX() == 0 && vector.getY() == -1)
            return Direction.UP;

        if (vector.getX() == 0 && vector.getY() == 1)
            return Direction.DOWN;

        if (vector.getX() == -1 && vector.getY() == 0)
            return Direction.LEFT;

        if (vector.getX() == 1 && vector.getY() == 0)
            return Direction.RIGHT;

        throw new IllegalArgumentException();
    }

    /**
     * Returns a direction that is opposite to given direction
     * Throws an ArgumentOutOfRangeException when given invalid input
     *
     * @param dir
     * @return
     */
    public static Direction inverted(Direction dir) {

        Direction invertedDirection = null;
        switch(dir){
            case LEFT:
                invertedDirection =  Direction.RIGHT;
                break;

            case RIGHT:
                invertedDirection =  Direction.LEFT;
                break;

            case UP:
                invertedDirection = Direction.DOWN;
                break;

            case DOWN:
                invertedDirection = Direction.UP;
                break;

        }

        return invertedDirection;


    }

    /**
     * Returns the amount of steps a player has to make in order to get from pos1 to pos2
     *
     * @param pos1
     * @param pos2
     * @return
     */
    public static int getDistance(Vector pos1, Vector pos2) {
        int tempX = abs(pos1.getX() - pos2.getX());
        int tempY = abs(pos1.getY() - pos2.getY());

        return tempX + tempY;


    }
}
