import java.util.Scanner;
import java.util.Stack;

public class Task4 {

    public static void insertAtBottom(Stack<Integer> stack, int value) {

        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }

        int temp = stack.pop();
        insertAtBottom(stack, value);
        stack.push(temp);
    }

    public static void reverse(Stack<Integer> stack) {

        if (stack.isEmpty()) {
            return;
        }

        int temp = stack.pop();

        reverse(stack);

        insertAtBottom(stack, temp);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }

        reverse(stack);
        System.out.println(stack);

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        sc.close();
    }
}