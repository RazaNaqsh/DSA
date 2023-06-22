public class Constructors {
    public static void main(String args[]) {

        Student s1 = new Student();
        Student s2 = new Student("Raza");
        s2.roll = 1;
        System.out.println(s2.name);

        s2.marks[0] = 90;
        s2.marks[1] = 100;
        s2.marks[2] = 80;
        Student s3 = new Student(s2);

        s2.roll = 2;
        // example of shallow copying, ive changed the value of s2's marks after copying
        // it to s3, but still down below when im printing s3 marks, the changes of s2
        // are reflected there. this is shallow or reference copy
        s2.marks[0] = 1;

        // ? We copied s3.roll from s2, but not the name, thus s3.name is null
        System.out.println(s2.roll);
        System.out.println(s3.roll);
        System.out.println(s3.name);
        for (int i = 0; i < 3; i++) {
            System.out.print(s3.marks[i] + " ");
        }
    }
}

class Student {
    String name;
    int roll;
    int marks[];

    // Default Constructor
    Student() {
        marks = new int[3];
        System.out.println("New student");
    }

    // Parameterized Constructor
    Student(String name) {
        marks = new int[3];
        this.name = name;

    }

    // Copy Constructor
    Student(Student s2) {
        marks = new int[3];

        this.roll = s2.roll;
        this.marks = s2.marks;
    }
}