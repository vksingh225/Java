public class DriverMain {
    public static void main(String[] args) {
        Stack myStack = new Stack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        myStack.pop();

        myStack.display();
    }
}
