//Written by Zhouzhou, Jan 14 2025

package LabSheet1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Q1_3 {
    public static void main(String[] args) {
        new Q1_3().InputAndProcess();
    }

    public String getString(){
        String s = null;
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextLine()){
            s = sc.nextLine();
        }
        return s;
    }

    public ArrayList<String> getStringList(){
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            System.out.printf("Enter word (%d/10): ", i+1);
            list.add(getString());
        }
        return list;
    }

    public void Process(ArrayList<String> list){
        Collections.sort(list);
        Collections.reverse(list);
        for(String s : list){
            System.out.print(s + " ");
        }
    }

    public void InputAndProcess(){
        Process(getStringList());
    }



}
