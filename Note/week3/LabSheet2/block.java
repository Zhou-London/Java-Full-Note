package week3.LabSheet2;

import java.util.ArrayList;

public class block {
    public ArrayList<Integer>[] matrix;
    public block(){
        matrix = new ArrayList[3];
        for(int i = 0; i < matrix.length; i++){
            matrix[i] = new ArrayList<>();
            for(int j = 0; j < 3; j++){
                matrix[i].add(0);
            }
        }
    }
    public void print(){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].size(); j++){
                System.out.print(matrix[i].get(j)+" ");
            }
            System.out.println();
        }
    }

}
