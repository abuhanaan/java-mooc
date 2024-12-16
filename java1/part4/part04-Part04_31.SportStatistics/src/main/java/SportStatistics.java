
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        ArrayList<Statistics> stats = readRecordsFromFile(file);
        
        System.out.println("Team:");
        String team = scan.nextLine();
        int count = 0;
        int wins = 0;
        int losses = 0;
        
        for(Statistics stat: stats) {
            if (stat.getHome().equals(team)){
                count++;
                if (stat.getHomePoint() > stat.getVisitingPoint()){
                    wins++;
                } else {
                    losses++;
                }
            }
            if (stat.getVisiting().equals(team)){
                count++;
                if (stat.getHomePoint() > stat.getVisitingPoint()){
                    losses++;
                } else {
                    wins++;
                }
            }
        }
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
    
    public static ArrayList<Statistics> readRecordsFromFile(String file) {
        ArrayList<Statistics> stats = new ArrayList<>();

        // Write here the code for reading from file
        // and printing the read records
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                String home = parts[0];
                String visiting = parts[1];
                int homePoint = Integer.valueOf(parts[2]);
                int visitingPoint = Integer.valueOf(parts[3]);
                stats.add(new Statistics(home, visiting, homePoint, visitingPoint));
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        return stats;
    }

}
