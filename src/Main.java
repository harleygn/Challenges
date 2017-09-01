public class Main {

    public static void main(String[] args) {
        for (int n = 1; n <= 100; n++) {
            if (n % 3 == 0) {
                System.out.print("Fizz");
            }
            if (n % 5 == 0) {
                System.out.print("Buzz");
            }
            if (n % 3 != 0 && n % 5 != 0) {
                System.out.print(n);
            }
            System.out.print("\n");
        }
    }
}