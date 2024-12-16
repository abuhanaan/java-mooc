
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        ArrayList<String> list = new ArrayList<>();
        try(Scanner fileScanner = new Scanner(Paths.get(file))) {
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                list.add(line);
            }
        } catch(Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        for(String info: list){
            String[] parts = info.split(",");
            String name = parts[0];
            int age = Integer.valueOf(parts[1]);
            if(age == 1){
                System.out.println(String.format("%s, age: %s year", name, age));
            } else {
                System.out.println(String.format("%s, age: %s years", name, age));
            }
        }
    }
}
