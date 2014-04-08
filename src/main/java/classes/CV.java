package classes;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Emilie on 01/04/14.
 */
@XmlRootElement(name="cv")
public class CV {

    String nom;
    String prenom;
    Degree degree;

    public CV(String nom, String prenom, Degree degree) {
        this.nom = nom;
        this.prenom = prenom;
        this.degree = degree;
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
