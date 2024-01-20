public class RandomWalkers{
    public static void main(String[] args){

        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

            double prom = 0;
            
        for (int i = 1; i <= trials; i++ ) {
            
            int steps = 0;
            int x = 0;
            int y = 0;
            while ((Math.abs(x) + Math.abs(y)) < r ){

            double direccion = Math.random();

            if (direccion <= 0.25){
                x++;
                steps++;
                
            }else {
                if (direccion <= 0.5) {
                    y++;
                    steps++;
                    
                }else {
                    if (direccion <= 0.75) {
                        x--;
                        steps++;
                        
                    }else {
                        if (direccion <= 1) {
                            y--;
                            steps++;
                            
                            }
                        }
                    }
                }
                
            }prom = (prom + steps);            
        }
        double total = prom / trials;
        System.out.println("average number of steps = " + total);
    }
}