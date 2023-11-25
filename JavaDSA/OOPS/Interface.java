public class Interface {
    public static void main(String[] args) {
        King grey = new King();
        grey.moves();
    }
}

interface ChessPlayer {
    void moves();
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("In linear");
    }
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("All Directions");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("All Directions but one step");
    }
}