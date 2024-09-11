import java.util.Scanner;

public class Task7 {

 public static void main(String[] args) {
  String answer = "y";
  while (answer.equals("y")) {
   Scanner in = new Scanner(System.in);
   System.out.print("num: ");
   int num = in.nextInt();
   System.out.println("factorial of num: " + factorial(num));
   System.out.print("Calculate again? (y/n)");
   answer = in.next();
  }
  in.close();
 }
 
 public static int factorial(int num) {
  int p = 1;
  if (num>1) {
   for (int i=2; i<=num; i++) {
    p=p*i;
   }
  }
  return p; 
 }

}
