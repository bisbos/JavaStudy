package com.mystudy.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by bbose on 4/12/17.
 */
public class ComparatorEx {

    public static void main(String[] args){
        List<Employee> employees = Arrays.asList(
                new Employee(10,"Hari"),
                new Employee(5,"Anil"),
                new Employee(8,"Sunil"),
                new Employee(12,"Bisin")
        );
        Collections.sort(employees,new EmployeeSortID());
        for (Employee employee:employees){
            System.out.println(employee.getId()+" "+employee.getName());
        }

        Collections.sort(employees,new EmployeeSortName());
        for (Employee employee:employees){
            System.out.println(employee.getId()+" "+employee.getName());
        }

    }
}
