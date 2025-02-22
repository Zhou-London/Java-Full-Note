package week5.LabSheet3.Q2;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Range {

    //Use an Integer Stream
    private IntStream range;

    //Store the start and end of the stream
    private int start;
    private int end;

    //Init with a low and high value.
    public Range(int low, int high) {

        //Check valid
        if(low > high) { throw new IllegalArgumentException("low > high"); }

        //Assign value
        range = IntStream.rangeClosed(low, high);
        start = low;
        end = high;
    }

    //Print the range
    public void printRange() { range.forEach(System.out::println); }

    //Return as an ArrayList
    public ArrayList<Integer> getValue() {

        //Declare a new list
        ArrayList<Integer> list = new ArrayList<>();

        //Add values to the list
        range.forEach(i -> list.add(i));

        //Return the list
        return list;
    }

    //Return low and high value
    public int getLow(){ return start; }
    public int getHigh(){ return end; }

    //Check if contains a value
    public boolean contains(int value) {
        //Check valid
        if(value < start || value > end) { throw new IllegalArgumentException("value not valid"); }

        //Match the value
        boolean result = false;
        result = range.anyMatch(r -> r == value);

        //Return the boolean value
        return result;
    }
}
