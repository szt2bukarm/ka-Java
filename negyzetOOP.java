class Negyzet {
    double oldal;
    public Negyzet(double oldal) {
        this.oldal = oldal;
    }

    public double Kerulet() {
        return 4 * oldal;
    }

    public double Terulet() {
        return oldal * oldal;
    }
}

public class negyzetOOP {
    public static void main(String[] args) {
        
        Negyzet negyzet = new Negyzet(5);
        System.out.println("A négyzet kerülete: " + negyzet.Kerulet() + " cm");
        System.out.println("A négyzet területe: " + negyzet.Terulet() + " cm2");
    }
}
