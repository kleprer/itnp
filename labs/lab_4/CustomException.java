
import java.io.*;


public class CustomExceptions {
    
    public static void main(String[] args) throws Exception  {
        
        File file = new File("test.log");
        PrintStream ps = new PrintStream(file);

        if (args.length > 0) {
            try {
                readFile(args[0]);
            }
            catch (CustomFileNotFoundException e) {
                System.out.println(e.getMessage());
                    e.printStackTrace(ps);
                
            }
            
        }
        ps.close();

    }

    public static void readFile(String path) throws Exception {
        BufferedReader br;
        
            try {
                br = new BufferedReader(new FileReader(path));
            }
            catch (FileNotFoundException ex) {
                throw new CustomFileNotFoundException(path);
                
            }

            //reading the files
            try {
                br.read();
            }
            catch (IOException e) {
                System.out.println("Error reading files");
                e.printStackTrace(new PrintStream(new File("test.log")));
            }

            //closing the file
            try {
                br.close();
                System.out.println("File has been written");
            }
            catch (IOException e) {
                System.out.println("Error closing the files");
                e.printStackTrace(new PrintStream(new File("test.log")));
            }
            
    }

}


class CustomFileNotFoundException extends FileNotFoundException {
    private String message = "No such file found in path";
    private String path;
    
    CustomFileNotFoundException(String path) {
        this.path = path;
    } 

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public String toString() {
        return "CustomFileNotFoundException[" + path + "]";
    }

}
