import java.util.*;

class node {
    int data;
    node next;

    node(int d) {
        data = d;
        next = null;
    }
}

class ll {
    node head = null, prev = null;

    void ins(int val) {
        node nn = new node(val);
        if (head == null) {
            head = nn;
            prev = nn;
            nn.next = head;
        } else {
            prev.next = nn;
            nn.next = head;
            prev = nn;
        }
    }

    void dis() {
        if (head == null) {
            return;
        }

        node temp = head;
        do {
            if (temp != null) {
                System.out.print(temp.data + " ");
            }
            temp = temp.next;
        } while (temp != head);
    }
}

public class singlyCircular{
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        ll a = new ll();
        while (z.hasNext()) {
            int d = z.nextInt();
            a.ins(d);
        }
        a.dis();
    }
}
