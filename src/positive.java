import java.util.Scanner;

public class positive {
    public static int sumN(int n) {
        if (n <= 0) {
            return n;
        }return n + sumN(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int result = sumN(n);
        System.out.println("The sum of the first " + n + " integers is: " + result);
    }
}