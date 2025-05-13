package uebung2;

public interface Queue {
    boolean isEmpty();
    boolean isFull();
    void enqueue(Object v);
    Object dequeue();
}
