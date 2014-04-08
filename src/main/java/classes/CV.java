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
    List<Degree> degrees;

    public CV(String nom, String prenom, List<Degree> degrees) {
        this.nom = nom;
        this.prenom = prenom;
        this.degrees = degrees;
    }

    public List<Degree> getDegrees() {
        return degrees;
    }

    public void setDegrees(List<Degree> degrees) {
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
