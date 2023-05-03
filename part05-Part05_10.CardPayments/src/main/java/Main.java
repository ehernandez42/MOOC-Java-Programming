
public class Main {

    public static void main(String[] args) {
        PaymentTerminal unicafeExactum = new PaymentTerminal();
        System.out.println(unicafeExactum);
        PaymentCard eh = new PaymentCard(1000);

        unicafeExactum.eatAffordably(eh);
        unicafeExactum.eatHeartily(eh);

        System.out.println(eh.balance());
        System.out.println(unicafeExactum);
    }
}

