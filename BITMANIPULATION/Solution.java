public class Solution{
    public static void main(String args[]){
        int x=3, y=4;
        System.out.println("Before swap:x ="+x+" and y ="+y);
        // swap using xor
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("After swap:x ="+x+" and y ="+y);
    }
}

public class Solution{
    public static void main(String args[]){
        int x =6;
        System.out.println(x+"+"+1+"is"+-~x);
        x=-4;
        System.out.println(x+"+"+1+"is"+-~x);
        x=0;
        System.out.println(x+"+"+1+"is"+-~x);
    }
}

public class Solution{
    public static void main(String args[]){
        // convert uppercase to lowercase
        for(char ch='A'; ch<='Z'; ch++){
            System.out.println((char)(ch|' '));
        }
    }
}