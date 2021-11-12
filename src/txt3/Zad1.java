package txt3;
import java.io.*;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Zad1 {
    public static void main(String[] args) throws IOException {
        BufferedReader red = null;
        BufferedWriter wr = null;
        String letters = "слов";
        try {
            red = new BufferedReader(
                    new InputStreamReader(new FileInputStream("D:\\java\\text.txt"), StandardCharsets.UTF_8));
            wr = new BufferedWriter(
                    new OutputStreamWriter(new FileOutputStream("D:\\java\\text2.txt"), StandardCharsets.UTF_8));
            int lineCount = 0;
            int lineWord = 0;
            String s;

            while ((s = red.readLine()) != null) {
                lineCount++;
                for (String words : s.split(" ")) {
                    Arrays.stream(s.split("\\s+"))
                            .filter(x -> letters.contains(x.substring(0,1)))
                            .forEach(System.out::println);
                    }
                }

        } catch (IOException e) {
            System.out.println("Ошибка!");
        }
        finally{
            assert red != null;
        red.close();
            assert wr != null;
            wr.flush();
            wr.close();
        }
    }
}
