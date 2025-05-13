package uebung2;

public class TwoStacksArray {
    int topA;
    int topB;
    Object[] stack;

    public TwoStacksArray(int capacity) {
        topA = 0;
        topB = capacity-1;
        stack = new Object[capacity];
    }

    public void push(Object v, boolean isStackA) {
        if (topA == topB +1) {
            throw new RuntimeException("push to full Stack");
        }

        if (isStackA){
            stack[topA] = v;
            topA = topA + 1;
        }else{
            stack[topB] = v;
            topB = topB - 1;
        }
    }

    public Object pop(boolean isStackA) {
        Object value;

        if (isStackA){
            if (topA == 0) {
                throw new RuntimeException("pop from empty stack A");
            }
            topA = topA - 1;
            value = stack[topA];
            stack[topA] = null;
        }else{
            if (topB == stack.length - 1) {
                throw new RuntimeException("pop from empty stack B");
            }
            topB = topB + 1;
            value = stack[topB];
            stack[topB] = null;
        }
        return value;
    }


    public boolean isEmpty(boolean isStackA) {
        return (isStackA ? topA ==0 : topB == stack.length -1);
    }

    public boolean isFull() {
        return topA == topB + 1;
    }

    public int getTopA() {
        return topA;
    }

    public void setTopA(int topA) {
        this.topA = topA;
    }

    public int getTopB() {
        return topB;
    }

    public void setTopB(int topB) {
        this.topB = topB;
    }

    public Object[] getStack() {
        return stack;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int i = stack.length - 1; i >= 0; i--) {
            sb.append(stack[i]).append("\n");
        }
        return sb.toString();
    }
}
