package P;

import java.util.ArrayList;

public class Utilisateur {
	private String nom;
	private ArrayList<Commentaire> commentaires=new ArrayList<Commentaire>();
	public void ajouterCommentaire(String contenu,Film f) {
		Commentaire c=new Commentaire(contenu,f,this);
		commentaires.add(c);
		f.ajouterCommentaire(c);
	}
	
	public Utilisateur(String nom) {
		super();
		this.nom = nom;
	}
	public void suuprimerCommentaire(Commentaire c) {
		commentaires.remove(c);
	}

	@Override
	public String toString() {
		return " "+nom;
	}
	
}
