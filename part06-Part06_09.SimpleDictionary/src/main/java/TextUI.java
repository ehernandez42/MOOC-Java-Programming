//this code takes the work off of the Main class
import java.util.Scanner;
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    //takes the SimpleDictionary class in the same folder
    public TextUI (Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while(true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (command.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);
            }

            if (command.equals("search")) {
                System.out.print("To be translated: ");
                String queue = scanner.nextLine();
                String translated = dictionary.translate(queue);
                if (translated == null) {
                    System.out.println("Word " + queue + " was not found");
                } else {
                    System.out.println("Translation: " + dictionary.translate(queue));
                }
            }

            System.out.println("Unknown command");
        }

    }
}
