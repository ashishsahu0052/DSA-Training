package logic_building;

public class Q1_PrimeNumber {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = true; // Assume the number is prime
        for (int i = 2; i <= Math.sqrt(num); i++) { // Check divisibility from 2 to √num
            if (num % i == 0) {
                isPrime = false; // Found a divisor, so it's not prime
                break; // No need to check further
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
