
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

class Game {
    
    String team1;
    String team2;
    int scoreTeam1;
    int scoreTeam2;
    
    public Game(String team1, String team2, int scoreTeam1, int scoreTeam2) {
        this.team1 = team1;
        this.team2 = team2;
        this.scoreTeam1 = scoreTeam1;
        this.scoreTeam2 = scoreTeam2;
    }

}

public class SportStatistics {
    
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Game> game = new ArrayList<>();
        
        System.out.println("File:");
        String fileName = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;
        
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                String team1 = parts[0];
                String team2 = parts[1];
                int scoreTeam1 = Integer.valueOf(parts[2]);
                int scoreTeam2 = Integer.valueOf(parts[3]);
                
                game.add(new Game(team1, team2, scoreTeam1, scoreTeam2));
                
                if (team1.equals(team) || team2.equals(team)) {
                    gamesPlayed += 1;
                }
                
                if ((team1.equals(team) && scoreTeam1 > scoreTeam2) || (team2.equals(team) && scoreTeam2 > scoreTeam1)) {
                    wins += 1;
                } 
                
                if ((team1.equals(team) && scoreTeam1 < scoreTeam2) || (team2.equals(team) && scoreTeam2 < scoreTeam1)) {
                        losses += 1;
                }
                
            }
            
        } catch (Exception e) {
            
        }
        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
