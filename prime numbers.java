public class PrimeChecker {

    public static void main(String[] args) {
        System.out.println("Prime numbers between 0 and 500:");

        int count = 0;
        for (int i = 2; i <= 500; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\n\nTotal primes found: " + count);
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
