
public class Main {

    public static void main(String[] args) {

       MessagingService ms = new MessagingService();
       System.out.println(ms.getMessages());

       Message caleb = new Message("hi","he" );
       ms.add(caleb);

        System.out.println(ms.getMessages());


    }
}
