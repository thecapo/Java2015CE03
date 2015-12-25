package org.bhi.q1.models;

/**
 *
 * @author carlo nino mabalatan
 */
public class IT extends Employee {

    private boolean microsftcert;

    public IT(int employeeID, String employeename, boolean microsftcert) {
        super(employeeID, employeename);
        this.microsftcert = microsftcert;
    }

    public boolean isMicrosftcert() {
        return microsftcert;
    }

    public void setMicrosftcert(boolean microsftcert) {
        this.microsftcert = microsftcert;
    }

}
