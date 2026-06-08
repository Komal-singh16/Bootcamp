import java.util.*;

// Node class for Doubly Linked List
class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

// Doubly Linked List class
class DoublyLinkedList {
    Node head;

    // Insert node at the end
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
        newNode.prev = temp;
    }

    // Replace node data at given index
    public void replaceAtIndex(int index, int newData) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node temp = head;
        int count = 0;

        while (temp != null && count < index) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Index out of range!");
        } else {
            temp.data = newData;
        }
    }

    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

// Main class
public class ReplaceNodeAtINodeWithFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.insert(sc.nextInt());
        }

        System.out.println("Original List:");
        list.display();

        System.out.print("Enter index to replace: ");
        int index = sc.nextInt();

        System.out.print("Enter new data: ");
        int newData = sc.nextInt();

        list.replaceAtIndex(index, newData);

        System.out.println("Updated List:");
        list.display();

        sc.close();
    }
}
