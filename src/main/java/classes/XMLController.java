package classes;

import classes.manager.*;
import classes.model.*;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Emilie on 01/04/14.
 */
@Controller
@RequestMapping
public class XMLController {

    private final static int MIN_ANNEE = 1900;
    private CVManager manager  = new CVManager();

    @RequestMapping(value="/cv", method = RequestMethod.GET)
    public @ResponseBody
    CVManager getCVManagerInXML() {
       // CVManager manager = new CVManager();
        return manager;
    }

    @RequestMapping(value="/cv/{id}", method = RequestMethod.GET)
    public @ResponseBody
    CV getCVManagerInXML(@PathVariable int id) {
       // CVManager manager = new CVManager();
        return manager.getCv(id);
    }

    @RequestMapping(value = "/cv/put", method = RequestMethod.PUT)
    public @ResponseBody
    String putCvInXML(@RequestBody CV cv) {
        return doValidation(cv);
    }


    private String doValidation(CV cv) {
        String msg = "";
        boolean res = false;

        final Calendar c = Calendar.getInstance();
        int annee = c.get(Calendar.YEAR);
        int mois = c.get(Calendar.MONTH);
        mois++;

        if (cv.getNom() == null || cv.getNom().isEmpty()) {
            res = true;
            msg += "Le champ Nom est obligatoire.\n";
        }
        if (cv.getPrenom() == null || cv.getPrenom().isEmpty()) {
            res = true;
            msg += "Le champ Prénom est obligatoire.\n";
        }

        DegreeManager degrees = cv.getDegrees();
        for (int i = 0; i < degrees.getDegree().size(); i++) {
            Degree d = degrees.getDegree().get(i);
            if (d.getTitle() == null || d.getTitle().isEmpty()) {
                res = true;
                msg += "Le champ Titre du diplôme " + (i + 1) + " est obligatoire.\n";
            }
            if (d.getBeginYear() > d.getEndYear()) {
                res = true;
                msg += "L'année de début du diplôme " + (i + 1) + " doit être antérieure à l'année de fin.\n";
            }
            if (d.getBeginYear() < MIN_ANNEE) {
                res = true;
                msg += "L'année de début du diplôme " + (i + 1) + " doit être postérieure à " + MIN_ANNEE + ".\n";

            }
            if (d.getBeginYear() > annee) {
                res = true;
                msg += "L'année de début du diplôme " + (i + 1) + " doit être antérieure à l'année en cours.\n";
            }
            if (d.getEndYear() < MIN_ANNEE) {
                res = true;
                msg += "L'année de début du diplôme " + (i + 1) + " doit être postérieure à " + MIN_ANNEE + ".\n";

            }
            if (d.getEndYear() > annee) {
                res = true;
                msg += "L'année de fin du diplôme " + (i + 1) + " doit être antérieure à l'année en cours ou vide.\n";
            }
            if (d.getLocation() == null || d.getLocation().isEmpty()) {
                res = true;
                msg += "Le champ Lieu du diplôme " +(i + 1) + " est obligatoire.\n";
            }
            if (d.getSchool() == null || d.getSchool().isEmpty()) {
                res = true;
                msg += "Le champ Ecole du diplôme " + (i + 1) + " est obligatoire.\n";
            }
        }

        Map<String, Integer> months = new HashMap<String, Integer>();
        months.put("En cours",0);
        months.put("Janvier", 1);
        months.put("Février", 2);
        months.put("Mars", 3);
        months.put("Avril", 4);
        months.put("Mai", 5);
        months.put("Juin", 6);
        months.put("Juillet", 7);
        months.put("Août", 8);
        months.put("Septembre", 9);
        months.put("Octobre", 10);
        months.put("Novembre", 11);
        months.put("Décembre", 12);

        ExperienceManager experiences = cv.getExperiences();
        for (int i = 0; i < experiences.getExperience().size(); i++) {
            Experience exp = experiences.getExperience().get(i);
            if (exp.getTitle() == null || exp.getTitle().isEmpty()) {
                res = true;
                msg += "Le champ Titre de l'expérience " + (i + 1) + " est obligatoire.\n";
            }
            if (exp.getBeginYear() > exp.getEndYear()) {
                res = true;
                msg += "L'année de début de l'expérience " + (i + 1) + " doit être antérieure à l'année de fin.\n";
            }
            if (exp.getBeginYear() < MIN_ANNEE) {
                res = true;
                msg += "L'année de début de l'expérience " + (i + 1) + " doit être postérieure à " + MIN_ANNEE + ".\n";

            }
            if (exp.getEndYear() < MIN_ANNEE) {
                res = true;
                msg += "L'année de fin de l'expérience " + (i + 1) + " doit être postérieure à " + MIN_ANNEE + ".\n";

            }
            if (exp.getBeginYear() == exp.getEndYear()) {
                if (months.get(exp.getBeginMonth()) > months.get(exp.getEndMonth()) && months.get(exp.getEndMonth()) != 0) {
                    res = true;
                    msg += "Le mois de début de l'expérience " +(i + 1) + " doit être antérieur au mois de fin.\n";
                }
            }
            if (exp.getBeginYear() == annee) {
                if (months.get(exp.getBeginMonth()) > mois) {
                    res = true;
                    msg += "Le mois de début de l'expérience " +(i + 1) + " doit être antérieur à la date du jour.\n";
                }
            }
            if (exp.getEndYear() == annee) {
                if (months.get(exp.getEndMonth()) > mois) {
                    res = true;
                    msg += "Le mois de fin de l'expérience " +(i + 1) + " doit être antérieur à la date du jour.\n";
                }
            }

            if (exp.getLocation() == null || exp.getLocation().isEmpty()) {
                res = true;
                msg += "Le champ Lieu de l'expérience " + (i + 1) + " est obligatoire.\n";
            }
            if (exp.getCompany() == null || exp.getCompany().isEmpty()) {
                res = true;
                msg += "Le champ Entreprise de l'expérience " + (i + 1) + " est obligatoire.\n";
            }
        }

        LanguageManager languages = cv.getLanguages();
        for (int i = 0; i < languages.getLanguage().size(); i++) {
            Language l = languages.getLanguage().get(i);
            if (l.getName() == null || l.getName().isEmpty()) {
                res = true;
                msg += "Le champ Titre de la langue " + (i + 1) + " est obligatoire.\n";
            }
        }

        SkillManager skills = cv.getSkills();
        for (int i = 0; i < skills.getSkill().size(); i++) {
            Skill skill = skills.getSkill().get(i);
            if (skill.getName() == null || skill.getName().isEmpty()) {
                res = true;
                msg += "Le champ Titre de la compétence " + (i + 1) + " est obligatoire.\n";
            }
        }

        if (res == false ) {
            manager.addCv(cv);
            return "Ajout effectué avec succès !";
        } else {
            return msg;
        }
    }

}
