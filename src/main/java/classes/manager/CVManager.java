package classes.manager;

import classes.model.*;

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

        List<Degree> tmp = new ArrayList<Degree>();
        Degree d1 = new Degree("Licence Informatique", 2010, 2013, Mention.BIEN, "Rouen", "Université de Rouen", "Licence informatique avec L1 MIEEA");
        Degree d2 = new Degree("BAC S Européenne Espagnol", 2007, 2010, Mention.TB, "Dieppe", "Lycée Jehan Ango", "Spé SVT");
        tmp.add(d1);
        tmp.add(d2);
        DegreeManager degrees = new DegreeManager(tmp);

        List<Experience> exp = new ArrayList<Experience>();
        Experience e = new Experience("Stage développeur Webdev", "Juin", 2013, "Juillet", 2013, "Dieppe", "Mairie", "");
        exp.add(e);
        ExperienceManager experiences = new ExperienceManager(exp);


        List<Skill> skill = new ArrayList<Skill>();
        Skill s = new Skill("SQL", 4);
        SkillManager skills = new SkillManager(skill);

        List<Language> l = new ArrayList<Language>();
        Language langue = new Language("Français", 5);
        LanguageManager languages = new LanguageManager(l);

        cv.add(new CV("Prat", "Emilie", experiences, skills, degrees, languages));
    }

    public CVManager(List<CV> cv) {
        this.cv = cv;
    }

}
