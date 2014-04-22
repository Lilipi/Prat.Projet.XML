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

    @XmlAttribute(name="resume")
    private List<CV> resumes;

    public List<CV> getResumes() {
        return resumes;
    }

    public void setResumes(List<CV> resumes) {
        this.resumes = resumes;
    }

    public CVManager() {
        resumes = new ArrayList<CV>();
        DegreeManager degrees = new DegreeManager();
        ExperienceManager experiences = new ExperienceManager();
        SkillManager skills = new SkillManager();
        LanguageManager languages = new LanguageManager();
        resumes.add(new CV("Prat", "Emilie", experiences, skills, degrees, languages));
    }

    public CVManager(List<CV> cv) {
        this.resumes = cv;
    }

}
