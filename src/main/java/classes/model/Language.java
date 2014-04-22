package classes.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Emilie on 12/04/14.
 */
@XmlRootElement(name="language")
public class Language {

    private String name;
    private int level;

    public Language(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public Language() {

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
