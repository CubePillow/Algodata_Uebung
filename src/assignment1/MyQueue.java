package assignment1;
import java.util.*;

public class MyQueue {
    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public MyQueue() {
        // Initialize your data structure here.
        stackPush = new Stack<>();
        stackPop = new Stack<>();
    }
    public void push(int x) {
        // Push element x to the back of the queue.
        stackPush.push(x);
    }
    public int pop() {
        // Remove and return the front element.
        if (stackPop.isEmpty()) {
            while (!stackPush.isEmpty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }
    public int peek() {
        // Return the front element.
        if (stackPop.isEmpty()) {
            while (!stackPush.isEmpty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }

    public boolean empty() {
        // Return true if the queue is empty, false otherwise
        return stackPush.isEmpty() && stackPop.isEmpty();
    }
}
