import java.util.*;

public class Strings {

    public static void printLetters(String str) {
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static boolean isPalindrome(String str) {
        for(int i=0; i<str.length()/2; i++) {
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-i-1)) {
                //not a palindrome
                return false;
            }
        }
        return true;
    }

    public static float getShortestPath(String path) {
        int x=0, y=0;

        for(int i=0; i<path.length();i++) {
            char dir = path.charAt(i);
            // south
            if(dir == 'S'){
                y--;
            }
            // North
            else if(dir == 'N'){
                y++;
            }
            // East
            else if(dir == 'E'){
                x++;
            }
            // West
            else {
                x--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float) Math.sqrt(X2+Y2);
    }

    public static void main(String args[]) {
        char arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String ("xyz");

        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.next();
        System.out.println(name);
        String firstName = "Mahseeba";
        String lastName = "Tanzeem";
        String fullName = firstName + " "+ lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());
        System.out.println(fullName.charAt(0));
        printLetters(fullName);
        String str = "anas";
        System.out.println(isPalindrome(str));
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}

COMPARE
public static void main(String args[]) {
    String s1 = "Tony";
    String s2 = "Tony";
    String s3 = new String("Tony");

    if(s1==s2) {
        System.out.println("strings are equal");
    } else {
        System.out.println("strings are not equal");
    }
    if(s1==s3) {
        System.out.println("strings are equal");
    } else {
        System.out.println("strings are not equal");
    }
     if(s1.equals(s3)) {
        System.out.println("strings are equal");
    } else {
        System.out.println("strings are not equal");
    }
}

SUBSTRING
public static String substring(String str, int si, int ei) {
    String substr = "";
    for(int i=si; i<ei; i++){
        substr += str.charAt(i);
    }
    return substr;
}

public static void main(String args[]) {
    substring
    String str = "HelloWorld";
    System.out.println(substring(str, 0, 5));
    System.out.println(str.substring(0,5));
}

Print largest String(lexico graphic order)

public static void main (String args[]) {
    String fruits[] = {"apple","banana", "mango"};

    String largest = fruits[0];
    for(int i=1; i<fruits.length; i++) {
        if(largest.compareTo(fruits[i])<0) {
            largest = fruits[i];
        }
    }
    System.out.println(largest);
}

STRING BUILDER
public static void main (String args[]) {
    StringBuilder sb = new StringBuilder("");
    for(char ch='a'; ch<='z'; ch++) {
        sb.append(ch);
    }
    System.out.println(sb.length());
}

UPPERCASE
public static String toUpperCase(String str) {
    StringBuilder sb = new StringBuilder("");

    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);

    for(int i=1; i<str.length();i++){
        if(str.charAt(i)== ' ' && i<str.length()-1) {
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        } else {
            sb.append(str.charAt(i));
        }
    }
    return sb.toString();
}

public static void main (String args[]) {
    String str = "muhammad anas";
    System.out.println(toUpperCase(str));
}

STRING COMPRESSION
public static String compress(String str) {
    String newStr = "";

    for(int i=0; i<str.length(); i++) {
        Integer count = 1;
        while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)) {
            count++;
            i++;
        }
        newStr += str.charAt(i);
        if(count>1) {
            newStr += count.toString();
        }
    }
    return newStr;
}

public static void main(String args[]) {
    String str = "aaaabbcccdd";
    System.out.println(compress(str));
}
