

public class Client {
    

    public static void main(String[] args){
        SimpleLinkedList ll = new SimpleLinkedList();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        ll.printList();

        System.out.println("----");
        ll.update(5, 9);

        ll.printList();
        System.out.println("----");
        ll.remove(4);
        ll.printList();
    }
}