import java.io.*;
public class EmployeeTest {
    public static void main(String[] args) {
        Employee empOne = new Employee("Don Jon");
        Employee empTwo = new Employee("Sarah James");

        empOne.empAge(31);
        empOne.empDesig("Senior Java Developer");
        empOne.empSalary(2500);
        empOne.printEmployee();

        empTwo.empAge(45);
        empTwo.empDesig("Middle Java Developer");
        empTwo.empSalary(1500);
        empTwo.printEmployee();

        if(empOne.isOlderThan(empTwo)){
            System.out.println("OLDER");
        }
        else {
            System.out.println("YOUNGER");
        }
    }

}


