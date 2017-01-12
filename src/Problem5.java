import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Problem5 {

    /*
     * Problem 5
     *
     * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
     * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
     */
    static int problem5(int min, int max) {
        List<Integer> factors = new ArrayList<>();
        List<Integer> newFactors;
        for (int i = min; i <= max; i++) {
            newFactors = primeFactors(i);
            factors = mergePrimeFactors(factors, newFactors);
        }
        int solution = 1;
        for (Integer factor : factors)
            solution *= factor;
        return solution;
    }

    private static List<Integer> primeFactors(int number) {
        List<Integer> result = new ArrayList<>();
        int prime = 2;
        boolean plusTwo = true;
        while (number > 1) {
            if (number % prime == 0) {
                result.add(prime);
                number /= prime;
            }
            else if (prime > 3) {
                do {
                    if (plusTwo) {
                        prime += 2;
                        plusTwo = false;
                    }
                    else {
                        prime += 4;
                        plusTwo = true;
                    }
                } while (!Problem3.isPrime(prime));
            }
            else if (prime == 2)
                prime = 3;
            else
                prime = 5;
        }
        return result;
    }

    private static List<Integer> mergePrimeFactors(List<Integer> factors1, List<Integer> factors2) {
        List<Integer> result = new ArrayList<>();
        for (Integer factor : factors1) {
            factors2.remove(factor);
            result.add(factor);
        }
        result.addAll(factors2);
        Collections.sort(result);
        return result;
    }

    static int problem5_easy_but_slow(int min, int max) {
        int solution = max;
        while (true) {
            int i = min;
            while (solution % i == 0 && i <= max)
                i++;
            if (i > max) return solution;
            solution += max;
        }
    }

}
