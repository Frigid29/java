import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.IOException;
public class osWriter {
    public static void main(String[] args) {
        try(OutputStreamWriter osw=new OutputStreamWriter(System.out)) {
            osw.write("hi");
            osw.write("\n");
            osw.write("how are you");
            osw.write("\n");
            osw.write("9");
            osw.write("\n");
            char[] ar="how are you".toCharArray();
            osw.write(ar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
