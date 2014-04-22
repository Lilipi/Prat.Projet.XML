package classes.manager;

import classes.model.Experience;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Emilie on 12/04/14.
 */
@XmlRootElement(name="experiences")
public class ExperienceManager {

    private List<Experience> experience;

    public ExperienceManager(List<Experience> experience) {
        this.experience = experience;
    }

    public ExperienceManager() {
        this.experience = new ArrayList<Experience>();
        Experience exp1 = new Experience("Stage développeur", "Juin", 2013, "Juillet", 2013, "Dieppe", "Mairie de Dieppe", "Développement d'un logiciel de gestion de régies de recettes");
        this.experience.add(exp1);
    }

    public List<Experience> getExperience() {
        return experience;
    }

    public void setExperience(List<Experience> experience) {
        this.experience = experience;
    }
}
