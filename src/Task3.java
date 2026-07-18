import java.util.ArrayDeque;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            int command = sc.nextInt();

            if (command == 1) {

                int value = sc.nextInt();
                deque.addFirst(value);

            } else if (command == 2) {

                int value = sc.nextInt();
                deque.addLast(value);

            } else if (command == 3) {

                System.out.println(deque.removeFirst());

            } else if (command == 4) {

                System.out.println(deque.removeLast());

            }
        }

        sc.close();
    }
}
