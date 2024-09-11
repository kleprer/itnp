public class Palindrome {

    public static void main(String[] args) {
        for (int i=0; i<args.length; i++) {
            String s = args[i];
            boolean result = isPalindrome(s);
            if (result == true) {
                System.out.println("This string is a palindrome: " + s);
            }
            else {
                System.out.println("This string is not a palindrome:" + s);
            }
        }
    }
 
    public static String reverseString(String s) {
        int l = s.length();
        String newS = "";
        for (int i=l-1; i>=0; i--) {
            newS += s.charAt(i);
        }
    return newS;
    }
 
    public static boolean isPalindrome(String s) {
        String newS = reverseString(s);
        if (newS.equals(s)) { return true; }
        else { return false; }   
    }
    
}