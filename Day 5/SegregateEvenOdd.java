import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class SegregateEvenOdd {
     
    void push(Node head, int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    Node segregateEvenOdd(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node evenHead= head;
        Node eventail = head;
        Node oddHead= null;
        Node oddTail= null;
        Node curr = head;
        
    }
}
