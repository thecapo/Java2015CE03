package org.bhi.q1.testmodels;

import org.bhi.q1.models.Administration;
import org.bhi.q1.models.IT;
import org.bhi.q1.models.Manager;

/**
 *
 * @author carlo nino mabalatan
 */
public class TestEmployee {

    public static void main(String[] args) {
        Manager john = new Manager(567, "Harry Wang", "1234-1234-1234-1234");
        Administration doe = new Administration(899, "Cindy Blooms", 454545);
        Administration doe2 = new Administration(900, "Toni Tibbets", 878787);
        IT jane = new IT(333, "Wayne Dooms", true);
        IT jane2 = new IT(334, "Tune Tone", false);
        IT jane3 = new IT(335, "Sally Smalls", true);

        System.out.println("Manager");
        System.out.println("--------------------------");
        System.out.println("");
        System.out.println("Employee ID: " + john.getEmployeeID());
        System.out.println("Employee Name: " + john.getEmployeename());
        System.out.println("Credit Card Number: " + john.getCreditcardnumber());
        System.out.println("");
        System.out.println("");
        System.out.println("Administration");
        System.out.println("--------------------------");
        System.out.println("");
        System.out.println("Employee ID: " + doe.getEmployeeID());
        System.out.println("Employee Name: " + doe.getEmployeename());
        System.out.println("Admin Certificate Number: " + doe.getAdmincertificatenumber());
        System.out.println("");
        System.out.println("Employee ID: " + doe2.getEmployeeID());
        System.out.println("Employee Name: " + doe2.getEmployeename());
        System.out.println("Admin Certificate Number: " + doe2.getAdmincertificatenumber());
        System.out.println("");
        System.out.println("");
        System.out.println("IT");
        System.out.println("--------------------------");
        System.out.println("");
        System.out.println("Employee ID: " + jane.getEmployeeID());
        System.out.println("Employee Name: " + jane.getEmployeename());
        System.out.println("Microsoft Certification: " + jane.isMicrosftcert());
        System.out.println("");
        System.out.println("Employee ID: " + jane2.getEmployeeID());
        System.out.println("Employee Name: " + jane2.getEmployeename());
        System.out.println("Microsoft Certification: " + jane2.isMicrosftcert());
        System.out.println("");
        System.out.println("Employee ID: " + jane3.getEmployeeID());
        System.out.println("Employee Name: " + jane3.getEmployeename());
        System.out.println("Microsoft Certification: " + jane3.isMicrosftcert());
        System.out.println("");
        System.out.println("");

    }

}
