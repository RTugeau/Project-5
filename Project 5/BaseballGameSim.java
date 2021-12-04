import java.util.Random;
import java.lang.*;
import java.util.Scanner;
/**
 * The class BaseballGameSim holds the main and runs the program.
 *
 * @author (Riley Tugeau)
 * @version (12/3/2021)
 */
public class BaseballGameSim
{
    /**
     * The main for BaseballGameSim. Program starts by printing instructions for how to follow along and score the game. The program then asks the user
     *  for the Team Names (Stored in Teams). The simulation begins after the Team Names are correctly entered by simulating the first half-inning
     *  (Top of the 1st inning). The user will trace through the play-by-play generated by the simulator to calculate the number of runs the batting 
     *  team scored in the given inning. The entered score is saved under the awayRuns/homeRuns variables and is stored in the Teams class. Once a score
     *  is entered, the next half-inning simulates and a new play-by-play inning is printed. Between half innings (2 full half-innings), the simulator
     *  will print the current score so the user can track the score throughout the game. It prints the Away Team Runs, Away Team Hits, and Errors(will 
     *  always be Zero since errors have not been added to the simulator yet), followed by the same information for the Home Team (Runs, Hits, Errors).
     *  This cycle continues until the simulator reaches the final inning (Bottom of the 9th inning). Once the game is complete, the simulator will print
     *  the final score based on which team scored the most points throughout the 9 simulated innings. 
     */
    public static void main(String[] args) {
        boolean playBall = true;
        Scanner scan = new Scanner(System.in);
        String start = "";
        
        System.out.println("Welcome to Riley's Interactive Baseball Game Simulator!");
        System.out.println("How to play: As each inning simulates, you will keep track of the score as the play-by-play is simulated.");
        System.out.println("The simulator will take care of the rest, and the final score will be revealed after 9 innings of play.");
        System.out.println("---------------------------------------------");
        System.out.println("Scoring Key: ");
        System.out.println("Single - Batter advances to 1st Base. All baserunners advance 1 base.");
        System.out.println("Walk - Batter advances to 1st Base. Baserunners advance if they are forced to.");
        System.out.println("  (ex: a walk w/ a baserunner on 1st - the baserunner advences to 2nd; the batter advances to 1st)");
        System.out.println("Double - Batter advances to 2nd Base. All baserunners advance 2 bases.");
        System.out.println("Triple - Batter advances to 3rd Base. All baserunners advance 3 bases.");
        System.out.println("Home Run - Batter advances all 4 Bases. All baserunners also advance all 4 bases.");
        System.out.println("If a baserunner advances all 4 bases, that baserunner scores for the batting team.");
        System.out.println("---------------------------------------------");
        System.out.println("Now that you know the rules, are you ready to play? ");
        System.out.println("Type (y) to start the simulator.");
        start = scan.next();
        
        String awayTeam = "";
        String homeTeam = "";
        Teams team1 = new Teams("Team 1", 0, 0);
        Teams team2 = new Teams("Team 2", 0, 0);
        System.out.println("Enter the Away Team's Name: ");
        awayTeam = team2.getUserName();
        System.out.println("Enter the Home Team's Name: ");
        homeTeam = team1.getUserName();
        
        System.out.println("Away Team: " + awayTeam);
        System.out.println("Home Team: " + homeTeam);
        System.out.println("==========================");
        
        int inning = 1;
        int halfInning = 0;
        int awayRuns = team2.getRuns();
        int awayHits = team2.getHits();
        int homeRuns = team1.getRuns();
        int homeHits = team2.getHits();
        String play = "";
        while (playBall) {
            int random1 = 0;
            Random r = new Random();
            /**
             * While (playBall) runs the simulator for the desired 18 half-innings (9-innings) with the Boolean PlayBall declared at the top.
             */
            if (halfInning % 2 == 0) {
                System.out.println("Top " + inning);
                int aOuts = 0;
                /**
                 * if (halfInning % 2 == 0) uses the Modulus operator to depict whether the home or away team is batting.
                 */
                while (aOuts < 3) {
                    random1 = r.nextInt(21) + 1;
                    Integer a = new Integer(random1);
                    /**
                     * Here is the actual simulator. The Random r selects a number between 1-20, with each number being assigned to a play. The 
                     * program itterates through the below if/else sattement to find the simulated number. once the number is found, the program 
                     * converts the integer to a string and returns the play along with the recorded outs with the (play) variable. The simulator 
                     * continues this cycle until the outs are equal to 3.
                     */
                        if (random1 == 1) {
                        String rand = a.toString();
                        aOuts = aOuts + 1;
                        play = "Strike out    " + " Outs:" + aOuts;
                    } else if (random1 == 2) {
                        String rand = a.toString();
                        aOuts = aOuts + 1;
                        play = "Strike out    " + " Outs:" + aOuts;
                    } else if (random1 == 3) {
                        String rand = a.toString();
                        aOuts = aOuts;
                        awayHits++;
                        play = "Single        " + " Outs:" + aOuts;
                    } else if (random1 == 4) {
                        String rand = a.toString();
                        aOuts = aOuts + 1;
                        play = "Ground out    " + " Outs:" + aOuts;
                    } else if (random1 == 5) {
                        String rand = a.toString();
                        aOuts = aOuts;
                        play = "Walk          " + " Outs:" + aOuts;
                    } else if (random1 == 6) {
                        String rand = a.toString();
                        aOuts = aOuts + 1;
                        play = "Line out      " + " Outs:" + aOuts;
                    } else if (random1 == 7) {
                        String rand = a.toString();
                        aOuts = aOuts;
                        awayHits++;
                        play = "Home Run      " + " Outs:" + aOuts;
                    } else if (random1 == 8) {
                        String rand = a.toString();
                        aOuts = aOuts + 1;
                        play = "Fly out       " + " Outs:" + aOuts;
                    } else if (random1 == 9) {
                        String rand = a.toString();
                        aOuts = aOuts + 1;
                        play = "Fly out       " + " Outs:" + aOuts;
                    } else if (random1 == 10) {
                        String rand = a.toString();
                        aOuts = aOuts + 1;
                        play = "Strike out    " + " Outs:" + aOuts;
                    } else if (random1 == 11) {
                        String rand = a.toString();
                        aOuts = aOuts + 1;
                        play = "Ground out    " + " Outs:" + aOuts;
                    } else if (random1 == 12) {
                        String rand = a.toString();
                        aOuts = aOuts;
                        awayHits++;
                        play = "Single        " + " Outs:" + aOuts;
                    } else if (random1 == 13) {
                        String rand = a.toString();
                        aOuts = aOuts + 1;
                        play = "Ground out    " + " Outs:" + aOuts;
                    } else if (random1 == 14) {
                        String rand = a.toString();
                        aOuts = aOuts;
                        awayHits++;
                        play = "Triple        " + " Outs:" + aOuts;
                    } else if (random1 == 15) {
                        String rand = a.toString();
                        aOuts = aOuts + 1;
                        play = "Ground out    " + " Outs:" + aOuts;
                    } else if (random1 == 16) {
                        String rand = a.toString();
                        aOuts = aOuts + 1;
                        play = "Strike out    " + " Outs:" + aOuts;
                    } else if (random1 == 17) {
                        String rand = a.toString();
                        aOuts = aOuts + 1;
                        play = "Pop out       " + " Outs:" + aOuts;
                    } else if (random1 == 18) {
                        String rand = a.toString();
                        aOuts = aOuts;
                        awayHits++;
                        play = "Double        " + " Outs:" + aOuts;
                    } else if (random1 == 19) {
                        String rand = a.toString();
                        aOuts = aOuts + 1;
                        play = "Fly out       " + " Outs:" + aOuts;
                    } else {
                        String rand = a.toString();
                        aOuts = aOuts + 1;
                        play = "Strike out    " + " Outs:" + aOuts;
                    }
                    System.out.println(play);
                    if (aOuts == 3) {
                        halfInning++;
                        System.out.println("==========================");
                        System.out.println("Enter " + awayTeam + " Runs from Inning " + inning + ": ");
                        awayRuns = awayRuns + scan.nextInt();
                        System.out.println("==========================");
                        /**
                         * Once the outs are equal to 3, the program asks the user to enter the runs scored in the inning based on the simulated
                         * play-by-play. The (awayRuns) variable keeps tally of the runs the Away Team scores throughout the game. The same happens
                         * for the home team.
                         */
                    }
                }
            } else {
                /**
                 * When the Modulus operator does not equal Zero, the program knows the Home Team is batting, and it's the bottom of the inning.
                 * The same functions that were adreesed and ran for the top of the inning now happen for the bottom of the inning.
                 */
                System.out.println("Bottom " + inning );
                int hOuts = 0;
                while (hOuts < 3) {
                    random1 = r.nextInt(21) + 1;
                    Integer a = new Integer(random1);
                        if (random1 == 1) {
                        String rand = a.toString();
                        hOuts = hOuts + 1;
                        play = "Strike out    " + " Outs:" + hOuts;
                    } else if (random1 == 2) {
                        String rand = a.toString();
                        hOuts = hOuts + 1;
                        play = "Strike out    " + " Outs:" + hOuts;
                    } else if (random1 == 3) {
                        String rand = a.toString();
                        hOuts = hOuts;
                        homeHits++;
                        play = "Single        " + " Outs:" + hOuts;
                    } else if (random1 == 4) {
                        String rand = a.toString();
                        hOuts = hOuts + 1;
                        play = "Ground out    " + " Outs:" + hOuts;
                    } else if (random1 == 5) {
                        String rand = a.toString();
                        hOuts = hOuts;
                        play = "Walk          " + " Outs:" + hOuts;
                    } else if (random1 == 6) {
                        String rand = a.toString();
                        hOuts = hOuts + 1;
                        play = "Line out      " + " Outs:" + hOuts;
                    } else if (random1 == 7) {
                        String rand = a.toString();
                        hOuts = hOuts;
                        homeHits++;
                        play = "Home Run      " + " Outs:" + hOuts;
                    } else if (random1 == 8) {
                        String rand = a.toString();
                        hOuts = hOuts + 1;
                        play = "Fly out       " + " Outs:" + hOuts;
                    } else if (random1 == 9) {
                        String rand = a.toString();
                        hOuts = hOuts + 1;
                        play = "Fly out       " + " Outs:" + hOuts;
                    } else if (random1 == 10) {
                        String rand = a.toString();
                        hOuts = hOuts + 1;
                        play = "Strike out    " + " Outs:" + hOuts;
                    } else if (random1 == 11) {
                        String rand = a.toString();
                        hOuts = hOuts + 1;
                        play = "Ground out    " + " Outs:" + hOuts;
                    } else if (random1 == 12) {
                        String rand = a.toString();
                        hOuts = hOuts;
                        homeHits++;
                        play = "Single        " + " Outs:" + hOuts;
                    } else if (random1 == 13) {
                        String rand = a.toString();
                        hOuts = hOuts + 1;
                        play = "Ground out    " + " Outs:" + hOuts;
                    } else if (random1 == 14) {
                        String rand = a.toString();
                        hOuts = hOuts;
                        homeHits++;
                        play = "Triple        " + " Outs:" + hOuts;
                    } else if (random1 == 15) {
                        String rand = a.toString();
                        hOuts = hOuts + 1;
                        play = "Ground out    " + " Outs:" + hOuts;
                    } else if (random1 == 16) {
                        String rand = a.toString();
                        hOuts = hOuts + 1;
                        play = "Strike out    " + " Outs:" + hOuts;
                    } else if (random1 == 17) {
                        String rand = a.toString();
                        hOuts = hOuts + 1;
                        play = "Pop out       " + " Outs:" + hOuts;
                    } else if (random1 == 18) {
                        String rand = a.toString();
                        hOuts = hOuts;
                        homeHits++;
                        play = "Double        " + " Outs:" + hOuts;
                    } else if (random1 == 19) {
                        String rand = a.toString();
                        hOuts = hOuts + 1;
                        play = "Fly out       " + " Outs:" + hOuts;
                    } else {
                        String rand = a.toString();
                        hOuts = hOuts + 1;
                        play = "Strike out    " + " Outs:" + hOuts;
                    }
                    System.out.println(play);
                    if (hOuts == 3) {
                        halfInning++;
                        inning++;
                        System.out.println("==========================");
                        System.out.println("Enter " + homeTeam + " Runs from Inning " + (inning -1) + ": ");
                        homeRuns = homeRuns + scan.nextInt();
                        System.out.println("==========================");
                        System.out.println("End of Inning " + (inning -1) + ". Current Score: ");
                        System.out.println(awayTeam + ": " + awayRuns + " Runs, " + awayHits + " Hits, 0 Errors");
                        System.out.println(homeTeam + ": " + homeRuns + " Runs, " + homeHits + " Hits, 0 Errors");
                        System.out.println("==========================");
                        /**
                         * Here, the program has reached the End of one full innning. It similarly asks the user to enter the runs scored for the Home
                         * Team and saves the entered amount to the (homeRuns) variable. The program then prints "End of Inning" and prints the current
                         * score in the adressed format:
                         *                                 Away Team: Away Runs, Away Hits, Away Errors(Always Zero)
                         *                                 Home Team: Home Runs, Home Hits, Home Errors(Always Zero)
                         */
                    }
                }
            }
            playBall = (halfInning < 18);
        }
        /**
         * At this point of the program, the variable (halfInning) is equal to 18, and the simulator stops running. The game is over, and the program 
         * prints the final scores to the user and thanks them for using the simulator.
         */
        if (awayRuns > homeRuns) {
            System.out.println("Final Score: " + awayTeam + " beat the " + homeTeam + ", " + awayRuns + " to " + homeRuns + ".");
        } else if (awayRuns < homeRuns) {
            System.out.println("Final Score: " + homeTeam + " beat the " + awayTeam + ", " + homeRuns + " to " + awayRuns + ".");
        } else if (awayRuns == homeRuns){
            System.out.println("Final Score: " + homeTeam + " tied the " + awayTeam + ", " + homeRuns + " to " + awayRuns + ".");
        }
        /**
         * The program compares the final scores between the Away Team and the Home Team to depict the winner and prints it to the user.
         */
        
        System.out.println("Thank You for using Riley's Interactive Baseball Game Simulator!");
        
    }
}
