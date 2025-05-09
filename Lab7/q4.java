import java.io.*;

public class q4{
    public static void main(String[] args){
        String file1 = "file1.bin";
        String file2 = "file2.bin";

        try (FileInputStream fis1 = new FileInputStream(file1);
             FileInputStream fis2 = new FileInputStream(file2)) {

            int pos = 0, byte1, byte2;
            while ((byte1 = fis1.read()) != -1 && (byte2 = fis2.read()) != -1) {
                if (byte1 != byte2) {
                    System.out.println("Files differ at byte position: " + pos);
                    return;
                }
                pos++;
            }
            System.out.println("Two files are equal.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
