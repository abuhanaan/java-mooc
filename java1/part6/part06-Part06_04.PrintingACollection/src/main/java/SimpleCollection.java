
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
    
    public String toString(){
        if (this.elements.isEmpty()){
            return String.format("The collection %s is empty.", this.name);
        }
        String characters = "\n";
        for(String element: this.elements){
            characters += element + "\n";
        }
        if (this.elements.size() == 1){
            return String.format("The collection %s has %s element: %s", this.name, this.elements.size(), characters);
        }
        return String.format("The collection %s has %s elements: %s", this.name, this.elements.size(), characters);
    }
    
}
