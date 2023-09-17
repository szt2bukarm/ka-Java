import java.util.Scanner;

public class DrawChessTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the chess table size: ");
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.println(" % % % %");
        }
        scanner.close();
    }
}