import java.util.Scanner;
public class UserInterface {

    private TodoList list;
    private Scanner scan;

    public UserInterface(TodoList list, Scanner scan) {
        this.list = list;
        this.scan = scan;
    }

    public void start() {
        while(true) {
            System.out.print("Command: ");
            String command = scan.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                System.out.print("To add: ");
                String addition = scan.nextLine();
                list.add(addition);
            }

            if (command.equals("list")) {
                list.print();
            }

            if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int reduction = scan.nextInt();
                list.remove(reduction);
            }
        }
    }

}
