class Animal {
    int numberOfLegs;
    int numberOfEyes;
    String name;

    public Animal(int numberOfLegs, int numberOfEyes , String name) {
        this.numberOfEyes = numberOfEyes;
        this.numberOfLegs = numberOfLegs;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }
    
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void printAnimal() {
        System.out.println("Név: " + name + ", Lábak száma: " + numberOfLegs + ", Szemek száma: " + numberOfEyes);
    }
}

public class AnimalClass {
    public static void main(String[] args) {
        Animal kutya = new Animal(4, 2, "Benji");
        kutya.printAnimal();
        
    }
}
