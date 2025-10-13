import java.util.Stack;

public class StudentStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        
        stack.push("Anand");
        stack.push("bunny");
        stack.push("chinnu");
        stack.push("tommy");
        stack.push("vikram");

        System.out.println("Initial stack: " + stack);

        String poppedName = stack.pop();
        System.out.println("Popped name: " + poppedName);
        System.out.println("Updated stack: " + stack);
    }
}
