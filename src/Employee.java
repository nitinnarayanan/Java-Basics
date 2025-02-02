/*Create a class Employee with members empNo, name, department, and salary.
In main, create a reference variable of type Employee,
allocate memory for the Employee object using the new operator,
and initialize the data members using command line arguments. Display the data members.*/

public class Employee {

    private int empNo;
    private String name;
    private String department;
    private double salary;

    public Employee(int empNo, String name, String department, double salary) {
        this.empNo = empNo;
        this.name = name;
        this.department = department;
        this.salary = salary;

    }

    public void display() {
        System.out.println("Employee number: " + empNo);
        System.out.println("Employee name: " + name);
        System.out.println("Employee Department: " + department);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee o = new Employee(11605859, "Nitin", "Cloud Ops", 78900.87);
        o.display();

    }
}
