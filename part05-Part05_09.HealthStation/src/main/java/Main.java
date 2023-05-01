
public class Main {

    public static void main(String[] args) {

        HealthStation childrensHospital = new HealthStation();
        System.out.println("Health Station Check Up");
        Person rachelle = new Person("Rachelle", 16, 135, 120);
        Person frank = new Person("Frank", 20, 145, 150);

        System.out.println("");

        System.out.println(rachelle.getName() + " weight: " + childrensHospital.weigh(rachelle) + " kilos");
        System.out.println(frank.getName() + " weight: " + childrensHospital.weigh(frank) + " kilos");

        System.out.println("weighings performed: " + childrensHospital.weighings());
        System.out.println("");

        childrensHospital.feed(rachelle);
        childrensHospital.feed(frank);
        childrensHospital.feed(frank);
        childrensHospital.feed(rachelle);
        childrensHospital.feed(frank);
        childrensHospital.feed(frank);
        
        System.out.println(rachelle.getName() + " weight: " + childrensHospital.weigh(rachelle) + " kilos");
        System.out.println(frank.getName() + " weight: " + childrensHospital.weigh(frank) + " kilos");
        System.out.println("weighings performed: " + childrensHospital.weighings());

    }
}


//Runs as person with methods called on to show weight, the number of weighings that were performed, and can manipulate weight through feed() method
