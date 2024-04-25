package P;
import java.util.ArrayList;
public class Application {
private ArrayList<Film> films=new ArrayList<Film>();
private ArrayList<Utilisateur> utilsateurs=new ArrayList<Utilisateur>();

public void ajouterFilm(Film f) {
	films.add(f);
}
public void supprimerFilm(Film f) {
	films.remove(f);
}

public void ajouterUtilisateur(Utilisateur u) {
	utilsateurs.add(u);
}
public void suuprimerUtilisateur(Utilisateur u) {
	utilsateurs.add(u);
}
public Film getFilmByTitle(String titre) {
	for (Film f: films)
	{if (f.getTitre().equals(titre))
		return f;}
	return null;
	
	
}
}
