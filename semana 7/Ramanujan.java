public class Ramanujan {
    public static boolean isRamanujan(long n) {
        int count = 0;
        int satisfechos = 0;
        for (long i = 1; i < Math.cbrt(n); i++) {
            double b = Math.cbrt(n - i * i * i);
            if (Math.floor(b) == b) {
                if (count == 0) {
                    satisfechos = (int) b;
                    count++;
                }
                else if (i != satisfechos) count++;
                if (count == 2) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        StdOut.print(isRamanujan(n));
    }
}
