package classes.manager;

import classes.model.Skill;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Emilie on 12/04/14.
 */
@XmlRootElement(name="skills")
public class SkillManager {

    public List<Skill> getSkill() {
        return skill;
    }

    public void setSkill(List<Skill> skill) {
        this.skill = skill;
    }

    private List<Skill> skill;

    public SkillManager(List<Skill> skill) {
        this.skill = skill;
    }

    public SkillManager() {
    }


}
