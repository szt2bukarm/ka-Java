import java.util.Scanner;

public class ConditionalVariableMutation {
    
    public static void main(String[] args) {
        
        int output1 = 0;
        String output2 = "";
        int output3 = 0;
        String output4 = "";

        System.out.println("Please enter an integer");
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
        System.out.println("Please enter an integer between 0 and 100");
        do {
            credit = scanner.nextInt();
        } while (credit < 0 || credit > 100);

        System.out.println("Please enter a boolean (true/false)");
        boolean isBonus;
        do {
            isBonus = scanner.nextBoolean();
        } while (isBonus != true && isBonus != false);

        if (credit >= 50 && !isBonus) {
            output3 -= 2;
        } else if (credit < 50 && !isBonus) {
            output3 -= 1;
        }

        int d;
        System.out.println("Please enter an integer between 0 and 50");
        do {
            d = scanner.nextInt();
        } while (d < 0 || d > 50);

        System.out.println("Please enter an integer between 0 and 500");
        int time;
        do {
            time = scanner.nextInt();
        } while (time < 0 || time > 500);

        if (d % 4 == 0 && time <= 200) {
            output4 = "Check";
        } else if (time > 200) {
            output4 = "TImeout";
        } else {
            output4 = "Run Forest Run!";
        }

        scanner.close();
        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
        System.out.println(output4);
    }

}
