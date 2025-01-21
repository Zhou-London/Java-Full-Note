//Written by Zhouzhou Jan 14

package LabSheet1;

import java.util.Scanner;

public class Q1_8 {
    public static void main(String[] args) {
        Q1_8 q = new Q1_8();
        q.run();
    }

    public void run(){
        while(true){
            prompt();
            int a = getPrompt();
            if(a == 1){
                System.out.println("Enter miles");
                double miles = getValue();
                System.out.println(miles + " miles are " + convertMile(miles) + " kilometers.");
            }
            else if(a == 2){
                System.out.println("Enter meters");
                double meters = getValue();
                System.out.println(meters + " meters are " + convertMeter(meters) + " inches.");
            }
            else if(a == 3){
                System.out.println("Enter kilometers");
                double kilometers = getValue();
                System.out.println(kilometers + " kilometers are " + convertKilometers(kilometers) + " yards.");
            }
            else if(a == 4){
                System.out.println("Goodbye!");
                break;
            }
        }
    }


    public void prompt(){
        System.out.printf("1. Convert millimetres to kilometers\n" +
                "2. Convert meters to inches.\n" +
                "3. Convert kilometers to yards\n" +
                "4. Quit.\n");
    }

    Scanner sc = new Scanner(System.in);

    public int getPrompt(){
        int res = 0;
        while(true){
            res = sc.nextInt();
            if(1 <= res && res <= 4){
                break;
            }else{
                System.out.println("Invalid input. Try again.");
            }
        }

        return res;
    }

    public double getValue(){
        return sc.nextDouble();
    }

    public double convertMile(double miles){
        return miles * 1.609;
    }

    public double convertMeter(double meters){
        return meters * 39.370;
    }

    public double convertKilometers(double kilometers){
        return kilometers * 1093.613;
    }

}