package EmployeeQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSalaryofEmployee {
    static void main() {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Aman", "Engineering", 35000),
                new Employee(2, "Groot", "Tester", 33000),
                new Employee(3, "Rocket", "ServiceNow", 75000),
                new Employee(4, "StarLord", "DevOps", 35000),
                new Employee(5, "Nebula", "Finance", 95000),
                new Employee(6,"Bishal","DevOps",51000)
        );
        double averageSalary = employees.stream()
//                .collect(Collectors.averagingDouble(Employee::getSalary)); 1st method
                .mapToDouble(Employee::getSalary)
                        .average()
                                .orElseThrow();
        System.out.println(averageSalary);
    }
}
