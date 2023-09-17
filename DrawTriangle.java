import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int characters = 0;

        System.out.print("Please enter the triangle height: ");
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            characters++;
            for (int j = 0; j < characters; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
        
    }
}
