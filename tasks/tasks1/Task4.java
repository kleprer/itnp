import java.util.Scanner;

public class Task4 {

 public static void main (String[] args) {
  Scanner in = new Scanner(System.in);
  String answer = "y";
  while(answer.equals("y")) {
   System.out.print("a: ");
   int a = in.nextInt();
   System.out.print("b: ");
   int b = in.nextInt();
   System.out.print("c: ");
   int c = in.nextInt();
   System.out.println("triangle type: " + triangleType(a,b,c));
   System.out.print("Calculate again? (y/n) ");
   answer = in.next();
   if (!answer.equals("y")) { break; }
  }
  in.close();
 }

 public static String triangleType(int a, int b, int c) {
  String result = "";
  if (a+b > c && a+c > b && b+c > a) {
   if ((a==b && b!=c) || (a==c && b!=a) || (c==b && c!=a)) { result = "isosceles"; }
   else if ((a==b) && (b==c)) { result = "equalateral"; }
   else { result = "different-sided"; }
  }
  else {
  result = "not a triangle";
  }
  return result;
 }

}
