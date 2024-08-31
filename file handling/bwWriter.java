import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class bwWriter {
    public static void main(String[] args) {
        try(BufferedWriter bw=new BufferedWriter(new FileWriter("notes3.txt", true))) {
            bw.write("\nHare Krishna");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
