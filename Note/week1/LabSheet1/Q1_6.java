//Written by Zhouzhou Jan 14

package week1.LabSheet1;

import java.util.Scanner;

public class Q1_6 {

    private double num_1;
    private double num_2;
    private double result;

    public static void main(String[] args) {
        Q1_6 q = new Q1_6();
        System.out.println("Enter two double number: ");
        q.storeNum1();
        q.storeNum2();
        q.storeResult();
        System.out.println(q.result);
    }

    Scanner sc = new Scanner(System.in);

    public double getInput(){
        double n = 0;
        while(true){
            if(sc.hasNextDouble()){
                n = sc.nextDouble();
                break;
            }
        }
        return n;
    }

    public void storeNum1(){
        num_1 = sc.nextDouble();
    }

    public void storeNum2(){
        num_2 = sc.nextDouble();
    }

    private void storeResult(){
        result = Math.sqrt(num_1 + num_2);
    }

}
