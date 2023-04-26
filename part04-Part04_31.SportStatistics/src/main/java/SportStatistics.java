
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String fileNameInput = scan.nextLine();
        System.out.println("Team:");
        String teamInput = scan.nextLine().toLowerCase();

        int games = 0;
        int wins = 0;
        int losses = 0;


        try (Scanner fileScanner = new Scanner(Paths.get(fileNameInput))) {

            while (fileScanner.hasNextLine()) {
                String[] splitStr = fileScanner.nextLine().split(",");

                if (splitStr.equals("")) {
                    continue;
                }

                String homeTeam = splitStr[0];
                String awayTeam = splitStr[1];
                int homePoints = Integer.valueOf(splitStr[2]);
                int awayPoints = Integer.valueOf(splitStr[3]);

                if (teamInput.equals(homeTeam.toLowerCase())) {
                    games++;
                    if (homePoints > awayPoints) {
                        wins++;
                    } else if (awayPoints > homePoints) {
                        losses++;
                    }
                }
                if (teamInput.equals(awayTeam.toLowerCase())) {
                    games++;
                    if (awayPoints > homePoints) {
                        wins++;
                    } else if (homePoints > awayPoints) {
                        losses++;
                    }
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
