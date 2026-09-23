package EmployeeQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmplloyeeWithLowestSalary {
    static void main() {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Aman", "Engineering", 35000),
                new Employee(1, "Groot", "Tester", 37800),
                new Employee(1, "Rocket", "ServiceNow", 75000),
                new Employee(1, "StarLord", "DevOps", 35000),
                new Employee(1, "Nebula", "Finance", 95000)
        );
        Optional<Employee> lowestEarningEmployee = employees.stream()
                .min(Comparator.comparing(Employee::getSalary));
        System.out.println(lowestEarningEmployee.get());
    }
}
