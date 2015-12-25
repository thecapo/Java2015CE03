package org.bhi.q1.models;

/**
 *
 * @author carlo nino mabalatan
 */
public class Manager extends Employee {

    private String creditcardnumber;

    public Manager(int employeeID, String employeename, String creditcardnumber) {
        super(employeeID, employeename);
        this.creditcardnumber = creditcardnumber;
    }

    public String getCreditcardnumber() {
        return creditcardnumber;
    }

    public void setCreditcardnumber(String creditcardnumber) {
        this.creditcardnumber = creditcardnumber;
    }

}
