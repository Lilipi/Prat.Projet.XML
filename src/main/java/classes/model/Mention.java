package classes.model;

/**
 * Created by Emilie on 08/04/14.
 */
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
