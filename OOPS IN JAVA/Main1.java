import java.util.Scanner;
import java.util.Stack;

public class Main1 {
    public static void pushAtb(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtb(s, data);
        s.push(top);
    }

    public static void selectionSort(int[] a) {
        Scanner sc = new Scanner(System.in);
        Main1 m = new Main1();
        Stack<Integer> s = new Stack<>();
        s.push(sc.nextInt());
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtb(s, 4);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
