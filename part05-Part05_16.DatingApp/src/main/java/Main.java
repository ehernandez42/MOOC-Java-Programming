
public class Main {

    public static void main(String[] args) {
        SimpleDate dayNew = new SimpleDate(30, 12,2011);

        dayNew.advance(3);

        System.out.println(dayNew);

        SimpleDate clone = dayNew.afterNumberOfDays(1);
        System.out.println(clone);

        dayNew.advance(1);

        System.out.println(dayNew);
        System.out.println(clone);


    }
}
