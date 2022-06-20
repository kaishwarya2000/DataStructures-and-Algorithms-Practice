/*A positive integer n is given, generate a square matrix filled with elements from 1 to n² 
in spiral order.
*/

class Solution {
    public int[][] generateMatrix(int n) {
       int[][] arr = new int[n][n];
        
        int minc = 0;
        int minr = 0;
        int maxr = arr.length-1;
        int maxc = arr[0].length - 1;
        
        int num = 1;
        int count = 0;
        int tne = n*n;
        
        while(count<tne){
            //top wall
            for(int i = minc, j = minr; i<=maxc && count<tne; i++){
                arr[j][i] = num;
                num++;
                count++;
            }
            minr++;
            
            
            //right wall
            for(int i = minr, j = maxc; i<=maxr && count<tne; i++){
                arr[i][j] = num;
                num++;
                count++;
            }
            maxc--;
            
            //bottom wall
            for(int i = maxc, j = maxr; i>=minc && count<tne; i--){
                arr[j][i] = num;
                num++;
                count++;
            }
            maxr--;
            
            //left wall
            for(int i = maxr, j = minc; i>=minr && count<tne; i--){
                arr[i][j] = num;
                num++;
                count++;
            }
            minc++;
        }
        return arr;
        
    }
    
}