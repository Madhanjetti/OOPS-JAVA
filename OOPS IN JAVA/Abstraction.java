//not pure abstraction
abstract class Animal {
    abstract void walk();

    public void eats() {
        System.out.println("Animals can eats");
    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Walk on 4legs");
    }
}

class Hen extends Animal {
    public void walk() {
        System.out.println("Walk on 2legs");
    }
}

class Lion extends Animal {
    public void walk() {
        System.out.println("Loin has 4 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        Animal h = new Horse();
        Animal l = new Lion();
        l.walk();
        l.eats();
        h.walk();
        h.eats();

    }
}
