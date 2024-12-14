
import java.util.Scanner;
import java.util.ArrayList;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        ArrayList<String> arrayList = new ArrayList<>();
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            arrayList.add(input);
            String[] parts = input.split(",");
            int currentAge = Integer.valueOf(parts[1]);
            if(oldest < currentAge){
                oldest = currentAge;
            }
        }
        for(int i=0; i<arrayList.size(); i++) {
            String[] slice = arrayList.get(i).split(",");
            int age = Integer.valueOf(slice[1]);
            if (oldest == age){
                System.out.println("Name of the oldest: " + slice[0]);
                break;
            }
        }
    }
}
