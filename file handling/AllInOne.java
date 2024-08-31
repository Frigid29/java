import java.io.*;
public class AllInOne {
    public static void main(String[] args) {
        //create a file
        try {
            File fo=new File("new-file2.txt");
            fo.createNewFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //write in the file
        try(FileWriter fw=new FileWriter("new-file2.txt")) {
            fw.write("hi");
            fw.write("\n");
            char[] ar="how are you".toCharArray();
            fw.write(ar);
            fw.write("\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //read from the file
        try(FileReader fr= new FileReader ("new-file2.txt")){
            int letters=fr.read();
            while(fr.ready()){
                System.out.println((char)letters);
                letters=fr.read();
            }
            //isr.close();
            System.out.println();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
