class Problem10 {

    /*
     * Problem 10
     *
     * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
     * Find the sum of all the primes below two million.
     */
    static long problem10(long max) {
        long sum = 5;
        int prime = 5;
        while (prime < max) {
            if (Problem3.isPrime(prime))
                sum += prime;
            prime = Problem7.getNextPossiblePrime(prime);
        }
        return sum;
    }
}
