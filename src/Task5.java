import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Queue<Integer> students = new LinkedList<>();

        int[] samsas = new int[n];

        for (int i = 0; i < n; i++) {
            students.add(sc.nextInt());
        }

        for (int i = 0; i < n; i++) {
            samsas[i] = sc.nextInt();
        }

        int index = 0;
        int count = 0;

        while (!students.isEmpty() && count < students.size()) {

            if (students.peek() == samsas[index]) {

                students.poll();
                index++;
                count = 0;

            } else {

                students.add(students.poll());
                count++;
            }
        }

        System.out.println(students.size());

        sc.close();
    }
}