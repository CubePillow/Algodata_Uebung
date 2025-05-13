package uebung2;

public class QueueArray implements Queue{
    int first, last;
    Object[] queue;

    public QueueArray(int capacity) {
        first = 0;
        last = 0;
        queue = new Object[capacity+1];
    }

    @Override
    public boolean isEmpty() {
        return (first == last);
    }

    @Override
    public boolean isFull() {
        return (first == (last+1) % queue.length);
    }

    @Override
    public void enqueue(Object v) {
        int next = (last+1) % queue.length;
        if (next == first) {
            throw new RuntimeException("enqueue to full QueueArray");
        }
        queue[last] = v;
        last = next;
    }

    @Override
    public Object dequeue() {
        if (first == last) {
            throw new RuntimeException("equeue from empty queue");
        }
        Object x = queue[first];
        queue[first] = null;
        first = (first+1) % queue.length;
        return x;
    }

    public int getFirst() {
        return first;
    }

    public int getLast() {
        return last;
    }

    public Object[] getQueue() {
        return queue;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < queue.length; i++) {
            sb.append(queue[i]).append(" ");
        }
        return sb.toString();
    }
}
