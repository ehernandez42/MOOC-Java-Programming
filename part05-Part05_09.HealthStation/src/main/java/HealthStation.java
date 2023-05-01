
//class I created that can manipulate the weight of the person
//also included is the method for the amount of times a person was weighed

public class HealthStation {

    private int weighing;
    
    
    public int weigh(Person person) {
        weighing = weighing + 1;
        return person.getWeight();
    }

    public void feed(Person person) {
         person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return this.weighing;
    }

}
