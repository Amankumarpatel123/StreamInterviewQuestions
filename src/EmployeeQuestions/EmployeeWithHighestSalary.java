package EmployeeQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmployeeWithHighestSalary {
    static void main() {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Aman", "Engineering", 350000),
                new Employee(1, "Groot", "Tester", 350000),
                new Employee(1, "Rocket", "ServiceNow", 750000),
                new Employee(1, "StarLord", "DevOps", 350000),
                new Employee(1, "Nebula", "Finance", 950000)
        );

        Optional<Employee> HighestPaidEmployee = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(HighestPaidEmployee.get());
    }
}
