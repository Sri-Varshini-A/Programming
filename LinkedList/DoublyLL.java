import java.util.*;

public class DoublyLL {
    public static void main(String[] args) {
      //System.out.println("Hello, World!");
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
    }
    else{
      old.right = nn;
      nn.left = old;
      old = nn;
    }
  }
  
  void dis()
  {
    Node temp = old;
    while(temp!=null)
    {
      System.out.print(temp.data+" ");
      temp = temp.left;
    }
    
  }
}
