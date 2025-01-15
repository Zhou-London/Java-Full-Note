package src;

public class TempConv {

    private double ToFah(double cel){
        return (cel * 9/5) + 32;
    }


    public static void main(String[] args){
        TempConv tc = new TempConv();
        double cel = 30.0;
        double fah = tc.ToFah(cel);
        System.out.printf("%.1f Celsus is %.1f Fahrenheit \n", cel, fah);


    }
}
