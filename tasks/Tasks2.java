
import java.util.Arrays;
import java.util.Scanner;

public class Tasks2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Task 1");
        System.out.print("String number one: ");
        String one = in.next();
        System.out.print("String number two: ");
        String two = in.next();
        System.out.println("changed string : " + duplicateChars(one, two));

        System.out.println("Task 2");
        System.out.print("Size of the array: ");
        int n = in.nextInt();
        
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            if (in.hasNextInt()) {
                arr[i] = in.nextInt();
            }
        }
        System.out.println("Numbers of multiples of 3: " + dividedByThree(arr));


        System.out.println("Task 3");
        System.out.print("Full name: ");
        Scanner in2 = new Scanner(System.in);
        String name = in2.nextLine();
        
        System.out.println("Initials: " + getInitials(name));

        System.out.println("Task 4");

        System.out.print("Size of the array: ");
        n = in.nextInt();
        float[] arr2 = new float[n];
        for (int i=0; i<n;i++) {
            if (in.hasNextFloat()) {
                arr2[i] = in.nextFloat();
            }
        }
        System.out.println("Normalized: " + Arrays.toString(normalizator(arr2)));

        System.out.println("Task 5");
        System.out.print("Size of the array: ");
        n = in.nextInt();
        int k = 0;
        float[] arr3 = new float[n];
        for (int i = 0; i < n; i++) {
            if (in.hasNextFloat()) {
                arr3[i] = in.nextFloat();
                if (arr3[i] == 0f) { k+=1; }
            }
        }
        System.out.println("Compressed array: " + Arrays.toString(compressedNums(arr3, k)));

        System.out.println("Task 6");
        System.out.print("Your string in camelCase: ");
        String s = in2.next();
        System.out.println("Converted to snake_case: " + camelToSnake(s));

        System.out.println("Task 7");
        System.out.println("Size of the array: ");
        n = in.nextInt();
        int[] arr4 = new int[n];
        for (int i = 0; i < n; i++) {
            if (in.hasNextInt()) {
                arr4[i] = in.nextInt();
            }
        }
        System.out.println("Second biggest number: " + secondBiggest(arr4));

        System.out.println("Task 8");
        System.out.println("Your string: ");
        String s4 = in.next();
        System.out.print("The marker char: ");
        String c = in.next();
        System.out.println("Changed string: " + localReverse(s4, c));

        System.out.println("Task 9");
        System.out.println("Input the three numbers");
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            if (in.hasNextInt()) {
                nums[i] = in.nextInt();
            }
        }
        System.out.println(equal(nums));
        
        System.out.println("Task 10");
        System.out.println("String one: ");
        String s1 = in.next().toLowerCase();
        System.out.println("String two: ");
        String s2 = in.next().toLowerCase();
        System.out.println(isAnagram(s1, s2));

        in.close();
        in2.close();
    }

    public static String duplicateChars(String one, String two) {
        String newString = "";
        String[] parts = two.split("");
        for (int i=0; i<one.length();i++) {
            if (!(Arrays.asList(parts).contains(Character.toString(one.charAt(i))))) {
                newString+=Character.toString(one.charAt(i));
            }
        }
        System.out.println(newString);
        return newString;
    }

    public static int dividedByThree(int[] arr) {
        int n = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != 0 && arr[i] % 3 == 0) { n+=1; }
        }
        return n;
    }

    public static String getInitials(String name) {
        String[] parts = name.split(" ");
        String firstName = parts[1].substring(0,1).toUpperCase();
        String middleName = parts[2].substring(0,1).toUpperCase();
        String lastName = parts[0].substring(0,1).toUpperCase() + parts[0].substring(1);
        return firstName + ". " + middleName + ". " + lastName;
    }

    public static float[] normalizator(float[] arr) {
        float[] newArr = new float[arr.length];
        float[] unsortedArr = new float[arr.length];
        System.arraycopy( arr, 0, unsortedArr, 0, arr.length );
        Arrays.sort(arr);
        for (int i = 0; i<newArr.length; i++) {
            newArr[i] = (unsortedArr[i] - arr[0])/(arr[arr.length-1] - arr[0]);
        }
        return newArr;
    }

    public static int[] compressedNums(float[] arr, int n) {
        
        Arrays.sort(arr);
        int[] newArr = new int[arr.length-n];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = (int) arr[i+n];
        }
        return newArr;
    }

    public static String camelToSnake(String s) {
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && Character.isUpperCase(s.charAt(i))) { return "not camelcase"; }
            else {
                if (Character.isUpperCase(s.charAt(i))) {
                    newS += ("_" + Character.toString(s.charAt(i)).toLowerCase());
                }
                else {
                    newS += Character.toString(s.charAt(i));
                }
            }
            
        } 
        return newS;
    }

    public static int secondBiggest(int[] arr) {
        Arrays.sort(arr);
        if (arr.length >= 2) {
            return arr[arr.length - 2];
        }
        return arr[0];
    }

    public static String localReverse(String s, String c) {
        String newS = "";
        if (Character.toString(s.charAt(0)).equals(c)) {newS += c;}
        boolean flag = true;
        String[] parts = s.split(c);
        for (int i = 0; i < parts.length; i++) {
            if (newS.length() > 0 && Character.toString(newS.charAt(0)).equals(c) && i==0) {
                newS += new StringBuilder(parts[i]).reverse().toString();
            }
            else if (newS.length() == 0 && i==0) {
                newS += parts[i];
                flag = false;
            }
            else {
                if (i%2 != 0 && flag == false) {
                    newS += new StringBuilder(parts[i]).reverse().toString();
                }
                else if (i%2 == 0) { newS += parts[i]; }
                else if (i%2 == 0 && flag == true ) { 
                    newS += new StringBuilder(parts[i]).reverse().toString(); 
                }
                else { newS += parts[i]; }
                
            }
            
            newS += c;
            
        }
        if (!Character.toString(s.charAt(s.length() - 1)).equals(c)) {newS = newS.substring(0, s.length() - 1);}
        return newS;
    }

    public static int equal(int[] arr) {
        Arrays.sort(arr);
        int count = 1;
        for (int i = 0; i < 2; i++) {
            if (arr[i] == arr[i+1]) {
                count+=1;
            }
        }
        if (count == 1) { return 0; }
        return count;
    }

    public static boolean isAnagram(String s1, String s2) {
        s1 = s1.replaceAll("[^A-Za-z0-9]","");
        s2 = s2.replaceAll("[^A-Za-z0-9]","");
        String[] parts1 = s1.split("");
        String[] parts2 = s2.split("");
        Arrays.sort(parts1);
        Arrays.sort(parts2);
        return Arrays.toString(parts1).equals(Arrays.toString(parts2));

    }
}


