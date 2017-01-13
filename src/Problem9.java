class Problem9 {

    /*
     * Problem 9
     *
     * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which, a^2 + b^2 = c^2.
     * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2. There exists exactly one Pythagorean triplet
     * for which a + b + c = 1000. Find the product abc.
     */
    static int problem9() {
        int b, c;
        for (int a = 1; a < 1000; a++) {
            if ((b = getB(a)) != 0)
                if ((c = getC(a, b)) != 0)
                    return a * b * c;
        }
        return 0;
    }

    private static int getB(int a) {
        if ((500000 - 1000 * a) % (1000 - a) == 0)
            return (500000 - 1000 * a) / (1000 - a);
        return 0;
    }

    private static int getC(int a, int b) {
        int result = (int) Math.sqrt(a * a + b * b);
        if (result * result == a * a + b * b) return result;
        return 0;
    }


}
