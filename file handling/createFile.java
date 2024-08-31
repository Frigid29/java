import java.io.File;
import java.io.IOException;
public class createFile {
    public static void main(String[] args) {
        try {
            File fo=new File("new-file.txt");
            fo.createNewFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
