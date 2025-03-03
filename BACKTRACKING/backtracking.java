public class backtracking {
    // BACKTRACKING ON ARRAYS
    // public static void changeArr(int arr[], int i, int val){
    //     // base case
    //     if(i == arr.length){
    //         printArr(arr);
    //         return;
    //     }
    //     // recursion
    //     arr[i] = val;
    //     changeArr(arr, i+1, val+1);
    //     arr[i] = arr[i] -2;
    // }

    // public static void printArr(int arr[]){
    //     for(int i=0; i<arr.length; i++){
    //         System.out.print(arr[i]+"");
    //     }
    //     System.out.println();
    // }

    // FIND SUBSET
    // public static void findSubsets(String str, String ans, int i) {
    //     // base case
    //     if(i == str.length()) {
    //         if(ans.length() == 0){
    //             System.out.println("null");
    //         } else {
    //             System.out.println(ans);
    //         }
    //         return;
    //     }
    //     // Yes choice
    //     findSubsets(str, ans+str.charAt(i), i+1);

    //     // No choice
    //     findSubsets(str, ans, i+1);
    // }

    // PERMUTATION
    // public static void findPermutations(String str, String ans) {
    //     // base case
    //     if(str.length() == 0){
    //         System.out.println(ans);
    //         return;
    //     }
    //     // recursion
    //     for( int i=0; i<str.length(); i++){
    //         char curr = str.charAt(i);
    //         // abcde = "ab" + "de"= "abde"
    //         String newStr = str.substring(0, i) + str.substring(i+1);
    //         findPermutations(newStr, ans+curr);
    //     }
    // }

    // nQueens -attacking case
    // public static void nQueens(char board[][], int row){
    //     // base case
    //     if(row == board.length){
    //         printBoard(board);
    //         return;
    //     }
    //     // column loop
    //     for(int j=0; j<board.length; j++){
    //         if(isSafe(board, row, j)){
    //             board[row][j] = 'Q';
    //             nQueens(board, row+1);
    //             board[row][j] = 'x';
    //         }
    //     }
    // }
    // public static void printBoard(char board[][]) {
    //     System.out.println("-------chess board-------");
    //     for(int i=0; i<board.length; i++){
    //         for(int j=0; j<board.length; j++){
    //             System.out.print(board[i][j]+ " ");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static boolean isSafe(char board[][], int row, int col){
    //     // vertically up 
    //     for(int i=row-1; i>=0; i--){
    //         if(board[i][col] == 'Q'){
    //             return false;
    //         }
    //     }
    //     // diagnol left up
    //     for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
    //         if(board[i][j] == 'Q'){
    //             return false;
    //         }
    //     }
    //     // diagnol right up
    //     for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++){
    //         if(board[i][j] == 'Q'){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // nQueens -count ways
    // public static void nQueens(char board[][], int row){
    //     // base case
    //     if(row == board.length){
    //         // printBoard(board);
    //         count++;
    //         return;
    //     }
    //     // column loop
    //     for(int j=0; j<board.length; j++){
    //         if(isSafe(board, row, j)){
    //             board[row][j] = 'Q';
    //             nQueens(board, row+1);
    //             board[row][j] = 'x';
    //         }
    //     }
    // }
    // public static void printBoard(char board[][]) {
    //     System.out.println("-------chess board-------");
    //     for(int i=0; i<board.length; i++){
    //         for(int j=0; j<board.length; j++){
    //             System.out.print(board[i][j]+ " ");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static boolean isSafe(char board[][], int row, int col){
    //     // vertically up 
    //     for(int i=row-1; i>=0; i--){
    //         if(board[i][col] == 'Q'){
    //             return false;
    //         }
    //     }
    //     // diagnol left up
    //     for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
    //         if(board[i][j] == 'Q'){
    //             return false;
    //         }
    //     }
    //     // diagnol right up
    //     for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++){
    //         if(board[i][j] == 'Q'){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    static int count = 0;
    
    // nQueens-1soluton
    public static boolean nQueens(char board[][], int row){
        // base case
        if(row == board.length){
            // printBoard(board);
            count++;
            return true;
        }
        // column loop
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                if(nQueens(board, row+1)){
                    return true;
                }
                board[row][j] = 'x';
            }
        }
        return false;
    }
    public static void printBoard(char board[][]) {
        System.out.println("-------chess board-------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(char board[][], int row, int col){
        // vertically up 
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // diagnol left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        // diagnol right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
        public static void main(String args[]) {
        // int arr[] = new int[5];
        // changeArr(arr, 0, 1);
        // printArr(arr);
        // String str = "abc";
        // findSubsets(str, "", 0);
        // String str = "abc";
        // findPermutations(str, "");
        // int n=2;
        // char board[][] = new char[n][n];
        // // initialize
        // for(int i=0; i<n; i++) {
        //     for(int j=0; j<n; j++){
        //         board[i][j] = 'x';
        //     }
        // }
        // nQueens(board, 0);
        // System.out.println("total ways to solve n queens =" + count);
        int n=4;
        char board[][] = new char[n][n];
        // initialize
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++){
                board[i][j] = 'x';
            }
        }
        if(nQueens(board, 0)){
           System.out.println("solution is possible"); 
           printBoard(board);
        } else {
            System.out.println("solution is not possible"); 
        }
    }
}


