// star pattern
// public class Patterns{
//     public static void main(String args[]){
//         for(int line=1; line<=4; line++){
//             for(int star=1; star<=line; star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// inverted star pattern 
// public class Patterns{
//     public static void main(String args[]){
//         int n=4;
//         for(int line=1; line<=n; line++){
//             for(int star=1; star<=n-line+1; star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// half pyramid pattern
// public class Patterns{
//     public static void main(String args[]){
//         int n=4;
//         for(int line=1; line<=n; line++){
//             for(int num=1; num<=line; num++){
//                 System.out.print(num);
//             }
//             System.out.println();
//         }
//     }
// }

// Character pattern
// public class Patterns{
//     public static void main(String args[]){
//         int n=4;
//         char ch = 'A';
//         for(int line=1; line<=n; line++){
//             for(int chars=1; chars<=line; chars++){
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }

// Top right triangle
// public class Patterns{
//     public static void main(String args[]){
//         int n=5;
//         for(int row =1; row<=n; row++){
//             for(int col=1; col<=n; col++){
//                 if(row-col<=0){
//                     System.out.print("*");
//                 } else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// Top Left Triangle
// public class Patterns{
//     public static void main(String args[]){
//         int n=5;
//         for(int row =1; row<=n; row++){
//             for(int col=1; col<=n; col++){
//                 if(row+col<=n+1){
//                     System.out.print("*");
//                 } else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
// Bottom right triangle
// public class Patterns{
//     public static void main(String args[]){
//         int n=5;
//         for(int row =1; row<=n; row++){
//             for(int col=1; col<=n; col++){
//                 if(row+col>=n+1){
//                     System.out.print("*");
//                 } else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// X pattern
// public class Patterns{
//     public static void main(String args[]){
//         int n=5;
//         for(int row =1; row<=n; row++){
//             for(int col=1; col<=n; col++){
//                 if(row-col==0 || row+col == n+1){
//                     System.out.print("*");
//                 } else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// M pattern
public class Patterns{
    public static void main(String args[]){
        int n=5;
        for(int row =1; row<=n; row++){
            for(int col=1; col<=n; col++){
                if(col == 1 
                  || col == n 
                  || (row == col && row <= n / 2) 
                  || (row + col == n + 1 && row <= n / 2)
                ){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

