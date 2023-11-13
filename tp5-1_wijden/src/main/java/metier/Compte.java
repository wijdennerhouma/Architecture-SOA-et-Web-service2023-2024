package metier;
import java.util.Date;

//@WebService


public class Compte {
    private int code = 0;
    private double solde = 0.0;
    private Date date = new Date();

    // Constructeur avec paramètres pour initialiser les attributs
    public Compte(int code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.date = dateCreation;
    }

    // Constructeur par défaut
    public Compte() {

    }

    //les  Getters et Setters pour les attributs
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }


    public Date getDateCreation() {
        return date;
    }

    public void setDateCreation(Date dateCreation) {
        this.date = dateCreation;
    }
}
