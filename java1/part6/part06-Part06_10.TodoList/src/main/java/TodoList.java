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
public class TodoList {
    
    private ArrayList<String> todos;
    
    public TodoList(){
        this.todos = new ArrayList<>();
    }
    
    public void add(String task){
        this.todos.add(task);
    }
    
    public void print(){
        int taskIndex = 1;
        for (String todo: this.todos){
            System.out.println(String.format("%s: %s", taskIndex, todo));
            taskIndex += 1;
        }
    }
    
    public void remove(int number){
        this.todos.remove(number -1);
    }
}
