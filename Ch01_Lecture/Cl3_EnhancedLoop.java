package Ch01_Lecture;

import java.util.ArrayList;

public class Cl3_EnhancedLoop {
    public static void main(String[] args) {
        // int [] arr = {1,2,3,4,05};

        // for(int i : arr){
        // System.out.println(i);
        // }

        ArrayList<Integer> arr = new ArrayList<>(); // initial capacity = 10
        arr.add(1);
        arr.add(3);
        arr.forEach(i -> System.out.println(i));
    }
}
