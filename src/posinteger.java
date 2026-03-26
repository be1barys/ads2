import java.util.Scanner;

public class posinteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            printReverse(sc, n);
        }
        sc.close();
    }

    public static void printReverse(Scanner sc, int n) {
        if (n <= 0) return;
        String s = sc.next();
        printReverse(sc, n - 1);
        System.out.println(s);
    }
}