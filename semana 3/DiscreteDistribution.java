public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]); 
        int n = args.length;
        int[] a = new int[n];
        for (int i = 1; i < n; i++)
            a[i] = Integer.parseInt(args[i]);

        // To generate a random index i with probability proportional to ai:
        // Define the cumulative sums Si=a1+a2+…+ai, with S0=0.
        int total = 0;
        for (int i = 1; i < n; i++)
            total += a[i];

        // Pick a random integer r uniformly between 0 and Sn−1.
        // Find the unique index i between 1 and n such that S(i−1)≤r<Si.

        for (int j = 0; j < m; j++) {
            int r = (int) (Math.random() * total); // integer in [0, total)
            int event = -1;
            int sum = 0;
            for (int i = 0; i < n && sum <= r; i++) {
                sum += a[i];
                event = i;
            }
            System.out.print(event + " ");
        }

    }
}
