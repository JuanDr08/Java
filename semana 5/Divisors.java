public class Divisors {
    public static int gcd(int a, int b) {
        if (a == 0 && b == 0) return 0;
        else if (b == 0) return Math.abs(a);
        int positiveA = Math.abs(a);
        int positiveB = Math.abs(b);
        while (positiveA % positiveB != 0) {
            int retenedor = positiveA;
            positiveA = positiveB;
            positiveB = retenedor % positiveB;
        }
        return positiveB;
    }

    public static int lcm(int a, int b) {
        if (a == 0 && b == 0) return 0;
        else {
            int absA = Math.abs(a);
            int absB = Math.abs(b);
            return (absA / gcd(a, b) * absB);
        }

    }


    public static boolean areRelativelyPrime(int a, int b) {
        return (gcd(a, b) == 1);
    }

    public static int totient(int n) {
        if (n <= 0) return 0;
        int cuenta = 0;
        for (int i = 1; i <= n; i++) {
            if (areRelativelyPrime(i, n)) cuenta++;
        }
        return cuenta;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        StdOut.println("gcd" + "(" + a + ", " + b + ")  = " + gcd(a, b));
        StdOut.println("lcm" + "(" + a + ", " + b + ")  = " + lcm(a, b));
        StdOut.println(
                "areRelativelyPrime" + "(" + a + ", " + b + ")  = " + areRelativelyPrime(a, b));
        StdOut.println("totient" + "(" + a + ") = " + totient(a));
        StdOut.println("totient" + "(" + b + ") = " + totient(b));
    }
}
