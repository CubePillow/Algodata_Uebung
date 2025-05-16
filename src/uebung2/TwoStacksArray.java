package uebung2;

public class TwoStacksArray {
    int topA;
    int topB;
    Object[] stack;

    public TwoStacksArray(int n) {
        topA = 0;
        topB = n-1;
        stack = new Object[n];
    }


    public void push(Object v, boolean isStackA) {
        if(isFull()){
            throw new RuntimeException("push to full StackArray");
        }

        if(isStackA) {
            stack[topA] = v;
            topA = topA + 1;
        }else{
            stack[topB] = v;
            topB = topB - 1;
        }
    }


    public Object pop(boolean isStackA) {
        if(isEmpty(isStackA)){
            String StackName = isStackA ? "StackA" : "StackB";
            throw new RuntimeException("pop from empty " +  StackName);
        }

        Object value;
        if(isStackA){
            topA = topA - 1;
            value = stack[topA];
            stack[topA] = null;
        }else{
            topB = topB + 1;
            value = stack[topA];
            stack[topA] = null;

        }

        return value;
    }


    public boolean isEmpty(boolean isStackA) {
        return isStackA?topA == 0 :topB == stack.length-1;
    }

    public boolean isFull() {
        return topA - topB == 1;
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
