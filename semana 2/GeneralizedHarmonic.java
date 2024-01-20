public class GeneralizedHarmonic{
    public static void main(String[] args){

        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]); 
        if(n>0){
            double calculo = 1 / (Math.pow(1,r)); 
            
            for ( int j = 2; j <= n; j++){
                double t = calculo;
                double operacion = t + (1 / (Math.pow(j,r)));
                t = operacion;
                calculo = t;
                
            }System.out.println(calculo); 
        }
    }
}