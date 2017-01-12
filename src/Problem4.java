class Problem4 {

    /*
     * Problem 4
     *
     * A palindromic number reads the same both ways. The largest palindrome made from the product of two
     * 2-digit numbers is 9009 = 91 × 99. Find the largest palindrome made from the product of two 3-digit numbers.
     */
    static int problem4() {
        int max = 0;
        int max_j = 0;
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                int number = i * j;
                if (isPalindromic(number)) {
                    if (number > max) {
                        max = number;
                        max_j = j;
                    }
                    else break;
                }
                if (i <= max_j) break;
            }
        }
        return max;
    }

    private static boolean isPalindromic(int number) {
        String numberString = Integer.toString(number);
        int length = numberString.length();
        for (int i = 0; i < length / 2; i++) {
            if (numberString.charAt(i) != numberString.charAt(length - 1 - i)) return false;
        }
        return true;
    }

}
