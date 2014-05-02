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

    private List<Language> language;

    public LanguageManager(List<Language> language) {
        this.language = language;
    }

    public LanguageManager() {
        this.language = new ArrayList<Language>();
    }

    public List<Language> getLanguage() {

        return language;
    }

    public void setLanguage(List<Language> language) {
        this.language = language;
    }
}
