import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adja meg az 'a' értékét: ");
        int a = scanner.nextInt();
            System.out.print("Adja meg az 'b' értékét: ");
        int b = scanner.nextInt();
            System.out.print("Adja meg az 'c' értékét: ");
        int c = scanner.nextInt();
        scanner.close();
        System.out.println(fuggveny(a,b,c));
    }

    public static String fuggveny(int a,int b,int c) {
    
        double D = Math.pow(b, 2) - 4 * a * c;

        if (D < 0) return "A függvénynek nincs zérushelye";
        else if (D == 0) {
            double x = (-b + Math.sqrt(D)) / (2*a);
            return "A függvénynek 1 zérushelye van: x =" + x;
        } else if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2*a);
            double x2 = (-b - Math.sqrt(D)) / (2*a);
            return "A függvénynek 2 zérushelye van: x1 = " + x1 + " és x2 = " + x2;
        }
        return "";    
    }
}
