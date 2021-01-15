package Game;


import Game.actors.Player;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import java.util.*;


/**
 * Static class with extension methods for reports about players' performance during the game
 */
public class Scoreboard {


    /**
     * Returns a collection of all players, sorted by their score (from highest to lowest)
     *
     * @param players
     * @return
     */
    public static List<Player> getRankedPlayers(List<Player> players) {
        Comparator<Player> playerComparator = new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return o2.getCurrentScore() - o1.getCurrentScore();
            }
        };
        players.sort(playerComparator);
        return players;
    }

    /**
     * Returns a collection of all players, from given team, sorted by their score (from highest to lowest)
     *
     * @param players
     * @param team
     * @return
     */
    public static List<Player> getRankedPlayersInTeam(List<Player> players, Player.PlayerTeam team) {
        List<Player> choosenTeam = players.stream()
                .filter(player -> player.getTeam() == team)
                .collect(Collectors.toList());


        Comparator<Player> playerComparator = new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return o2.getCurrentScore() - o1.getCurrentScore();
            }
        };
        choosenTeam.sort(playerComparator);
        return choosenTeam;

    }

    /**
     * Returns the team that has the greatest amount of points scored by its players
     *
     * @param players
     * @return
     */
    public static Player.PlayerTeam getWinningTeam(List<Player> players) {
        int sumForPaper = players.stream()
                .filter(player -> player.getTeam() == Player.PlayerTeam.PAPER)
                .mapToInt(Player::getCurrentScore)
                .sum();

        int sumForRock = players.stream()
                .filter(player -> player.getTeam() == Player.PlayerTeam.ROCK)
                .mapToInt(Player::getCurrentScore)
                .sum();

        int sumForScissors = players.stream()
                .filter(player -> player.getTeam() == Player.PlayerTeam.SCISSORS)
                .mapToInt(Player::getCurrentScore)
                .sum();

        Map<Player.PlayerTeam, Integer> finalList = new HashMap<>();
        finalList.put(Player.PlayerTeam.PAPER, sumForPaper);
        finalList.put(Player.PlayerTeam.ROCK, sumForRock);
        finalList.put(Player.PlayerTeam.SCISSORS, sumForScissors);

        int max = Collections.max(finalList.values());

        List<Player.PlayerTeam> collect = finalList.entrySet().stream()
                .filter(entry -> entry.getValue() == max)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        Player.PlayerTeam winningTeam  = collect.get(0);

        return winningTeam;

    }


    /**
     * Returns amount of dead players
     *
     * @param players
     * @return
     */

    public static int getDeadPlayersAmount(List<Player> players) {
        long count = players.stream()
                .filter(player -> !player.isAlive())
                .count();

        int result = (int) count;

        return result;

    }

    /**
     * Returns full scoreboard string for current game (see the example)
     *
     * @param players
     * @return
     */
    public static String getScoreboard(List<Player> players) {
        // Team Rock Adam Points: 20
        // Team Paper Eve Points: 10
        // Team Scissors Abel Points: 5 DEAD

        throw new RuntimeException("Method not implemented!");
    }

}
