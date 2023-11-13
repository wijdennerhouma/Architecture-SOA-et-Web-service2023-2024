package serveur;

import jakarta.xml.ws.Endpoint;
import service.BanqueService;
public class ServeurJWS {
    public static void main(String[] args) {
        // Crée une instance de la classe CalculatriceWS à publier
        BanqueService banqueService = new BanqueService();

        // donner l'URL dans lequel le service web sera publié.
        String url = "http://localhost:8085/";

        // Publier le service web  en utilisant l'API Endpoint.

        Endpoint.publish(url,banqueService);

        // Afficher l'URL du service web publié.
        System.out.println("Server url: " + url);
    }
}
