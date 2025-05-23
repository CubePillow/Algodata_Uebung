package uebung2;

public class StackArray implements Stack {
    int top;
    Object[] stack;

    public StackArray(int capacity) {
        top = 0;
        stack = new Object[capacity];
    }

    @Override
    public void push(Object v) {
        if (top >= stack.length){
            throw new RuntimeException("push to full StackArray");
        }
        stack[top] = v;
        top = top + 1;
    }

    @Override
    public Object pop() {
        if (top == 0) {
            throw new RuntimeException("pop from empty stack");
        }
        top = top - 1;
        Object value = stack[top];
        stack[top] = null;
        return value;
    }

    @Override
    public boolean isEmpty() {
        return (top == 0);
    }

    @Override
    public boolean isFull() {
        return (top >= stack.length);
    }

    public int getTop() {
        return top;
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
