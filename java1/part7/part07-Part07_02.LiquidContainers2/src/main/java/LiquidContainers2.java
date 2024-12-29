
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
//            System.out.print("> ");
            System.out.println(String.format("First: %s", first));
            System.out.println(String.format("Second: %s", second));

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (amount > 0 && command.equals("add")){
                first.add(amount);
            } else if (amount > 0 && command.equals("move")) {
                if (first.contains() < amount){
                    first.remove(first.contains());
                    second.add(first.contains());
                } else {
                    second.add(amount);
                    first.remove(amount);
                } 
            } else if (amount > 0 && command.equals("remove")){
                second.remove(amount);
            }
        }
    }

}
