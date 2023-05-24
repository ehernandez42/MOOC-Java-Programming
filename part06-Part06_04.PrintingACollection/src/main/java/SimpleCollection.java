
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String printOutput = "The collection " + name + " ";

        if (elements.isEmpty()) {
            return printOutput + "is empty.";
        }

        String elementInCollection = "";

        for (String element : elements) {
            elementInCollection = elementInCollection + "\n" +  element;
         }

        if (elements.size() == 1) {
            return printOutput + "has " + elements.size() + " element:" + "\n" + elementInCollection;
        }

        return printOutput + "has " + elements.size() + " elements:" + "\n" + elementInCollection;
    }
    
}
