import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            generateSequences(n, k, "");
        }
    }

    public static void generateSequences(int n, int k, String current) {
        if (current.length() == n) {
            System.out.println(current);
            return;
        }

        for (int i = 1; i <= k; i++) {
            generateSequences(n, k, current + i);
        }
    }
}