public class RightTriangle {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean positive = (a>=0) && (b>=0) && (c>=0); 
        boolean case1 = (a*a + b*b == c*c);
        boolean case2 = (c*c + a*a == b*b);
        boolean case3 = (c*c + b*b == a*a);
        
        boolean result = positive && (case1 || case2 || case3);

        System.out.println(result);
    }

}