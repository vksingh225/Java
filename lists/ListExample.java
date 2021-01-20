import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class ListExample {
    public static void main(String[] args) {
        // UseArrayList();
        // UseLinkedList();
        // UseStack();
        UseQueue();
    }

    public static void UseArrayList() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.remove(1);

        Iterator<Integer> itr = arrayList.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void UseLinkedList() {
        List<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(10);

        ll.remove(1);

        Student aman = new Student("Aman");
        List<Student> stuList = new LinkedList<>();
        stuList.add(aman);
        stuList.add(new Student("Rohan"));
        stuList.add(new Student("Shyam"));
        stuList.add(new Student("Ram"));

        stuList.remove(aman);

        Iterator<Student> itr = stuList.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void UseStack() {
        Stack<String> myStack = new Stack<>();
        myStack.add("Hello");
        myStack.add("World");
        myStack.add("Good");
        myStack.add("Morning");

        myStack.pop();

        Iterator<String> itb = myStack.iterator();
        while(itb.hasNext()) {
            System.out.println(itb.next());
        }
    }

    public static void UseQueue() {
        Queue<Integer> que = new PriorityQueue<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);

        que.remove();
        System.out.println(que);

        Iterator<Integer> itr = que.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
