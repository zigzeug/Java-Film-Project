package P;

public class Commentaire {
	private String contenu;
	private Film film;
	private Utilisateur utilisateur;
	@Override
	public String toString() {
		return  contenu  + film +  utilisateur ;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Commentaire(String contenu, Film film, Utilisateur utilisateur) {
		super();
		this.contenu = contenu;
		this.film = film;
		this.utilisateur = utilisateur;
	}
}
