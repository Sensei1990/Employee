import java.io.*;
public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    public Employee (String name){
        this.name = name;
    }
    public void empAge( int empAge){
        age = empAge;
    }
    public void empDesig(String empDesig){
        designation = empDesig;
    }
    public void empSalary(double empSalary){
        salary = empSalary;
    }
    public void printEmployee(){
        System.out.println("Name : " + name);
        System.out.println("Age is : " + age);
        System.out.println("Designation : " + designation);
        System.out.println("Salary is : " + salary);
    }
    public boolean isOlderThan(Employee myEmployee){
        if(this.age > myEmployee.age){
        return true;
        }
        return false;
    }
}

