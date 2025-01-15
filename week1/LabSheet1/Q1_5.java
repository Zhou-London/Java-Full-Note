//Written by Zhouzhou Jan 14

package LabSheet1;

import java.util.Scanner;

public class Q1_5 {
    public static void main(String[] args) {
        Q1_5 q = new Q1_5();
        System.out.println("Enter two doubles: ");
        double result = q.getRoot(q.getDouble(), q.getDouble());
        System.out.println("The result is: " + result);
    }

    Scanner sc = new Scanner(System.in);

    public double getDouble(){
        double n = 0;
        while(true){
            if(sc.hasNextDouble()){
                n = sc.nextDouble();
                break;
            }
        }
        return n;
    }

    public double getRoot(double a, double b){
        double c = a+b;
        return Math.sqrt(c);
    }


}
