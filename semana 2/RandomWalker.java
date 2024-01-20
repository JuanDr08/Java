public class  RandomWalker{
    public static void main(String[] args){

        int r = Integer.parseInt(args[0]);
        

        int steps = 0;
        int x = 0;
        int y = 0;
        System.out.println("(" + x + ", " + y + ")");
        while ((Math.abs(x) + Math.abs(y)) < r ){
            double direccion = Math.random();
            if (direccion <= 0.25){
                x++;
                steps++;
                System.out.println("(" + x + ", " + y + ")");
            }else {
                if (direccion <= 0.5) {
                    y++;
                    steps++;
                    System.out.println("(" + x + ", " + y + ")");
                }else {
                    if (direccion <= 0.75) {
                        x--;
                        steps++;
                        System.out.println("(" + x + ", " + y + ")");
                    }else {
                        if (direccion <= 1) {
                            y--;
                            steps++;
                            System.out.println("(" + x + ", " + y + ")");
                        }
                    }
                }
            }
                
                
                    
        }int total_steps = steps;
        System.out.println("steps = " + total_steps);
    }
}