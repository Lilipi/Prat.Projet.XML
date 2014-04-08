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
        Degree d2 = new Degree("BAC S Européenne Espagnol", 2007, 2010, Mention.TB, "Dieppe", "Lycée Jehan Ango", "Spé SVT");
        List<Degree> degrees = new LinkedList<Degree>();
        degrees.add(d1);
        degrees.add(d2);
        resumes.add(new CV("Prat", "Emilie", degrees));

    }

    public CVManager(List<CV> cv) {
        this.resumes = cv;
    }

}
