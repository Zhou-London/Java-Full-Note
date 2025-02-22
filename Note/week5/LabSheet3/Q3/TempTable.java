package week5.LabSheet3.Q3;

import java.util.ArrayList;

public class TempTable {

    //2D Array of String to represent the table
    private ArrayList<String> matrix;

    //Minimum and maximum range of the Cel
    private int min;
    private int max;

    //Text of the Centre Header
    private String CentreHeader;

    //Text of the Column Header
    private String C_Header;
    private String F_Header;

    //Text Align
    private int Max_Num_Cols;
    private int Num_Of_Spaces;

    //Layout
    private int length;
    private int width;
    //Const Value
    private final int Length_Of_Cel = 6;
    private final int Length_Of_Fah = 6;
    private final int Space_Between_CF = 2;

    //Celsius to Fahrenheit
    private int CtoF (int C){
        return (C * 9/5 + 32);
    }

    public TempTable(int min, int max){
        this.min = min;
        this.max = max;
        this.matrix = new ArrayList<>();
        //Default Value
        this.CentreHeader = "I like your Mom, I like your Mom! I wanna marry her!";
        this.C_Header = "C";
        this.F_Header = "F";
        this.Max_Num_Cols = 5;
        this.Num_Of_Spaces = 2;
    }

    public void formatTable(){

        //**Calculate the total number of Celsius value**
        final int NUM_OF_VALUE = max - min + 1;

        //**Calculate the real number of cols**
        int Num_Of_Cols = 0;
        if(NUM_OF_VALUE > this.Max_Num_Cols) { Num_Of_Cols = this.Max_Num_Cols; }
        else { Num_Of_Cols = NUM_OF_VALUE; }

        //**Calculate the layout**
            //Const value, not being changed by user
        final int Length_Of_One_Col = Length_Of_Cel + Length_Of_Fah + Space_Between_CF;
            //Calculate spaces
        String space = String.format(" ".repeat(this.Num_Of_Spaces));
        String Space_CF = String.format(" ".repeat(Space_Between_CF));
            //Calculate the length and width of the whole table
        this.length = Length_Of_One_Col * this.Max_Num_Cols
                + this.Num_Of_Spaces * (this.Max_Num_Cols - 1);
        this.width = (NUM_OF_VALUE) / 5 + 1;

        //**Format the Center Header**
            //Calculate padding
        final int Padding_of_Center_Header = this.length - this.CentreHeader.length();
            //Center the Header
        String formatted_Center_Header = getFormattedString(Padding_of_Center_Header, this.CentreHeader);
            //Add it to the matrix
        matrix.add(formatted_Center_Header);

        //**Format the line**
            //Repeat the line, the same length as the Header
        final String line = String.format("-".repeat(this.CentreHeader.length()));
            //Center the line
        final int Padding_Of_Line = this.length - line.length();
        String Formatted_Line = getFormattedString(Padding_Of_Line, line);
            //Add it to the matrix
        matrix.add(Formatted_Line);

        //**Format the Celsius and Fahrenheit Header**
        String C_s = this.C_Header;
        String F_s = this.F_Header;
            //Keep the same length, to text align
        while(C_s.length() < Length_Of_Cel){C_s = C_s + " ";}
        while(F_s.length() < Length_Of_Fah){F_s = F_s + " ";}
            //Format a single C-F pair
        String single_CF_Column = C_s + Space_CF + F_s;
            //Format the whole row
        String formatted_CF_Header = "";
        for(int i = 0; i < Num_Of_Cols; i++){
            formatted_CF_Header += single_CF_Column;
                //The last pair doesn't need space
            if(i < Num_Of_Cols - 1){ formatted_CF_Header += space; }
        }
            //Add it to the matrix
        matrix.add(formatted_CF_Header);

        //**Format the Table**
        ArrayList<String> pair_table = new ArrayList<>();
        for(int i = this.min; i <= this.max; i++){
            //Get Cel and Fah in Integer
            int Cel = i;
            int Fah = CtoF(Cel);
            //Convert them into String
            String Cel_s = String.valueOf(Cel);
            String Fah_s = String.valueOf(Fah);
            //Keep the same length, to text align
            while(Cel_s.length() < Length_Of_Cel ){ Cel_s += " "; }
            while(Fah_s.length() < Length_Of_Fah){ Fah_s += " "; }
            //Format a single pair
            String single_pair = Cel_s + Space_CF + Fah_s;
            //Collect pairs as an ArrayList
            pair_table.add(single_pair);
        }

            //Format the pairs into a row
            //i is the number of the loop
            //count is the index of the col
            //if number of col > this.Num_Of_Cols, then reset
        int i = 0;
        int count = 0;
        String single_row = "";

        while(i < pair_table.size()){
            if(count == Num_Of_Cols){
                //Add it to the matrix and reset the row
                //If reach the maximum number of cols in one row
                matrix.add(single_row);
                single_row = "";
                count = 0;
            }
            //Format the whole row
            single_row += pair_table.get(i);
            single_row += space;

            //Increase the count
            i++;
            count++;
        }

    }

    //**Print the matrix line by line**
    public void printTable(){
        for(String str : matrix){ System.out.println(str); }
    }


    //**Method to format a Centered String**
    private String getFormattedString(int padding_total, String text) {
        final int padding_left = padding_total / 2;
        final int padding_right = padding_total - padding_left;
        String formatted_Center_Header = String.format("%s%s%s",
                                                        " ".repeat(padding_left),
                                                        text,
                                                        " ".repeat(padding_right));
        return formatted_Center_Header;
    }



    //Test
    public static void main(String[] args){
        TempTable tempTable = new TempTable(-20, 20);
        tempTable.formatTable();
        tempTable.printTable();
    }



}
