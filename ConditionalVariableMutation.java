import java.util.Scanner;

public class ConditionalVariableMutation {
    
    public static void main(String[] args) {
        
        int output1 = 0;
        String output2 = "";
        int output3 = 0;

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a % 2 == 0) output1++;

        int b;
        System.out.println("Please enter an integer between 0 and 30");
        do {
            b = scanner.nextInt();
        } while (b < 0 || b > 30);

        if (b >= 10 && b <= 20) {
            output2 = "Sweet!";
        } else if (b < 10) {
            output2 = "Less!";
        } else if (b > 20) {
            output2 = "More!";
        }

        int credit;
        System.out.println("Please enter an integer between 0 and 30");
        do {
            credit = scanner.nextInt();
        } while (credit < 0 || credit > 100);

        System.out.println("Please enter a boolean (true/false)");
        boolean isBonus;
        do {
            isBonus = scanner.nextBoolean();
        } while (isBonus != true || isBonus != false);


    }

}
