import java.util.Scanner;

public class Task9 {

 public static void main(String[] args) {
  float commission = 1.38888888f;
  Scanner in = new Scanner(System.in);
  String answer = "y";
  while (answer.equals("y")) {
   System.out.print("number of tickets: ");
   int num = in.nextInt();
   System.out.print("ticket cost: ");
   int cost = in.nextInt();
   System.out.println("revenue: " + ticketSaler(num, cost, commission));
   System.out.print("Calculate again? (y/n) ");
   answer = in.next();
  }
 }
 
 public static int ticketSaler(int num, int cost, float com) {
  return (int)((float)(num*cost)/com);
 
 }
}