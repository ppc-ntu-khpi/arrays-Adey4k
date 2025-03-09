package test;

import java.util.Scanner;
import static domain.Exercise.Calculate;


/**
 * Клас відповідає за взаємодію з користувачем
 */
public class TestResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean i = true;
        
        while (i == true) {
            System.out.print("Enter number, or 'q' to quit: ");
            
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (Calculate(number)) {
                    System.out.println(number + " is an Armstrongs number");
                } else {
                    System.out.println(number + " is NOT an Armstrongs number");
                }
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("q")) {
                    i = false;
                } else {
                    System.out.println("Unknown command");
                }
            }
        }
        
        scanner.close();
    }
}
