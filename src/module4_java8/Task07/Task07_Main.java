package module4_java8.Task07;

class Employee {
    private String name;
    private String account;
    private double salary;

    public Employee(String name, String account, double salary) {
        this.name = name;
        this.account = account;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "[name=" + this.name + ", account=" + this.account + ", salary=" + this.salary +"]";
    }
}

interface EmployeeInter {
    Employee create(String name, String account, double salary);
}

public class Task07_Main {
    public static void main(String[] args) {
        EmployeeInter constRef = Employee::new;

        Employee emp1 = constRef.create("Rohit", "Acc1", 50000.0);
        Employee emp2 = constRef.create("Virat", "Acc2", 60000.0);

        System.out.println(emp1);
        System.out.println(emp2);
    }
}
