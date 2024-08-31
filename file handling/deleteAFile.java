import java.io.*;
public class deleteAFile {
    public static void main(String[] args) {
        try{
            File fo=new File("random.txt");
            fo.createNewFile();
            if(fo.delete()){
                System.out.println("File \""+ fo.getName()+"\" deleted");
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
