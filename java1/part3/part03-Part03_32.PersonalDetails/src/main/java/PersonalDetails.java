
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        String longestName = "";
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            String[] parts = input.split(",");
            int currentAge = Integer.valueOf(parts[1]);
            String currentName = parts[0];
            if(longestName.length() < currentName.length()){
                longestName = currentName;
            }
            sum += currentAge;
            count += 1;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (double)sum/count);

    }
}
