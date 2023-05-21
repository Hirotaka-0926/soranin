public class SortingArraysApplication {
    public static void main(String[] args){
        int[][] arrays = {
        {3, 2, 1},
        {9, 7, 10, 4, 8, 2, 5, 3, 1, 6},
        {7, 2, 3, 2, 2, 1, 1, 1},
        {2, 1},
        {100},
        {888888888, -888888888}
        };
        int a;




        for(int i = 0 ; i < arrays.length; i++){
            for(int j = arrays[i].length-1 ; j > 0 ; j--){
                for(int k = arrays[i].length-1 ; k > 0 ; k--){
                    if(arrays[i][k]<arrays[i][k-1]){
                        a=arrays[i][k];
                        arrays[i][k]=arrays[i][k-1];
                        arrays[i][k-1]=a;
                    }
                }
            }
        }
        /**
        your code
        */
        for ( int i = 0; i < arrays.length; i++ ){
        for ( int j = 0; j < arrays[i].length; j++ ){
        System.out.print(" " + arrays[i][j]);
        }
        System.out.println();
        }
        }
       
}
