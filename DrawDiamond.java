import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the triangle height: ");
        int size = scanner.nextInt();
        int spaces = size;
        int characters = 1;
        int line = 0;

        for (int i = 0; i < size * 2 + 1; i++) {
            line++;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < characters; j++) {
                System.out.print("*");
            }

            if (line <= size) {
                spaces--;
                characters += 2;    
            } else if (line > size) {
                spaces++;
                characters -= 2;   
            }


            System.out.println();
        }
        scanner.close();
    }
}