package service;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte;

import java.util.ArrayList;
import java.util.Date;

// Service web JAX-WS représentant des opérations bancaires
@WebService
public class BanqueService {

    // Liste des comptes enregistrés
    public ArrayList<Compte> comptes = new ArrayList<>();

    // Constructeur par défaut
    public BanqueService() {
    }

    // Méthode pour la récupération de la liste des comptes
    @WebMethod
    public ArrayList<Compte> getComptes() {
        comptes.add(new Compte(1, 0.0, new Date()));
        comptes.add(new Compte(2, 0.0, new Date()));
        comptes.add(new Compte(3, 0.0, new Date()));
        return comptes;
    }

    // Méthode pour la conversion du montant
    @WebMethod
    public double conversion(@WebParam double montant) {
        return montant * 3.3;
    }
}
