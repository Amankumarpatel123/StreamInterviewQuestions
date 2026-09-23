package EmployeeQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class  EmployeeWithSalaryGreaterThanGiven {
        public static void main() {
            List<Employee> employees = Arrays.asList(
                    new Employee(1,"Aman","Engineering",350000),
                    new Employee(1,"Groot","Tester",350000),
                    new Employee(1,"Rocket","ServiceNow",750000),
                    new Employee(1,"StarLord","DevOps",350000),
                    new Employee(1,"Nebula","Finance",950000)
            );

            List<Employee> empWithSalary = employees.stream()
                    .filter(emp-> emp.getSalary() > 50000)
                    .collect(Collectors.toList());
        System.out.println(empWithSalary);
    }
}
