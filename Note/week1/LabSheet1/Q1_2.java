//Written by Zhouzhou, Jan 14 2025

package week1.LabSheet1;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1_2 {
    public static void main(String[] args) {
        Q1_2 q = new Q1_2();
        System.out.println("The average is " + q.InputAndProcess());
    }

    public double getInput() {
        Scanner sc = new Scanner(System.in);
        double number = 0.0;
        if(sc.hasNextDouble()){
            number = sc.nextDouble();
        }
        return number;
    }

    public double processInput(ArrayList<Double> input){
        double sum = 0.0;
        for(double n: input){
            sum += n;
        }
        return sum/input.size();
    }

    public ArrayList<Double> getList(){
        ArrayList<Double> list = new ArrayList<>();
        for(int i = 0; i<10; i++){
            System.out.printf("Enter double number (%d/10): ", i+1);
            list.add(getInput());
        }
        return list;
    }

    public double InputAndProcess(){
        return processInput(getList());
    }

}
