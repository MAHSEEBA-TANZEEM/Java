public class bt2 {
    // GRID WAYS
    // public static int gridWays(int i, int j, int n, int m){
    //     // base case
    //     if(i == n-1 && j == m-1){ //condition for last cell
    //         return 1;
    //     } else if(i == n || j == n){ //boundary cross condition 
    //         return 0;
    //     }

    //     int w1 = gridWays(i+1, j, n, m);
    //     int w2 = gridWays(i, j+1, n, m);
    //     return w1+w2;
    // }

    // SUDUKO
    public static boolean isSafe(int suduko[][], int row, int col, int digit) {
        // column 
        for(int i=0; i<=8; i++){
            if(suduko[i][col] == digit){
                return false;
            }
        }
        // row
        for(int j=0; j<=8; j++){
            if(suduko[row][j] == digit){
                return false;
            }
        }
        // grid
        int sr = (row/3) * 3; //starting row of grid
        int sc = (col/3) * 3; //starting col of grid
        
        // 3*3 grid
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(suduko[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean sudukoSolver(int suduko[][], int row, int col){
        // base case
        if(row == 9 && col == 0) {
            return true;
        }

        // recursion
        int nextRow = row, nextCol = col+1;
        if(col+1 == 9){
            nextRow = row+1;
            nextCol = 0;
        }

        if(suduko[row][col] != 0){
             return sudukoSolver(suduko, nextRow, nextCol);
        }

        for(int digit=1; digit<=9; digit++){
            if(isSafe(suduko, row, col, digit)){
                suduko[row][col] = digit;
                if(sudukoSolver(suduko, nextRow, nextCol)) {
                    return true;
                }
                suduko[row][col] = 0;
            }
        }
        return false;
    }

    public static void printSuduko(int suduko[][]){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(suduko[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        // gridways
        // int n = 3, m = 3;
        // System.out.println(gridWays(0, 0, n, m));
        // suduko
        int suduko[][] = { {0, 0, 8, 0, 0, 0, 0, 0, 0},
        {4, 9, 0, 1, 5, 7, 0, 0, 2},
        {0, 0 ,3, 0, 0, 4, 1, 9, 0},
        {1, 8, 5, 0, 6, 0, 0, 2, 0},
        {0, 0, 0, 0, 2, 0, 0, 6, 0},
        {9, 6, 0, 4, 0, 5, 3, 0, 0},
        {0, 3, 0, 0, 7, 2, 0, 0, 4},
        {0, 4, 9, 0, 3, 0, 0, 5, 7},
        {8, 2, 7, 0, 0, 9, 0, 1, 3}};

        if(sudukoSolver(suduko, 0, 0)){
            System.out.println("Solution exists");
            printSuduko(suduko);
        } else {
            System.out.println("Solution does not exist");
        }
    }
}
