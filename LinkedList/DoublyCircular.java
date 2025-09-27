import java.util.*;
public class DoublyCircular {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      ll obj = new ll();
      while(sc.hasNext())
      {
        int d = sc.nextInt();
        obj.ins(d);
      }
      obj.dis();
  }
}

class Node
{
  int data;
  Node left;
  Node right;
  Node(int d)
  {
    data = d;
  }
}

class ll{
  
  Node head = null;
  Node old = null;
  
  void ins(int val)
  {
    Node nn = new Node(val);
    if(head==null)
    {
      head = nn;
      old = nn;
      nn.right = head;
      head.left = nn;
    }
    else{
      old.right = nn;
      nn.left = old;
      nn.right = head;
      old = nn;
      head.left = nn;
    }
  }
  
  void dis()
  {
    Node temp = head;
    if(head==null)
    {
        return;
    }
    System.out.print(temp.data+" ");
    temp = temp.right;
    while(temp!=head)
    {
      System.out.print(temp.data+" ");
      temp = temp.right;
    }
    
  }
}
