/**
 *
 */
package correspondance;

/**
 * @author Alex
 *
 */
public class Correspondance {

    public String nomExpediteur;
    public String nomDestinataire;

    public Correspondance(String nomExpediteur, String nomDestinataire) {
        super();
        this.nomExpediteur = nomExpediteur;
        this.nomDestinataire = nomDestinataire;
    }

    public String getNomExpediteur() {
        return nomExpediteur;
    }

    public void setNomExpediteur(String nomExpediteur) {
        this.nomExpediteur = nomExpediteur;
    }

    public String getNomDestinataire() {
        return nomDestinataire;
    }

    public void setNomDestinataire(String nomDestinataire) {
        this.nomDestinataire = nomDestinataire;
    }

}
