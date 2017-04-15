package com.mystudy.sorting;

import java.util.Comparator;

/**
 * Created by bbose on 4/12/17.
 */
public class EmployeeSortID implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        return e1.getId() - e2.getId();
    }
}
