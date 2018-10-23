/**
 *
 */
package lettre;

import correspondance.Correspondance;

/**
 * @author Alex
 *
 */
public class Lettre extends Correspondance {
    private double poids;
    public static final double poids_max = 0.2;
    public static final double forfaitaire = 0.7;
    
    public Lettre(String nomExpediteur, String nomDestinataire, double poids) {
        super(nomExpediteur, nomDestinataire);
        this.poids = poids;
    }
    public double getPoids() {
        return poids;
    }
    public void setPoids(double poids) {
        this.poids = poids;
    }

    public void envoyer(Lettre ltr) {
        if (ltr.getPoids() < poids_max) {
            System.out.println("C'est une lettre");
            double result = ltr.getPoids() * forfaitaire;
            System.out.println("L'expéditeur est "+ltr.getNomExpediteur()+" pour le destinataire "+ ltr.getNomDestinataire());
            System.out.println("Ca coute "+ result + " €");
        }else {
            System.out.println("C'est un colis");
        }
    }







}
