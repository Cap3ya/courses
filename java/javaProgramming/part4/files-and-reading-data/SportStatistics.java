import java.util.Scanner;
import java.nio.file.Paths;

public class SportStatistics {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int nbrGames = 0, nbrWins = 0, nbrLoss = 0;

        System.out.println("Whut file?");
        String fileName = reader.nextLine();

        System.out.println("Whut team?");
        String teamName = reader.nextLine();

        try (Scanner readFile = new Scanner(Paths.get(fileName))) {
            while (readFile.hasNextLine()) {

                String line = readFile.nextLine();

                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeScore = Integer.valueOf(parts[2]);
                int awayScore = Integer.valueOf(parts[3]);

                if (homeTeam.equals(teamName)) {
                    nbrGames++;
                    if (homeScore > awayScore) {
                        nbrWins++;
                    } else {
                        nbrLoss++;
                    }
                }
                else if (awayTeam.equals(teamName)) {
                    nbrGames++;
                    if (awayScore > homeScore) {
                        nbrWins++;
                    } else {
                        nbrLoss++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games : " + nbrGames);
        System.out.println("Wins  : " + nbrWins);
        System.out.println("Loss  : " + nbrLoss);

        reader.close();    
    }
}
