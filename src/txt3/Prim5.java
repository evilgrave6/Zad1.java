package txt3;
import java.io.*;

public class Prim5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = null;
        PrintWriter out = null;

        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("D:\\files\\MyFile1.txt"), "cp1251"));

            out = new PrintWriter(("D:\\files\\MyFile2.txt"), "cp1251");
            int lineCount = 0;
            String s;

            while ((s = br.readLine()) != null) {
                lineCount++;
                out.println(lineCount + ": " + s);
                System.out.println(lineCount + ": " + s);
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!");
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}

