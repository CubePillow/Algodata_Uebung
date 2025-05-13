package uebung2;

public class Main {
    public static void main(String[] args) {
        //StackArray
        StackArray stack = new StackArray(4);
        stack.push("1");
        stack.push("2");
        stack.pop();
        System.out.println(stack);

        //TwoStacksArray
        TwoStacksArray twoStacksArray = new TwoStacksArray(4);
        twoStacksArray.push("a1", true);
        twoStacksArray.push("b1", false);
        System.out.println(twoStacksArray);

        twoStacksArray.push("a2", true);
        twoStacksArray.push("b2", false);
        System.out.println(twoStacksArray);

        twoStacksArray.pop(true);
        System.out.println(twoStacksArray);

        //QueueArray
        QueueArray queueArray = new QueueArray(4);
        queueArray.enqueue(1);
        queueArray.enqueue(2);
        queueArray.dequeue();
        System.out.println(queueArray);

        //TwoQueuesArray
        TwoQueuesArray twoQueuesArray = new TwoQueuesArray(6);
        twoQueuesArray.enqueue("a1", true);
        twoQueuesArray.enqueue("a2",true);
        twoQueuesArray.enqueue("b1", false);
        twoQueuesArray.enqueue("b2", false);
        System.out.println(twoQueuesArray);

        twoQueuesArray.dequeue(true);
        twoQueuesArray.enqueue("a3", true);
        System.out.println(twoQueuesArray);
    }
}



