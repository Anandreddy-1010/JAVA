import java.util.Stack;

public class IntegerStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }

        System.out.println("Stack after pushing 1-5: " + stack);

        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        System.out.println("Stack after peek(): " + stack);
    }
}
