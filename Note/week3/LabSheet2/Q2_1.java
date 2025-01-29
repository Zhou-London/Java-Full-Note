package week3.LabSheet2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Q2_1 {
    public static void main(String[] args) {
        new Q2_1().print();
    }

    private Scanner sc = new Scanner(System.in);

    public void print(){
        System.out.println("Formatted Date: " + getFormattedDate(getCalendar()));
    }

    private String getFormattedDate(Calendar cal){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(cal.getTime());
    }

    private Calendar getCalendar(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, getDay());
        calendar.set(Calendar.MONTH, getMonth());
        calendar.set(Calendar.YEAR, getYear());
        return calendar;
    }

    private int getDay(){System.out.printf("Enter Day: ");return sc.nextInt();}
    private int getMonth(){System.out.printf("Enter Month: ");return sc.nextInt();}
    private int getYear(){System.out.printf("Enter Year: ");return sc.nextInt();}

}
