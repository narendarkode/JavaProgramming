package java_Programming;

public class Employee_Main {
    public static void main(String[] args) {
        Employee e1= new Employee();
        e1.employee_Id= 24;
        e1.employee_Salary =548754.4f;
        e1.employeeName ="sravani";

        e1.calculateBonus();

        Employee e2= new Employee();
        e2.employee_Id= 25;
        e2.employee_Salary =658754.4f;
        e2.employeeName ="naren";

        e2.calculateBonus();


    }
}
