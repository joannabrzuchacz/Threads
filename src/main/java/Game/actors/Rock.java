package Game.actors;

import Game.GameMap;

public class Rock extends Player {


    public String name;

    public Rock(String name, GameMap mapReference) {
        super(name, mapReference);
    }


    @Override
    public int Fight(Player otherPlayer) {
        if(otherPlayer instanceof  Paper){
            return  -1;
        }else if(otherPlayer instanceof Scissors){
            return  0;
        }else{
            return 1;
        }
    }

    @Override
    public PlayerTeam getTeam() {
        return null;
    }

    @Override
    public void onGameCycle() {

    }


    public int getResult() {
        return 0;
    }
}
