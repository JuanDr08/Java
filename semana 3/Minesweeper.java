public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        boolean[][] bombs = new boolean[m+2][n+2];
        int[][] neighbor = new int[m + 2][n + 2];
        
        // colocar minas uniformemente
        int total_Minas = 0;
        while (total_Minas < k) {
            int x1 = (int) (Math.random() * (m));
            int y1 = (int) (Math.random() * (n));
            
            if (!bombs[x1][y1]) {
                bombs[x1][y1] = true;
                total_Minas++;
                
            } else{
                if(bombs[x1][y1] == true){
                continue;
                }
            }

        }
        // contar el numero de minas vecinas
        for (int p = 1; p <= m; p++) {
            for (int q = 1; q <= n; q++) {
                int count = 0;
                for (int r = p - 1; r <= p + 1; r++) {
                    for (int s = q - 1; s <= q + 1; s++) {
                        if (bombs[r][s] == true) count++;
                    }
                }
                neighbor[p][q] = count;
            }
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (bombs[i][j] == true) System.out.print("*  ");
                else System.out.print(neighbor[i][j] + "  ");
            }
            System.out.println();
        }
    }
}