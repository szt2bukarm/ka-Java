import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Side a:");
        double a = scanner.nextDouble();
        System.out.println("Side b:");
        double b = scanner.nextDouble();
        System.out.println("Side c:");
        double c = scanner.nextDouble();
        scanner.close();

        double surfaceArea = 2 * (a * b + b * c + a * c);
        double volume = a * b * c;

        System.out.println("Surface: " + surfaceArea);
        System.out.println("Volume: " + volume);

        
    }
}
