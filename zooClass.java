package zoo;

abstract class Animal {
    String name;
    String gender;
    int weight;
    int age;

    public Animal(String name, String gender, int weight, int age) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void adjHangot() {
        System.out.println("hang");
    }

    public void breed() {
        System.out.println("breed");
    }
} 

class Bird extends Animal {
    public Bird(String name, String gender,int weight, int age) {
        super(name,gender,weight,age);
    }

    @Override
    public void adjHangot() {
        System.out.println("csiripel");
    }
    
    @Override
    public void breed() {
        System.out.println("Tojás rakás");
    }
}

class Mammal extends Animal {
    public Mammal(String name, String gender,int weight, int age) {
        super(name,gender,weight,age);
    }
    
    @Override
    public void breed() {
        System.out.println("élő utódot szül");
    }
}

class Reptile extends Animal {
    public Reptile(String name, String gender,int weight, int age) {
        super(name,gender,weight,age);
    }
    
    @Override
    public void breed() {
        System.out.println("Tojás rakás");
    }
}




public class zooClass {
    public static void main(String[] args) {
        
        Bird csibe = new Bird("Csibe", "him",2 , 1);
        csibe.getGender();
        csibe.adjHangot();

    }
}
