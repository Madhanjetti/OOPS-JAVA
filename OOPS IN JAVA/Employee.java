class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    

    }
}

class Employee {
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(15);
        Node c = new Node(90);
        Node d = new Node(34);
        Node e = new Node(89);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node.display(a);
        Node.num(10);

    }
}