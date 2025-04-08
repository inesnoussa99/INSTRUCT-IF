package metier.modele;

import java.io.IOException;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Intervenant extends Personne {

    private Long nbSolicitation;
    private String tel;
    private List<Long> niveauCompetance;
    private String Type ; 

    
    public Intervenant() {}

    
    public Intervenant( String nom, String prenom, String mail, String motDePasse, Long nbSolicitation, String tel, String Type,   List<Long> niveauCompetance) throws IOException {
        super(nom, prenom, mail, motDePasse);
        this.nbSolicitation = nbSolicitation;
        this.tel = tel;
        this.niveauCompetance = niveauCompetance;
        this.Type = Type ; 
    }

     public String getType() {
        return this.Type;
    }

    public void setType(String type) {
        this.Type = Type;
    }
    
    public Long getNbSolicitation() {
        return this.nbSolicitation;
    }

    public void setNbSolicitation(Long nbSolicitation) {
        this.nbSolicitation = nbSolicitation;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public List<Long> getNiveauCompetance() {
        return this.niveauCompetance;
    }

    public void setNiveauCompetance(List<Long> niveauCompetance) {
        this.niveauCompetance = niveauCompetance;
    }

    
    @Override
    public String toString() {
        return "Intervenant{" +
                "nbSolicitation=" + this.nbSolicitation +
                ", tel='" + this.tel + '\'' +
                ", niveauCompetance=" + this.niveauCompetance +
                ", type=" + this.Type +
                ", nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' +
                ", mail='" + getMail() + '\'' +
                '}';
    }
}

