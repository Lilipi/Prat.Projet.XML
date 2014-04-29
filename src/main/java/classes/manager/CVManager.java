package classes.manager;

import classes.model.CV;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Emilie on 01/04/14.
 */
@XmlRootElement(name="CVs")
public class CVManager {


    private List<CV> cv;//resume;

    public List<CV> getCv() {
        return cv;
    }

    public void addCv(CV cv) {this.cv.add(cv);}

    public void setCv(List<CV> cv) {
        this.cv = cv;
    }

    public CV getCv(int id) {
        return cv.get(id);
    }

    public CVManager() {
        cv = new ArrayList<CV>();
        DegreeManager degrees = new DegreeManager();
        ExperienceManager experiences = new ExperienceManager();
        SkillManager skills = new SkillManager();
        LanguageManager languages = new LanguageManager();
        cv.add(new CV("Prat", "Emilie", experiences, skills, degrees, languages));
        cv.add(new CV("Jouanigot", "Valentin", experiences, skills, degrees, languages));
    }

    public CVManager(List<CV> cv) {
        this.cv = cv;
    }

}
