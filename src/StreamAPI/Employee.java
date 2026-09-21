package StreamAPI;
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
    List<Employee> employees = Arrays.asList(
            new Employee(1, "Anil", "IT", 55000),
            new Employee(2, "Bob", "HR", 42000),
            new Employee(3, "Amit", "IT", 72000),
            new Employee(4, "Rakesh", "Finance", 65000),
            new Employee(5, "Ankit", "HR", 39000),
            new Employee(6, "Sam", "Finance", 81000)
    );

}

