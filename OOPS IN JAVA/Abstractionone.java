interface Animal {
    int noofeyes = 4;

    public void walk();
}

class Horse implements Animal {
    public void walk() {
        System.out.println("walk with 4 legs " + noofeyes);
    }
}

public class Abstractionone {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
    }
}
