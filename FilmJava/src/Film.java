import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class Film {
    private int code;
    private String theme;
    private int anneeProd;
    private String titre;

    public Film(int code, String theme, int anneeProd, String titre) {
        this.code = code;
        this.theme = theme;
        this.anneeProd = anneeProd;
        this.titre = titre;
    }

    // Getters and setters go here (omitted for brevity)

    // Method to serialize Film object to JSON file
    public void serializeToJsonFile(String fileName) {
        Gson gson = new Gson();
        String json = gson.toJson(this);
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(json);
            System.out.println("Serialized data written to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
