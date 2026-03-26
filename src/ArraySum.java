void main() {
    public static int sumArray(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        return arr[n - 1] + sumArray(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] myArray = {5, 10, 15, 20};
        int n = 3;
        int result = sumArray(myArray, n);
            System.out.println("Array: {5, 10, 15, 20}");
            System.out.println("Sum of the first " + n + " elements: " + result);
    }
}