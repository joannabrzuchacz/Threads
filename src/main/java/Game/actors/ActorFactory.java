package Game.actors;

import Game.GameMap;
import Game.actors.Paper;

public class ActorFactory extends Actor {

    public static String name;

    public ActorFactory(GameMap mapReference) {
        super(mapReference);
    }


    public static String getName() {
        return name;
    }

    public static Actor createPlayer(Player.PlayerTeam team, GameMap mapReference){
        Actor newPlayer = null;
        String name = getName();

        switch (team){
            case PAPER:
                newPlayer = new Paper(name, mapReference);
                break;
            case ROCK:
                newPlayer = new Rock(name, mapReference);
                break;
            case SCISSORS:
                newPlayer = new Scissors(name, mapReference);
                break;

        }
        return newPlayer;

    }

    public static Actor createFlag(GameMap mapReference){
        Actor newFlag = new Flag(mapReference);
        return  newFlag;
    }

    public static Actor createFromChar(char c, GameMap mapReference){
        Actor newPlayer = null;
        String name = getName();

        switch (String.valueOf(c)){
            case "R":
                newPlayer = new Rock(name, mapReference);
                break;
            case "S":
                newPlayer = new Scissors(name, mapReference);
                break;
            case "P":
                newPlayer = new Paper(name, mapReference);
                break;
        }
        return newPlayer;
    }
}

