package classes;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Emilie on 01/04/14.
 */
@XmlRootElement
public class CVManager {

    public List<CV> getResumes() {
        return resumes;
    }

    public void setResumes(List<CV> resumes) {
        this.resumes = resumes;
    }

    private List<CV> resumes;

    public CVManager() {
        this.resumes = new ArrayList<CV>();
        resumes.add(new CV("Prat", "Emilie"));
        resumes.add(new CV("Jouanigot", "Valentin"));
    }

    public CVManager(List<CV> cv) {
        this.resumes = cv;
    }

}
