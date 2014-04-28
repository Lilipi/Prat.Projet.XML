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


    private List<CV> resume;

    public List<CV> getResume() {
        return resume;
    }

    public void addResume(CV cv) {resume.add(cv);}

    public void setResume(List<CV> resume) {
        this.resume = resume;
    }

    public CV getResume(int id) {
        return resume.get(id);
    }

    public CVManager() {
        resume = new ArrayList<CV>();
        DegreeManager degrees = new DegreeManager();
        ExperienceManager experiences = new ExperienceManager();
        SkillManager skills = new SkillManager();
        LanguageManager languages = new LanguageManager();
        resume.add(new CV("Prat", "Emilie", experiences, skills, degrees, languages));
        resume.add(new CV("Jouanigot", "Valentin", experiences, skills, degrees, languages));
    }

    public CVManager(List<CV> cv) {
        this.resume = cv;
    }

}
