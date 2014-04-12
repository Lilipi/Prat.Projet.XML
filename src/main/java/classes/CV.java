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
    ExperienceManager experiences;

    public CV(String nom, String prenom, DegreeManager degrees, ExperienceManager experiences) {
        this.nom = nom;
        this.prenom = prenom;
        this.degrees = degrees;
        this.experiences = experiences;
    }

    public DegreeManager getDegrees() {
        return degrees;
    }

    public void setDegrees(DegreeManager degrees) {
        this.degrees = degrees;
    }


    public ExperienceManager getExperiences() {
        return experiences;
    }

    public void setExperiences(ExperienceManager experiences) {
        this.experiences = experiences;
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
