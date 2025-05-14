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

    public boolean isEmpty(boolean isQueueA) {
        return isQueueA ? firstA == lastA : firstB == lastB;
    }


    public boolean isFull(boolean isQueueA) {
        return isQueueA ? (firstA == (lastA+1) % (queue.length/2)) : (firstB == (lastB+1) % (queue.length/2) + queue.length/2);
    }


    public void enqueue(Object v, boolean isQueueA) {
        if(isFull(isQueueA)){
            String Queue = isQueueA?"QueueA":"QueueB";
            throw new RuntimeException("enqueue to full " +  Queue);
        }

        if (isQueueA) {
            int next = (lastA+1) % (queue.length/2);
            queue[lastA] = v;
            lastA = next;
        }else{
            int next = (lastB+1) % (queue.length/2) + queue.length/2;
            queue[lastB] = v;
            lastB = next;
        }
    }


    public Object dequeue(boolean isQueueA) {
        if(isEmpty(isQueueA)){
            String Queue = isQueueA? "QueueA":"QueueB";
            throw new RuntimeException("dequeue from empty " + Queue);
        }

        Object x;
        if (isQueueA) {
            x = queue[firstA];
            queue[firstA] = null;
            firstA = (firstA+1) % (queue.length/2);
        }else {
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
