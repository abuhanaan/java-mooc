import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adewunmi
 */
public class UserInterface {
    
    private TodoList tasks;
    private Scanner scanner;
    
    public UserInterface(TodoList todos, Scanner scanner){
        this.tasks = todos;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Command");
            String command = this.scanner.nextLine();
            if(command.equals("stop")){
                return;
            } else if (command.equals("add")){
                System.out.println("To add: ");
                String task = this.scanner.nextLine();
                this.tasks.add(task);
            } else if (command.equals("list")){
                this.tasks.print();
            } else if(command.equals("remove")){
                System.out.println("Which one is removed?");
                int index = Integer.valueOf(this.scanner.nextLine());
                this.tasks.remove(index);
            }
        }
    }
}
