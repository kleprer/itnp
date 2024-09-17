package labs.lab_2;

public class Company {
    public static void main(String[] args) {
        Programmer sam = new Programmer("Sam", 15, 15000, "Frontend");
        System.out.println(sam.getActualSalary());
        System.out.println(sam.getId());
        Administrator robert = new Administrator("Robert");
        System.out.println(robert.getId());
        robert.setSalary(15000);
        System.out.println(robert.getActualSalary());
        
    }
}

abstract class Employee {
    private String name;
    private int id; // fields
    private int experience;
    private int salary;
    static int counter = 1;

    // getter
    public String getName() { return name; }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() { return experience; }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSalary() { return salary; }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // default constructor
    Employee () {
        this.name = "Undefined";
        this.experience = 0;
        this.salary = 0;
        id = counter++;

    }

    Employee (String name) {
        this.name = name;
        this.experience = 0;
        this.salary = 0;
        id = counter++;

    }

    Employee (String name, int salary) {
        this.name = name;
        this.experience = 0;
        this.salary = salary;
        id = counter++;

    }
    // constructor
    Employee (String name, int experience, int salary) {
        setName(name);
        this.experience = experience;
        this.salary = salary;
        id = counter++;
    }

    public int getId() {
        return id;
    }

    public float getActualSalary() {
        return (float)this.salary*0.87f;
    }

    public void displayInfo() {
        System.out.println(this.name);
        System.out.println(this.experience);
        System.out.println(this.salary);
        System.out.println(this.id);
    }

}

    

    


class Programmer extends Employee{
    private String field;
    private boolean promotion = false;
    // default constructor
    Programmer () {
        super("Undefined", 0, 0);
        setField("undefined");
    }
    // constructor
    Programmer(String name, int experience, int salary, String field) {
        super(name, experience, salary);
        setField(field);
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void givePromotion() {
        System.out.println("Promotion granted!");
        this.promotion = true;

    }

    public boolean getPromotionInfo() {
        return this.promotion;
    }
}

class Manager extends Employee {
    private String department;
    // default constructor
    Manager () {
        super("Undefined", 0, 0);
        setDepartment("undefined");
    }
    Manager (String name) {
        super(name, 0, 0);
        setDepartment("undefined");
    }
    Manager (String name, String department) {
        super(name, 0, 0);
        setDepartment(department);
    }
    // constructor
    Manager(String name, int experience, int salary, String department) {
        super(name, experience, salary);
        setDepartment(department);
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}

class Administrator extends Manager {
    private String office;
    // default constructor
    Administrator () {
        super("Undefined", 0, 0, "undefined");
        setOffice("undefined");
    }
    Administrator (String name) {
        super(name, 0, 0, "undefined");
        setOffice("undefined");
    }
    Administrator (String name, String office) {
        super(name, 0, 0, "undefined");
        setOffice(office);
    }
    // constructor
    Administrator(String name, int experience, int salary, String department, String office) {
        super(name, experience, salary, department);
        setOffice(office);
    }
    public String getOffice() {
        return office;
    }
    public void setOffice(String office) {
        this.office = office;
    }
    @Override
    public float getActualSalary() {
        return (float) this.getSalary() * 0.8f;
    }
}

