public class GreatCircle {
    public static void main(String[] args) {

        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));

        double r = 2*6371.0;
        double x = (x2 - x1) / 2;
        double y = (y2 - y1) / 2;
        double sqrt_Operation = Math.sqrt(Math.pow(Math.sin(x), 2) + Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin(y), 2));
        double arcsin = Math.asin(sqrt_Operation);
        double total = r * arcsin;

        System.out.println(total + " kilometers");
    }
}