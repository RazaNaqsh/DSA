public class Constructors {
    public static void main(String args[]) {

        Student s1 = new Student();
        Student s2 = new Student("Raza");
        s2.roll = 1;
        System.out.println(s2.name);

        Student s3 = new Student(s2);

        //? We copied s3.roll from s2, but not the name, thus s3.name is null
        System.out.println(s3.roll);
        System.out.println(s3.name);
    }
}

class Student {
    String name;
    int roll;

    // Default Constructor
    Student() {
        System.out.println("New student");
    }

    // Parameterized Constructor
    Student(String name) {
        this.name = name;
    }

    // Copy Constructor
    Student(Student s2) {
        this.roll = s2.roll;
    }
}