import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        next=null;
        prev=null;
    }
}
public class DeleteNodeAtKthInCLL {
    Node head;
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            head.next = head;
            return;
        }
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }
    void deleteAtKth(int k){
        if(head == null) return;
                if(k == 1){
            Node temp = head;
            while(temp.next != head){
                temp = temp.next;
            }
            temp.next = head.next;
            head = head.next;
            return;
        }
        Node temp = head;
        for(int i = 1; i < k-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DeleteNodeAtKthInCLL list = new DeleteNodeAtKthInCLL();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int data = sc.nextInt();
            list.insert(data);
        }

    }
}
