package org.bhi.q3.models;

import java.util.Date;

/**
 *
 * @author carlo nino mabalatan
 */
public class Consultation {

    private int consultationid;
    private int doctorid;
    private Date consultationdate;

    public Consultation() {
    }

    public Consultation(int consultationid, int doctorid, Date consultationdate) {
        this.consultationid = consultationid;
        this.doctorid = doctorid;
        this.consultationdate = consultationdate;
    }

    public int getConsultationid() {
        return consultationid;
    }

    public void setConsultationid(int consultationid) {
        this.consultationid = consultationid;
    }

    public int getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(int doctorid) {
        this.doctorid = doctorid;
    }

    public Date getConsultationdate() {
        return consultationdate;
    }

    public void setConsultationdate(Date consultationdate) {
        this.consultationdate = consultationdate;
    }

}
