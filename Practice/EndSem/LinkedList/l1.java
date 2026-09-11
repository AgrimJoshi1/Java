package Practice.EndSem.LinkedList;
// import java.util.*;

/*
Question 4 🟢 Beginner

Create this linked list:

10 → 20 → 30

Using a Node class.

Print only the LAST element of the linked list.

Expected output:

30

Hint:

You need to traverse until:

temp.next == null

The node at that point is the last node.
*/
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}


public class l1 {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        n1.next=n2;
        n2.next=n3;


        Node head = n1;
        Node temp = head;

        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}

    

