package org.bhi.q1.models;

/**
 *
 * @author carlo nino mabalatan
 */
public abstract class Employee {

    private int employeeID;
    private String employeename;

    public Employee(int employeeID, String employeename) {
        this.employeeID = employeeID;
        this.employeename = employeename;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

}
