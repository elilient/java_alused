import java.util.Scanner;
import nhlstats.NHLStatistics;



public class Example {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("Top ten by goals");
        System.out.print("\n");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.print("\n");
        System.out.println("Top 25 by penalties");
        System.out.print("\n");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.print("\n");
        System.out.print("Sidney Crosby stats: \n");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.print("\n");
        System.out.println("Team statistics for Philadelphia Flyers: \n");
        NHLStatistics.teamStatistics("PHI");
        System.out.print("\n");
        System.out.println("Team statistics for Anaheim Ducks: \n");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
    }
}
