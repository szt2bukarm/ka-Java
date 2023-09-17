import java.util.Scanner;

public class DrawSquare { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = 0;

        System.out.print("Please enter the square size: ");
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            line++;
            if (line == 1 || line == size) {
                for (int j = 0; j < size; j++) {
                    System.out.print("%");
                }
            } else {
                for (int j =0; j< size;j++) {
                    if (j == 0 || j == size - 1) {
                    System.out.print("%");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
