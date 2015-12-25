package org.bhi.q3.testmodels;

import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;
import java.util.Date;
import org.bhi.q3.models.Consultation;

/**
 *
 * @author carlo nino mabalatan
 */
public class TestConsultation {

    public static void main(String[] args) {
        List<Consultation> consultations = new ArrayList<>();

        Calendar cal1 = Calendar.getInstance();
        cal1.set(2013, 4, 27, 9, 0, 0);

        Date consult1 = cal1.getTime();

        Calendar cal2 = Calendar.getInstance();
        cal2.set(2013, 4, 27, 9, 30, 0);

        Date consult2 = cal2.getTime();

        Calendar cal3 = Calendar.getInstance();
        cal3.set(2013, 4, 27, 10, 0, 0);

        Date consult3 = cal3.getTime();

        Consultation doe = new Consultation(3400, 45, consult1);
        Consultation doe2 = new Consultation(3500, 45, consult2);
        Consultation doe3 = new Consultation(3600, 47, consult1);
        Consultation doe4 = new Consultation(3800, 45, consult3);

        consultations.add(doe);
        consultations.add(doe2);
        consultations.add(doe3);
        consultations.add(doe4);

        for (Consultation tempconsultation : consultations) {
            System.out.println("Consultation ID: " + tempconsultation.getConsultationid() + "\n"
                    + "Doctor ID: " + tempconsultation.getDoctorid() + "\n" + "Date: " + tempconsultation.getConsultationdate() + "\n" + "---------------");
        }

    }

}
