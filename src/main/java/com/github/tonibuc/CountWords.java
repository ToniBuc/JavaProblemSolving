package main.java.com.github.tonibuc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CountWords {
    public static void main(String[] args) throws IOException {
        String file = "E:\\Java Projects\\JavaProblemSolving\\src\\main\\java\\com\\github\\tonibuc\\resources\\CountWordsTextFile.txt";
        try{
            String x = new String(Files.readAllBytes(Paths.get(file)));
            int z = x.split("\\s+").length;

            System.out.println("CountWordsTextFile has " + z + " words.");
        }
        catch(FileNotFoundException ex){
            System.out.println("Error.");
            ex.printStackTrace();
        }

    }
}
