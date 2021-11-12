package txt3;
import java.io.*;
public class Prim1 {
    public static void main(String[] args) throws IOException {
        Reader in=null;
        Writer out=null;
        try {
            in = new FileReader("D:\\files\\MyFile1.txt");
            out= new FileWriter("D:\\files\\MyFile2.txt", true);
            int oneByte;
            while ((oneByte = in.read()) != -1) {
                out.append((char)oneByte);
                System.out.print((char)oneByte);
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!! ");
        }
        finally{
            in.close();
            out.close();
        } }
}

