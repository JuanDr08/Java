public class Inversions {
    public static long count(int[] a) {
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) total++;
            }
        }
        return total;
    }

    public static int[] generate(int n, long k) {
        int[] a = new int[n];
        int counter = 1;
        long newk = k;
        if (k == ((long) n) * (n - 1) / 2) {
            for (int i = 0; i < n; i++) {
                a[i] = n - i - 1;
            }
            return a;
        }
        while (newk >= n - counter) {
            a[counter - 1] = n - counter;
            newk = newk - n + counter;
            counter++;
        }
        int index = n - (int) newk - 1;
        a[index] = n - counter;
        for (int i = counter - 1; i < index; i++) {
            a[i] = i - counter + 1;
        }
        for (int i = index + 1; i < n; i++) {
            a[i] = i - counter;
        }
        return a;

    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long k = Long.parseLong(args[1]);
        int[] a = generate(n, k);
        for (int i = 0; i < n; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }
}
