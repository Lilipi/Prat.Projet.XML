package classes.manager;

import classes.model.Degree;
import classes.model.Mention;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Emilie on 12/04/14.
 */
@XmlRootElement(name="degrees")
public class DegreeManager {

    @XmlAttribute(name="degree")
    private List<Degree> degrees;

    public List<Degree> getDegrees() {
        return degrees;
    }

    public void setDegrees(List<Degree> degrees) {
        this.degrees = degrees;
    }

    public DegreeManager(List<Degree> degrees) {
        this.degrees = degrees;
    }

    public DegreeManager() {
        this.degrees = new ArrayList<Degree>();
        List<Degree> tmp = new ArrayList<Degree>();
        Degree d1 = new Degree("Licence Informatique", 2010, 2013, Mention.BIEN, "Rouen", "Université de Rouen", "Licence informatique avec L1 MIEEA");
        Degree d2 = new Degree("BAC S Européenne Espagnol", 2007, 2010, Mention.TB, "Dieppe", "Lycée Jehan Ango", "Spé SVT");
        tmp.add(d1);
        tmp.add(d2);
        this.setDegrees(tmp);
    }



}
