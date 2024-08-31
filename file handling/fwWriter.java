import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class fwWriter {
    public static void main(String[] args) {
        System.out.println("original data: ");
        data();
        try(FileWriter fw=new FileWriter("notes.txt")) {
            fw.write("hi");
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
        try(BufferedReader br= new BufferedReader(new FileReader("notes.txt"))){
            while(br.ready()){
                System.out.println(br.readLine());
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

/*
    original data: 
    hello
    akash here
    this is original         
    which will be overwritten
    new data: 
    hi
    how are you
 */
