package org.bhi.q2.models;

/**
 *
 * @author carlo nino mabalatan
 */
public class Part {

    private int partid;
    private String partname;
    private String description;
    private float price;

    public Part(int partid, String partname, String description, float price) {
        this.partid = partid;
        this.partname = partname;
        this.description = description;
        this.price = price;
    }

    public Part() {
    }

    public int getPartid() {
        return partid;
    }

    public void setPartid(int partid) {
        this.partid = partid;
    }

    public String getPartname() {
        return partname;
    }

    public void setPartname(String partname) {
        this.partname = partname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
