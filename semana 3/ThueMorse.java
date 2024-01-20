public class    ThueMorse{
    public static void main(String[] args){

        int n = Integer.parseInt(args[0]);
        
        
        //if(n%2==1){
          //  n = n;
        //}
        int[] thue = new int[n];
            for(int i = 0; i < n; i++){
                if(i==0){
                    thue[i] = 0;
                }
                if((i%2)==1 && i>0){
                    thue[i] = Math.abs(1-thue[i-1]);
                }
                if((i%2)==0){
                    thue[i] = thue[i/2]; 
                }
                
            }

            for(int x = 0; x < n; x++){
                for(int y = 0; y < n; y++){
                    if((thue[x]==0 && thue[y]==0) || (thue[x]==1 && thue[y]==1)){
                        System.out.print("+  ");
                    }
                    if((thue[x]==0 && thue[y]==1) || (thue[x]==1 && thue[y]==0)){
                        System.out.print("-  ");
                    }
                } System.out.println();
            }
        
    }
}