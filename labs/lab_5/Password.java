import java.util.regex.*;

public class Password {
    public static void main(String[] args) {
        String password = "Ihnm95";
        
        Pattern pattern1 = Pattern.compile("^[a-zA-Z0-9]+$");
        Pattern pattern2 = Pattern.compile("(?=.*[A-Z])");
        Pattern pattern3 = Pattern.compile("(?=.*[!@#$%^&+=])");
        Pattern pattern4 = Pattern.compile("(?=.*[0-9])");
        Pattern pattern5 = Pattern.compile("^.{8,16}$");
        boolean flag = true;

        System.out.println(password);
        if (!pattern2.matcher(password).find()) {
            System.out.println("password should have at least 1 uppercase letter"); 
            flag = false;
        }
                
        if (pattern3.matcher(password).find()) {
            password = password.replaceAll("[!@#$%^&+=]","");
            System.out.println(password);
        }
        else { 
            System.out.println("password should have at least 1 special character"); 
            flag = false;
        }
    
        if (!pattern4.matcher(password).find()) {
                
            System.out.println("password should have at least 1 number"); 
            flag = false;
        }

        if (!pattern5.matcher(password).find()) {
            System.out.println("password should be from 8 to 16 letters long"); 
            flag = false;
        }

        if (!pattern1.matcher(password).find()) {
            System.out.println("should be in latin");
            flag = false;
        }
        
    
        if (flag) {
            System.out.println("Good password");
        }
    
    }
    
}
