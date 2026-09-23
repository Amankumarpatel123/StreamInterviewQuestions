package EmployeeQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class HighestPaidEmployeeInEachDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Aman", "Engineering", 35000),
                new Employee(2, "Groot", "Tester", 33000),
                new Employee(3, "Rocket", "ServiceNow", 75000),
                new Employee(4, "StarLord", "DevOps", 35000),
                new Employee(5, "Nebula", "Finance", 95000),
                new Employee(6,"Bishal","DevOps",89500),
                new Employee(7, "Aditi", "Engineering", 31000),
                new Employee(8, "tanmay", "Tester", 39700),
                new Employee(9, "Samay", "ServiceNow", 87000),
                new Employee(10, "teaserface", "DevOps", 35000),
                new Employee(11, "Gamora", "Finance", 25000),
                new Employee(12,"Yondu","DevOps",81000)
        );
        Map<String, Optional<Employee>> highestPaidPerDept= employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(
                        Comparator.comparingDouble(Employee::getSalary))));
        System.out.println(highestPaidPerDept);
    }
}
