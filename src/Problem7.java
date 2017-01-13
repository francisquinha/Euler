class Problem7 {

    /*
     * Problem 7
     *
     * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
     * What is the 10 001st prime number?
     */
    static int problem7(int number) {
        int primes = 3;
        int prime = 5;
        while (primes < number) {
            prime = getNextPossiblePrime(prime);
            if (Problem3.isPrime(prime))
                primes++;
        }
        return prime;
    }

    static int getNextPossiblePrime(int prime) {
        if ((prime + 1) % 6 == 0)
            return prime + 2;
        else return prime + 4;
    }

}
