
public class WorldMap {
    public static void main(String[] args) {
        int width = StdIn.readInt();
        int height = StdIn.readInt();

        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        StdDraw.setPenColor(StdDraw.BLACK);
        while (!StdIn.isEmpty()) {
            String city = StdIn.readString();
            int vertices = StdIn.readInt();
            double[] x = new double[vertices];
            double[] y = new double[vertices];
            int p = 0;
            while (p < vertices) {
                x[p] = StdIn.readDouble();
                y[p] = StdIn.readDouble();
                p++;

            }
            StdDraw.polygon(x, y);
        }

    }
}
