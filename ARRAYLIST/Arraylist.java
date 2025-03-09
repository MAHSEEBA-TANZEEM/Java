package ARRAYLIST;
import java.util.ArrayList;
// import java.util.Collections;

public class Arraylist {
    public static void main (String args[]){
        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        // list.add(2); //O(1)
        // list.add(5);
        // list.add(9);
        // list.add(3);
        // list.add(6);

        // System.out.println(list);

        // get 
        // int element = list.get(2);
        // System.out.println(element);

        // delete
        // list.remove(2);
        // // System.out.println(list);

        // // set
        // list.set(2,10);
        // System.out.println(list);

        // contains
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));
        
        // add element O(n)
        // list.add(1,9);
        // System.out.println(list);

        // size
        // System.out.println(list.size());

        // print the arraylist
        // for(int i=0; i<list.size(); i++){
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();

        // print reverse
        // for(int i = list.size()-1; i>=0; i--){
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();

        // find max
        // int max = Integer.MIN_VALUE;
        // for(int i=0; i<list.size(); i++){
        //     // if(max<list.get(i)){
        //     //     max = list.get(i);
        //     // }
        //     max = Math.max(max, list.get(i));
        // }
        // System.out.println("max element = " + max);

        // swap
        // int idx1 = 1, idx2 = 3;
        // System.out.println(list);
        // swap(list, idx1, idx2);
        // System.out.println(list);

        // sorting
        // Collections.sort(list);
        // System.out.println(list);

        // descending sort
        // Collections.sort(list, Collections.reverseOrder());
        // System.out.println(list);

        // multi dimensional arraylist
        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1); list.add(2);
        // mainList.add(list);

        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(3); list2.add(4);
        // mainList.add(list2);

        // for(int i=0; i<mainList.size(); i++){
        //     ArrayList<Integer> currList = mainList.get(i);
        //     for(int j=0; j<currList.size(); j++){
        //         System.out.print(currList.get(j)+" ");
        //     }
        //     System.out.println();
        // }
        // System.out.println(mainList);

        // multi dimensional eg2
        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<Integer> list2 = new ArrayList<>();
        // ArrayList<Integer> list3 = new ArrayList<>();

        // for(int i=1; i<=5; i++){
        //     list1.add(i*1);
        //     list2.add(i*2);
        //     list3.add(i*3);
        // }
        // mainList.add(list1);
        // mainList.add(list2);
        // mainList.add(list3);

        // System.out.println(mainList);

    
        // for(int i=0; i<mainList.size(); i++){
        //     ArrayList<Integer> currList = mainList.get(i);
        //     for(int j=0; j<currList.size(); j++){
        //         System.out.print(currList.get(j)+" ");
        //     }
        //     System.out.println();
        // }
        // System.out.println(mainList);

        // CONTAINER WITH MOST WATER -BRUTE FORCE and 2 POINTER APPROACH
        // ArrayList<Integer> height = new ArrayList<>();
        // height.add(1);
        // height.add(8);
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);

        // System.out.println(storeWater(height));

        // pair sum1- brute force
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        
        // System.out.println(pairSum1(list, target));
        System.out.println(pairSum2(list, target));
    }

    // public static void swap(ArrayList<Integer>list, int idx1, int idx2){
    //     int temp = list.get(idx1);
    //     list.set(idx1, list.get(idx2));
    //     list.set(idx2, temp);
    // }

    // public static int storeWater(ArrayList<Integer> height){
    //     int maxWater = 0;
    //     // brute force- O(n^2)
    //     for(int i=0; i<height.size(); i++){
    //         for(int j=i+1; j<height.size(); j++){
    //             int ht = Math.min(height.get(i), height.get(j));
    //             int width = j-i;
    //             int currWater = ht * width;
    //             maxWater = Math.max(maxWater, currWater);
    //         }
    //     }
    //     return maxWater;
    // }

    // 2 pointer approach-O(n)
    // public static int storeWater(ArrayList<Integer> height){
    //     int maxWater = 0;
    //     int lp = 0;
    //     int rp = height.size()-1;

    //     while(lp < rp){
    //         //calculate water area
    //         int ht = Math.min(height.get(lp), height.get(rp));
    //         int width = rp-lp;
    //         int currWater = ht * width;
    //         maxWater = Math.max(maxWater, currWater);

    //         //update ptr
    //         if(height.get(lp) < height.get(rp)){
    //             lp++;
    //         } else {
    //             rp--;
    //         }
    //     }
    //     return maxWater;
    // }

    // pair sum brute-force
    // public static boolean pairSum1(ArrayList<Integer> list, int target){
    //      for(int i=0; i<list.size(); i++){
    //         for(int j=i+1; j<list.size(); j++){
    //             if(list.get(i) + list.get(j) == target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    // 2 pointer approach
    // public static boolean pairSum1(ArrayList<Integer> list, int target){
    //     int lp = 0; 
    //     int rp = list.size()-1;

    //     while(lp != rp){
    //         //case1
    //         if(list.get(lp)+ list.get(rp) == target) {
    //             return true;
    //         } 

    //         //case2
    //         if(list.get(lp)+ list.get(rp) < target) {
    //             lp++;
    //         } else {
    //             //case3
    //             rp--;
    //         }
    //     }
    //     return false;
    // }
    
    // pair-sum2 2pointer approach -O(n)
    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int bp = -1;
        int n = list.size();
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > list.get(i+1)) { //breaking point
                bp = i;
                break;
            }
        }
        int lp = bp+1; //smallest
        int rp = bp; //largest

        while(lp != rp){
            //case1
            if(list.get(lp) + list.get(rp) == target) {
                return true;
            }

            //case2
            if(list.get(lp) + list.get(rp) < target) {
                lp = (lp+1) % n;
            } else{
                //case3
                rp = (n+rp-1) % n;
            }
        }
        return false;
    }
}
