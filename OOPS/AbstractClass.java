public class AbstractClass {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        // h.changeColor();
        System.out.println(h.color);

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "brown";
    }

    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    void changeColor() {
        color = "blue";
    }

    void walk() {
        System.out.println("Horse walks on four legs");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "green";
    }

    void walk() {
        System.out.println("Chicken walks on two legs");
    }
}