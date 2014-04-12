package classes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Emilie on 12/04/14.
 */
public class DegreeManager {

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
        Degree d1 = new Degree("Licence Informatique", 2010, 2013, Mention.BIEN, "Rouen", "Université de Rouen", "Licence informatique avec L1 MIEEA");
        Degree d2 = new Degree("BAC S Européenne Espagnol", 2007, 2010, Mention.TB, "Dieppe", "Lycée Jehan Ango", "Spé SVT");
        this.degrees.add(d1);
        this.degrees.add(d2);
    }



}
