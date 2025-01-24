//Written by Zhouzhou Jan 14

package week1.LabSheet1;

import java.util.Random;

public class Q1_4 {
    private double min = 0;
    private double max = 0;
    private double average = 0;

    public static void main(String[] args) {
        Q1_4 q = new Q1_4();
        q.process(-0.9999999, 0.9999999);
        System.out.printf("Min is %.7f, Max is %.7f, Avg is %.7f. \n", q.min, q.max, q.average);
    }

    public double getRandom(double min_range, double max_range) {
        Random rand = new Random();
        return rand.nextDouble() * (max_range - min_range) + min_range;
    }

    public void process(double min_range, double max_range){
        double sum = 0;
        for(int i = 0; i < 10000; i++){
            double n = getRandom(min_range, max_range);
            if(n<min){
                min = n;
            }else if(n>max){
                max = n;
            }
            sum += n;
        }
        average = sum / 10000;
    }

    public double getAverage(){
        return average;
    }

    public double getMin(){
        return min;
    }

    public double getMax(){
        return max;
    }

}
