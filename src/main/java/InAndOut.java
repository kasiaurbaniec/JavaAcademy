import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InAndOut {
    String path = "file.txt";

    public void write(String message) throws IOException {
        FileWriter fileWriter = new FileWriter(path, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.append(message + "\n");
        bufferedWriter.close();
        fileWriter.close();

    }

    public void read() throws IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        while ((line=bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
