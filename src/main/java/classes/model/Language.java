package classes.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Emilie on 12/04/14.
 */
@XmlRootElement(name="language")
@XmlType(propOrder = {"name", "level" })
public class Language {

    private String name;
    private int level;
    public final static int MAX_LEVEL = 20;

    public Language(String name, int level) {
        this.name = name;
        setLevel(level);
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
        if (level < 0) {
            level = 0;
        } else if (level > MAX_LEVEL) {
            level = MAX_LEVEL;
        } else {
            this.level = level;
        }
    }
}
