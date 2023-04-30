
public class MainProgram {

    public static void main(String[] args) {
        Counter counter = new Counter(1);
        
        //this decrease call was a test to see if the negative numbers could affect the 
        //count, which was one of the points of this exercises
        counter.decrease(-20);
        System.out.println(counter.getValue());
    }
}
