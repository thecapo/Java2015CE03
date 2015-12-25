package org.bhi.q1.models;

/**
 *
 * @author carlo nino mabalatan
 */
public class Administration extends Employee {

    private int admincertificatenumber;

    public Administration(int employeeID, String employeename, int admincertificatenumber) {
        super(employeeID, employeename);
        this.admincertificatenumber = admincertificatenumber;
    }

    public int getAdmincertificatenumber() {
        return admincertificatenumber;
    }

    public void setAdmincertificatenumber(int admincertificatenumber) {
        this.admincertificatenumber = admincertificatenumber;
    }

}
