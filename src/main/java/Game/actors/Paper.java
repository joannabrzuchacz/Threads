package Game.actors;

import Game.GameMap;
import Game.util.Direction;
import Game.util.Vector;


public class Paper extends Player {

    public String name;
    public  int result;

    public int getResult() {
        return result;
    }

    public Paper(String name, GameMap mapReference) {
        super(name, mapReference);
    }


    @Override
    public void onGameCycle() {
        if (!isAlive())
            return;

        // Make next move
        Vector myPosition = mapReference.getPosition(this);
        Vector nearestFlagPosition = mapReference.getNearestFlagPosition(this);
        Direction targetDirection = getMoveDirection(myPosition, nearestFlagPosition);

        mapReference.tryMovePlayer(this, myPosition, targetDirection);
    }

    @Override
    public int Fight(Player otherPlayer) {
        if(otherPlayer instanceof Paper){
            return  -1;
        }else if(otherPlayer instanceof Scissors){
            return  0;
        }else{
            return 1;
        }
    }

    @Override
    public PlayerTeam getTeam() {
        return PlayerTeam.PAPER;
    }
}
