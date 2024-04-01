import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class User extends Personne {
    private String email;
    private String password;
    private String dateNaissance;
    private Abonnement abonnement;

    public User(String email, String password, String dateNaissance, Abonnement abonnement) {
        this.email = email;
        this.password = password;
        this.dateNaissance = dateNaissance;
        this.abonnement = abonnement;
    }

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

    // Method to serialize User object to JSON
    public String serializeToJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    // Example method to write JSON to a file (optional)
    public void writeJsonToFile(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            String json = serializeToJson();
            writer.write(json);
            System.out.println("Serialized data written to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}



