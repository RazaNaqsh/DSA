public class Super {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor");
    }
}

class Horse extends Animal {
    Horse() {
        super(); // calls immediate parent class constructor,
        // But by default, java already calls super class first.
        // But we can use super to do these stufss,
        super.color = "brown"; // this declares color from child class to parent one
        System.out.println("Horse constructor");
    }
}