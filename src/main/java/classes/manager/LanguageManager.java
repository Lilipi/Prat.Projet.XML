package classes.manager;

import classes.model.Language;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Emilie on 12/04/14.
 */
@XmlRootElement(name="languages")
public class LanguageManager {

    @XmlAttribute(name="language")
    private List<Language> languages;

    public LanguageManager(List<Language> languages) {
        this.languages = languages;
    }

    public LanguageManager() {
        this.languages = new ArrayList<Language>();
        this.languages.add(new Language("Français", 5));
    }

    public List<Language> getLanguages() {

        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }
}
