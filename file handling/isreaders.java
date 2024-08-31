import java.io.*;
public class isreaders {
    public static void main(String[] args) {
        
        //reader

        try(InputStreamReader isr= new InputStreamReader(System.in)){
            System.out.print("enter some letter: ");
            int letters=isr.read();
            while(isr.ready()){
                System.out.println((char)letters);
                letters=isr.read();
            }
            isr.close();
            System.out.println();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}