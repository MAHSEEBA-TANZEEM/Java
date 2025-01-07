import java.util.*;

public class Solution{
    // no of 7
    // public static void main(String[] args){
    //     int [][] array = {{4,7,8},{8,8,7}};
        
    //     int countOf7 = 0;
    //     for(int i=0; i<array.length; i++){
    //         for(int j=0; j<array[0].length; j++){
    //             if(array[i][j] == 7){
    //                 countOf7++;
    //             }
    //         }
    //     }
    //     System.out.println("count of 7 is:"+ countOf7);
    // }
    
    // SUM OF NO'S IN SECOND ROW OF NUMS ARRAY
    // public static void main(String args[]){
    //     int [][] nums = {{1,4,9},{11,4,3},{2,2,3}};
    //     int sum =0;
    //     int i = 1;
        
    //     // sum of second row element
    //     for(int j=0; j<nums[0].length; j++){
    //         sum += nums[i][j];
    //     }
    //     System.out.println("sum is:"+sum);
    // }
    
    public static void main(String args[]){
        int row = 2, col = 3;
        int[][]matrix = {{2,3,7},{5,6,7}};

        printMatrix(matrix);

        int[][]transpose = new int[col][row];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        printMatrix(transpose);
    }
    public static void printMatrix(int[][]matrix){
        System.out.println("The matrix is:");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}