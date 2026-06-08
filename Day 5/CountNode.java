import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
//without function call, count the number of nodes in a linked list
public class CountNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int data=sc.nextInt();
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                continue;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println(count);
        sc.close();
    }
}
