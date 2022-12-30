package com.aina;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeManagement {


    public static void main(String[] args) {
       List<Employee> employees = loadEmployee();
                employees.stream().
               sorted(Comparator.comparing(Employee::getName))
               .map(Employee::getName)
               .forEach(System.out::println);
    }



    private static List<Employee> loadEmployee() {
        return Arrays.asList(new Employee("Emp100","John","New York",2000),
                new Employee("Emp101","Ally","New Jersey",2000),
                new Employee("Emp102","Sam","California",2000),
                new Employee("Emp103","Elena","Los Angeles",2000),
                new Employee("Emp104","Micheal","Las Vegas",2000),
                new Employee("Emp105","Aina","New York40",2000),
                new Employee("Emp106","Jack","New York",2000),
                new Employee("Emp107","Albert","New York",2000),
                new Employee("Emp108","Leo","New York",2000),
                new Employee("Emp109","Robert","New York",2000));
    }
}
