package classes;

/**
 * Created by Emilie on 08/04/14.
 */
public class Degree {

    //ATTRIBUTS
    private String title;
    private int beginYear;
    private int endYear;
    private Mention mention;
    private String location;
    private String school;
    private String description;

    //CONSTRUCTORS

    public Degree() {
    }

    public Degree(String title, int beginYear, int endYear, Mention mention, String location, String school, String description) {
        this.title = title;
        this.beginYear = beginYear;
        this.endYear = endYear;
        this.mention = mention;
        this.location = location;
        this.school = school;
        this.description = description;
    }

   //GETTERS
    public String getTitle() {
        return title;
    }

    public int getBeginYear() {
        return beginYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public Mention getMention() {
        return mention;
    }

    public String getLocation() {
        return location;
    }

    public String getSchool() {
        return school;
    }

    public String getDescription() {
        return description;
    }


    //SETTERS
    public void setTitle(String title) {
        this.title = title;
    }

    public void setBeginYear(int beginYear) {
        this.beginYear = beginYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public void setMention(Mention mention) {
        this.mention = mention;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
