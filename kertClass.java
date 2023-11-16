import java.util.ArrayList;
import java.util.List;

class Noveny {
    protected String faj;
    protected String novenyTipus;
    protected int vizmennyiseg;
}

class fa extends Noveny {
    public fa(String faj,int vizmennyiseg) {
        this.faj = faj;
        this.vizmennyiseg = vizmennyiseg;
        this.novenyTipus = "fa";
    }
}

class virag extends Noveny {
    public virag(String faj,int vizmennyiseg) {
        this.faj = faj;
        this.vizmennyiseg = vizmennyiseg;
        this.novenyTipus = "virág";
    }
}

class kert {
    public List<Noveny> novenyek;

    public kert() {
        this.novenyek = new ArrayList<>();
    }

    public void kerthezAdas(Noveny noveny) {
        novenyek.add(noveny);
    }

    private int vizreVanSzuksege() {
        int db = 0;
        for (Noveny noveny : novenyek) {
            if (noveny.novenyTipus == "fa" && noveny.vizmennyiseg < 10) {
                db++;
            } else if (noveny.novenyTipus == "virág" && noveny.vizmennyiseg < 5) {
                db++;
            } 
       }
       return db;
    };


    public void ontoz(int mennyivel) {
        int vizPerNoveny = mennyivel / vizreVanSzuksege();
        for (Noveny noveny : novenyek) {
            if (noveny.novenyTipus == "fa" && noveny.vizmennyiseg < 10) {
                noveny.vizmennyiseg += vizPerNoveny * 0.4;
            } else if (noveny.novenyTipus == "virág" && noveny.vizmennyiseg < 5) {
                noveny.vizmennyiseg += vizPerNoveny * 0.75;
            }
        }
        kertAllapot();
    }

    public void kertAllapot() {
        for (Noveny noveny : novenyek) {
            if (noveny.novenyTipus == "fa" && noveny.vizmennyiseg < 10) {
                System.out.println("A " + noveny.faj + "fának vízre van szüksége."); }
            else if (noveny.novenyTipus == "fa" && noveny.vizmennyiseg >= 10) {
                System.out.println("A " + noveny.faj + "fának nincs vízre szüksége.");
            } else if (noveny.novenyTipus == "virág" && noveny.vizmennyiseg < 5) {
                System.out.println("A " + noveny.faj + "virágnak vízre van szüksége.");
            } else if (noveny.novenyTipus == "virág" && noveny.vizmennyiseg >= 5) {
                System.out.println("A " + noveny.faj + "virágnak nincs vízre szüksége.");
            }
        }
    }
}

public class kertClass {
    public static void main(String[] args) {
        kert Kert = new kert();

        virag Sarga = new virag("sárga",1);
        virag Kek = new virag("kék",2);
        fa Lonc = new fa("lonc",4);
        fa Narancs = new fa("narancs",5);


        Kert.kerthezAdas(Sarga);
        Kert.kerthezAdas(Kek);
        Kert.kerthezAdas(Lonc);
        Kert.kerthezAdas(Narancs);

        Kert.ontoz(40);
        Kert.ontoz(70);
    }
}