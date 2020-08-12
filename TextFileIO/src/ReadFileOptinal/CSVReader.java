package ReadFileOptinal;

import java.io.*;

public class CSVReader {
    public static final String FILE_READ="TextFileIO/src/ReadFileOptinal/FormText.txt";
    public static void main(String[] args) {

        try {
            File file= new File(FILE_READ);
            FileReader fileReader= new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;

            while ((line=reader.readLine())!= null){
                String[] country= line.split(",");
                System.out.println("Country [code = "+ country[4]+ " ,name = " +country[5] +"]" );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
