package LabSheet1;

import java.util.Scanner;

public class Q1_14 {
    public static void main(String[] args) {
        Q1_14 q = new Q1_14();
        q.printLine();

    }

    public void printLine(){
        String content = getContent();
        int insertPos = findInsert(content);
        for (int i = 0; i < insertPos; i++) {
            System.out.printf("-");
        }
        for (int i = 0; i < content.length(); i++) {
            System.out.printf("%c", content.charAt(i));
        }
        for (int i = 0; i < 80 - insertPos; i++) {
            System.out.printf("-");
        }
    }

    public String getContent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your content: ");
        return sc.nextLine();
    }

    public int findInsert(String content){
        return 40 - (content.length() / 2);
    }
}
