import java.util.Scanner;

public class Task8 {

 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  String answer = "y";
  while (answer.equals("y")) {
   System.out.print("a: ");
   int a = in.nextInt();
   System.out.print("b: ");
   int b = in.nextInt();
   System.out.println("gcd: " + gcd(a, b));
   System.out.print("Calculate again? (y/n) ");
   answer = in.next();
  }
 }

 public static int gcd(int a, int b) {
  if (b==0) return a;
  else return gcd(b, a%b); 
 }
}