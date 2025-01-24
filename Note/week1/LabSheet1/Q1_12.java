package week1.LabSheet1;

import java.util.ArrayList;

public class Q1_12 {
    public static void main(String[] args) {
        Q1_12 q = new Q1_12();
        q.run();

    }

    ArrayList<String> list = new ArrayList<>();
    ArrayList<String> list_reversed = new ArrayList<>();

    public void run(){
        copyFile("/Users/zhou/repo/javaNote/week1/LabSheet1/hello.txt");
        reverseFile();
        outPutFile("/Users/zhou/repo/javaNote/week1/LabSheet1/target.txt");
    }

    public void copyFile(String filename){
        FileInput input = new FileInput(filename);
        while(input.hasNextLine()){
            list.add(input.nextLine());
        }
        input.close();
    }

    public void reverseFile(){
        for(int i = list.size() - 1; i >= 0; i--){
            list_reversed.add(list.get(i));
        }
    }

    public void outPutFile(String filename){
        FileOutput output = new FileOutput(filename);
        for(String line : list_reversed){
            output.writeString(line);
            output.writeString("\n");
        }
        output.close();
    }



}
