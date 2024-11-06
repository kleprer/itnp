import java.util.regex.*;

public class Siblings {
    public static void main(String[] args) {
        String sib = "for i am am i am";
        Pattern pattern = Pattern.compile("([a-z]{1})([A-Z]{1})");
        Matcher matcher = pattern.matcher(sib);
        
        String result = matcher.replaceAll("!$1$2!");
        System.out.println(result);
        
        
    }
        
    
}
