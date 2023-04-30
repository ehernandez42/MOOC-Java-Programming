
public class MainProgram {

    public static void main(String[] args) {
        Counter counter = new Counter(1);
        counter.decrease(-20);
        System.out.println(counter.getValue());
    }
}
