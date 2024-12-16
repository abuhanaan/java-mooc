
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        
        ArrayList<Integer> list = new ArrayList<>();
        try(Scanner fileScanner = new Scanner(Paths.get(file))) {
            while(fileScanner.hasNextLine()){
                int line = Integer.valueOf(fileScanner.nextLine());
                list.add(line);
            }
        } catch(Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        int count = 0;
        for (int number: list){
            if(number >= lowerBound && number <= upperBound){
                count++;
            }   
        }
        System.out.println("Numbers: " + count);
    }

}
