import java.util.*;
public class ReverseSinglyLL{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ll a = new ll();
        node head = null;
        while(sc.hasNext())
        {
            int d = sc.nextInt();
            a.ins(d);
        }
        node last = a.reverse();
        a.dis(last);
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
    
    void dis(node head)
    {
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    
    node reverse()
    {
        node prev = null;
        node safety = null;
        node curr = head;
        
        while(curr!=null)
        {
            safety = curr.next;
            curr.next = prev;
            prev = curr;
            curr = safety;
        }
         return prev;   
    }
}
    
