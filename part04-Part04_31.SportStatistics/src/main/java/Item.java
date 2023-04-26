public class Item {

    private String homeTeam;
    private String awayTeam;
    private int homePoints;
    private int awayPoints;

    public Item(String initialHomeTeam, String initialAwayTeam, int initialHomePoints, int initialAwayPoints) {
        this.homeTeam = initialHomeTeam;
        this.awayTeam = initialAwayTeam;
        this.homePoints = initialHomePoints;
        this.awayPoints = initialAwayPoints;
    }

    public String getHomeTeam() {
        return this.homeTeam;
    }

    public String getAwayTeam() {
        return this.awayTeam;
    }

    public int getHomePoints() {
        return this.homePoints;
    }

    public int getAwayPoints() {
        return this.awayPoints;
    }

    public String toString() {
        return this.homeTeam;
    }
}
