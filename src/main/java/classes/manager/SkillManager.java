package classes.manager;

import classes.model.Skill;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Emilie on 12/04/14.
 */
@XmlRootElement
public class SkillManager {

    private List<Skill> skills;

    public SkillManager(List<Skill> skills) {
        this.skills = skills;
    }

    public SkillManager() {
        this.skills = new ArrayList<Skill>();
        this.skills.add(new Skill("PHP"));
    }

    public List<Skill> getSkills() {

        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
