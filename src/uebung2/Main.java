package uebung2;

public class Main {
    public static void main(String[] args) {
        StackArray stack = new StackArray(4);
        stack.push("1");
        stack.push("2");
        stack.pop();
        System.out.println(stack);

        StackWithTwoArrays stackWithTwoArrays = new StackWithTwoArrays(4);
        stackWithTwoArrays.push("a1", true);
        stackWithTwoArrays.push("b1", false);
        System.out.println(stackWithTwoArrays);

        stackWithTwoArrays.push("a2", true);
        stackWithTwoArrays.push("b2", false);
        System.out.println(stackWithTwoArrays);

        stackWithTwoArrays.pop(true);
        System.out.println(stackWithTwoArrays);
    }
}



