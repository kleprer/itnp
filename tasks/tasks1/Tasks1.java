import java.util.Scanner;

public class Tasks1 {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Task 1");
        System.out.print("gallons: ");
        int num = in.nextInt();
        System.out.printf("this but in liters: %.2f%n", gallonsToLiters(num));

        System.out.println("Task 2");
        System.out.print("workout in minutes: ");
        int minutes = in.nextInt();
        System.out.print("intensity: ");
        int intensity = in.nextInt();
        System.out.printf("burnt calories: %d%n", fitCalc(minutes, intensity));

        System.out.println("Task 3");
        System.out.print("boxes: ");
        int boxes = in.nextInt();
        System.out.print("bags: ");
        int bags = in.nextInt();
        System.out.print("barrels: ");
        int barrels = in.nextInt();
        System.out.println("the amount of items in the warehouse: " + containers(boxes, bags, barrels));

        System.out.println("Task 4");
        System.out.print("a: ");
        int a = in.nextInt();
        System.out.print("b: ");
        int b = in.nextInt();
        System.out.print("c: ");
        int c = in.nextInt();
        System.out.println("triangle type: " + triangleType(a,b,c));

        System.out.println("Task 5");
        System.out.print("a: ");
        int num1 = in.nextInt();
        System.out.print("b: ");
        int num2 = in.nextInt();
        ternaryEvaluation(num1,num2);

        System.out.println("Task 6");
        System.out.print("meters: ");
        int n = in.nextInt();
        System.out.print("width: ");
        float w = in.nextFloat();
        System.out.print("height: ");
        float h = in.nextFloat();
        System.out.println("the number of items: " + howManyItems(n, w, h));

        System.out.println("Task 7");
        System.out.print("num: ");
        int x = in.nextInt();
        System.out.println("factorial of num: " + factorial(x));

        System.out.println("Task 8");
        System.out.print("a: ");
        int y = in.nextInt();
        System.out.print("b: ");
        int z = in.nextInt();
        System.out.println("gcd: " + gcd(y, z));

        System.out.println("Task 9");
        float commission = 1.38888888f;
        System.out.print("number of tickets: ");
        int tickNum = in.nextInt();
        System.out.print("ticket cost: ");
        int cost = in.nextInt();
        System.out.println("revenue: " + ticketSaler(tickNum, cost, commission));

        System.out.println("Task 10");
        System.out.print("students: ");
        int students = in.nextInt();
        System.out.print("desks: ");
        int desks = in.nextInt();
        System.out.println("needed desks: " + tables(students, desks));

        in.close();
  
    }

    public static float gallonsToLiters(int gallon) {
        float liters = (float) gallon * 4.55f;
        return liters;
    }

    public static int fitCalc(int min, int intens) {
        int result = min * intens;
        return result;
    }

    public static int containers(int boxes, int bags, int barrels) {
        int items = 20*boxes + 50*bags + 100*barrels;
        return items;
    }

    public static String triangleType(int a, int b, int c) {
        String result = "";
        if (a+b > c && a+c > b && b+c > a) {
            if ((a==b && b!=c) || (a==c && b!=a) || (c==b && c!=a)) { result = "isosceles"; }
            else if ((a==b) && (b==c)) { result = "equalateral"; }
            else { result = "different-sided"; }
        }
        else { result = "not a triangle"; }
        return result;
    }

    public static void ternaryEvaluation(int a, int b) {
        String result = a > b ? "a > b" : "a < b";
        System.out.println(result);
    }

    public static int howManyItems(int n, float w, float h) {
        return (int) ((n/2) / (w*h));
    }

    public static int factorial(int num) {
        int p = 1;
        if (num>1) {
         for (int i = 2; i <= num; i++) { p = p*i; }
        }
        return p; 
    }

    public static int gcd(int a, int b) {
        if (b==0) { return a; }
        else { return gcd(b, a%b); } 
    }

    public static int ticketSaler(int num, int cost, float com) {
        return (int)((float)(num*cost)/com);
       
    }

    public static int tables(int students, int desks) {
        if (desks*2 > students) { return 0; }
        int tables = (students%desks != 0) ? (students%desks+1)/2 : students%(desks)/2;
        return tables;
    }
}