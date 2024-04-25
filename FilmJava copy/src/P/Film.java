package P;
import java.util.ArrayList;
public class Film {
private String titre;
private boolean actif=true;
private ArrayList<Commentaire> commentaires=new ArrayList<Commentaire>();

public void ajouterCommentaire(Commentaire c) {
	commentaires.add(c);
}
public void suprimerCommentaire(Commentaire c) {
	commentaires.remove(c);
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public Film(String titre) {
	super();
	this.titre = titre;
}

void desactiver() {
	// on peut demander le mot de passe de l'administrateur
	actif=false;}
void activer() {
	// on peut demander le mot de passe de l'administrateur
	actif=true;}

public void afficheCommentaire() {
	if (!actif) {System.out.println("Commentaires désactivés pour ce film");}
	else {
		for (Commentaire c:commentaires) {
			System.out.println(c);
		}
	}
}
@Override
public String toString() {
	return " " + titre;
}
}
