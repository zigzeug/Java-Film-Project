import java.util.List;

public class User extends Personne {
    private String email;
    private String password;
    private String dateNaissance;
    private Abonnement abonnement;

    public void commenter(Film film, String commentaire) {
        // Implementation here
    }

    public void noter(Film film, int note) {
        // Implementation here
    }

    public List<Film> historique() {
        // Implementation here
        return null;
    }
}
