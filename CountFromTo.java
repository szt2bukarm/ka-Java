import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number 1:");
        int num1 = scanner.nextInt();
        System.out.println("Number 2:");
        int num2 = scanner.nextInt();
        scanner.close();
        if (num1 > num2) System.out.println("The second number should be bigger");

        for (int i = num1; i < num2; i++) {
            System.out.println(num1);
            num1++;
        }
    }
}
