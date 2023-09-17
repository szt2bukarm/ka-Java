import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int storedNumber = 8;
        int guess;
        do {
            System.out.print("Please enter your guess: ");
            guess = scanner.nextInt();
            if (guess < storedNumber) System.out.println("The stored number is greater than " + guess);
            else if (guess > storedNumber) System.out.println("The stored number is smaller than " + guess);
        } while (guess != storedNumber);

        System.out.println("You have found the stored number " + storedNumber);
        scanner.close();
    }
}
