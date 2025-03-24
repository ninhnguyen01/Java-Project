import java.util.Stack;

// Stack Data Structure - Last In First Out Concept (LIFO)
public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        // Add item to stack
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("CoD");
        stack.push("Halo");
        stack.push("Battlefield");
        stack.push("Cyberpunk 2077");

        // Search for item in stack - index starts at 1
        System.out.println("Stack position: " + stack.search("Cyberpunk 2077"));

        if (stack.empty()) {
            System.out.println(true);
        }

        else {
            System.out.println(stack);
            // view the last item (top item)
            System.out.println("Last item (top item): " + stack.peek());
        }

        // Remove the last item in stack
        String removedGame = stack.pop();
        // print out stack again to verify
        System.out.println(stack);
        System.out.println("The last item popped: " + removedGame);
    }
}