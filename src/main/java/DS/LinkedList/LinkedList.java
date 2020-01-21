package DS.LinkedList;

public class LinkedList {
    public static int size;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public Node head;
    public Node tail;


    private void addNodeAddBegining(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            size++;
        } else {

            node.next = head;
            head = node;
            size++;
        }

    }

    private void addNodeAtEnd(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            size++;
        } else {
            tail.next = node;
            tail = node;
            size++;
        }
    }

    private void addAtPosition(int data, int position) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            size++;
        } else {
            Node temp = head;
            for (int i = 0; i < position - 2; i++) {
                temp = temp.next;
            }

            node.next = temp.next;

            // node.next=temp;
            temp.next = node;
            size++;
        }
    }


    private void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print("  " + current.data);
            current = current.next;
        }

    }

    private void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("Link is empty");
        } else {
            Node temp = head;
            for (int i = 0; i < position - 2; i++) {
                temp = temp.next;
            }
            Node current = temp.next;
            temp.next = current.next;
            size--;
        }
    }


    public static void main(String args[]) {

        LinkedList ls = new LinkedList();
        ls.addNodeAddBegining(1);
        ls.addNodeAddBegining(2);
        ls.addNodeAddBegining(3);
        ls.addNodeAtEnd(5);
        ls.addNodeAddBegining(4);
        ls.addNodeAtEnd(6);
        ls.addAtPosition(7, 3);
        ls.deleteAtPosition(4);
        System.out.println(size + "    size of linkedlist");


        ls.displayList();
    }


}
