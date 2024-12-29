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
public class Database {
    
    private ArrayList<Bird> birds;

    public Database() {
        this.birds = new ArrayList<>();
    }

    public ArrayList<Bird> getBirds() {
        return birds;
    }
    
    public void add(String name, String latin){
        this.birds.add(new Bird(name, latin));
    }
    
    public Bird getOne(String name){
        for (Bird bird: this.birds){
            if (bird.getName().equals(name)){
                return bird;
            }
        }
        return null;
    }
     
    public void printAll(){
        for (Bird bird: this.birds){
            System.out.println(bird);
        }
    }
    
    public void observeBird(Bird bird){
        bird.observe();
    }
}
