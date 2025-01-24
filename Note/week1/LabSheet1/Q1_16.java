package week1.LabSheet1;

import java.util.ArrayList;


public class Q1_16 {
    public static void main(String[] args) {
        Q1_16 q = new Q1_16();
        boolean b = q.check(new char[]{'a', 'b', 'c'}, new char[]{'b'});
        System.out.println(b);

    }

    public boolean check(char[] arr1, char[] arr2) {
        ArrayList<Character> list = new ArrayList<>();

        if(arr1.length == 0
        || arr2.length == 0) {
            return false;
        }


        for (int i = 0; i < arr1.length; i++) {
            list.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            if (list.contains(arr2[i])) {
                return true;
            }
        }

        return false;


    }
}
