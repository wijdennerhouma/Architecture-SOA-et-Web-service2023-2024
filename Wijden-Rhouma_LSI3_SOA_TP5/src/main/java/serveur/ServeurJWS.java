package serveur;
import jakarta.xml.ws.Endpoint;
import service.BanqueService;
import static jakarta.xml.ws.Endpoint.publish;
public class ServeurJWS {
    public static void main(String[] args) {
        // Crée une instance de la classe CalculatriceWS, qui est le service web que vous souhaitez publier.
        BanqueService banqueService = new BanqueService();
        // Définit l'URL à laquelle le service web sera publié.
        String url = "http://localhost:8085/";
        // Publie le service web à l'URL spécifiée en utilisant l'API Endpoint.
        // Cela permet au service web d'être accessible via des requêtes HTTP à cette URL.
        publish(url,banqueService);
        // Affiche l'URL du service web publié.
        System.out.println("Server url: " + url);
    }
}
