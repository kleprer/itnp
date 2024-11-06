package labs.lab_4;
import java.io.*;

public class Copycat {
    public static void main(String[] args) {
        if (args.length == 2) {

            //creating instances of br and bw to read and write the files
            BufferedReader br;
            BufferedWriter bw;

            //opening the files
            try {
                br = new BufferedReader(new FileReader(args[0]));
                bw = new BufferedWriter(new FileWriter(args[1], true));
            }
            catch (IOException ex) {
                System.out.println("Could not open files");
                return;
            }
            
            //reading the files
            try {
                int c;
                while((c=br.read()) != -1) { bw.write(c); }
            }
            catch (IOException e2) {
                System.out.println("Error reading files");
            }

            //closing the files
            try {
                br.close();
                bw.close();
                System.out.println("File has been written");
            }
                
            catch (IOException e) {
                System.out.println("Error closing the files");
            }
        }   
        
    }
}
