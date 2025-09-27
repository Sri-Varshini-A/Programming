import java.util.*;
public class MidSingly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ll a = new ll();
        node head = null;
        while(sc.hasNext())
        {
            int d = sc.nextInt();
            a.ins(d);
        }
        System.out.print(a.findMid());
    }
}
class node
{
    int data;
    node next;
    node(int val)
    {
        data = val;
        next = null;
    }
}
class ll
{
    node head = null;
    node old = null;
    void ins(int val)
    {
        node nn = new node(val);
        if(head==null)
        {
            head = nn;
            old = nn;
        }
        else
        {
            old.next = nn;
            old = nn;
        }
    }
    
    int findMid()
    {
        node slow = head;
        node fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow.data;
    }
}
    
