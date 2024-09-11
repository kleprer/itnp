import java.util.Scanner;

public class Task1 {

 public static void main (String[] args) {
  Scanner in = new Scanner(System.in);
  String answer = "y";
  while(answer.equals("y")) {
   System.out.print("gallons: ");
   int num = in.nextInt();
   System.out.printf("this but in liters: %.2f%n", gallonsToLiters(num));
   System.out.print("Convert again? (y/n) ");
   answer = in.next();
   if (!answer.equals("y")) { break; }
  }
  
  in.close();
 }

 public static float gallonsToLiters(int gallon) {
  float liters = (float) gallon * 4.55f;
  return liters;
 }

}