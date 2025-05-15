package primenumber;

public class PrimeNumberChecker {
    
    // Phương thức kiểm tra số nguyên tố
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Phương thức in ra các số nguyên tố trong khoảng [1, n]
    public void printPrimesInRange(int n) {
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        checker.printPrimesInRange(20); // Kết quả: 2 3 5 7 11 13 17 19
    }
}
