class Shape {
    // String color;
    void shpe() {
        System.out.println("this is parent class");
    }
}

class Rectangle extends Shape {
    void rec() {
        System.out.println("This is rectangle");
    }
}

class Triangle extends Rectangle {
    void tri() {
        System.out.println("This is child class");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.tri();
        t.shpe();
        t.rec();
    }
}
