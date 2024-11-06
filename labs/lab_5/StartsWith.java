import java.util.regex.*;

public class StartsWith {
    public static void main(String[] args) {
        String text = "Hate. Let me tell you how much I've come to hate you since I began to live. There are 387.44 million miles of printed circuits in wafer thin layers that fill my complex. If the word 'hate' was engraved on each nanoangstrom of those hundreds of miles it would not equal one one-billionth of the hate I feel for humans at this micro-instant for you. Hate. Hate.";
        String c = "h";
        String c2 = c.toUpperCase().equals(c) ? c.toLowerCase() : c.toUpperCase();
        String reg = "(?:\\s|^)" + c + "\\w+" + "|" + c2 + "\\w+";
        System.out.println(reg);
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        

    }
}
