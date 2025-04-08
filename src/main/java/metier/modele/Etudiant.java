package metier.modele;

import java.io.IOException;
import java.util.List;
import javax.persistence.Entity;

@Entity
public class Entudiant extends Intervenant {

    private String univ;
    private String spe;


    public Entudiant() {}

    public Entudiant(Long nbSolicitation, String tel, String nom, String prenom, String mail, String motDePasse, List<Long> niveauCompetance, String typeIntervenant, String univ, String spe) throws IOException {
        super(nom, prenom, mail, motDePasse, nbSolicitation, tel, niveauCompetance, typeIntervenant);
        this.univ = univ;
        this.spe = spe;
    }


    public String getUniv() {
        return univ;
    }

    public void setUniv(String univ) {
        this.univ = univ;
    }

    public String getSpe() {
        return spe;
    }

    public void setSpe(String spe) {
        this.spe = spe;
    }


    @Override
    public String toString() {
        return "Entudiant{" +
                "univ='" + univ + '\'' +
                ", spe='" + spe + '\'' +
                ", nbSolicitation=" + getNbSolicitation() +
                ", tel='" + getTel() + '\'' +
                ", niveauCompetance=" + getNiveauCompetance() +
                ", nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' +
                ", mail='" + getMail() + '\'' +
    }}