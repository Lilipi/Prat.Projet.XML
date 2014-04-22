package classes.manager;

import classes.model.Experience;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Emilie on 12/04/14.
 */
@XmlRootElement
public class ExperienceManager {

    private List<Experience> experiences;

    public ExperienceManager(List<Experience> experiences) {
        this.experiences = experiences;
    }

    public ExperienceManager() {
        this.experiences = new ArrayList<Experience>();
        Experience exp1 = new Experience("Stage développeur", "Juin", 2013, "Juillet", 2013, "Dieppe", "Mairie de Dieppe", "Développement d'un logiciel de gestion de régies de recettes");
        this.experiences.add(exp1);
    }

    public List<Experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(List<Experience> experiences) {
        this.experiences = experiences;
    }
}
