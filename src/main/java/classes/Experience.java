package classes;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Emilie on 08/04/14.
 */
@XmlRootElement(name="experience")
public class Experience {

    //ATTRIBUTS
    private String title;
    private String beginMonth;
    private int beginYear;
    private String endMonth;
    private int endYear;
    private String location;
    private String company;
    private String description;

    //CONSTRUCTOR
    public Experience() {
    }

    public Experience(String title, String beginMonth, int beginYear, String endMonth, int endYear, String location, String company, String description) {
        this.title = title;
        this.beginMonth = beginMonth;
        this.beginYear = beginYear;
        this.endMonth = endMonth;
        this.endYear = endYear;
        this.location = location;
        this.company = company;
        this.description = description;
    }

    //GETTERS
    public String getTitle() {

        return title;
    }

    public String getBeginMonth() {
        return beginMonth;
    }

    public int getBeginYear() {
        return beginYear;
    }

    public String getEndMonth() {
        return endMonth;
    }

    public int getEndYear() {
        return endYear;
    }

    public String getLocation() {
        return location;
    }

    public String getCompany() {
        return company;
    }

    public String getDescription() {
        return description;
    }

    //SETTERS
    public void setTitle(String title) {
        this.title = title;
    }

    public void setBeginMonth(String beginMonth) {
        this.beginMonth = beginMonth;
    }

    public void setBeginYear(int beginYear) {
        this.beginYear = beginYear;
    }

    public void setEndMonth(String endMonth) {
        this.endMonth = endMonth;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
