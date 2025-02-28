package firstproject;
import java.util.*;

public class Employee {
    int empid;
    String name;
    double salary;

    void read() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Employee Information");
        empid = in.nextInt();
        name = in.nextLine();
        salary = in.nextDouble();
    }

    void show() {
        System.out.println(empid);
        System.out.println(name);
        System.out.println(salary);
    }

    public static void main(String [] a) {
        Employee e = new Employee();
        e.read(); 
        e.show();
    }
}
