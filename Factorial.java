import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Adjon meg egy nem negativ egész számot: ");
            n = scanner.nextInt();
        } while (n < 0);
        scanner.close();
        System.out.println(fuggveny(n));
    }

    public static int fuggveny(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return n * fuggveny(n - 1);
    }

}
