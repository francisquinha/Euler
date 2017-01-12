class Problem1 {

    /*
     * Problem 1
     *
     * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
     * The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
     */
    static int problem1(int max, int[] divisors) {
        int sum = 0;
        for (int i = 0; i < max; i++) {
            for (int divisor : divisors) {
                if (i % divisor == 0) {
                    sum += i;
                    break;
                }
            }

        }
        return sum;
    }

}
