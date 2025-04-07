/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.service;


import metier.modele.Eleve;
import dao.EleveDao;
import dao.EtablissementDAO;
import dao.JpaUtil;
import java.util.ArrayList;
import java.util.List;
import metier.modele.Etablissement;
import util.Message;

/**
 *
 * @author ytaharaste
 */
public class Service {
    public Boolean inscrireEleve(Eleve eleve) {
       EleveDao eleveDao = new EleveDao();
       EtablissementDAO etablissementDAO = new EtablissementDAO() ; 
       Message message = new Message();
       try {
            JpaUtil.creerContextePersistance();
            JpaUtil.ouvrirTransaction();
            String code = eleve.getCodeEtablissement() ; 
            Etablissement e  = etablissementDAO.FindByCode (code ) ; 
            if (e==null) 
            {
                e = new Etablissement(code);
                etablissementDAO.CreateEtablissment (e); 
            }
            //eleve.setEtablissement(e);
            eleveDao.create(eleve);
            JpaUtil.validerTransaction();
             // envoyer le mail de confirmation
            message.envoyerMail("contact@instruct.if", eleve.getMail(), "Bienvenue dans le réseau INSTRUCT'IF", "Bonjour "+eleve.getPrenom()+", nous te confirmons ton inscription sur le réseau INSTRUC'IF. Si tu as besoin d'un soutien pour tes leçons ou tes devoirs, rends-toi sur notre site pour une mise en relation avec un intervenant.") ;
        } catch (Exception ex) {
            ex.printStackTrace();
            JpaUtil.annulerTransaction();
            message.envoyerMail("contact@instruct.if", eleve.getMail(), "Echec de l'inscription sur le réseau INSTRUCT'IF", "Bonjour " +eleve.getPrenom()+", ton inscription sur le réseau INSTRUCT'IF a malencontreusement échoué... Merci de recommencer ultérieurement");
            return false; // on pourrait aussi lancer une exception
        } finally { // dans tous les cas, on ferme l'entity manager
            JpaUtil.fermerContextePersistance();
        }
        return true;
    }
    
    public List<Eleve> listerEleves() {
        List<Eleve> eleves = new ArrayList<>();
        EleveDao eleveDao = new EleveDao();
        try {
            JpaUtil.creerContextePersistance();
            eleves = eleveDao.findAll();
        } catch (Exception ex) { // ça n'a pas marché, on affiche l'exception
            ex.printStackTrace();
        } finally { // dans tous les cas, on ferme l'entity manager
            JpaUtil.fermerContextePersistance();
        }
        return eleves;
    }
}
