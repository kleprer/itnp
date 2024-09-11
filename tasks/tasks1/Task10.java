import java.util.Scanner;

public class Task10 {

 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  String answer = "y";
  while (answer.equals("y")) {
   System.out.print("students: ");
   int students = in.nextInt();
   System.out.print("desks: ");
   int desks = in.nextInt();
   System.out.println("needed desks: " + tables(students, desks));
   System.out.print("Calculate again? y/n ");
   answer = in.next();
  }
  
 }
 
 public static int tables(int students, int desks) {
 if (desks*2 > students) return 0;
 int tables = (students%desks != 0) ? (students%desks+1)/2 : students%(desks)/2;
 return tables;
 
 }

}