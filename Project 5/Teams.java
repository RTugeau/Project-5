import java.util.Scanner;
/**
 * Write a description of class AwayTeam here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teams {
    private String teamName;
    private int teamNumber;
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