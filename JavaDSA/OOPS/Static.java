public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "CSVP";

        Student s2 = new Student();
        System.out.println(s2.schoolName);
    }
}

class Student {
    // static things will remain same thru out every objects that are created from
    // this class.
    static int returnPercentage(int math, int phys, int chem) {
        return (math + phys + chem) / 3;
    }

    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}