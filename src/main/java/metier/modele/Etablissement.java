/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.modele;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import util.EducNetApi ; 
/**
 *
 * @author ytaharaste
 */
@Entity
public class Etablissement {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    protected Long id;
    
    @Column(nullable = false, unique = true)
    String code ; 
    
    Float ips ;
    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getDenomination() {
        return denomination;
    }

    public Float getIps() {
        return ips;
    }
    
    String denomination ; 

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.id);
        hash = 23 * hash + Objects.hashCode(this.code);
        hash = 23 * hash + Objects.hashCode(this.denomination);
        hash = 23 * hash + Objects.hashCode(this.ips);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Etablissement other = (Etablissement) obj;
        if (!Objects.equals(this.code, other.code)) {
            return false;
        }
        if (!Objects.equals(this.denomination, other.denomination)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.ips, other.ips)) {
            return false;
        }
        return true;
    }
    
    

    public Etablissement() {
    }
    
   public Etablissement(String code) throws IOException {
//        EducNetApi api = new EducNetApi();
//
//        List<String> result = api.getInformationEtablissement(code);
//        //List<String> result = api.getInformationEtablissement("0690132U");
//        if (result != null) {
//            this.code = result.get(0);
//            this.denomination = result.get(1);
//            
//            String ips = result.get(8);
//            this.ips = Float.parseFloat(ips);
//                    
//            String nomCommune = result.get(4);
//            
//            System.out.println("Etablissement " + code + ": " + denomination + " à " + nomCommune);  
//        }
//        else {
//            System.out.println("Etablissement inconnu");
//        }
// 
  }
    
}
