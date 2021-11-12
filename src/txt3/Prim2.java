package txt3;
import java.io.*;
public class Prim2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = null;
        BufferedWriter out=null;
        try {
            br = new BufferedReader( new FileReader("D:\\files\\MyFile1.txt" ));
            out = new BufferedWriter( new FileWriter( "D:\\files\\MyFile2.txt" ));
            int lineCount = 0; // счетчик строк
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                out.write(s);
                out.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!");
        }
        finally{
            br.close();
            out.flush();
            out.close();
        }
    }
}

