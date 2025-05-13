package uebung2;

public class TwoQueuesArray {
    int firstA, lastA, firstB, lastB;
    Object[] queue;

    public TwoQueuesArray(int n) {
        firstA = 0;
        lastA = 0;
        firstB = n/2;
        lastB = n/2;
        queue = new Object[n];
    }

    public boolean isEmpty(boolean isStackA) {
        return isStackA ? firstA == lastA : firstB == lastB;
    }


    public boolean isFull(boolean isStackA) {
        return isStackA ? (firstA == (lastA+1) % (queue.length/2)) : (firstB == (lastB+1) % (queue.length/2) + queue.length/2);
    }


    public void enqueue(Object v, boolean isStackA) {
        if (isStackA) {
            int next = (lastA+1) % (queue.length/2);
            if (next == firstA) {
                throw new RuntimeException("enqueue to full QueueArray A");
            }
            queue[lastA] = v;
            lastA = next;
        }else{
            int next = (lastB+1) % (queue.length/2) + queue.length/2;
            if (next == firstB) {
                throw new RuntimeException("enqueue to full QueueArray B");
            }
            queue[lastB] = v;
            lastB = next;
        }
    }


    public Object dequeue(boolean isStackA) {
        Object x;
        if (isStackA) {
            if (firstA == lastA) {
                throw new RuntimeException("equeue from empty queue A");
            }
            x = queue[firstA];
            queue[firstA] = null;
            firstA = (firstA+1) % (queue.length/2);
        }else {
            if (firstB== lastB){
                throw new RuntimeException("equeue from empty queue B");
            }
            x = queue[firstB];
            queue[firstB] = null;
            firstB = (lastB+1) % (queue.length/2) + queue.length/2;
        }
        return x;
    }

    public Object[] getQueue() {
        return queue;
    }

    public int getFirstA() {
        return firstA;
    }

    public int getLastA() {
        return lastA;
    }

    public int getFirstB() {
        return firstB;
    }

    public int getLastB() {
        return lastB;
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
