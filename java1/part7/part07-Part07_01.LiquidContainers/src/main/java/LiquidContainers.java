
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
//            System.out.print("> ");
            System.out.println(String.format("First: %s/100", first));
            System.out.println(String.format("Second: %s/100", second));

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (amount > 0 && command.equals("add")){
                if (amount + first > 100){
                    first = 100;
                } else {
                    first += amount;
                }
            } else if (amount > 0 && command.equals("move")) {
                if (first < amount && second + first < 100){
                    second += first;
                    first = 0;
                } else if (first < amount && second + first > 100){
                    second = 100;
                    first = 0;
                } else if (second + amount > 100){
                    second = 100;
                    first -= amount;
                } else {
                    second += amount;
                    first -= amount;
                }
            } else if (amount > 0 && command.equals("remove")){
                if (second < amount){
                    second = 0;
                } else {
                    second -= amount;
                }
            }
        }
    }

}
