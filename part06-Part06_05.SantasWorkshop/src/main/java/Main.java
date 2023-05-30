
public class Main {

    public static void main(String[] args) {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        System.out.println("Gift's name: " + book.getName());
        System.out.println("Gift's weight: " + book.getWeight() + " kg");

        System.out.println("Gift: " + book);

        System.out.println("");

        Gift bookTwo = new Gift("The Kite Runner", 1);

        System.out.println("Gift's name: " + bookTwo.getName());
        System.out.println("Gift's weight: " + bookTwo.getWeight() + " kg");

        System.out.println("Gift: " + bookTwo);

        Package gifts = new Package();
        gifts.addGift(book);
        System.out.println("Total weight of books thus far: " + gifts.totalWeight() + " kg");

    }
}
