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

    private List<CV> resumes;

    public List<CV> getResumes() {
        return resumes;
    }

    public void setResumes(List<CV> resumes) {
        this.resumes = resumes;
    }

    public CVManager() {
        DegreeManager degrees = new DegreeManager();
        resumes.add(new CV("Prat", "Emilie", degrees));
    }

    public CVManager(List<CV> cv) {
        this.resumes = cv;
    }

}
