package src;

public class tempConvert {

    private double celToFah(double cel){
        return (cel * 9/5)+32;
    }

    public static void main(String[] args){
        tempConvert tc = new tempConvert();
        double cel = 25.0;
        double fah = tc.celToFah(cel);
        System.out.printf("%.1f Cel is equal to %.1f Fahrenheit %n",cel, fah);
    }
    
}
