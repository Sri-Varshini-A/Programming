//No global declaration

import java.util.*;
class node{
   int data;
   node next;
   node(int d){
       data=d;
       next=null;
   }
}

class ll{
   node ins(node head,int val)
   {
       node nn=new node(val);
       if(head==null){
           head=nn;
       }
       else{
           node t = head;
           while(t.next!=null)
           {
               t = t.next;
           }
           t.next = nn;
       }
       return head;
   }
   void dis(node head){
       node temp=head;
       while(temp!=null){
           System.out.print(temp.data+" ");
           temp=temp.next;
       }
   }
}

public class singly2{
   public static void main(String[] args) {
       Scanner z=new Scanner(System.in);
       ll a=new ll();
       node head = null;
       while(z.hasNext()){

           int d=z.nextInt();

           head = a.ins(head,d);

       }

       a.dis(head);
   }
}
