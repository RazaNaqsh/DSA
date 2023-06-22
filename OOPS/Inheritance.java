public class Inheritance {
    public static void main(String[] args) {
        // Single level
        Fish shark = new Fish();
        shark.eat();

        // Multi level inheritance
        Human joe = new Human();
        joe.eat();
        joe.legs = 2;
        System.out.println(joe.legs);
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Single level inheritance

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims");
    }
}

// Multi level

class Mammal extends Animal {
    int legs;
}

class Human extends Mammal {
    char gender;
}