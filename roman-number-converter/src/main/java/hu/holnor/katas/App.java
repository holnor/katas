package hu.holnor.katas;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Enter number (1-3000) to convert, or 'q' to quit");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if (input.equals("q")) {
                isRunning = false;
                System.out.println("Good bye!");
            } else {
                int number = Integer.parseInt(input);
                Engine engine = new Engine();
                System.out.print("Result: " + engine.numberToNumeral(number));
                System.out.println();
            }
        }
    }
}
