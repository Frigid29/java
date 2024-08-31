import java.io.*;
public class filehandling {
    public static void main(String[] args) {
        
        //reader

        /*try(InputStreamReader isr= new InputStreamReader(System.in)){
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
        }*/

        /*try(FileReader fr= new FileReader ("notes.txt")){
            int letters=fr.read();
            while(fr.ready()){
                System.out.println((char)letters);
                letters=fr.read();
            }
            //isr.close();
            System.out.println();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }*/


        /*try(BufferedReader br= new BufferedReader(new FileReader("notes.txt"))){
            while(br.ready()){
                System.out.println(br.readLine());
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        try(BufferedReader br= new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("You Typed: "+br.readLine());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }*/

        //writer
        /*try(OutputStreamWriter osw=new OutputStreamWriter(System.out)) {
            osw.write("hi");
            osw.write("\n");
            osw.write("how are you");
            osw.write("\n");
            osw.write("9");
            osw.write("\n");
            char[] ar="how are you".toCharArray();
            osw.write(ar);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }*/

        /*try(FileWriter fw=new FileWriter("notes.txt")) {
            fw.write("hi");
            fw.write("\n");
            fw.write("how are you");
            fw.write("\n");
            fw.write("9");
            fw.write("\n");
            char[] ar="how are you".toCharArray();
            fw.write(ar);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }*/


        //append
        /*try(FileWriter fw=new FileWriter("notes2.txt", true)) {
            fw.write("\nm kronga ab append");
            fw.write("\n");
            char[] ar="how are you".toCharArray();
            fw.write(ar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/

        /*try(BufferedWriter bw=new BufferedWriter(new FileWriter("notes3.txt", true))) {
            bw.write("Hare Krishna");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/
        
    }
}
