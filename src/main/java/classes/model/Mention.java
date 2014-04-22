package classes.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * Created by Emilie on 08/04/14.
 */
@XmlEnum(String.class)
public enum Mention {
    @XmlEnumValue("Passable")
    PASSABLE("Passable"),
    @XmlEnumValue("Assez bien")
    AB("Assez bien"),
    @XmlEnumValue("Bien")
    BIEN("Bien"),
    @XmlEnumValue("Très bien")
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
