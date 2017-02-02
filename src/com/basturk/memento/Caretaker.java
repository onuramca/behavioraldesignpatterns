package com.basturk.memento;

import java.util.Stack;

/**
 * Created by basturk
 * Date: 02.02.2017.
 */

// caretaker
public class Caretaker {

    private Stack<EmployeeMemento> employeeHistory = new Stack<>();

    public void save(Employee emp) {
        employeeHistory.push(emp.save());
    }

    public void revert(Employee emp) {
        emp.revert(employeeHistory.pop());
    }

}
