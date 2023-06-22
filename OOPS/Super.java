public class Super {
    public static void main(String[] args) {
        Horse h = new Horse();
    }
}

class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
}

class Horse extends Animal {
    Horse() {
        super();
        System.out.println("Horse constructor");
    }
}