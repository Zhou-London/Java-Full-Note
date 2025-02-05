package week3.LabSheet2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q1_1 {
    private int charCount = 0;
    private int wordCount = 0;
    private int lineCount = 0;

    public static void main(String[] args) {
        Q1_1 q1 = new Q1_1();
        q1.solve("/Users/zhou/repo/javaNote/Note/week3/LabSheet2/text.txt");
    }

    public void solve(String fileName) {
        readFile(fileName);
        System.out.println("Characters: " + charCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Lines: " + lineCount);
    }

    private void readFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                countWords(line);
            }
        } catch (FileNotFoundException e) {System.out.println("File not found: " + filename);
        } catch (IOException e) {System.out.println("I/O exception: " + filename);}
    }

    private void countWords(String line) {
        Matcher matcher = Pattern.compile("\\b[a-zA-Z]+\\b").matcher(line);
        while (matcher.find()) {wordCount++;}
    }
}
