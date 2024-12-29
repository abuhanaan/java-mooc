
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        int totalPoint = 0;
        int pointCount = 0;
        int totalPassing = 0;
        int passingCount = 0;
        int grade5 = 0;
        int grade4 = 0;
        int grade3 = 0;
        int grade2 = 0;
        int grade1 = 0;
        int grade0 = 0;
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int grade = Integer.valueOf(scanner.nextLine());
            if (grade == -1) {
                break;
            }
            if (grade > 0 && grade <= 100) {
                totalPoint += grade;
                pointCount++;
                if (grade >= 50 && grade <= 100) {
                    totalPassing += grade;
                    passingCount++;
                }
                if (grade < 50) {
                    grade0++;
                } else if (grade < 60) {
                    grade1++;
                } else if (grade < 70) {
                    grade2++;
                } else if (grade < 80) {
                    grade3++;
                } else if (grade < 90) {
                    grade4++;
                } else if (grade >= 90) {
                    grade5++;
                }
            }
        }
        
        System.out.println(String.format("Point average (all): %s", (double)totalPoint/pointCount));
        if (passingCount == 0){
            System.out.println("Point average (passing): -");
        } else {
            System.out.println(String.format("Point average (passing): %s", (double)totalPassing/passingCount));
        }
        if (passingCount == 0){
            System.out.println("Pass percentage: 0.0");
        } else {
            System.out.println(String.format("Pass percentage: %s", 100.0 * passingCount/pointCount));
        }
        System.out.println("Grade distribution:");
        System.out.println(String.format("5: %s", "*".repeat(grade5)));
        System.out.println(String.format("4: %s", "*".repeat(grade4)));
        System.out.println(String.format("3: %s", "*".repeat(grade3)));
        System.out.println(String.format("2: %s", "*".repeat(grade2)));
        System.out.println(String.format("1: %s", "*".repeat(grade1)));
        System.out.println(String.format("0: %s", "*".repeat(grade0)));
    }
}
