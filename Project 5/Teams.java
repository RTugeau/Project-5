import java.util.Scanner;
/**
 * The Teams Class creates the the two teams that will compete in the simulation. The Teams Class holds the Team's Names, Runs, and Hits, which are saved 
 *  and used in the simulation. The method getUserName() scans the user input in the main to correctly set the user-entered Team Names used in the 
 *  simulator.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teams {
    private String teamName;
    private int runs;
    private int hits;
    
    /**
     * Constructor for objects of class Teams
     */
    public Teams(String tName, int r, int h) {
        this.teamName = tName;
        this.runs = r;
        this.hits = h;
    }
    
    public String getTeam() {
        return this.teamName;
    }
    
    public int getRuns() {
        return this.runs;
    }
    
    public int getHits() {
        return this.hits;
    }
    
    public String getUserName() {
        Scanner scan = new Scanner(System.in);
        teamName = scan.next();
        return teamName;
    }
    
}