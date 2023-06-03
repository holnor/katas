package hu.holnor.katas;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Engine engine = new Engine();
        boolean isRunning = true;
        Scanner sc = new Scanner(System.in);
        while (isRunning) {
            System.out.println("a.) arabic -> roman\nb.) roman -> arabic\nq.) quit");
            String input = sc.nextLine();
            if (input.equals("a")) {
                System.out.println("Enter an arabic number (1-3000) to convert");
                int arabicNumber = sc.nextInt();
                System.out.print("Result: " + engine.numberToNumeral(arabicNumber));
                System.out.println();

            } else if (input.equals("b")) {
                System.out.println("Enter a roman number (I-MMM) to convert");
                String romanNumber = sc.nextLine();
                System.out.print("Result: " + engine.romanToArabic(romanNumber));
                System.out.println();

            } else if (input.equals("q")) {
                isRunning = false;
                System.out.println("Good bye!");
            }
        }
    }
}
