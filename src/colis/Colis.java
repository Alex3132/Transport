/**
 *
 */
package colis;

import correspondance.Correspondance;
import lettre.Lettre;

/**
 * @author Alex
 *
 */
public class Colis extends Correspondance {
    private double poids;
    public static final double poids_max = 5;
    public static final int forfaitaire = 15;

    public Colis(String nomExpediteur, String nomDestinataire, double poids) {
        super(nomExpediteur, nomDestinataire);
        this.poids = poids;
    }
    public double getPoids() {
        return poids;
    }
    public void setPoids(double poids) {
        this.poids = poids;
    }

    public void receptionner(Lettre ltr) {

    }

}