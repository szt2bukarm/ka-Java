import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the triangle height: ");
        int size = scanner.nextInt();
        int spaces = size - 1;
        int characters = 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < characters; j++) {
                System.out.print("*");
            }
            spaces--;
            characters += 2;
            System.out.println();
        }
        scanner.close();
    }
}