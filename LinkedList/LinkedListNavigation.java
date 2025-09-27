import java.io.*;
import java.util.*;

public class LinkedListNavigation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ll a = new ll();
        String[] sl = sc.nextLine().split(" ");
        for(String s: sl)
        {
            int input = Integer.parseInt(s);
            a.ins(input);
        }
        
        int y = sc.nextInt();
        int x = sc.nextInt();
        
        node mid = a.findMid();
        node last = a.reverse(mid); 
        a.dis(mid.next,y);
        a.dis(last,x);
    }
}
class node
{
    int data;
    node next;
    node(int d)
    {
        data = d;
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
    
    node reverse(node mid)
    {
        node prev = null;
        node curr = head;
        node safety = null;
        
        while(curr!=mid)
        {
            safety = curr.next;
            curr.next = prev;
            prev = curr;
            curr = safety;
        }
        
        return prev;
    }
    
    void dis(node head,int n)
    {
        node temp = head;
    
        for(int i=1;i<n;i++)
        {
            temp = temp.next;
            if(temp == null)
            {
                System.out.println("NULL");
                return;
            }
        }
        
        System.out.println(temp.data);
              
    }
    
     node findMid()
     {
         node slow = head;
         node fast = head;
        
         while(fast!=null && fast.next!=null)
         {
             slow = slow.next;
             fast = fast.next.next;
         }
         
         return slow;
     }
}
