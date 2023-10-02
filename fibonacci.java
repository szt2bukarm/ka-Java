import java.util.Scanner;
import java.util.ArrayList;

public class fibonacci {

    public static void main(String[] args) {
        ArrayList<Integer> alap = new ArrayList<Integer>();
        alap.add(0);
        alap.add(1);

        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Adjon meg egy számot");
            n = scanner.nextInt();
        } while (n < 0);
        System.out.println("A " + n + ". fibonacci szám: (loop) " + fibonacciLoop(alap,n));
        System.out.println("A " + n + ". fibonacci szám: (rec) " + fibonacciRec(n));
        scanner.close();
    }
    public static int fibonacciLoop(ArrayList<Integer> lista, int n) {
        for (int i = 1; i < n; i++) {
            lista.add(lista.get(i-1) + lista.get(i));
        }
        return lista.get(n);
    }

    public static int fibonacciRec(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return fibonacciRec(n - 1) + fibonacciRec(n - 2);
    }


}
