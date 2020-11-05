package oop.abstractclasses;

import java.util.Date;

// 1. abstract class cannot be instantiated.
// 2. abstract class can have abstract methods.
// 3. subclasses must implement abstract methods.
public abstract class Employee {
    private String employeeId;
    private long salary;
    private Date startDate;

    // cmd(ctrl) + n: code generation
    public Employee(String employeeId, long salary, Date startDate) {
        this.employeeId = employeeId;
        this.salary = salary;
        this.startDate = startDate;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public long getSalary() {
        return salary;
    }

    public final Date getStartDate() {
        return startDate;
    }

    public abstract void work();

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            // compare memory address
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            // is it null? are they different types?
            return false;
        }
        Employee that = (Employee) o; // downcast
        // do they have the same employeeId?
        return employeeId.equals(that.employeeId);
    }

    @Override
    public String toString() {
        // returns the string representation of Employee
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", salary=" + salary +
                ", startDate=" + startDate +
                '}';
    }
}