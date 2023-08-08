class student {
    public void StudInfo(String name) {
        System.out.println("Name is" + name);
    }

    public void StudInfo(int rollno) {
        System.out.println("roll no is" + rollno);
    }

    public void StudInfo(String name, int rollno) {
        System.out.println("Name and roll no is " + name + " " + rollno);
    }
}

public class Polymorphism1 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.StudInfo("madhan");
        s1.StudInfo("madhan", 28);
    }
}