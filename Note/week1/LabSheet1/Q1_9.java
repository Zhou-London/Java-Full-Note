package week1.LabSheet1;

import java.util.Scanner;

public class Q1_9 {
    public static void main(String[] args) {
        Q1_9 q = new Q1_9();
        long x = q.getLong();
        System.out.println(q.palindrome(x));
    }

    Scanner sc = new Scanner(System.in);

    public long getLong(){
        System.out.println("Enter an integer: ");
        return sc.nextLong();
    }

    public long reverse(long x){
        String s = Long.toString(x);
        String rev = "";
        for(int i = s.length() - 1; i >= 0; i--){
            rev = rev + s.charAt(i);
        }
        return Long.parseLong(rev);
    }

    public boolean palindrome(long x){
        return x == reverse(x);
    }
}
