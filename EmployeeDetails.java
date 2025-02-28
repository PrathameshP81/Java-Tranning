package firstproject;

class EmployeeBio {
    String empno, name, address;

    EmployeeBio(String no, String nam, String add) {
        this.empno = no;
        this.name = nam;
        this.address = add;
    }
}

class EmployeeDeptInfo extends EmployeeBio {
    String dept, designation, location;

    EmployeeDeptInfo(String no, String nam, String add, String dept, String des, String loc) {
        super(no, nam, add);
        this.dept = dept;
        this.designation = des;
        this.location = loc;
    }
}

class EmployeeSalaryInfo extends EmployeeDeptInfo {
    int salary, hra, da;

    public EmployeeSalaryInfo(String no, String nam, String add, String dept, String des, String loc, int salary, int hra, int da) {
        super(no, nam, add, dept, des, loc);
        this.salary = salary;
        this.hra = hra;
        this.da = da;
    }

    @Override
    public String toString() {
        return "EmployeeSalaryInfo [empno=" + empno + ", name=" + name + ", dept=" + dept + ", designation=" 
                + designation + ", location=" + location + ", address=" + address + ", salary=" + salary + "]";
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        String no = "123";
        String nam = "John Doe";
        String add = "123 Main Street";
        String dept = "Engineering";
        String des = "Software Developer";
        String loc = "Mumbai";
        int salary = 50000;
        int hra = 10000;
        int da = 5000;

        EmployeeSalaryInfo e = new EmployeeSalaryInfo(no, nam, add, dept, des, loc, salary, hra, da);
        System.out.println(e);
    }
}
