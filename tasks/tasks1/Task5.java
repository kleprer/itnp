import java.util.Scanner;

public class Task5 {

 public static void main (String[] args) {
  Scanner in = new Scanner(System.in);
  String answer = "y";
  while(answer.equals("y")) {
   System.out.print("a: ");
   int a = in.nextInt();
   System.out.print("b: ");
   int b = in.nextInt();
   ternaryEvaluation(a,b);
   System.out.print("Compare again? (y/n) ");
   answer = in.next();
  }
  
  
 }

 public static void ternaryEvaluation(int a, int b) {
  String result = a > b ? "a > b" : "a < b";
  System.out.println(result);
 }

}