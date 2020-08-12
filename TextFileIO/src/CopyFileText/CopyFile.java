package CopyFileText;

import java.io.*;

public class CopyFile {
    public static final String SOURCE_FILE="TextFileIO/src/CopyFileText/SourceFile.txt";
    public static final String COPYFILESOURCE_FILE="TextFileIO/src/CopyFileText/CopyFileSource.txt";
    public static void main(String[] args) {
        try {
            File FileCopy= new File(COPYFILESOURCE_FILE);
            FileInputStream fout = new FileInputStream(SOURCE_FILE);
            FileOutputStream dout = new FileOutputStream(COPYFILESOURCE_FILE);
            int i;

            while ((i=fout.read())!=-1){
                dout.write(i);
            }
            if (FileCopy.exists()){
                System.out.println("file copy đc hình thành");
            }else {
                System.out.println("file ko tồn tại");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
