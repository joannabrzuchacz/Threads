package Game.actors;

import Game.GameMap;

public class Flag extends Actor{

    GameMap mapReference;

    public Flag(GameMap mapReference) {
        super(mapReference);
        this.mapReference = mapReference;
    }

    public static boolean isCaptured(Flag flag) {


        return true;
    }

    public void setCaptured(boolean b) {

    }
}
