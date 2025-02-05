package week3.LabSheet2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Dict {

    private HashMap<String, String> dict;

    public Dict(){ dict = new HashMap<>(); }

    public void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String key = sc.nextLine();
        System.out.println("Enter the value: ");
        String value = sc.nextLine();
        dict.put(key, value);
    }

    public void writeFile(){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/zhou/repo/javaNote/Note/week3/LabSheet2/Dictonary.txt"));
            bw.write(dict.toString());
            bw.close();
        } catch (IOException e){ e.printStackTrace(); }
    }

    public void put(String key, String value){ dict.put(key, value); writeFile();}

    public String get(String key){ return dict.get(key); }

    public boolean contains(String key){ return dict.containsKey(key); }

    public int size(){ return dict.size(); }

    public void print(){
        System.out.println("Dictonary");
        for (String key : dict.keySet()){ System.out.println(key + "\t" + dict.get(key)); }
    }

    public void delete(String key) {
        if(dict.containsKey(key)){ dict.remove(key); writeFile(); }
        else { System.out.println("Key " + key + " not found");}
    }
}
