import java.util.Scanner;

public class nseq {
    private static Scanner sc = new Scanner(System.in);

    public static void reversePrint(int n) {
        if (n <= 0) {
            return;
        }
        int current = sc.nextInt();

        reversePrint(n - 1);
        System.out.print(current + " ");
    }

    public static void main(String[] args) {
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            reversePrint(n);
        }
    }
}