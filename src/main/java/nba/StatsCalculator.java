package nba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class StatsCalculator {

    /**
     * StatsCalculator turi tureti sias funkcijas (atitinkacias uzduotis)
     * Compare stats of 2 given teams. Eg. TeamA Has 15.2 more ppg than TeamB, TeamA has 2.6 more apg than TeamB, etc..
     * Print out stats of given list of teams.
     * Find team with most points per game of given team list.
     * Find best player in every team. Input list of teams.
     * Find best player in ONE given team.
     * Comapre two given player stats.
     * Find most experienced coach in given team list
     * Find most winning team by given team list
     * Find Most loosing team by given team list.
     * Sort all of the players by ppg (points per game) Given list of teams.
     * BONUS: Cover StatsCalculator with unit tests.
     */

    public void compareTwoTeams(Team teamA, Team teamB) {
        if (teamA.getPpg() > teamB.getPpg()) {
            System.out.println(teamA.getName() + "Turi daugiau tasku" + (teamA.getPpg() - teamB.getPpg()) + "negu" + teamB.getName());
        } else {
            System.out.println(teamB.getName() + "Turi daugiau tasku" + (teamB.getPpg() - teamA.getPpg()) + "negu" + teamA.getName());
        }
        ;
    }

    public void printStats(List<Team> teams) {
        for (Team team : teams) {
            System.out.println(team);
        }
    }

    public void maxPoints(List<Team> teams) {
        Collections.sort(teams);
        System.out.println(teams);
    }

    public void maxPlayerPoints(List<Team> teams) {
        for (Team team : teams) {
            Player player = Collections.max(team.getPlayers());
            System.out.println(player);

        }

    }


}
