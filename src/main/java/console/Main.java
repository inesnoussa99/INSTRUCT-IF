package console;

import dao.JpaUtil;
import java.io.IOException;
import java.util.List;
import metier.modele.Eleve;
import metier.service.Service;

public class Main {

    public static void main(String[] args) throws IOException {
        //JpaUtil.desactiverLog();
        JpaUtil.creerFabriquePersistance();
        testerInscrireEleves();
        testerConsulterListeEleves();
        JpaUtil.fermerFabriquePersistance();
    }

    private static void testerInscrireEleves() throws IOException {
        Service service = new Service();

        printlnConsoleIHM("Inscription Eleve C1");
        Eleve c1 = new Eleve("06/03/2000", "5eme", "loli", "lola", "iii@lll.fr", "1234" ,"0692155T");
        Boolean resultat1 = service.inscrireEleve(c1);
        printlnConsoleIHM(resultat1 + " -> Inscription eleve C1 " + c1);
        
        printlnConsoleIHM("Inscription Eleve C2");
        Eleve c2 = new Eleve("06/03/2004", "7eme", "tom", "bernard", "illll@ffff.fr", "1235" ,"0692155T");
        Boolean resultat2 = service.inscrireEleve(c2);
        printlnConsoleIHM(resultat2 + " -> Inscription eleve C2 " + c2);
      
    }

    private static void testerConsulterListeEleves() {
        Service service = new Service();
        List<Eleve> eleves = service.listerEleves();

        if (eleves == null) {
            printlnConsoleIHM("ERREUR du Service listerEleves");
        } else {
            printlnConsoleIHM("Liste des Eleves (" + eleves.size() + ")");
            for (Eleve c : eleves) {
                printlnConsoleIHM("#" + c.getId() + " " + c.getNom().toUpperCase() + " " + c.getPrenom());
            }
            printlnConsoleIHM("----");
        }
    }

    public static void printlnConsoleIHM(Object o) {
        String BG_CYAN = "\u001b[46m";
        String RESET = "\u001B[0m";

        System.out.print(BG_CYAN);
        System.out.println(String.format("%-80s", o));
        System.out.print(RESET);
    }

}