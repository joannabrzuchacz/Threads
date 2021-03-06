package Game;


import Game.actors.Actor;
import Game.actors.Flag;
import Game.actors.Player;
import Game.util.Direction;
import Game.util.Vector;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static Game.util.GameUtils.toVector;


/**
 * GameMap class
 */
public class GameMap {

    /**
     * A 2D matrix of all actor references (null if the field is empty)
     */
    private final Actor[][] actorMatrix;

    /**
     * Contains all players present on the map (also dead ones)
     */
    private final List<Player> players;

    /**
     * Contains all players present on the map (also captured ones)
     */
    private final List<Flag> flags;


    /**
     * Returns a new GameMap instance, constructed from given char matrix
     */
    public GameMap(String charMatrix) {


        throw new RuntimeException("Method not implemented!");
    }

    /**
     * Returns a char matrix of map's current state
     *
     * @return
     */
    @Override
    public String toString() {
        throw new RuntimeException("Method not implemented!");
    }

    /**
     * Returns an actor instance present on given position
     * Should return null if no actor is present
     * Should throw an IllegalArgumentException if the position is outside map's boundaries
     *
     * @param position
     * @return
     */
    public Actor getActor(Vector position) {
        throw new RuntimeException("Method not implemented!");
    }

    /**
     * Returns a position of given actor instance
     * Should throw an IllegalArgumentException if actor is not found or no actor is given
     *
     * @param actor
     * @return
     */
    public Vector getPosition(Actor actor) {
        throw new RuntimeException("Method not implemented!");
    }

    /**
     * Assignes given actor to given position
     * Should throw an IllegalArgumentException if the position is occupied by an another actor
     *
     * @param actor
     * @param position
     */
    public void setPosition(Actor actor, Vector position) {
        throw new RuntimeException("Method not implemented!");
    }

    /**
     * Attempts to move given player to a new position
     * If necessary, restricts movement or simulates fights between players
     *
     * @param player
     * @param currentPosition
     * @param dir
     */
    public void tryMovePlayer(Player player, Vector currentPosition, Direction dir) {
        Vector dirVector = toVector(dir);
        Vector targetPosition = new Vector(currentPosition.getX() + dirVector.getX(), currentPosition.getY() + dirVector.getY());

        if (!withinBoundaries(targetPosition))
            return;

        Actor actorOnTargetPosition = getActor(targetPosition);

        if (actorOnTargetPosition == null) {
            actorMatrix[currentPosition.getY()][currentPosition.getX()] = null;
            setPosition(player, targetPosition);
        } else if (actorOnTargetPosition instanceof Flag) {
            actorMatrix[currentPosition.getY()][currentPosition.getX()] = null;
            actorMatrix[targetPosition.getY()][targetPosition.getX()] = null;
            setPosition(player, targetPosition);

            player.setCapturedFlags(player.getCapturedFlags() + 1);
            ((Flag) actorOnTargetPosition).setCaptured(true);
        } else if (actorOnTargetPosition instanceof Player) {
            Player otherPlayer = (Player) actorOnTargetPosition;
            int fightResult = player.Fight(otherPlayer);

            if (fightResult == 1) {
                // Player has won, move to the target position
                otherPlayer.setAlive(false);
                actorMatrix[currentPosition.getY()][currentPosition.getX()] = null;
                actorMatrix[targetPosition.getY()][targetPosition.getX()] = null;
                setPosition(player, targetPosition);

                player.setKilledPlayers(player.getKilledPlayers() + 1);
            } else if (fightResult == 0) {
                // Other player has won
                player.setAlive(false);
                actorMatrix[currentPosition.getY()][currentPosition.getX()] = null;
                actorMatrix[targetPosition.getY()][targetPosition.getX()] = null;
                setPosition(otherPlayer, currentPosition);

                otherPlayer.setKilledPlayers(otherPlayer.getKilledPlayers() + 1);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Returns the position of an uncaptured flag that is closest to given player
     * Should throw IllegalArgumentException if there are no uncaptured flags
     *
     * @param player
     * @return
     */
    public Vector getNearestFlagPosition(Player player) {
        throw new IllegalArgumentException();
    }

    /**
     * Returns true if given position is within the map's boundaries
     *
     * @param position
     * @return
     */
    public boolean withinBoundaries(Vector position) {
        throw new RuntimeException("Method not implemented!");
    }

    public Actor[][] getActorMatrix() {
        return actorMatrix;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Flag> getFlags() {
        return flags;
    }
}
