import java.util.regex.*;

public class DoxerMachine {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])([.](?!$)|$)){4}$");
        String IP = "2.1.2.3.3.10024";
        System.out.println(IP);
        
        if (!pattern.matcher(IP).find()) {
            
            System.out.println("Wrong IP address.");
        }
    }
}
