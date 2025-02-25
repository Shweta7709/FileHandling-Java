import java.io.*;

public class CopyFile1 {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("input.txt");
             FileOutputStream out = new FileOutputStream("output1.txt")) {

            int c;
            while ((c = in.read()) != -1) {
             System.out.println((char)c);
                out.write(c);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error occurred: " + e.getMessage());
        }
    }
}
