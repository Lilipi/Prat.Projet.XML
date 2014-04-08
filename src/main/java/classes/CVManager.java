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
        Degree d1 = new Degree("Licence Informatique", 2010, 2013, Mention.BIEN, "Rouen", "Université de Rouen", "Licence informatique avec L1 MIEEA");
        resumes.add(new CV("Prat", "Emilie", d1));
        resumes.add(new CV("Jouanigot", "Valentin", new Degree()));
    }

    public CVManager(List<CV> cv) {
        this.resumes = cv;
    }

}
