package main.java.com.github.tonibuc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountWordsNoSplit {
    public static void main(String[] args) throws IOException {
        String file = "E:\\Java Projects\\JavaProblemSolving\\src\\main\\java\\com\\github\\tonibuc\\resources\\CountWordsTextFile.txt";
        try{
            Path x = FileSystems.getDefault().getPath(file);
            List<String> lines = Files.readAllLines(x, Charset.defaultCharset());
            int z = 0, counter = 0;

            for (String line: lines) {
                if (!line.isEmpty()){
                    z++; //for last word in each line
                }

                String y = line;
                while (!y.isEmpty()){
                    if (Character.isSpaceChar(y.charAt(counter))) {
                        z++;
                    }
                    y = y.substring(counter+1);
                    counter = 0;
                }
            }

            System.out.println("CountWordsTextFile has " + z + " words.");
        }
        catch(FileNotFoundException ex){
            System.out.println("Error.");
            ex.printStackTrace();
        }

    }
}
