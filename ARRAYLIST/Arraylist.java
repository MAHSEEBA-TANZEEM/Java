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
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1; i<=5; i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

    
        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainList);


    }
    // public static void swap(ArrayList<Integer>list, int idx1, int idx2){
    //     int temp = list.get(idx1);
    //     list.set(idx1, list.get(idx2));
    //     list.set(idx2, temp);
    // }
    
}
