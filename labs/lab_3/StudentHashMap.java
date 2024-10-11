package labs.lab_3;
import java.util.*;
public class StudentHashMap {
    public static  void main(String[] args) {

        Map<Integer, Student> students = new HashMap<Integer, Student>();
        Student petya = new Student("Петя Петров", 19, 4.3f);

        students.put(125234, petya);
        String first = students.get(125234).getName();
        System.out.println(first);
        students.remove(125234);
        System.out.println(students.get(125234));
    }

}

class Student {
    private String name;
    private int age;
    private float averagePoint;

    Student(String name, int age, float averagePoint) {
        this.name = name;
        this.age = age;
        this.averagePoint = averagePoint;
    }
    
    public String getName() {
        return this.name;
    }

    public float getAveragePoint() {
        return this.averagePoint;
    }

    public int getAge() {
        return this.age;
    }

}


