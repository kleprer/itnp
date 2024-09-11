import java.util.Scanner;

public class Task3 {

 public static void main (String[] args) {
  Scanner in = new Scanner(System.in);
  String answer = "y";
  while(answer.equals("y")) {
   System.out.print("boxes: ");
   int boxes = in.nextInt();
   System.out.print("bags: ");
   int bags = in.nextInt();
   System.out.print("barrels: ");
   int barrels = in.nextInt();
   System.out.println("the amount of items in the warehouse: " + containers(boxes, bags, barrels));
   System.out.print("Convert again? (y/n) ");
   answer = in.next();
   if (!answer.equals("y")) { break; }
  }
  in.close();
  
 }

 public static int containers(int boxes, int bags, int barrels) {
  int items = 20*boxes + 50*bags + 100*barrels;
  return items;
 }

}
