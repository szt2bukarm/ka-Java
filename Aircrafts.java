class Aircraft{
    int max_ammo;
    int ammo;
    int damage;

    public Aircraft(int max_ammo,int damage) {
        this.max_ammo = max_ammo;
        this.damage = damage;
        this.ammo = 0;
    }

    public int fight() {
        int damageCaused = ammo * damage;
        this.ammo = 0;
        return damageCaused;
    }

    public int refillAmmo(int refillAmount) {
        if (refillAmount < max_ammo) {
            ammo = refillAmount;
            return ammo;
        } else {
            ammo = max_ammo;
            return refillAmount - ammo;
        }
    }
}

class F16 extends Aircraft {
    String type;
    public F16() {
        super(8, 30);
        type = "F16";
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return "Type " + type + ",Ammo " + ammo + ",Base damage " + damage + ",All damage: " + ammo * damage;
    }

    public boolean isPriority() {
        return false;
    }
}

class F35 extends Aircraft {
    String type;
    public F35() {
        super(12, 50);
        type = "F35";
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return "Type " + type + ",Ammo " + ammo + ",Base damage " + damage + ",All damage: " + ammo * damage;
    }

    public boolean isPriority() {
        return true;
    }
}

public class Aircrafts {
    public static void main(String[] args) {
        F16 F16  = new F16();
        F16.refillAmmo(300);
        System.out.println(F16.getStatus());
        System.out.println("Damage: " + F16.fight());
        System.out.println(F16.getStatus());
        System.out.println(F16.getType());
        System.out.println(F16.isPriority());

        F35 F35  = new F35();
        F35.refillAmmo(300);
        System.out.println(F35.getStatus());
        System.out.println("Damage: " + F35.fight());
        System.out.println(F35.getStatus());
        System.out.println(F35.getType());
        System.out.println(F35.isPriority());
    }
    
}
