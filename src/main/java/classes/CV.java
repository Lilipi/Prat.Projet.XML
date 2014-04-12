package classes;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Emilie on 01/04/14.
 */
@XmlRootElement(name="cv")
public class CV {

    String nom;
    String prenom;
    DegreeManager degrees;

    public CV(String nom, String prenom, DegreeManager degrees) {
        this.nom = nom;
        this.prenom = prenom;
        this.degrees = degrees;
    }

    public DegreeManager getDegrees() {
        return degrees;
    }

    public void setDegrees(DegreeManager degrees) {
        this.degrees = degrees;
    }

    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }


    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public CV() {

    }

}
