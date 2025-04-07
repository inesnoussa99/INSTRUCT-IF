/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.modele;

import java.io.IOException;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import metier.modele.Etablissement;
/**
 *
 * @author ytaharaste
 */
@Entity
public class Eleve extends Personne{
    private String dateNaissance;
    
    private String classe;
    
    //@ManyToOne(cascade = CascadeType.PERSIST)
    //private Etablissement etablissement; 
    
    private String codeEtablissement; 

    @Override
    public String toString() {
        return "Eleve{" +super.toString() + "dateNaissance=" + dateNaissance + ", classe=" + classe + '}';
    }

    public Eleve() {
    }
    
//    //public Etablissement getEtablissement() {
//        return etablissement;
//    }

    public String getCodeEtablissement() {
        return codeEtablissement;
    }

    
    public Eleve(String dateNaissance, String classe, String nom, String prenom, String mail, String motDePasse , String codeEtablissement) throws IOException {
        super(nom, prenom, mail, motDePasse);
        this.dateNaissance = dateNaissance;
        this.classe = classe;
        this.codeEtablissement = codeEtablissement;
        //this.etablissement = null;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public String getClasse() {
        return classe;
    }

//    public void setEtablissement(Etablissement etablissement) {
//        this.etablissement = etablissement;
//    }

    public void setCodeEtablissement(String codeEtablissement) {
        this.codeEtablissement = codeEtablissement;
    }
    
    
}
