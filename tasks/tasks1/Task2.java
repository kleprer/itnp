import java.util.Scanner;

public class Task2 {

 public static void main (String[] args) {
  Scanner in = new Scanner(System.in);
  String answer = "y";
  while(answer.equals("y")) {
   System.out.print("workout in minutes: ");
   int minutes = in.nextInt();
   System.out.print("intensity: ");
   int intensity = in.nextInt();
   System.out.printf("burnt calories: %d%n", fitCalc(minutes, intensity));
   System.out.print("Calculate again? (y/n) ");
   answer = in.next();
   if (!answer.equals("y")) { break; }
  }
  
  
 }

 public static int fitCalc(int min, int intens) {
  int result = min * intens;
  return result;
 }

}