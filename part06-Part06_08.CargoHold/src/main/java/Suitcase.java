import java.util.ArrayList;
public class Suitcase {

    private int maxWeight;

    private ArrayList<Item> items;
    public Suitcase (int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public int totalWeight () {
        int total = 0;

        for (Item e : items) {
            total += e.getWeight();
        }

        return total;
    }

    public void printItems () {
        for (Item e : items) {
            System.out.println(e);
        }
    }

    public void addItem (Item item) {
       if (item.getWeight() + totalWeight() <= maxWeight) {
           items.add(item);
       }
    }

    public Item heaviestItem () {
        if (items.isEmpty()) {
            return null;
        }
        Item heavyItem = new Item("item", 0);
        for (Item e : items) {
            if (e.getWeight() > heavyItem.getWeight()) {
                heavyItem = e;
            }
        }

        return heavyItem;
    }
    public String languageFormat() {
        if (this.items.size() == 0) {
            return "no items";
        } else if (this.items.size() == 1) {
            return "1 item";
        }
        return this.items.size() + " items";
    }

    public String toString() {
        return languageFormat() + " ("  + totalWeight() + " kg)";
    }
}
