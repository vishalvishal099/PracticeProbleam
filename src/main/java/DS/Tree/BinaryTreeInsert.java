package DS.Tree;

class Node {
    int data;
    Node left;
    Node right;
}

class BST {

    Node createNewNode(int data) {
        Node a = new Node();
        a.data = data;
        a.left = null;
        a.right = null;
        return a;
    }

    public Node insert(Node node, int i) {
        if (node == null) {
            return createNewNode(i);
        }
        if (i < node.data) {
            node.left = insert(node.left, i);
        } else
            node.right = insert(node.right, i);
        return node;
    }

  Node deleteNode (Node node, int data){
        if(node ==null){
            return null;
        }
        if(data < node.data) {
            node.left = deleteNode(node.left, data);
        }
        else if (data > node.data){
            node.right = deleteNode(node.right, data);
        }else
            if(node.left ==null || node.right ==null){
                Node temp;
                temp = node.left ==null ? node.right :node.left;
                if(temp ==null){
                    return null;
                }else
                    return temp;
            }
            else {
              Node successor = getSuccessor(node);
              node.data = successor.data;
              node.right = deleteNode(node,node.data);
            }

        return node;
  }


      Node getSuccessor(Node node){
        if(node ==null){
            return null;
        }
            Node temp = node.right;
        while (temp.left !=null){
            temp = temp.left;
        }
        return temp;
      }

    public void inorder(Node node) {
        if (node == null) {
            return;
        } else
            inorder(node.left);
        System.out.println(node.data);
        inorder(node.right);
    }
}


public class BinaryTreeInsert {

    public static void main(String[] args) {
        //8,3,6,10,4,7,1,14,13
        BST a = new BST();
        Node root = null;
        root = a.insert(root, 8);
        root = a.insert(root, 3);
        root = a.insert(root, 6);
        root = a.insert(root, 10);
        root = a.insert(root, 4);
        root = a.insert(root, 7);
        root = a.insert(root, 1);
        root = a.insert(root, 14);
        root = a.insert(root, 13);

        root = a.deleteNode(root, 3);
        a.inorder(root);

    }
}
