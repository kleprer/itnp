import java.util.Scanner;
import java.lang.Math;

public class Task6 {

 public static void main (String[] args) {
  String answer = "y";
  while (answer.equals("y")) {
   Scanner in = new Scanner(System.in);
   System.out.print("meters: ");
   int n = in.nextInt();
   System.out.print("width: ");
   float w = in.nextFloat();
   System.out.print("height: ");
   float h = in.nextFloat();
   System.out.println("the number of items: " + howManyItems(n, w, h));
   System.out.print("Calculate again? (y/n)");
   answer = in.next();
  }
  in.close();
 }
 
 public static int howManyItems(int n, float w, float h) {
 float square = n/2;
 float oneSize = w*h;
 float result = square / oneSize;
 return (int) result;
 
 }
}
