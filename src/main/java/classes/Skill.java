package classes;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Emilie on 12/04/14.
 */
@XmlRootElement(name="skill")
public class Skill {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill(String name) {
        this.name = name;
    }

    public Skill() {

    }
}
