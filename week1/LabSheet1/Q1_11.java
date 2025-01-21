package LabSheet1;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Q1_11 {
    public static void main(String[] args) {
        Q1_11 q = new Q1_11();
        q.readFile("/Users/zhou/repo/javaNote/week1/LabSheet1/hello.txt");
        q.printMap();


    }

    private HashMap<Character, Integer> map = new HashMap<>();
    private HashMap<Character, Double> map2 = new HashMap<>();

    public void readFile(String filename) {
        int sum = 0;
        FileInput input = new FileInput(filename);
        while (input.hasNextChar()) {
            char ch = input.nextChar();
            if(('a' <= ch && ch <= 'z')
            || ('A' <= ch && ch <= 'Z')) {
                countChar(Character.toLowerCase(ch));
                sum += 1;
            }
        }
        input.close();
        countFrequency(sum);
    }

    public void countChar(char ch){
        if(map.containsKey(ch)){
            map.put(ch, map.get(ch)+1);
        }
        else{
            map.put(ch, 1);
        }
    }

    public void countFrequency(int sum){
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            map2.put(entry.getKey(), (double)entry.getValue() / sum);
        }
    }

    public void printMap(){
        for(Map.Entry<Character, Double> entry : map2.entrySet()){
            System.out.printf(" %c's frequency is %.1f%%\n", entry.getKey(), entry.getValue()*100);
        }
    }





}
