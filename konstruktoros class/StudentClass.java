class Student {
    int id;
    String name;
    double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return String.format("Student: id: %d, name: %s, cgpa: %.2f",this.id, this.name, this.cgpa);
    }

    
}

public class StudentClass {
    public static void main(String[] args) {
        
        Student Peti = new Student(1,"Peti",3.84);
        System.out.println(Peti.toString());
    }
}
