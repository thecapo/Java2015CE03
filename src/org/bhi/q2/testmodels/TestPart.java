package org.bhi.q2.testmodels;

import org.bhi.q2.models.Part;

/**
 *
 * @author carlo nino mabalatan
 */
public class TestPart {

    public static void main(String[] args) {
        Part[] parts = new Part[10];

        parts[0] = new Part(456, "Nut", "1cm Nut", 0.25f);
        parts[1] = new Part(457, "Bolt", "3cm Bolt", 0.50f);
        parts[2] = new Part(489, "Screw", "2cm Screw", 0.35f);
        parts[3] = new Part(499, "Hex Nut", "1cm Hex Nut", 0.10f);
        parts[4] = new Part(509, "Dynabolt", "3cm Dynabolt", 1.40f);

        for (int i = 0; i < parts.length && parts[i] != null; i++) {
            if (parts[i].getPrice() > 0.30f) {
                System.out.println("Parts greater than $0.30 are: " + parts[i].getPrice());
            }
        }
    }

}
