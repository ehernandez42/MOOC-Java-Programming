import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold (int maxWeight) {
        this.maxWeight = maxWeight;
        suitcases = new ArrayList<>();
    }

    public int totalWeight () {
        int weight = 0;

        for (Suitcase e : suitcases) {
            weight += e.totalWeight();
        }

        return weight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + suitcaseWeight() <= maxWeight) {
            suitcases.add(suitcase);
        } else {
            return;
        }
    }

    public int suitcaseWeight () {
        int suitWeight = 0;

        for (Suitcase h : suitcases) {
            suitWeight += h.totalWeight();
        }

        return suitWeight;
    }
    public void printItems() {
        for (Suitcase f : suitcases) {
            f.printItems();
        }
    }

    public String toString () {
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }
}
