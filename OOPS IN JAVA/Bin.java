import java.util.*;

public class Bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Madhan";
        char d = 'A';
        int o = (char) d + 32;
        System.out.println((char) o);

        System.out.println(s);
        StringBuffer p = new StringBuffer(sc.next());
        p.append("Wipro");
        System.out.println(p);
        Queue<String> q = new PriorityQueue<>();

        q.add("rout");
        q.add("sr");
        q.add("anurag");
        System.out.println(q);
        System.out.println(q.peek());

        Stack<Integer> sr = new Stack<>();
        sr.push(sc.nextInt());
        sr.push(90);
        sr.push(30);
        System.out.println(sr);
        LinkedList<Integer> l = new LinkedList<>();
        l.push(sc.nextInt());
        System.out.println(l);
        l.push(30);
        l.push(23);
        l.push(78);
        System.out.println(l.peek());
        System.out.println(l);
    }

}