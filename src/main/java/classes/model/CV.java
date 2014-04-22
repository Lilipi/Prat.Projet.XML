package classes.model;

import classes.manager.DegreeManager;
import classes.manager.ExperienceManager;
import classes.manager.LanguageManager;
import classes.manager.SkillManager;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Emilie on 01/04/14.
 */
@XmlRootElement(name="cv")
public class CV {

    String nom;
    String prenom;
    DegreeManager degrees;
    ExperienceManager experiences;
    SkillManager skills;
    LanguageManager languages;

    public CV(String nom, String prenom, ExperienceManager experiences, SkillManager skills, DegreeManager degrees, LanguageManager languages) {
        this.nom = nom;
        this.prenom = prenom;
        this.experiences = experiences;
        this.skills = skills;
        this.degrees = degrees;
        this.languages = languages;
    }

    public SkillManager getSkills() {
        return skills;
    }

    public void setSkills(SkillManager skills) {
        this.skills = skills;
    }

    public LanguageManager getLanguages() {
        return languages;
    }

    public void setLanguages(LanguageManager languages) {
        this.languages = languages;
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
