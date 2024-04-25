package P;

public class Test {

	public static void main(String[] args) {
		P.Application application=new Application();
		Film f1=new Film("Titanic");
		Film f2=new Film("Les oiseaux se cachent pour mourir");
		Film f3=new Film("Impitoyable");
		Film f4=new Film("Le patient anglais");
		 application.ajouterFilm(f1);
		 application.ajouterFilm(f2);application.ajouterFilm(f3);
		 application.ajouterFilm(f4);
	Utilisateur u1=new Utilisateur("Paul");	
	Utilisateur u2=new Utilisateur("Anne");	
	u1.ajouterCommentaire("Perfect movie",f1);
	u2.ajouterCommentaire("Bad movie",f1);
	f1.afficheCommentaire();
	f1.desactiver();
	}

}
