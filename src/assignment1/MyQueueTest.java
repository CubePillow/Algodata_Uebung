package assignment1;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        System.out.println("Empty? " + q.empty());   // true

        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println("Peek: " + q.peek());     // 1

        System.out.println("Pop: " + q.pop());       // 1
        System.out.println("Peek: " + q.peek());     // 2

        q.push(4);
        System.out.println("Pop: " + q.pop());       // 2
        System.out.println("Pop: " + q.pop());       // 3
        System.out.println("Pop: " + q.pop());       // 4

        System.out.println("Empty? " + q.empty());   // true
    }
}
