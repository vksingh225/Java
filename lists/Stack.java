public class Stack {
    // A linked list node
    private class Node {

        int data;
        Node link;
    }

    Node top;

    Stack() {
        this.top = null;
    }

    public void push(int x) {
        Node temp = new Node();

        temp.data = x;

        temp.link = top;

        top = temp;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public void pop() {
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }

        top = (top).link;
    }

    public void display() {
        if (top == null) {
            System.out.print("\nStack Underflow");
        } else {
            Node temp = top;
            while (temp != null) {

                // print node data
                System.out.println(temp.data);

                // assign temp link to temp
                temp = temp.link;
            }
        }
    }
}
