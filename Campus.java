class Person {
    public String name;
    public int age;
    public String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + " a " + age + " year old " + gender);
    }
}

class Mentor extends Person {
    private String level;

    public Mentor(String name,int age,String gender,String level) {
        super(name, age, gender);
        this.level = level;
    }

        public Mentor() {
        super("Jane Doe", 30, "female");
        this.level = "intermediate";
    }

    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " " + level + " mentor.");
    }
}

class Sponsor extends Person {
    private String company;
    private int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    public Sponsor() {
        super("Jane Doe", 30, "female");
        this.company = "Google";
        this.hiredStudents = 0;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " who represents " + company +
                " and hired " + hiredStudents + " students so far.");
    }

    public void hire() {
        this.hiredStudents++;
    }

    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }
}

class Student extends Person {
    private String previousOrganization;
    private int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        super("Jane Doe", 30, "female");
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization +
                " who skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays(int numberOfDays) {
        this.skippedDays += numberOfDays;
    }
}

class Cohort {
    private String name;
    private java.util.List<Student> students;
    private java.util.List<Mentor> mentors;

    public Cohort(String name) {
        this.name = name;
        this.students = new java.util.ArrayList<>();
        this.mentors = new java.util.ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    public void info() {
        System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
    }
}

public class Campus {
    public static void main(String[] args) {
        Cohort cohort = new Cohort("AWESOME");

        Person mark = new Person("Mark", 46, "male");
        Person jane = new Person();
        Student john = new Student("John Doe", 20, "male", "BME");
        Student jane2 = new Student();
        Mentor gandhi = new Mentor("Gadhi", 148, "male", "senior");
        Mentor jane3 = new Mentor();
        Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX");
        elon.hire();
        elon.hire();
        elon.hire();
        elon.hire();
        elon.hire();
        Sponsor jane4 = new Sponsor();
        jane4.hire();
        jane4.hire();
        jane4.hire();

        mark.getGoal();
        mark.introduce();
        jane.getGoal();
        jane.introduce();
        john.getGoal();
        john.introduce();
        jane2.getGoal();
        jane2.introduce();
        gandhi.getGoal();
        gandhi.introduce();
        jane3.getGoal();
        jane3.introduce();
        elon.getGoal();
        elon.introduce();

        cohort.addMentor(gandhi);
        cohort.addMentor(jane3);
        cohort.addStudent(john);
        cohort.addStudent(jane2);

        cohort.info();
    }
}