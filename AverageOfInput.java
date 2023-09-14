import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int Sum = 0;
        
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Please enter a number: ");
            int number = scanner.nextInt();
            nums.add(number);
            Sum += number;
        }
        scanner.close();
        System.out.println("Sum: " + Sum + ", Average: " + Sum/nums.size());
    }
}
