import java.util.*;
public class PalindromeLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ll a = new ll();
        
        while(sc.hasNext())
        {
            int d = sc.nextInt();
            a.ins(d);
        }
        
        if(a.isPalindrome())
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
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
    
    boolean isPalindrome()
    {
        //Find mid
        node slow = head;
        node fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Reverse first-half
        node prev = null;
        node safety = null;
        node curr = head;
        
        while(curr!=slow)
        {
            safety = curr.next;
            curr.next = prev;
            prev = curr;
            curr = safety;
        }
        
        //Condition for odd number of nodes
        if(fast!=null)
        {
            curr = curr.next;
        }
        
        //Compare first-half and second-half
        while(prev!=null)
        {
            if(prev.data == curr.data)
            {
                prev = prev.next;
                curr = curr.next;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
    
