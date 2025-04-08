package metier.modele;

import java.io.IOException;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
public class Autre extends Intervenant {

    private String activite ;

    
    public Enseignent() {}

    
    public Enseignent(Long nbSolicitation, String tel, String nom, String prenom, String mail, String motDePasse, List<Long> niveauCompetance, String activite , String Type) throws IOException {
        super(nom, prenom, mail, motDePasse,nbSolicitation,tel,Type, niveauCompetance);
        this.activite = activite ;}

    public String getActivite() {
        return activite;
    }

    public void setActivite(String activite) {
        this.activite = activite;
    }

    // Méthode toString()
    @Override
    public String toString() {
        return "Enseignent{" +
                "activite='" + activite + '\'' +
                ", nbSolicitation=" + getNbSolicitation() +
                ", tel='" + getTel() + '\'' +
                ", type=" + getType() +
                ", niveauCompetance=" + getNiveauCompetance() +
                ", nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' +
                ", mail='" + getMail() + '\'' +
                '}';
    }

    
}

