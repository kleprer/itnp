import java.util.regex.*;
public class NumberFinder {
    public static void main(String[] args) {
        String text = "10 years, 25 five... or all the 1.09 and nine years that you've lived down here in my belly, here underground?";
        Pattern pattern = Pattern.compile("\\d+[.,]?\\d+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
        System.out.println(matcher.group());
        }
        
    }
}
