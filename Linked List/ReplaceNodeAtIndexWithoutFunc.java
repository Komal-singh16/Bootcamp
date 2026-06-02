import java.util.*;

class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        prev = next = null;
    }
}

public class ReplaceNodeAtIndexWithoutFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = null, tail = null;

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            Node newNode = new Node(value);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        System.out.print("Original List: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.print("\nEnter index to replace: ");
        int index = sc.nextInt();

        System.out.print("Enter new data: ");
        int newData = sc.nextInt();

        temp = head;
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

        System.out.print("Updated List: ");
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        sc.close();
    }
}