import java.util.Scanner;

public class Main {
    public static int square(int n) {
        if (n <= 1) {
            return n * n;
        }
        return (n * n) + square(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = square(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "^2" + (i < n ? " + " : " "));
        }
        System.out.println("= " + result);
    }
}