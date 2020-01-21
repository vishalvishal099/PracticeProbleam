package DS.LinkedList;

public class SegtigateLinkList {
    public static void main(String[] args) {
        Node root = null;
        LinkedListOperation linkedListOperation = new LinkedListOperation();
        root = linkedListOperation.insertNode(2, root);
        root = linkedListOperation.insertNode(3, root);
        root = linkedListOperation.insertNode(4, root);
        root = linkedListOperation.insertNode(5, root);
        root = linkedListOperation.insertNode(5, root);
        root = linkedListOperation.insertNode(7, root);
        root = linkedListOperation.insertNode(8, root);
        linkedListOperation.printLinkList(root);
         root  = linkedListOperation.segrigateEvenOdd(root);
         linkedListOperation.printLinkList(root);

    }


}

class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;

    }
}

class LinkedListOperation {

    Node getNewNode(int val) {
        Node node = new Node(val);
        return node;
    }

    Node insertNode(int data, Node node) {
        if (node == null) {
            return getNewNode(data);
        } else {
            node.next = insertNode(data, node.next);
            return node;
        }
    }

    public void printLinkList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ->  ");
            node = node.next;
        }
        System.out.print("null");
    }


    public Node segrigateEvenOdd(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node evenStart, evenEnd, oddStart, oddEnd;
        evenStart = evenEnd = oddStart = oddEnd = null;
        while (node != null) {
            if (node.data % 2 == 0) {
                if (evenStart == null) {
                    evenStart = node;
      evenEnd = evenStart;
                } else {
                    evenEnd.next = node;
                    evenEnd = evenEnd.next;
                }
            } else {
                if (oddStart == null) {
                    oddStart = node;
                    oddEnd = oddStart;
                } else {
                    oddEnd.next = node;
                    oddEnd = oddEnd.next;
                }
            }
            node = node.next;
        }
        evenEnd.next = oddStart;
        oddEnd.next = null;
        return evenStart;
    }


}


