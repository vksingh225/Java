

public class SimpleLinkedList {
    
    Node head;
    Node tail;
    int size = 0;

    public SimpleLinkedList() {
        
    }

    /* ADDING ELEMENTS TO LIST */
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    /* UPDATING ELEMENTS AT SPECIFIC INDEX */
    public void update(int index, int data) {
        
        if (index >= size || index < 0 ) {
            System.out.println("Index out of bounds");
        } else {
            int count = 0;
            Node tempHead = head;
            while (count <= index) {
                if (count == index) {
                    head.data = data;
                    break;
                } else {
                    head = head.next;
                    count++;
                }
            }
            head = tempHead;
        }
       
    }

    /* DELETE ELEMENT FROM LIST */
    public void remove(int index) {
        if (index >= size || index < 0 ) {
            System.out.println("Index out of bounds");
        } else {
            int count = 0;
            Node tempHead = head;
            Node prevNode = head;
            Node nextNode = head.next;
            if (size == 1) {
                head = null;
            } else if (index == 0) {
                head = head.next;
            }
            else {
                while (count <= index) {
                    if(count == index) {
                        prevNode.next = nextNode;
                        head = prevNode;
                        break;
                    } else {
                        
                        prevNode = head;
                        nextNode = nextNode.next;
                        head = head.next;
                        count++;
                    }
                }

                head = tempHead;
            }
            size--;
        }
    }

    /* RETURN SIZE OF LIST */
    public int size() {
        return size;
    }

    /* PRINT LIST */
    public void printList() {
        Node tempHead = head;
        while (tempHead != null) {
            System.out.println(tempHead.data);
            tempHead = tempHead.next; 
        }
    }
}