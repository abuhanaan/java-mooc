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
public class Hold {
    
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public ArrayList<Suitcase> getSuitcases() {
        return suitcases;
    }
    
    public int totalWeight(){
        int total = 0;
        for (Suitcase suitcase: this.suitcases){
            total += suitcase.totalWeight();
        }
        return total;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(this.totalWeight() + suitcase.totalWeight() <= this.maxWeight){
            this.suitcases.add(suitcase);
        }
    }
    
    public String toString(){
        return String.format("%s suitcases (%s kg)", this.suitcases.size(), this.totalWeight());
    }
    
    public void printItems(){
        for(Suitcase suitcase: this.suitcases){
            suitcase.printItems();
        }
    }
}
