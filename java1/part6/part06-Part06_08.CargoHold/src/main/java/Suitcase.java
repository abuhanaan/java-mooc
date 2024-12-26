import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adewunmi
 */
public class Suitcase {
    
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public int getMaxWeight() {
        return maxWeight;
    }
    
    public int totalWeight(){
        int total = 0;
        for (Item item: this.items){
            total += item.getWeight();
        }
        return total;
    }
    
    public Item heaviestItem(){
        if (this.items.isEmpty()){
            return null;
        }
        Item heaviest = this.items.get(0);
        for (Item item: this.items){
            if(heaviest.getWeight() < item.getWeight()){
                heaviest = item;
            }
        }
        return heaviest;
    }
    
    public void addItem(Item item){
        if(this.totalWeight() + item.getWeight() <= this.maxWeight){
            this.items.add(item);
        }
    }
    
    public String toString(){
        if(this.items.isEmpty()){
            return "no items (0 kg)";
        }
        if(this.items.size() == 1){
            return String.format("1 item (%s kg)", this.totalWeight());
        }
        return String.format("%s items (%s kg)", this.items.size(), this.totalWeight());
    }
    
    public void printItems(){
        for (Item item: this.items){
            System.out.println(item);
        }
    }
}
