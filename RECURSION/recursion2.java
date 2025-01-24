public class recursion2{
    // tiling problem
    public static int tilingProb(int n){ //2 X n (floor size)
    // base case
    if( n == 0 || n == 1){
        return 1;
    }
    // vertical choice
    int fnm1 = tilingProb(n-1);

    // horizontal choice
    int fnm2 = tilingProb(n-2);

    int totWays = fnm1 + fnm2;
    return totWays;
    }
    
    // remove duplicates
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            // duplicate
            removeDuplicates(str, idx+1, newStr, map);
        }
        else {
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar),map);
        }
    }
    
    // Binary string
    public static void printBinaryString(int n, int lastPlace, String str){
        // base case
        if(n == 0){
            System.out.println(str);
            return;
        }
        printBinaryString(n-1, 0, str+"0");
        if(lastPlace == 0){
            printBinaryString(n-1, 1, str+"1");
        }

    }
    public static void main(String args[]){
        // System.out.println(tilingProb(3));
        // String str  = "appnnacollege";
        // removeDuplicates(str, 0 ,new StringBuilder(""),new boolean[26]);
        printBinaryString(3,0,"");
    }
}