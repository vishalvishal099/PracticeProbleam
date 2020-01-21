package DS.LinkedList;

import java.util.Stack;

public class StackImpl {
    int arr[] = new int[10];
    int top = -1;

    public void push(int data) {
        if (top == arr.length - 1) {
            System.out.println("Stack overflow ");
        } else {
            top++;
            arr[top] = data;
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("There is no element available in the stack");
        } else {
            top = top - 1;
        }
    }

    public int top() {
        return arr[top];
    }

    public boolean isEmpty() {
        if (top != -1) {
            return false;
        } else {
            return true;
        }
    }

    public void show(){
        for (int i : arr){
            System.out.println(i);

        }
    }
    public static void main(String[] args) {
        StackImpl stack = new StackImpl();
        stack.pop();
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.pop();
        stack.pop();
        stack.push(16);
        stack.push(18);
        stack.push(19);
        stack.push(120);
        //stack.push(21);
        //stack.push(22);
        //stack.push(23);
        stack.show();
    }
}
