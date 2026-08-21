package Class16;
/*Linked list :
 Dynamic : can add unlimited nodes
 it is linear 
 nodes : data is in term of ndes it is also a object.
 Data/Add(Key) : 
 object : 
 part of list :
 NULL : if empty then it points to null and the last node too.
*/

import java.util.LinkedList;

/*
linked list is either singly doubly or circular;
*/


public class linkedlist {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.display(); // Output: 10 -> 20 -> 30 -> null
    }
}