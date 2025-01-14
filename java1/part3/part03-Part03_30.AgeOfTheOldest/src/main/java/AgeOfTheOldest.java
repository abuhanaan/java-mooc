
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            String[] parts = input.split(",");
            int currentAge = Integer.valueOf(parts[1]);
            if(oldest < currentAge){
                oldest = currentAge;
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
