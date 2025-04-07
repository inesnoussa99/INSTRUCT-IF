/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import metier.modele.Etablissement ;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import dao.JpaUtil.* ; 
import java.io.IOException;
import java.util.List;
/**
 *
 * @author ytaharaste
 */
public class EtablissementDAO {

    
    public Etablissement FindByCode (String code ) throws IOException{
        EntityManager em = JpaUtil.obtenirContextePersistance();
        Etablissement e;
        Query query = em.createQuery("SELECT e FROM Etablissement e WHERE e.code = :code");
        query.setParameter("code", code);
        e = (Etablissement) query.getSingleResult();
        return e ;
    }


     public void CreateEtablissment (Etablissement e )
     {
         JpaUtil.obtenirContextePersistance().persist(e);
     }
}
/*
 public Etablissement FindByCode (String code ) throws IOException{
        EntityManager em = JpaUtil.obtenirContextePersistance();
        Etablissement e;
        if (tableExists(em, "Etablissement")) { 
                Query query = em.createQuery("SELECT e FROM Etablissement e WHERE e.code = :code");
                query.setParameter("code", code);
                e = (Etablissement) query.getSingleResult();
                if (e == null)
                {
                    e = new Etablissement(code);
                    em.persist(e);
                }
        } 
        else {
            e = new Etablissement(code);
            em.persist(e); 
        }
        return e ;
    }
}*/