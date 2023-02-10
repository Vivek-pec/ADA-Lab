import java.util.Stack;
public class Solution {
    public static Stack<Integer> reverseStack(Stack<Integer> stack) {
        revStack(stack);
        return stack;
    }

    private static void revStack(Stack<Integer> stack) {
        if (stack.empty()) {
            return;
        }
        int x = stack.pop();
        revStack(stack);
        addAtLast(stack, x);
    }

    private static void addAtLast(Stack<Integer> stack, int x) {
        if (stack.empty()) {
            stack.add(x);
            return;
        }
        int y = stack.pop();
        addAtLast(stack, x);
        stack.add(y);
    }

    public static void main(String[] args) { 
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        stack.add(6);
        System.out.println();
        Object[] temp = stack.toArray();
        System.out.println("Before Reversal:");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
        System.out.println("After Reversal:");
        reverseStack(stack);
        temp = stack.toArray();
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
        System.out.println();
    }
}
