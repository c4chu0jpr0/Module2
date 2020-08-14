package Practice1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingJava7File(File source, File dest) throws IOException{
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest)throws IOException{
        InputStream is = null;
        OutputStream os = null;
        try {
            is= new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) >0){
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Enter source file: ");
        String sourcePath= scanner.nextLine();
        System.out.println("Enter dest file: ");
        String destPath= scanner.nextLine();

        File source = new File(sourcePath);
        File dest = new File(destPath);

        try{
            copyFileUsingStream(source,dest);
//            copyFileUsingJava7File(source,dest);
            System.out.println("complete file");
        } catch (IOException ioe) {
            System.out.println("Not complete file");
            System.out.println(ioe.getMessage());
        }
    }
}
