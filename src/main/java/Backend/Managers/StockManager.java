package Backend.Managers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class StockManager {

    public class StockFileReading {

        public static void main(String[] args) {
            try {
                FileReader reader = new FileReader("stock.txt");
                BufferedReader bufferedReader = new BufferedReader(reader);

                String line;

                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();

            } catch (IOException e) {
            }
        }

    }

    public class StockFileWriting {

        public static void main(String[] args) {
            try {
                FileOutputStream outputStream = new FileOutputStream("stock.txt");
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "");
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

                bufferedWriter.write("");
                bufferedWriter.newLine();
                bufferedWriter.write("");

                bufferedWriter.close();
            } catch (IOException e) {
            }

        }
    } 
    

}
