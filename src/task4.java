import java.util.Scanner;

public class task4 {
    public static int powerN(int b, int n){
        if ( n == 0) {
            return 1;
        }
        return (int) Math.pow(b, n) + powerN(b, n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Scanner pc = new Scanner (System.in);
        int b = sc.nextInt();
        int n = pc.nextInt();
        int result = powerN(b, n);

        for (int i = 0; i <= n; i++) {
            System.out.print(b + "^" + i + (i < n ? " + " : " = "));
        }
        System.out.println(result);
    }
}