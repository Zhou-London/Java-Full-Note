package week1.LabSheet1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Q1_15 {
    public static void main(String[] args) {
        Q1_15 q = new Q1_15();
        int[] nums = q.getNumbers();
        int product = q.product(nums, 0);
        System.out.println("Product is " + product);
    }

    public int[] getNumbers(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter start: ");
        int start = sc.nextInt();
        System.out.println("Enter end: ");
        int end = sc.nextInt();

        return IntStream.range(start, end+1).toArray();
    }

    public static int product(int[] nums, int k){

        if(k >= nums.length){
            return 1;
        }

        return nums[k] * product(nums, k+1);
    }
}
