package oop.finalexam.t1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T1 {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<Integer>(List.of(2, 1, 5, 8, 6, 4, 9, 7, 3, 10));
        List<String> list2 = List.of(
                "lrb", "kwx",
                "zuc", "pzl",
                "ths", "hdn",
                "vzf", "xfm",
                "ijb", "bgx",
                "drw", "tfh"
        );
        List<String> list3 = new ArrayList<String>();


        /**
         * This program first takes consecutive values from list1
         * then retrieves value at the index of these values
         * increments value of the index by one
         * then concatenates it with the string at list2
         * and puts at consecutive indecision in list3
         */
        for (int i : list1){
            int index = i+1;
            if (index < list2.size()) {
                list3.add(list2.get(index) + i); // concatinate
            }
        }
        for(String s: list3){
            System.out.println(s);
        }
        /**
         * Based on the sorted values from list1
         * if the index at the value from list1 exists we remove the first one
         * if it doesn't we don't do anything.
         */
        Collections.sort(list1, Collections.reverseOrder());
        for (int i : list1){
            System.out.println(i);
            if (i < list3.size()){
                list3.remove(i);
            }
        }
        for(String s: list3){
            System.out.println(s);
        }

    }
}
