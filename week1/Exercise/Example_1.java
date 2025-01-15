package Exercise;

import java.util.Scanner;

public class Example_1 {
    public int sumOfDigits(int n){
        int sum = 0;
        n = Math.abs(n);
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }

    public void inputAndProcess(){
        int n = 0;
        Input in = new Input();
        while(true){
            System.out.print("Type an integer: ");
            if(in.hasNextInt()){
                n = in.nextInt();
                break;
            }
            in.nextLine();
            System.out.println("You didn't enter an integer, try again");
        }
        System.out.println("The sum of the digits is: " + sumOfDigits(n));
    }

    public void input_GUI(){
        GUIInput input = new GUIInput();
        int n = input.readInt("Type an integer: ");
        System.out.println("The sum of digits is " + sumOfDigits(n));
    }


    public static void main(String[] args){
        //new Example_1().input_GUI();
        new Example_1().inputAndProcess();
    }

}
