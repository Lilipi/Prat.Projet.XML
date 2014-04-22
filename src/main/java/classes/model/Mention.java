package classes.model;

import javax.xml.bind.annotation.XmlEnum;

/**
 * Created by Emilie on 08/04/14.
 */
@XmlEnum(String.class)
public enum Mention {
    PASSABLE("Passable"),
    AB("Assez bien"),
    BIEN("Bien"),
    TB("Très bien");


    private String name = "";

    //Constructeur
    Mention(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
