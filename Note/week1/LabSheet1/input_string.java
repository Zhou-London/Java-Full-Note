//Written by Zhouzhou, Jan 14 2025

package week1.LabSheet1;

import java.util.ArrayList;
import java.util.Scanner;

public class input_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a string: ");
            ArrayList<String> list = new ArrayList<>();
            String s = sc.nextLine();
            if(s.compareTo("stop") == 0){
                System.out.println("Goodbye");
                break;
            }
            list.add(s);
        }
    }



}
