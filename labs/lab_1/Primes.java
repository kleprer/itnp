public class Primes {
    public static void main(String[] args) {
        for (int i = 2; i < 101; i++) {
            if (isPrime(i) == true) {
            System.out.println(i);
        }
    }
 }
 
    public static boolean isPrime(int n) {
        int count = 0;
        for (int k = 2; k < n; k++) {
            if (n%k == 0) count += 1;
        }
    
        if (count > 0) {
            return false;
        } 
        else {
            return true;
        }
    }

}