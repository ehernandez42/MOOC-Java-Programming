//files are tested here

public class Main {

    public static void main(String[] args) {
        PaymentTerminal unicafeExactum = new PaymentTerminal();
        System.out.println(unicafeExactum);
        PaymentCard eh = new PaymentCard(1000);
        
        //other methods for the PaymentTerminal class are the addMoney, takeMoney, etc. 
        //it pretty much acts as a register
        
        unicafeExactum.eatAffordably(eh);
        unicafeExactum.eatHeartily(eh);

        System.out.println(eh.balance());
        System.out.println(unicafeExactum);
    }
}

