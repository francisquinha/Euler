import static java.lang.Math.sqrt;

class Problem3 {

    /*
     * Problem 3
     *
     * The prime factors of 13195 are 5, 7, 13 and 29.
     * What is the largest prime factor of the number 600851475143?
     */
    static long problem3(long number) {
        long prime = ((long) (sqrt(number) - 1) / 6) * 6 + 1;
        for ( ; prime > 1; prime -= 6) {
            if (isPrime(prime) && number % prime == 0)
                return prime;
            if (isPrime(prime - 2) && number % (prime - 2) == 0)
                return prime - 2;
        }
        return 1;
    }

    static boolean isPrime(long number) {
        if (number == 2 || number == 3) return true; // 2 and 3 are prime
        if (number % 2 == 0 || number % 3 == 0) return false; // numbers divisible by 2 and 3 are not prime
        for (long i = 5; i * i < number; i += 6) { // all primes above 3 are of the form 6k + 1 or 6k - 1
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }
        return true;
    }

}
