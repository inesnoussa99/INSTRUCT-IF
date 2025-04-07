package metier.modele;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import metier.modele.Etablissement;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-04-01T16:02:31")
@StaticMetamodel(Eleve.class)
public class Eleve_ extends Personne_ {

    public static volatile SingularAttribute<Eleve, String> classe;
    public static volatile SingularAttribute<Eleve, String> dateNaissance;
    public static volatile SingularAttribute<Eleve, Etablissement> codeEtablissement;

}