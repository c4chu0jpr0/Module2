package Practice3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập file nguồn: ");
        String sourcePath = scanner.nextLine();
        System.out.println("Nhập file copy");
        String destPath = scanner.nextLine();
        File source = new File(sourcePath);
        File dest = new File(destPath);
        try{
            copyFileUsingStream(source,dest);
            System.out.println("file complete");
        } catch (IOException e) {
            System.out.println("not complete file");
            System.out.println(e.getMessage());
        }
    }
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
                System.out.println("byte: "+length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
}
