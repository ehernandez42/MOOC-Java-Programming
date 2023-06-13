import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }
    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        boolean isItEmpty = false;

        if (this.persons.isEmpty()) {
            isItEmpty = true;
        }

        return isItEmpty;
    }

    public ArrayList<Person> getPersons(){
        return this.persons;
    }

    public Person shortest(){

        if (this.persons.isEmpty()) {
            return null;
        }

        Person shortPerson = this.persons.get(0);

        for (Person e : persons) {
            if (e.getHeight() < shortPerson.getHeight()) {
                shortPerson = e;
            }
        }

        return shortPerson;

    }

    public Person take(){
        if (this.persons.isEmpty()) {
            return null;
        }

        Person removePerson = shortest();
        persons.remove(removePerson);

        return removePerson;
    }
}
