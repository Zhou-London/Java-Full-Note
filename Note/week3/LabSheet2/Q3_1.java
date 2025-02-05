package week3.LabSheet2;

import java.math.BigDecimal;
import java.util.Scanner;

public class Q3_1 {
    public static void main(String[] args) {
        Q3_1 q = new Q3_1();
        BigDecimal n = q.factorial(q.getNum());
        System.out.println(n);

    }

    public BigDecimal getNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        BigDecimal num = new BigDecimal(sc.next());
        return num;
    }

    public BigDecimal factorial(BigDecimal num) {
        BigDecimal fact = new BigDecimal(1);
        for (int i = 1; i <= num.intValue(); i++) {
            fact = fact.multiply(new BigDecimal(i));
        }
        return fact;
    }
}
