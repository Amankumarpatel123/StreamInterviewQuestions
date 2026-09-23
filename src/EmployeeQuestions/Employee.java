package EmployeeQuestions;
import java.util.Arrays;
import java.util.List;

public class Employee {
    public int id;
    public String name;
    public String department;
    public double salary;


    Employee( int id, String name, String department, double salary){
        this.id= id;
        this.name= name;
        this.department= department;
        this.salary= salary;
    }
    int getId(){
        return id;
    }
    String getName(){
        return  name;
    }
    String getDepartment(){
        return department;
    }
    double getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

