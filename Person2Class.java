class Person {
    String name;
    int age;
    String gender;
    String goal;

    public Person(String name, int age, String gender, String goal) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.goal = goal;
    }

    public Person() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.goal = "Live for the moment";
    }
    
    public void getGoals() {
        System.out.println("My goal is: " + goal);
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}


public class Person2Class {
    public static void main(String[] args) {
        Person Peter = new Person("Peter", 25, "male", "learning to code");
        Peter.introduce();
        Peter.getGoals();
        Person Jane = new Person();
        Jane.introduce();
        Jane.getGoals();
    }
}
