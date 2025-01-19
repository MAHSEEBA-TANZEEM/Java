public class recursion{
    // print decreasing numbers
    public static void printDec(int n) {
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n - 1);
    }
    // print increasing numbers
    public static void printInc(int n) {
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printInc(n - 1);
        System.out.print(n+" ");
    }
    // print factorial of n
    public static int fact (int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }
    // print sum of n numbers
    public static int calcSum(int n){
        if(n==1){
            return 1;
        }
        int Snm1 = calcSum(n-1);
        int Sn = n + Snm1;
        return Sn;
    }

    public static void main (String args[]){
        int n = 5;
        // printDec(n);
        // printInc(10);
        // System.out.println(fact(n));
        System.out.println(calcSum(n));
    }
}