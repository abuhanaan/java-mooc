import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        Database database = new Database();
        
        while(true){
            System.out.println("?");
            String command = scan.nextLine();
            if (command.equals("Quit")){
                break;
            }
            else if (command.equals("Add")){
                System.out.println("Name");
                String name = scan.nextLine();
                System.out.println("Name in Latin");
                String latin = scan.nextLine();
                database.add(name, latin);
            } else if (command.equals("Observation")){
                System.out.println("Bird?");
                String name = scan.nextLine();
                Bird bird = database.getOne(name);
                if(bird == null){
                    System.out.println("Not a bird!");
                } else{
                    database.observeBird(bird);
                }
            } else if (command.equals("One")){
                System.out.println("Bird?");
                String name = scan.nextLine();
                Bird bird = database.getOne(name);
                if(bird == null){
                    System.out.println("Not a bird!");
                } else{
                    System.out.println(bird);
                }
            } else if (command.equals("All")){
                database.printAll();
            }
        }
    }

}
