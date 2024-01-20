public class CMYKtoRGB {
    public static void main(String[] args) {

        double c = Double.parseDouble(args[0]);
        double m = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
        double b = Double.parseDouble(args[3]);

        double w = 1 - b;
        double r = Math.round(255 * w * (1-c));
        double g = Math.round(255 * w * (1-m));
        double bl = Math.round(255 * w * (1-y));

        System.out.println("red " + " = " + (int) r);
        System.out.println("green " + " = " + (int) g);
        System.out.println("blue " + " = " + (int) bl);
    }

}