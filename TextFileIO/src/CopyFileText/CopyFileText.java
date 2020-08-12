package CopyFileText;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyFileText {
    public static void main(String[] args){
        try {
            File fileSource = new File("TextFileIO/src/CopyFileText/SourceFile.txt");
            FileWriter writer = new FileWriter(fileSource);
            writer.write("Hello!");
            writer.close();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
