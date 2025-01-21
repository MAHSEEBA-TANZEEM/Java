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
    // fibonacci series
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1+ fnm2;
        return fn;
    }
    // array sorted or not
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    // first occurrence
    public static int firstOccur(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccur(arr,key,i+1);
    }
    // last occurrence
    public static int lastOccur(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccur(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    // x to power n
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * power(x, n-1);
    }
    // optimized x to power n
    public static int optimizedPower(int a, int n){
        if(n == 0){
            return 1;
        }
        // int halfpowerSq = optimizedPower(a, n/2) * optimizedPower(a, n/2); O(n)
        int halfPower = optimizedPower(a, n/2);  //O(logn)
        int halfPowerSq = halfPower * halfPower;

        // n is odd
        if( n % 2 != 0){
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main (String args[]){
        // int n = 5;
        // printDec(n);
        // printInc(10);
        // System.out.println(fact(n));
        // System.out.println(calcSum(n));
        // int arr[] = {8,3,6,9,5,10,2,5,3};
        // System.out.println(firstOccur(arr,3,0));
        // System.out.println(lastOccur(arr,5,0));
        // System.out.println(fib(n));
        // System.out.println(power(2,10));
        int a = 2;
        int n = 10;
        System.out.println(optimizedPower(a,n));
    }


}