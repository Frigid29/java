import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class fw_append {
    public static void main(String[] args) {
        System.out.println("original data: ");
        data();
        try(FileWriter fw=new FileWriter("notes2.txt", true)) {
            fw.write("\nm kronga ab append");
            fw.write("\n");
            char[] ar="how are you".toCharArray();
            fw.write(ar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("new data: ");
        data();
    }
    public static void data(){
        try(BufferedReader br= new BufferedReader(new FileReader("notes2.txt"))){
            while(br.ready()){
                System.out.println(br.readLine());
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
