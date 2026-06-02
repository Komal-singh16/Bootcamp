import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class CountNodes {
    Node head;
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    
    public int countNodes(){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        CountNodes list=new CountNodes();
        for(int i=0;i<=50;i++){
            list.insert(sc.nextInt());
        }
        System.out.println(list.countNodes());
        sc.close();
    }
}